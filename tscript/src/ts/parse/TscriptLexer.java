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
		T__3=1, T__2=2, T__1=3, T__0=4, NUMERIC_LITERAL=5, BOOLEAN_LITERAL=6, 
		NULL_LITERAL=7, STRING_LITERAL=8, LPAREN=9, RPAREN=10, LBRACE=11, RBRACE=12, 
		SEMICOLON=13, ASSIGN=14, EQUALITY=15, PLUS=16, MINUS=17, ASTERISK=18, 
		DIVIDE=19, LOGICAL_NOT=20, LESS=21, GREATER=22, LESS_OR_EQUAL=23, GREATER_OR_EQUAL=24, 
		COMMA=25, PRINT=26, VAR=27, IDENTIFIER=28, WhiteSpace=29;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'break'", "'while'", "'if'", "'else'", "NUMERIC_LITERAL", "BOOLEAN_LITERAL", 
		"'null'", "STRING_LITERAL", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "SEMICOLON", 
		"ASSIGN", "EQUALITY", "PLUS", "MINUS", "ASTERISK", "DIVIDE", "LOGICAL_NOT", 
		"LESS", "GREATER", "LESS_OR_EQUAL", "GREATER_OR_EQUAL", "COMMA", "'print'", 
		"'var'", "IDENTIFIER", "WhiteSpace"
	};
	public static final String[] ruleNames = {
		"T__3", "T__2", "T__1", "T__0", "DecimalLiteral", "DecimalIntegerLiteral", 
		"DecimalDigit", "DecimalDigits", "NonZeroDigit", "ExponentPart", "ExponentIndicator", 
		"SignedInteger", "HexIntegerLiteral", "HexDigit", "IdentifierCharacters", 
		"SpaceTokens", "SpaceChars", "EndOfLineComment", "LineTerminator", "NUMERIC_LITERAL", 
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
		case 43: WhiteSpace_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WhiteSpace_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\37\u0139\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6s\n\6\f\6\16\6v\13\6\3\6\5\6y"+
		"\n\6\3\6\3\6\5\6}\n\6\3\6\3\6\6\6\u0081\n\6\r\6\16\6\u0082\3\6\5\6\u0086"+
		"\n\6\5\6\u0088\n\6\3\7\3\7\3\7\5\7\u008d\n\7\5\7\u008f\n\7\3\b\3\b\3\t"+
		"\6\t\u0094\n\t\r\t\16\t\u0095\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u00a4\n\r\3\16\3\16\3\16\3\16\6\16\u00aa\n\16\r\16\16\16"+
		"\u00ab\3\16\3\16\3\16\3\16\6\16\u00b2\n\16\r\16\16\16\u00b3\5\16\u00b6"+
		"\n\16\3\17\3\17\5\17\u00ba\n\17\3\20\3\20\7\20\u00be\n\20\f\20\16\20\u00c1"+
		"\13\20\3\21\3\21\3\21\5\21\u00c6\n\21\3\22\3\22\3\23\3\23\3\23\3\23\7"+
		"\23\u00ce\n\23\f\23\16\23\u00d1\13\23\3\23\3\23\5\23\u00d5\n\23\3\24\3"+
		"\24\3\24\5\24\u00da\n\24\3\25\3\25\5\25\u00de\n\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u00e9\n\26\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\7\30\u00f2\n\30\f\30\16\30\u00f5\13\30\3\30\3\30\3\30\7\30\u00fa"+
		"\n\30\f\30\16\30\u00fd\13\30\3\30\5\30\u0100\n\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3"+
		"\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3*\3*"+
		"\3*\3*\3+\3+\3+\3+\3,\3,\3-\6-\u0134\n-\r-\16-\u0135\3-\3-\2.\3\3\1\5"+
		"\4\1\7\5\1\t\6\1\13\2\1\r\2\1\17\2\1\21\2\1\23\2\1\25\2\1\27\2\1\31\2"+
		"\1\33\2\1\35\2\1\37\2\1!\2\1#\2\1%\2\1\'\2\1)\7\1+\b\1-\t\1/\n\1\61\13"+
		"\1\63\f\1\65\r\1\67\16\19\17\1;\20\1=\21\1?\22\1A\23\1C\24\1E\25\1G\26"+
		"\1I\27\1K\30\1M\31\1O\32\1Q\33\1S\34\1U\35\1W\36\1Y\37\2\3\2\n\4\2GGg"+
		"g\4\2CHch\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\13\16\16\"\"\4\2\f\f\17\17"+
		"\5\2\f\f\17\17$$\5\2\f\f\17\17))\u0145\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2"+
		"W\3\2\2\2\2Y\3\2\2\2\3[\3\2\2\2\5a\3\2\2\2\7g\3\2\2\2\tj\3\2\2\2\13\u0087"+
		"\3\2\2\2\r\u008e\3\2\2\2\17\u0090\3\2\2\2\21\u0093\3\2\2\2\23\u0097\3"+
		"\2\2\2\25\u0099\3\2\2\2\27\u009c\3\2\2\2\31\u00a3\3\2\2\2\33\u00b5\3\2"+
		"\2\2\35\u00b9\3\2\2\2\37\u00bb\3\2\2\2!\u00c5\3\2\2\2#\u00c7\3\2\2\2%"+
		"\u00c9\3\2\2\2\'\u00d9\3\2\2\2)\u00dd\3\2\2\2+\u00e8\3\2\2\2-\u00ea\3"+
		"\2\2\2/\u00ff\3\2\2\2\61\u0101\3\2\2\2\63\u0103\3\2\2\2\65\u0105\3\2\2"+
		"\2\67\u0107\3\2\2\29\u0109\3\2\2\2;\u010b\3\2\2\2=\u010d\3\2\2\2?\u0110"+
		"\3\2\2\2A\u0112\3\2\2\2C\u0114\3\2\2\2E\u0116\3\2\2\2G\u0118\3\2\2\2I"+
		"\u011a\3\2\2\2K\u011c\3\2\2\2M\u011e\3\2\2\2O\u0121\3\2\2\2Q\u0124\3\2"+
		"\2\2S\u0126\3\2\2\2U\u012c\3\2\2\2W\u0130\3\2\2\2Y\u0133\3\2\2\2[\\\7"+
		"d\2\2\\]\7t\2\2]^\7g\2\2^_\7c\2\2_`\7m\2\2`\4\3\2\2\2ab\7y\2\2bc\7j\2"+
		"\2cd\7k\2\2de\7n\2\2ef\7g\2\2f\6\3\2\2\2gh\7k\2\2hi\7h\2\2i\b\3\2\2\2"+
		"jk\7g\2\2kl\7n\2\2lm\7u\2\2mn\7g\2\2n\n\3\2\2\2op\5\r\7\2pt\7\60\2\2q"+
		"s\5\21\t\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2ux\3\2\2\2vt\3\2\2\2"+
		"wy\5\25\13\2xw\3\2\2\2xy\3\2\2\2y\u0088\3\2\2\2z|\5\r\7\2{}\5\25\13\2"+
		"|{\3\2\2\2|}\3\2\2\2}\u0088\3\2\2\2~\u0080\7\60\2\2\177\u0081\5\21\t\2"+
		"\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0086\5\25\13\2\u0085\u0084\3\2\2\2"+
		"\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087o\3\2\2\2\u0087z\3\2\2\2"+
		"\u0087~\3\2\2\2\u0088\f\3\2\2\2\u0089\u008f\7\62\2\2\u008a\u008c\5\23"+
		"\n\2\u008b\u008d\5\21\t\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008f\3\2\2\2\u008e\u0089\3\2\2\2\u008e\u008a\3\2\2\2\u008f\16\3\2\2"+
		"\2\u0090\u0091\4\62;\2\u0091\20\3\2\2\2\u0092\u0094\5\17\b\2\u0093\u0092"+
		"\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\22\3\2\2\2\u0097\u0098\4\63;\2\u0098\24\3\2\2\2\u0099\u009a\5\27\f\2"+
		"\u009a\u009b\5\31\r\2\u009b\26\3\2\2\2\u009c\u009d\t\2\2\2\u009d\30\3"+
		"\2\2\2\u009e\u00a4\5\21\t\2\u009f\u00a0\7-\2\2\u00a0\u00a4\5\21\t\2\u00a1"+
		"\u00a2\7/\2\2\u00a2\u00a4\5\21\t\2\u00a3\u009e\3\2\2\2\u00a3\u009f\3\2"+
		"\2\2\u00a3\u00a1\3\2\2\2\u00a4\32\3\2\2\2\u00a5\u00a6\7\62\2\2\u00a6\u00a7"+
		"\7z\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00aa\5\35\17\2\u00a9\u00a8\3\2\2\2"+
		"\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00b6"+
		"\3\2\2\2\u00ad\u00ae\7\62\2\2\u00ae\u00af\7Z\2\2\u00af\u00b1\3\2\2\2\u00b0"+
		"\u00b2\5\35\17\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b1\3"+
		"\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00a5\3\2\2\2\u00b5"+
		"\u00ad\3\2\2\2\u00b6\34\3\2\2\2\u00b7\u00ba\5\17\b\2\u00b8\u00ba\t\3\2"+
		"\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\36\3\2\2\2\u00bb\u00bf"+
		"\t\4\2\2\u00bc\u00be\t\5\2\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0 \3\2\2\2\u00c1\u00bf\3\2\2\2"+
		"\u00c2\u00c6\5#\22\2\u00c3\u00c6\5\'\24\2\u00c4\u00c6\5%\23\2\u00c5\u00c2"+
		"\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\"\3\2\2\2\u00c7"+
		"\u00c8\t\6\2\2\u00c8$\3\2\2\2\u00c9\u00ca\7\61\2\2\u00ca\u00cb\7\61\2"+
		"\2\u00cb\u00cf\3\2\2\2\u00cc\u00ce\n\7\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1"+
		"\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d4\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d2\u00d5\5\'\24\2\u00d3\u00d5\7\2\2\3\u00d4\u00d2\3"+
		"\2\2\2\u00d4\u00d3\3\2\2\2\u00d5&\3\2\2\2\u00d6\u00d7\7\17\2\2\u00d7\u00da"+
		"\7\f\2\2\u00d8\u00da\t\7\2\2\u00d9\u00d6\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da"+
		"(\3\2\2\2\u00db\u00de\5\13\6\2\u00dc\u00de\5\33\16\2\u00dd\u00db\3\2\2"+
		"\2\u00dd\u00dc\3\2\2\2\u00de*\3\2\2\2\u00df\u00e0\7v\2\2\u00e0\u00e1\7"+
		"t\2\2\u00e1\u00e2\7w\2\2\u00e2\u00e9\7g\2\2\u00e3\u00e4\7h\2\2\u00e4\u00e5"+
		"\7c\2\2\u00e5\u00e6\7n\2\2\u00e6\u00e7\7u\2\2\u00e7\u00e9\7g\2\2\u00e8"+
		"\u00df\3\2\2\2\u00e8\u00e3\3\2\2\2\u00e9,\3\2\2\2\u00ea\u00eb\7p\2\2\u00eb"+
		"\u00ec\7w\2\2\u00ec\u00ed\7n\2\2\u00ed\u00ee\7n\2\2\u00ee.\3\2\2\2\u00ef"+
		"\u00f3\7$\2\2\u00f0\u00f2\n\b\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2"+
		"\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f6\u0100\7$\2\2\u00f7\u00fb\7)\2\2\u00f8\u00fa\n\t\2"+
		"\2\u00f9\u00f8\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc"+
		"\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u0100\7)\2\2\u00ff"+
		"\u00ef\3\2\2\2\u00ff\u00f7\3\2\2\2\u0100\60\3\2\2\2\u0101\u0102\7*\2\2"+
		"\u0102\62\3\2\2\2\u0103\u0104\7+\2\2\u0104\64\3\2\2\2\u0105\u0106\7}\2"+
		"\2\u0106\66\3\2\2\2\u0107\u0108\7\177\2\2\u01088\3\2\2\2\u0109\u010a\7"+
		"=\2\2\u010a:\3\2\2\2\u010b\u010c\7?\2\2\u010c<\3\2\2\2\u010d\u010e\7?"+
		"\2\2\u010e\u010f\7?\2\2\u010f>\3\2\2\2\u0110\u0111\7-\2\2\u0111@\3\2\2"+
		"\2\u0112\u0113\7/\2\2\u0113B\3\2\2\2\u0114\u0115\7,\2\2\u0115D\3\2\2\2"+
		"\u0116\u0117\7\61\2\2\u0117F\3\2\2\2\u0118\u0119\7#\2\2\u0119H\3\2\2\2"+
		"\u011a\u011b\7>\2\2\u011bJ\3\2\2\2\u011c\u011d\7@\2\2\u011dL\3\2\2\2\u011e"+
		"\u011f\7>\2\2\u011f\u0120\7?\2\2\u0120N\3\2\2\2\u0121\u0122\7@\2\2\u0122"+
		"\u0123\7?\2\2\u0123P\3\2\2\2\u0124\u0125\7.\2\2\u0125R\3\2\2\2\u0126\u0127"+
		"\7r\2\2\u0127\u0128\7t\2\2\u0128\u0129\7k\2\2\u0129\u012a\7p\2\2\u012a"+
		"\u012b\7v\2\2\u012bT\3\2\2\2\u012c\u012d\7x\2\2\u012d\u012e\7c\2\2\u012e"+
		"\u012f\7t\2\2\u012fV\3\2\2\2\u0130\u0131\5\37\20\2\u0131X\3\2\2\2\u0132"+
		"\u0134\5!\21\2\u0133\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0133\3\2"+
		"\2\2\u0135\u0136\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\b-\2\2\u0138"+
		"Z\3\2\2\2\34\2tx|\u0082\u0085\u0087\u008c\u008e\u0095\u00a3\u00ab\u00b3"+
		"\u00b5\u00b9\u00bf\u00c5\u00cf\u00d4\u00d9\u00dd\u00e8\u00f3\u00fb\u00ff"+
		"\u0135";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}