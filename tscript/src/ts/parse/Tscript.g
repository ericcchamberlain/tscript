//
// an ANTLR parser specification for a Tscript subset
//

grammar Tscript;

@header {
  package ts.parse;
  import ts.Location;
  import ts.tree.*;
  import static ts.parse.TreeBuilder.*;
  import java.util.List;
  import java.util.ArrayList;
}

@members {
  // grab location info (filename/line/column) from token
  // in order to stick into AST nodes for later error reporting
  public Location loc(final Token token)
  {
    return new Location(getSourceName(), token.getLine(),
      token.getCharPositionInLine());
  }

  // a program is a list of SourceElement
  // i.e. root of AST is stored here
  // set by the action for the start symbol
  private List<SourceElement> semanticValue;
  public List<SourceElement> getSemanticValue()
  {
    return semanticValue;
  }
}

// grammar proper

program
  :  // empty program 
    {semanticValue = new ArrayList<SourceElement>(); }
  | s=sourceElements EOF
    { semanticValue = $s.lval; }
  ;

sourceElements
  returns [ List<SourceElement> lval ]
  : s=sourceElement
    { $lval = new ArrayList<SourceElement>(); 
      $lval.add($s.lval);
    }
  | s1=sourceElements s2=sourceElement
    { $s1.lval.add($s2.lval);
      $lval = $s1.lval;
    }
  ;

sourceElement
  returns [ SourceElement lval ]
  : s=statement
    { $lval = $s.lval; }
  /* NEEDED FOR FUNCTIONS. 
    When I enable this, I need to change all the places I used
    sourceElement casting to (statement) and replaec with instanceOf ... 
  | f=functionDeclaration
    { $lval = $f.lval; }
  */
  ;

functionExpression
  returns [ Expression lval ]
  : FUNCTION LPAREN RPAREN LBRACE f=functionBody RBRACE
    { $lval = buildFunctionExpression(loc($start), null, null, $f.lval); }
  | FUNCTION i=IDENTIFIER LPAREN RPAREN LBRACE f=functionBody RBRACE
    { $lval = buildFunctionExpression(loc($start), $i.text, null, $f.lval); }
  | FUNCTION LPAREN fp=formalParameterList RPAREN LBRACE f=functionBody RBRACE
    { $lval = buildFunctionExpression(loc($start), null, $fp.lval, $f.lval); }
  | FUNCTION i=IDENTIFIER LPAREN fp=formalParameterList RPAREN LBRACE f=functionBody RBRACE
    { $lval = buildFunctionExpression(loc($start), $i.text, $fp.lval, $f.lval); }
  ;

formalParameterList
  returns [ List<String> lval ]
  : i=IDENTIFIER
    { $lval = new ArrayList<String>();
      $lval.add($i.text); 
    }
  | f=formalParameterList COMMA i=IDENTIFIER
    { $f.lval.add($i.text); 
      $lval = $f.lval; 
    }
  ;

functionBody
  returns [ List<SourceElement> lval ]  // WHAT DO I RETURN HERE ?
  : // empty
    { $lval = new ArrayList<SourceElement>(); }
  | s=sourceElements
    { $lval = $s.lval; }
  ;


statementList
  returns [ List<Statement> lval ]
  : s=statement
    { $lval = new ArrayList<Statement>();
      $lval.add($s.lval); 
    }
  | sl=statementList s=statement
    { $sl.lval.add($s.lval);
      $lval = $sl.lval; 
    }
  ;

statement
  returns [ Statement lval ]
  : b=block
    { $lval = $b.lval; }
  | v=varStatement
    { $lval = $v.lval; }
  | q=emptyStatement  
    { $lval = $q.lval; }
  | e=expressionStatement
    { $lval = $e.lval; }
  | i=ifStatement
    { $lval = $i.lval; }
  | t=iterationStatement
    { $lval = $t.lval; }
  | c=continueStatement
    { $lval = $c.lval; }
  | k=breakStatement
    { $lval = $k.lval; }
  | r=returnStatement
    { $lval = $r.lval; }
  | l=labelledStatement
    { $lval = $l.lval; }
  | p=printStatement
    { $lval = $p.lval; }
  ;

