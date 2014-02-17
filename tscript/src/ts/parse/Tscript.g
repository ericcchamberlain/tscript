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

  // a program is a list of statements
  // i.e. root of AST is stored here
  // set by the action for the start symbol
  private List<Statement> semanticValue;
  public List<Statement> getSemanticValue()
  {
    return semanticValue;
  }
}

// grammar proper

program
  : sl=statementList EOF
    { semanticValue = $sl.lval; }
  ;

statementList
  returns [ List<Statement> lval ]
  : // empty rule
    { $lval = new ArrayList<Statement>(); }
  | sl=statementList s=statement
    { $sl.lval.add($s.lval);
      $lval = $sl.lval; }
  ;

statement
  returns [ Statement lval ]
  : v=varStatement
    { $lval = $v.lval; }
  | e=expressionStatement
    { $lval = $e.lval; }
  | p=printStatement
    { $lval = $p.lval; }
  ;

varStatement
  returns [ Statement lval ]
  : VAR v=variableDeclarationList SEMICOLON
    { $lval = buildVariableDeclarationList(loc($start), $v.lval); }
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
  : p=primaryExpression
    { $lval = $p.lval; }
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

fragment DecimalDigit : [0-9];

fragment DecimalDigits
  : DecimalDigit+
  ;

fragment NonZeroDigit : [1-9];

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
  | [a-f]
  | [A-F]
  ;

fragment IdentifierCharacters : [a-zA-Z_$] [a-zA-Z0-9_$]*;

fragment SpaceTokens : SpaceChars | LineTerminator | EndOfLineComment;

fragment SpaceChars : ' ' | '\t' | '\f';

fragment EndOfLineComment : '//' ( ~[\n\r] )* (LineTerminator | EOF);

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
  : '"' ~["\n\r]* '"'
  | '\'' ~['\n\r]* '\''
  ;

LPAREN : [(];
RPAREN : [)];
SEMICOLON : [;];
ASSIGN : [=];
EQUALITY : [=][=];
PLUS : [+];
MINUS : [-];
ASTERISK : [*];
DIVIDE : [//];
LOGICAL_NOT : [!];
LESS : [<];
GREATER : [>];
LESS_OR_EQUAL : [<][=];
GREATER_OR_EQUAL : [>][=];
COMMA : [,];


// keywords start here
PRINT : 'print';
VAR : 'var';

IDENTIFIER : IdentifierCharacters;

// skip whitespace and comments

WhiteSpace : SpaceTokens+ -> skip;

