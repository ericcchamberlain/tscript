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
		LPAREN=5, RPAREN=6, LBRACE=7, RBRACE=8, SEMICOLON=9, ASSIGN=10, EQUALITY=11, 
		PLUS=12, MINUS=13, ASTERISK=14, DIVIDE=15, LOGICAL_NOT=16, LESS=17, GREATER=18, 
		LESS_OR_EQUAL=19, GREATER_OR_EQUAL=20, COMMA=21, PRINT=22, VAR=23, IDENTIFIER=24, 
		WhiteSpace=25;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"NUMERIC_LITERAL", "BOOLEAN_LITERAL", "'null'", "STRING_LITERAL", "LPAREN", 
		"RPAREN", "LBRACE", "RBRACE", "SEMICOLON", "ASSIGN", "EQUALITY", "PLUS", 
		"MINUS", "ASTERISK", "DIVIDE", "LOGICAL_NOT", "LESS", "GREATER", "LESS_OR_EQUAL", 
		"GREATER_OR_EQUAL", "COMMA", "'print'", "'var'", "IDENTIFIER", "WhiteSpace"
	};
	public static final String[] ruleNames = {
		"DecimalLiteral", "DecimalIntegerLiteral", "DecimalDigit", "DecimalDigits", 
		"NonZeroDigit", "ExponentPart", "ExponentIndicator", "SignedInteger", 
		"HexIntegerLiteral", "HexDigit", "IdentifierCharacters", "SpaceTokens", 
		"SpaceChars", "EndOfLineComment", "LineTerminator", "NUMERIC_LITERAL", 
		"BOOLEAN_LITERAL", "NULL_LITERAL", "STRING_LITERAL", "LPAREN", "RPAREN", 
		"LBRACE", "RBRACE", "SEMICOLON", "ASSIGN", "EQUALITY", "PLUS", "MINUS", 
		"ASTERISK", "DIVIDE", "LOGICAL_NOT", "LESS", "GREATER", "LESS_OR_EQUAL", 
		"GREATER_OR_EQUAL", "COMMA", "PRINT", "VAR", "IDENTIFIER", "WhiteSpace"
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
		case 39: WhiteSpace_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WhiteSpace_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\33\u011d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3"+
		"\2\7\2W\n\2\f\2\16\2Z\13\2\3\2\5\2]\n\2\3\2\3\2\5\2a\n\2\3\2\3\2\6\2e"+
		"\n\2\r\2\16\2f\3\2\5\2j\n\2\5\2l\n\2\3\3\3\3\3\3\5\3q\n\3\5\3s\n\3\3\4"+
		"\3\4\3\5\6\5x\n\5\r\5\16\5y\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\5\t\u0088\n\t\3\n\3\n\3\n\3\n\6\n\u008e\n\n\r\n\16\n\u008f\3\n"+
		"\3\n\3\n\3\n\6\n\u0096\n\n\r\n\16\n\u0097\5\n\u009a\n\n\3\13\3\13\5\13"+
		"\u009e\n\13\3\f\3\f\7\f\u00a2\n\f\f\f\16\f\u00a5\13\f\3\r\3\r\3\r\5\r"+
		"\u00aa\n\r\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u00b2\n\17\f\17\16\17\u00b5"+
		"\13\17\3\17\3\17\5\17\u00b9\n\17\3\20\3\20\3\20\5\20\u00be\n\20\3\21\3"+
		"\21\5\21\u00c2\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u00cd\n\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\7\24\u00d6\n\24\f\24\16"+
		"\24\u00d9\13\24\3\24\3\24\3\24\7\24\u00de\n\24\f\24\16\24\u00e1\13\24"+
		"\3\24\5\24\u00e4\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3"+
		" \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'"+
		"\3\'\3(\3(\3)\6)\u0118\n)\r)\16)\u0119\3)\3)\2*\3\2\1\5\2\1\7\2\1\t\2"+
		"\1\13\2\1\r\2\1\17\2\1\21\2\1\23\2\1\25\2\1\27\2\1\31\2\1\33\2\1\35\2"+
		"\1\37\2\1!\3\1#\4\1%\5\1\'\6\1)\7\1+\b\1-\t\1/\n\1\61\13\1\63\f\1\65\r"+
		"\1\67\16\19\17\1;\20\1=\21\1?\22\1A\23\1C\24\1E\25\1G\26\1I\27\1K\30\1"+
		"M\31\1O\32\1Q\33\2\3\2\n\4\2GGgg\4\2CHch\5\2C\\aac|\6\2\62;C\\aac|\5\2"+
		"\13\13\16\16\"\"\4\2\f\f\17\17\5\2\f\f\17\17$$\5\2\f\f\17\17))\u0129\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\3k\3\2\2\2\5r\3\2\2\2\7t\3\2\2\2\tw\3\2\2\2\13{\3\2\2\2\r}\3\2\2"+
		"\2\17\u0080\3\2\2\2\21\u0087\3\2\2\2\23\u0099\3\2\2\2\25\u009d\3\2\2\2"+
		"\27\u009f\3\2\2\2\31\u00a9\3\2\2\2\33\u00ab\3\2\2\2\35\u00ad\3\2\2\2\37"+
		"\u00bd\3\2\2\2!\u00c1\3\2\2\2#\u00cc\3\2\2\2%\u00ce\3\2\2\2\'\u00e3\3"+
		"\2\2\2)\u00e5\3\2\2\2+\u00e7\3\2\2\2-\u00e9\3\2\2\2/\u00eb\3\2\2\2\61"+
		"\u00ed\3\2\2\2\63\u00ef\3\2\2\2\65\u00f1\3\2\2\2\67\u00f4\3\2\2\29\u00f6"+
		"\3\2\2\2;\u00f8\3\2\2\2=\u00fa\3\2\2\2?\u00fc\3\2\2\2A\u00fe\3\2\2\2C"+
		"\u0100\3\2\2\2E\u0102\3\2\2\2G\u0105\3\2\2\2I\u0108\3\2\2\2K\u010a\3\2"+
		"\2\2M\u0110\3\2\2\2O\u0114\3\2\2\2Q\u0117\3\2\2\2ST\5\5\3\2TX\7\60\2\2"+
		"UW\5\t\5\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\\\3\2\2\2ZX\3\2\2"+
		"\2[]\5\r\7\2\\[\3\2\2\2\\]\3\2\2\2]l\3\2\2\2^`\5\5\3\2_a\5\r\7\2`_\3\2"+
		"\2\2`a\3\2\2\2al\3\2\2\2bd\7\60\2\2ce\5\t\5\2dc\3\2\2\2ef\3\2\2\2fd\3"+
		"\2\2\2fg\3\2\2\2gi\3\2\2\2hj\5\r\7\2ih\3\2\2\2ij\3\2\2\2jl\3\2\2\2kS\3"+
		"\2\2\2k^\3\2\2\2kb\3\2\2\2l\4\3\2\2\2ms\7\62\2\2np\5\13\6\2oq\5\t\5\2"+
		"po\3\2\2\2pq\3\2\2\2qs\3\2\2\2rm\3\2\2\2rn\3\2\2\2s\6\3\2\2\2tu\4\62;"+
		"\2u\b\3\2\2\2vx\5\7\4\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\n\3\2"+
		"\2\2{|\4\63;\2|\f\3\2\2\2}~\5\17\b\2~\177\5\21\t\2\177\16\3\2\2\2\u0080"+
		"\u0081\t\2\2\2\u0081\20\3\2\2\2\u0082\u0088\5\t\5\2\u0083\u0084\7-\2\2"+
		"\u0084\u0088\5\t\5\2\u0085\u0086\7/\2\2\u0086\u0088\5\t\5\2\u0087\u0082"+
		"\3\2\2\2\u0087\u0083\3\2\2\2\u0087\u0085\3\2\2\2\u0088\22\3\2\2\2\u0089"+
		"\u008a\7\62\2\2\u008a\u008b\7z\2\2\u008b\u008d\3\2\2\2\u008c\u008e\5\25"+
		"\13\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u009a\3\2\2\2\u0091\u0092\7\62\2\2\u0092\u0093\7"+
		"Z\2\2\u0093\u0095\3\2\2\2\u0094\u0096\5\25\13\2\u0095\u0094\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2"+
		"\2\2\u0099\u0089\3\2\2\2\u0099\u0091\3\2\2\2\u009a\24\3\2\2\2\u009b\u009e"+
		"\5\7\4\2\u009c\u009e\t\3\2\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e"+
		"\26\3\2\2\2\u009f\u00a3\t\4\2\2\u00a0\u00a2\t\5\2\2\u00a1\u00a0\3\2\2"+
		"\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\30"+
		"\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00aa\5\33\16\2\u00a7\u00aa\5\37\20"+
		"\2\u00a8\u00aa\5\35\17\2\u00a9\u00a6\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9"+
		"\u00a8\3\2\2\2\u00aa\32\3\2\2\2\u00ab\u00ac\t\6\2\2\u00ac\34\3\2\2\2\u00ad"+
		"\u00ae\7\61\2\2\u00ae\u00af\7\61\2\2\u00af\u00b3\3\2\2\2\u00b0\u00b2\n"+
		"\7\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b8\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b9\5\37"+
		"\20\2\u00b7\u00b9\7\2\2\3\u00b8\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9"+
		"\36\3\2\2\2\u00ba\u00bb\7\17\2\2\u00bb\u00be\7\f\2\2\u00bc\u00be\t\7\2"+
		"\2\u00bd\u00ba\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be \3\2\2\2\u00bf\u00c2"+
		"\5\3\2\2\u00c0\u00c2\5\23\n\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2"+
		"\u00c2\"\3\2\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7t\2\2\u00c5\u00c6\7w"+
		"\2\2\u00c6\u00cd\7g\2\2\u00c7\u00c8\7h\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca"+
		"\7n\2\2\u00ca\u00cb\7u\2\2\u00cb\u00cd\7g\2\2\u00cc\u00c3\3\2\2\2\u00cc"+
		"\u00c7\3\2\2\2\u00cd$\3\2\2\2\u00ce\u00cf\7p\2\2\u00cf\u00d0\7w\2\2\u00d0"+
		"\u00d1\7n\2\2\u00d1\u00d2\7n\2\2\u00d2&\3\2\2\2\u00d3\u00d7\7$\2\2\u00d4"+
		"\u00d6\n\b\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2"+
		"\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da"+
		"\u00e4\7$\2\2\u00db\u00df\7)\2\2\u00dc\u00de\n\t\2\2\u00dd\u00dc\3\2\2"+
		"\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2"+
		"\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e4\7)\2\2\u00e3\u00d3\3\2\2\2\u00e3"+
		"\u00db\3\2\2\2\u00e4(\3\2\2\2\u00e5\u00e6\7*\2\2\u00e6*\3\2\2\2\u00e7"+
		"\u00e8\7+\2\2\u00e8,\3\2\2\2\u00e9\u00ea\7}\2\2\u00ea.\3\2\2\2\u00eb\u00ec"+
		"\7\177\2\2\u00ec\60\3\2\2\2\u00ed\u00ee\7=\2\2\u00ee\62\3\2\2\2\u00ef"+
		"\u00f0\7?\2\2\u00f0\64\3\2\2\2\u00f1\u00f2\7?\2\2\u00f2\u00f3\7?\2\2\u00f3"+
		"\66\3\2\2\2\u00f4\u00f5\7-\2\2\u00f58\3\2\2\2\u00f6\u00f7\7/\2\2\u00f7"+
		":\3\2\2\2\u00f8\u00f9\7,\2\2\u00f9<\3\2\2\2\u00fa\u00fb\7\61\2\2\u00fb"+
		">\3\2\2\2\u00fc\u00fd\7#\2\2\u00fd@\3\2\2\2\u00fe\u00ff\7>\2\2\u00ffB"+
		"\3\2\2\2\u0100\u0101\7@\2\2\u0101D\3\2\2\2\u0102\u0103\7>\2\2\u0103\u0104"+
		"\7?\2\2\u0104F\3\2\2\2\u0105\u0106\7@\2\2\u0106\u0107\7?\2\2\u0107H\3"+
		"\2\2\2\u0108\u0109\7.\2\2\u0109J\3\2\2\2\u010a\u010b\7r\2\2\u010b\u010c"+
		"\7t\2\2\u010c\u010d\7k\2\2\u010d\u010e\7p\2\2\u010e\u010f\7v\2\2\u010f"+
		"L\3\2\2\2\u0110\u0111\7x\2\2\u0111\u0112\7c\2\2\u0112\u0113\7t\2\2\u0113"+
		"N\3\2\2\2\u0114\u0115\5\27\f\2\u0115P\3\2\2\2\u0116\u0118\5\31\r\2\u0117"+
		"\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2"+
		"\2\2\u011a\u011b\3\2\2\2\u011b\u011c\b)\2\2\u011cR\3\2\2\2\34\2X\\`fi"+
		"kpry\u0087\u008f\u0097\u0099\u009d\u00a3\u00a9\u00b3\u00b8\u00bd\u00c1"+
		"\u00cc\u00d7\u00df\u00e3\u0119";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}