block
  returns [ Statement lval ]
  : LBRACE RBRACE
    { $lval = buildBlockStatement(loc($start), null); }
  | LBRACE l=statementList RBRACE
    { $lval = buildBlockStatement(loc($start), $l.lval); }
  ;

emptyStatement
  returns [ Statement lval ]
  : SEMICOLON
  { $lval = buildEmptyStatement(loc($start)); }
  ;

ifStatement
  returns [ Statement lval ]
  : IF LPAREN e=expression RPAREN s1=statement ELSE s2=statement
    { $lval = buildIfStatement(loc($start), $e.lval, $s1.lval, $s2.lval); }
  | IF LPAREN e=expression RPAREN s1=statement
    { $lval = buildIfStatement(loc($start), $e.lval, $s1.lval, null); }
  ;

iterationStatement
  returns [ Statement lval ]
  : WHILE LPAREN e=expression RPAREN s=statement
    { $lval = buildWhileStatement(loc($start), $e.lval, $s.lval); }
  ;

breakStatement
  returns [ Statement lval ]
  : BREAK SEMICOLON
    { $lval = buildBreakStatement(loc($start), null); }
  | BREAK i=IDENTIFIER SEMICOLON
    { $lval = buildBreakStatement(loc($start), $i.text); }
  ;

continueStatement
  returns [ Statement lval ]
  : CONTINUE SEMICOLON
    { $lval = buildContinueStatement(loc($start), null); }
  | CONTINUE i=IDENTIFIER SEMICOLON
    { $lval = buildContinueStatement(loc($start), $i.text); }
  ;

labelledStatement
  returns [ Statement lval ]
  : i=IDENTIFIER COLON s=statement
    { $lval = buildLabelledStatement(loc($start), $i.text, $s.lval); }
  ; 

varStatement
  returns [ Statement lval ]
  : VAR v=variableDeclarationList SEMICOLON
    { $lval = buildVariableDeclarationList(loc($start), $v.lval); }
  ;

returnStatement 
  returns [ Statement lval ]
  : RETURN SEMICOLON
    { $lval = buildReturnStatement(loc($start), null); }
  | RETURN e=expression SEMICOLON
    {$lval = buildReturnStatement(loc($start), $e.lval); }
  ;

throwStatement
  returns [ Statement lval ]
  : THROW e=expression SEMICOLON
    { $lval = buildThrowStatement(loc($start), $e.lval); }
  ;

variableDeclarationList
  returns [ List<IdentifierInitializerTuple> lval ]
  : v=variableDeclaration
    { $lval = new ArrayList<IdentifierInitializerTuple>();
      $lval.add($v.lval); }
  | l=variableDeclarationList COMMA r=variableDeclaration
    { $l.lval.add($r.lval);
      $lval = $l.lval; }
  ;

variableDeclaration
  returns [ IdentifierInitializerTuple lval ]
  : IDENTIFIER 
    { $lval = buildIdentifierInitializerTuple(loc($start), $IDENTIFIER.text, null); }
  | IDENTIFIER ASSIGN r=assignmentExpression
    { $lval = buildIdentifierInitializerTuple(loc($start), $IDENTIFIER.text, $r.lval); }
  ;

expressionStatement
  returns [ Statement lval ]
  : e=expression SEMICOLON
    { $lval = buildExpressionStatement(loc($start), $e.lval); }
  ;

printStatement
  returns [ Statement lval ]
  : PRINT e=expression SEMICOLON
    { $lval = buildPrintStatement(loc($start), $e.lval); }
  ;

expression
  returns [ Expression lval ]
  : a=assignmentExpression
    { $lval = $a.lval; }
  ;

