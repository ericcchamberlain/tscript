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
		NUMERIC_LITERAL=1, BOOLEAN_LITERAL=2, NULL_LITERAL=3, STRING_LITERAL=4, 
		LPAREN=5, RPAREN=6, SEMICOLON=7, ASSIGN=8, EQUALITY=9, PLUS=10, MINUS=11, 
		ASTERISK=12, DIVIDE=13, LOGICAL_NOT=14, LESS=15, GREATER=16, LESS_OR_EQUAL=17, 
		GREATER_OR_EQUAL=18, PRINT=19, VAR=20, IDENTIFIER=21, WhiteSpace=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"NUMERIC_LITERAL", "BOOLEAN_LITERAL", "'null'", "STRING_LITERAL", "LPAREN", 
		"RPAREN", "SEMICOLON", "ASSIGN", "EQUALITY", "PLUS", "MINUS", "ASTERISK", 
		"DIVIDE", "LOGICAL_NOT", "LESS", "GREATER", "LESS_OR_EQUAL", "GREATER_OR_EQUAL", 
		"'print'", "'var'", "IDENTIFIER", "WhiteSpace"
	};
	public static final String[] ruleNames = {
		"DIGIT", "IdentifierCharacters", "SpaceTokens", "SpaceChars", "EndOfLineComment", 
		"LineTerminator", "NUMERIC_LITERAL", "BOOLEAN_LITERAL", "NULL_LITERAL", 
		"STRING_LITERAL", "LPAREN", "RPAREN", "SEMICOLON", "ASSIGN", "EQUALITY", 
		"PLUS", "MINUS", "ASTERISK", "DIVIDE", "LOGICAL_NOT", "LESS", "GREATER", 
		"LESS_OR_EQUAL", "GREATER_OR_EQUAL", "PRINT", "VAR", "IDENTIFIER", "WhiteSpace"
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
		case 27: WhiteSpace_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WhiteSpace_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\30\u00b6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\7\3@\n\3"+
		"\f\3\16\3C\13\3\3\4\3\4\3\4\5\4H\n\4\3\5\3\5\3\6\3\6\3\6\3\6\7\6P\n\6"+
		"\f\6\16\6S\13\6\3\6\3\6\5\6W\n\6\3\7\3\7\3\7\5\7\\\n\7\3\b\6\b_\n\b\r"+
		"\b\16\b`\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tl\n\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\7\13u\n\13\f\13\16\13x\13\13\3\13\3\13\3\13\7\13}\n\13"+
		"\f\13\16\13\u0080\13\13\3\13\5\13\u0083\n\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\35\6\35\u00b1\n\35\r\35"+
		"\16\35\u00b2\3\35\3\35\2\36\3\2\1\5\2\1\7\2\1\t\2\1\13\2\1\r\2\1\17\3"+
		"\1\21\4\1\23\5\1\25\6\1\27\7\1\31\b\1\33\t\1\35\n\1\37\13\1!\f\1#\r\1"+
		"%\16\1\'\17\1)\20\1+\21\1-\22\1/\23\1\61\24\1\63\25\1\65\26\1\67\27\1"+
		"9\30\2\3\2\26\3\2\62;\6\2&&C\\aac|\7\2&&\62;C\\aac|\5\2\13\13\16\16\""+
		"\"\4\2\f\f\17\17\3\2$$\5\2\f\f\17\17$$\3\2))\5\2\f\f\17\17))\3\2**\3\2"+
		"++\3\2==\3\2??\3\2--\3\2//\3\2,,\3\2\61\61\3\2##\3\2>>\3\2@@\u00bb\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3\2\2\2\5"+
		"=\3\2\2\2\7G\3\2\2\2\tI\3\2\2\2\13K\3\2\2\2\r[\3\2\2\2\17^\3\2\2\2\21"+
		"k\3\2\2\2\23m\3\2\2\2\25\u0082\3\2\2\2\27\u0084\3\2\2\2\31\u0086\3\2\2"+
		"\2\33\u0088\3\2\2\2\35\u008a\3\2\2\2\37\u008c\3\2\2\2!\u008f\3\2\2\2#"+
		"\u0091\3\2\2\2%\u0093\3\2\2\2\'\u0095\3\2\2\2)\u0097\3\2\2\2+\u0099\3"+
		"\2\2\2-\u009b\3\2\2\2/\u009d\3\2\2\2\61\u00a0\3\2\2\2\63\u00a3\3\2\2\2"+
		"\65\u00a9\3\2\2\2\67\u00ad\3\2\2\29\u00b0\3\2\2\2;<\t\2\2\2<\4\3\2\2\2"+
		"=A\t\3\2\2>@\t\4\2\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\6\3\2\2"+
		"\2CA\3\2\2\2DH\5\t\5\2EH\5\r\7\2FH\5\13\6\2GD\3\2\2\2GE\3\2\2\2GF\3\2"+
		"\2\2H\b\3\2\2\2IJ\t\5\2\2J\n\3\2\2\2KL\7\61\2\2LM\7\61\2\2MQ\3\2\2\2N"+
		"P\n\6\2\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RV\3\2\2\2SQ\3\2\2\2"+
		"TW\5\r\7\2UW\7\2\2\3VT\3\2\2\2VU\3\2\2\2W\f\3\2\2\2XY\7\17\2\2Y\\\7\f"+
		"\2\2Z\\\t\6\2\2[X\3\2\2\2[Z\3\2\2\2\\\16\3\2\2\2]_\5\3\2\2^]\3\2\2\2_"+
		"`\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\20\3\2\2\2bc\7v\2\2cd\7t\2\2de\7w\2\2e"+
		"l\7g\2\2fg\7h\2\2gh\7c\2\2hi\7n\2\2ij\7u\2\2jl\7g\2\2kb\3\2\2\2kf\3\2"+
		"\2\2l\22\3\2\2\2mn\7p\2\2no\7w\2\2op\7n\2\2pq\7n\2\2q\24\3\2\2\2rv\t\7"+
		"\2\2su\n\b\2\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2"+
		"\2\2y\u0083\t\7\2\2z~\t\t\2\2{}\n\n\2\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2"+
		"\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0083\t\t\2\2"+
		"\u0082r\3\2\2\2\u0082z\3\2\2\2\u0083\26\3\2\2\2\u0084\u0085\t\13\2\2\u0085"+
		"\30\3\2\2\2\u0086\u0087\t\f\2\2\u0087\32\3\2\2\2\u0088\u0089\t\r\2\2\u0089"+
		"\34\3\2\2\2\u008a\u008b\t\16\2\2\u008b\36\3\2\2\2\u008c\u008d\t\16\2\2"+
		"\u008d\u008e\t\16\2\2\u008e \3\2\2\2\u008f\u0090\t\17\2\2\u0090\"\3\2"+
		"\2\2\u0091\u0092\t\20\2\2\u0092$\3\2\2\2\u0093\u0094\t\21\2\2\u0094&\3"+
		"\2\2\2\u0095\u0096\t\22\2\2\u0096(\3\2\2\2\u0097\u0098\t\23\2\2\u0098"+
		"*\3\2\2\2\u0099\u009a\t\24\2\2\u009a,\3\2\2\2\u009b\u009c\t\25\2\2\u009c"+
		".\3\2\2\2\u009d\u009e\t\24\2\2\u009e\u009f\t\16\2\2\u009f\60\3\2\2\2\u00a0"+
		"\u00a1\t\25\2\2\u00a1\u00a2\t\16\2\2\u00a2\62\3\2\2\2\u00a3\u00a4\7r\2"+
		"\2\u00a4\u00a5\7t\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7p\2\2\u00a7\u00a8"+
		"\7v\2\2\u00a8\64\3\2\2\2\u00a9\u00aa\7x\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac"+
		"\7t\2\2\u00ac\66\3\2\2\2\u00ad\u00ae\5\5\3\2\u00ae8\3\2\2\2\u00af\u00b1"+
		"\5\7\4\2\u00b0\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\b\35\2\2\u00b5:\3\2\2\2"+
		"\16\2AGQV[`kv~\u0082\u00b2";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}