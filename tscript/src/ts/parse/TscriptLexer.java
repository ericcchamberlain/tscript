// Generated from Tscript.g by ANTLR 4.1

  package ts.parse;
  import ts.Location;
  import ts.tree.*;
  import static ts.parse.TreeBuilder.*;
  import java.util.List;
  import java.util.ArrayList;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TscriptLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMERIC_LITERAL=1, BOOLEAN_LITERAL=2, LPAREN=3, RPAREN=4, SEMICOLON=5, 
		ASSIGN=6, EQUALITY=7, PLUS=8, ASTERISK=9, LOGICAL_NOT=10, LESS=11, GREATER=12, 
		LESS_OR_EQUAL=13, GREATER_OR_EQUAL=14, PRINT=15, VAR=16, IDENTIFIER=17, 
		WhiteSpace=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"NUMERIC_LITERAL", "BOOLEAN_LITERAL", "LPAREN", "RPAREN", "SEMICOLON", 
		"ASSIGN", "EQUALITY", "PLUS", "ASTERISK", "LOGICAL_NOT", "LESS", "GREATER", 
		"LESS_OR_EQUAL", "GREATER_OR_EQUAL", "'print'", "'var'", "IDENTIFIER", 
		"WhiteSpace"
	};
	public static final String[] ruleNames = {
		"DIGIT", "IdentifierCharacters", "SpaceTokens", "SpaceChars", "EndOfLineComment", 
		"LineTerminator", "NUMERIC_LITERAL", "BOOLEAN_LITERAL", "LPAREN", "RPAREN", 
		"SEMICOLON", "ASSIGN", "EQUALITY", "PLUS", "ASTERISK", "LOGICAL_NOT", 
		"LESS", "GREATER", "LESS_OR_EQUAL", "GREATER_OR_EQUAL", "PRINT", "VAR", 
		"IDENTIFIER", "WhiteSpace"
	};


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


	public TscriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Tscript.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 23: WhiteSpace_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WhiteSpace_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\24\u0093\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\7\38\n\3\f\3\16\3;\13\3\3\4\3\4\3\4\5\4@\n\4\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\7\6H\n\6\f\6\16\6K\13\6\3\6\3\6\5\6O\n\6\3\7\3\7"+
		"\3\7\5\7T\n\7\3\b\6\bW\n\b\r\b\16\bX\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\td\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\31\6\31"+
		"\u008e\n\31\r\31\16\31\u008f\3\31\3\31\2\32\3\2\1\5\2\1\7\2\1\t\2\1\13"+
		"\2\1\r\2\1\17\3\1\21\4\1\23\5\1\25\6\1\27\7\1\31\b\1\33\t\1\35\n\1\37"+
		"\13\1!\f\1#\r\1%\16\1\'\17\1)\20\1+\21\1-\22\1/\23\1\61\24\2\3\2\20\3"+
		"\2\62;\6\2&&C\\aac|\7\2&&\62;C\\aac|\5\2\13\13\16\16\"\"\4\2\f\f\17\17"+
		"\3\2**\3\2++\3\2==\3\2??\3\2--\3\2,,\3\2##\3\2>>\3\2@@\u0095\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\3\63\3\2\2\2\5\65\3\2\2\2\7?\3\2\2\2\tA\3\2\2\2\13C\3\2\2\2\rS\3\2"+
		"\2\2\17V\3\2\2\2\21c\3\2\2\2\23e\3\2\2\2\25g\3\2\2\2\27i\3\2\2\2\31k\3"+
		"\2\2\2\33m\3\2\2\2\35p\3\2\2\2\37r\3\2\2\2!t\3\2\2\2#v\3\2\2\2%x\3\2\2"+
		"\2\'z\3\2\2\2)}\3\2\2\2+\u0080\3\2\2\2-\u0086\3\2\2\2/\u008a\3\2\2\2\61"+
		"\u008d\3\2\2\2\63\64\t\2\2\2\64\4\3\2\2\2\659\t\3\2\2\668\t\4\2\2\67\66"+
		"\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:\6\3\2\2\2;9\3\2\2\2<@\5\t\5"+
		"\2=@\5\r\7\2>@\5\13\6\2?<\3\2\2\2?=\3\2\2\2?>\3\2\2\2@\b\3\2\2\2AB\t\5"+
		"\2\2B\n\3\2\2\2CD\7\61\2\2DE\7\61\2\2EI\3\2\2\2FH\n\6\2\2GF\3\2\2\2HK"+
		"\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JN\3\2\2\2KI\3\2\2\2LO\5\r\7\2MO\7\2\2\3N"+
		"L\3\2\2\2NM\3\2\2\2O\f\3\2\2\2PQ\7\17\2\2QT\7\f\2\2RT\t\6\2\2SP\3\2\2"+
		"\2SR\3\2\2\2T\16\3\2\2\2UW\5\3\2\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2"+
		"\2\2Y\20\3\2\2\2Z[\7v\2\2[\\\7t\2\2\\]\7w\2\2]d\7g\2\2^_\7h\2\2_`\7c\2"+
		"\2`a\7n\2\2ab\7u\2\2bd\7g\2\2cZ\3\2\2\2c^\3\2\2\2d\22\3\2\2\2ef\t\7\2"+
		"\2f\24\3\2\2\2gh\t\b\2\2h\26\3\2\2\2ij\t\t\2\2j\30\3\2\2\2kl\t\n\2\2l"+
		"\32\3\2\2\2mn\t\n\2\2no\t\n\2\2o\34\3\2\2\2pq\t\13\2\2q\36\3\2\2\2rs\t"+
		"\f\2\2s \3\2\2\2tu\t\r\2\2u\"\3\2\2\2vw\t\16\2\2w$\3\2\2\2xy\t\17\2\2"+
		"y&\3\2\2\2z{\t\16\2\2{|\t\n\2\2|(\3\2\2\2}~\t\17\2\2~\177\t\n\2\2\177"+
		"*\3\2\2\2\u0080\u0081\7r\2\2\u0081\u0082\7t\2\2\u0082\u0083\7k\2\2\u0083"+
		"\u0084\7p\2\2\u0084\u0085\7v\2\2\u0085,\3\2\2\2\u0086\u0087\7x\2\2\u0087"+
		"\u0088\7c\2\2\u0088\u0089\7t\2\2\u0089.\3\2\2\2\u008a\u008b\5\5\3\2\u008b"+
		"\60\3\2\2\2\u008c\u008e\5\7\4\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2"+
		"\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092"+
		"\b\31\2\2\u0092\62\3\2\2\2\13\29?INSXc\u008f";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}