assignmentExpression
  returns [ Expression lval ]
  : e=equalityExpression
    { $lval = $e.lval; }
  | l=leftHandSideExpression ASSIGN r=assignmentExpression
    { checkAssignmentDestination(loc($start), $l.lval);
      $lval = buildBinaryOperator(loc($start), Binop.ASSIGN,
        $l.lval, $r.lval); }
  ;

equalityExpression
  returns [ Expression lval ]
  : r=relationalExpression
    { $lval = $r.lval; }
  | l=equalityExpression EQUALITY r=relationalExpression
    { $lval = buildBinaryOperator(loc($start), Binop.EQUAL, $l.lval, $r.lval); }
  ;

relationalExpression
  returns [ Expression lval ]
  : a=additiveExpression 
    { $lval = $a.lval; }
  | l=relationalExpression LESS r=additiveExpression
    { $lval = buildBinaryOperator(loc($start), Binop.LESS, $l.lval, $r.lval); }
  | l=relationalExpression GREATER r=additiveExpression
    { $lval = buildBinaryOperator(loc($start), Binop.GREATER, $l.lval, $r.lval); }
  ;

additiveExpression
  returns [ Expression lval ]
  : m=multiplicativeExpression
    { $lval = $m.lval; }
  | l=additiveExpression PLUS r=multiplicativeExpression
    { $lval = buildBinaryOperator(loc($start), Binop.ADD,
        $l.lval, $r.lval); }
  | l=additiveExpression MINUS r=multiplicativeExpression
    { $lval = buildBinaryOperator(loc($start), Binop.SUBTRACT,
        $l.lval, $r.lval); }
  ;

multiplicativeExpression
  returns [ Expression lval ]
  : p=unaryExpression
    { $lval = $p.lval; }
  | l=multiplicativeExpression ASTERISK r=unaryExpression
    { $lval = buildBinaryOperator(loc($start), Binop.MULTIPLY,
      $l.lval, $r.lval); }
  | l=multiplicativeExpression DIVIDE r=unaryExpression
    { $lval = buildBinaryOperator(loc($start), Binop.DIVIDE,
      $l.lval, $r.lval); }
  ;

unaryExpression
  returns [ Expression lval ]
  : LOGICAL_NOT u=unaryExpression
    { $lval = buildUnaryOperator(loc($start), Unary.LOGICAL_NOT, $u.lval); }
  | MINUS u=unaryExpression
    { $lval = buildUnaryOperator(loc($start), Unary.UNARY_MINUS, $u.lval); }
  | l=leftHandSideExpression
    { $lval = $l.lval; }
  ;

leftHandSideExpression
  returns [ Expression lval ]
  : n=newExpression
    { $lval = $n.lval; }
  | c=callExpression
    { $lval = $c.lval; }
  ;

memberExpression
  returns [ Expression lval ]
  : p=primaryExpression
    { $lval = $p.lval; }
  | f=functionExpression
    { $lval = $f.lval; }
  /*
  MemberExpression [ Expression ]
  MemberExpression . IdentifierName
  new MemberExpression Arguments
  */
  ;


newExpression
  returns [ Expression lval ]
  : m=memberExpression
    { $lval = $m.lval; }
// new newExpression
  ;

callExpression
  returns [ Expression lval ]
  : m=memberExpression a=arguments
    { $lval = buildCallExpression(loc($start), $m.lval, $a.lval); }
  /*
  | c=callExpression a=arguments
    { $lval = buildCallExpression(loc($start), $m.lval, $a.lval); }
  /*
  CallExpression [ Expression ]
  CallExpression . IdentifierName
  */
 ;

arguments
  returns [ List<Expression> lval ]
  : LPAREN RPAREN
    { $lval = new ArrayList<Expression>(); }
  | LPAREN al=argumentList RPAREN
    { $lval = $al.lval; }
  ;

argumentList
  returns [ List<Expression> lval ]
  : a=assignmentExpression
    { $lval = new ArrayList<Expression>();
      $lval.add($a.lval); 
    }
  | al=argumentList COMMA ae=assignmentExpression
    { $al.lval.add($ae.lval);
      $lval = $al.lval; 
    }
  ;



primaryExpression
  returns [ Expression lval ]
  : IDENTIFIER
    { $lval = buildIdentifier(loc($start), $IDENTIFIER.text); }
  | NUMERIC_LITERAL
    { $lval = buildNumericLiteral(loc($start), $NUMERIC_LITERAL.text); }
  | BOOLEAN_LITERAL
    { $lval = buildBooleanLiteral(loc($start), $BOOLEAN_LITERAL.text); }
  | NULL_LITERAL
    { $lval = buildNullLiteral(loc($start)); }
  | STRING_LITERAL
    { $lval = buildStringLiteral(loc($start), $STRING_LITERAL.text); }
  | LPAREN e=expression RPAREN
    { $lval = $e.lval; }
  ;

// fragments to support the lexer rules

fragment DecimalLiteral
  : DecimalIntegerLiteral '.' DecimalDigits* ExponentPart?
  | DecimalIntegerLiteral ExponentPart?
  | '.' DecimalDigits+ ExponentPart?
  ;

fragment DecimalIntegerLiteral
  : '0'
  | NonZeroDigit DecimalDigits?
  ;

fragment DecimalDigit : ('0'..'9');

fragment DecimalDigits
  : DecimalDigit+
  ;

fragment NonZeroDigit : ('1'..'9');

fragment ExponentPart : ExponentIndicator SignedInteger; 

fragment ExponentIndicator : 'e' | 'E';

fragment SignedInteger
  : DecimalDigits
  | '+' DecimalDigits
  | '-' DecimalDigits
  ;

fragment HexIntegerLiteral
  : '0x' HexDigit+
  | '0X' HexDigit+
  ;

fragment HexDigit
  : DecimalDigit
  | ('a'..'f')
  | ('A'..'F')
  ;

fragment IdentifierCharacters :  ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')*;

fragment SpaceTokens : SpaceChars | LineTerminator | EndOfLineComment;

fragment SpaceChars : ' ' | '\t' | '\f';

fragment EndOfLineComment : '//' (~('\n' | '\r'))* (LineTerminator | EOF);

fragment LineTerminator : '\r' '\n' | '\r' | '\n';

// lexer rules
//   keywords must appear before IDENTIFIER

NUMERIC_LITERAL
  : DecimalLiteral
  | HexIntegerLiteral
  ;

BOOLEAN_LITERAL 
  : 'true' 
  | 'false'
  ; 

NULL_LITERAL 
  : 'null'
  ; 

STRING_LITERAL 
  : '"' ~('"' | '\n' | '\r')* '"'
  | '\'' ~('\'' | '\n' | '\r')* '\''
  ;

LPAREN : ('(');
RPAREN : (')');
LBRACE : ('{');
RBRACE : ('}');
SEMICOLON : (';');
ASSIGN : ('=');
EQUALITY : ('=')('=');
PLUS : ('+');
MINUS : ('-');
ASTERISK : ('*');
DIVIDE : ('/');
LOGICAL_NOT : ('!');
LESS : ('<');
GREATER : ('>');
LESS_OR_EQUAL : ('<')('=');
GREATER_OR_EQUAL : ('>')('=');
COMMA : (',');
COLON : (':');

// keywords start here
PRINT : 'print';
VAR : 'var';
FUNCTION : 'function';
RETURN : 'return';
CONTINUE : 'continue';
BREAK : 'break';
THROW : 'throw';
WHILE : 'while';
IF : 'if';
ELSE : 'else';

IDENTIFIER : IdentifierCharacters;

// skip whitespace and comments

WhiteSpace : SpaceTokens+ -> skip;