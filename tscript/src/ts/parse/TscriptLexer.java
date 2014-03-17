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
		T__10=1, T__9=2, T__8=3, T__7=4, T__6=5, T__5=6, T__4=7, T__3=8, T__2=9, 
		T__1=10, T__0=11, NUMERIC_LITERAL=12, BOOLEAN_LITERAL=13, NULL_LITERAL=14, 
		STRING_LITERAL=15, LPAREN=16, RPAREN=17, LBRACE=18, RBRACE=19, SEMICOLON=20, 
		ASSIGN=21, EQUALITY=22, PLUS=23, MINUS=24, ASTERISK=25, DIVIDE=26, LOGICAL_NOT=27, 
		LESS=28, GREATER=29, LESS_OR_EQUAL=30, GREATER_OR_EQUAL=31, COMMA=32, 
		COLON=33, PRINT=34, VAR=35, IDENTIFIER=36, WhiteSpace=37;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'{'", "'function'", "')'", "','", "'break'", "'while'", "'('", "'if'", 
		"'else'", "'continue'", "'}'", "NUMERIC_LITERAL", "BOOLEAN_LITERAL", "'null'", 
		"STRING_LITERAL", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "SEMICOLON", 
		"ASSIGN", "EQUALITY", "PLUS", "MINUS", "ASTERISK", "DIVIDE", "LOGICAL_NOT", 
		"LESS", "GREATER", "LESS_OR_EQUAL", "GREATER_OR_EQUAL", "COMMA", "COLON", 
		"'print'", "'var'", "IDENTIFIER", "WhiteSpace"
	};
	public static final String[] ruleNames = {
		"T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", 
		"T__1", "T__0", "DecimalLiteral", "DecimalIntegerLiteral", "DecimalDigit", 
		"DecimalDigits", "NonZeroDigit", "ExponentPart", "ExponentIndicator", 
		"SignedInteger", "HexIntegerLiteral", "HexDigit", "IdentifierCharacters", 
		"SpaceTokens", "SpaceChars", "EndOfLineComment", "LineTerminator", "NUMERIC_LITERAL", 
		"BOOLEAN_LITERAL", "NULL_LITERAL", "STRING_LITERAL", "LPAREN", "RPAREN", 
		"LBRACE", "RBRACE", "SEMICOLON", "ASSIGN", "EQUALITY", "PLUS", "MINUS", 
		"ASTERISK", "DIVIDE", "LOGICAL_NOT", "LESS", "GREATER", "LESS_OR_EQUAL", 
		"GREATER_OR_EQUAL", "COMMA", "COLON", "PRINT", "VAR", "IDENTIFIER", "WhiteSpace"
	};


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
		case 51: WhiteSpace_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WhiteSpace_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\'\u0167\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\r\7\r\u009f\n\r\f\r\16\r\u00a2\13\r\3\r\5\r\u00a5\n\r"+
		"\3\r\3\r\5\r\u00a9\n\r\3\r\3\r\6\r\u00ad\n\r\r\r\16\r\u00ae\3\r\5\r\u00b2"+
		"\n\r\5\r\u00b4\n\r\3\16\3\16\3\16\5\16\u00b9\n\16\5\16\u00bb\n\16\3\17"+
		"\3\17\3\20\6\20\u00c0\n\20\r\20\16\20\u00c1\3\21\3\21\3\22\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\5\24\u00d0\n\24\3\25\3\25\3\25\3\25"+
		"\6\25\u00d6\n\25\r\25\16\25\u00d7\3\25\3\25\3\25\3\25\6\25\u00de\n\25"+
		"\r\25\16\25\u00df\5\25\u00e2\n\25\3\26\3\26\5\26\u00e6\n\26\3\27\3\27"+
		"\7\27\u00ea\n\27\f\27\16\27\u00ed\13\27\3\30\3\30\3\30\5\30\u00f2\n\30"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\7\32\u00fa\n\32\f\32\16\32\u00fd\13\32"+
		"\3\32\3\32\5\32\u0101\n\32\3\33\3\33\3\33\5\33\u0106\n\33\3\34\3\34\5"+
		"\34\u010a\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0115"+
		"\n\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\7\37\u011e\n\37\f\37\16\37\u0121"+
		"\13\37\3\37\3\37\3\37\7\37\u0126\n\37\f\37\16\37\u0129\13\37\3\37\5\37"+
		"\u012c\n\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3("+
		"\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\61\3\61"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\65\6\65"+
		"\u0162\n\65\r\65\16\65\u0163\3\65\3\65\2\66\3\3\1\5\4\1\7\5\1\t\6\1\13"+
		"\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\2\1\33\2\1\35\2\1\37"+
		"\2\1!\2\1#\2\1%\2\1\'\2\1)\2\1+\2\1-\2\1/\2\1\61\2\1\63\2\1\65\2\1\67"+
		"\16\19\17\1;\20\1=\21\1?\22\1A\23\1C\24\1E\25\1G\26\1I\27\1K\30\1M\31"+
		"\1O\32\1Q\33\1S\34\1U\35\1W\36\1Y\37\1[ \1]!\1_\"\1a#\1c$\1e%\1g&\1i\'"+
		"\2\3\2\n\4\2GGgg\4\2CHch\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\13\16\16\"\""+
		"\4\2\f\f\17\17\5\2\f\f\17\17$$\5\2\f\f\17\17))\u0173\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\3k\3\2\2\2"+
		"\5m\3\2\2\2\7v\3\2\2\2\tx\3\2\2\2\13z\3\2\2\2\r\u0080\3\2\2\2\17\u0086"+
		"\3\2\2\2\21\u0088\3\2\2\2\23\u008b\3\2\2\2\25\u0090\3\2\2\2\27\u0099\3"+
		"\2\2\2\31\u00b3\3\2\2\2\33\u00ba\3\2\2\2\35\u00bc\3\2\2\2\37\u00bf\3\2"+
		"\2\2!\u00c3\3\2\2\2#\u00c5\3\2\2\2%\u00c8\3\2\2\2\'\u00cf\3\2\2\2)\u00e1"+
		"\3\2\2\2+\u00e5\3\2\2\2-\u00e7\3\2\2\2/\u00f1\3\2\2\2\61\u00f3\3\2\2\2"+
		"\63\u00f5\3\2\2\2\65\u0105\3\2\2\2\67\u0109\3\2\2\29\u0114\3\2\2\2;\u0116"+
		"\3\2\2\2=\u012b\3\2\2\2?\u012d\3\2\2\2A\u012f\3\2\2\2C\u0131\3\2\2\2E"+
		"\u0133\3\2\2\2G\u0135\3\2\2\2I\u0137\3\2\2\2K\u0139\3\2\2\2M\u013c\3\2"+
		"\2\2O\u013e\3\2\2\2Q\u0140\3\2\2\2S\u0142\3\2\2\2U\u0144\3\2\2\2W\u0146"+
		"\3\2\2\2Y\u0148\3\2\2\2[\u014a\3\2\2\2]\u014d\3\2\2\2_\u0150\3\2\2\2a"+
		"\u0152\3\2\2\2c\u0154\3\2\2\2e\u015a\3\2\2\2g\u015e\3\2\2\2i\u0161\3\2"+
		"\2\2kl\7}\2\2l\4\3\2\2\2mn\7h\2\2no\7w\2\2op\7p\2\2pq\7e\2\2qr\7v\2\2"+
		"rs\7k\2\2st\7q\2\2tu\7p\2\2u\6\3\2\2\2vw\7+\2\2w\b\3\2\2\2xy\7.\2\2y\n"+
		"\3\2\2\2z{\7d\2\2{|\7t\2\2|}\7g\2\2}~\7c\2\2~\177\7m\2\2\177\f\3\2\2\2"+
		"\u0080\u0081\7y\2\2\u0081\u0082\7j\2\2\u0082\u0083\7k\2\2\u0083\u0084"+
		"\7n\2\2\u0084\u0085\7g\2\2\u0085\16\3\2\2\2\u0086\u0087\7*\2\2\u0087\20"+
		"\3\2\2\2\u0088\u0089\7k\2\2\u0089\u008a\7h\2\2\u008a\22\3\2\2\2\u008b"+
		"\u008c\7g\2\2\u008c\u008d\7n\2\2\u008d\u008e\7u\2\2\u008e\u008f\7g\2\2"+
		"\u008f\24\3\2\2\2\u0090\u0091\7e\2\2\u0091\u0092\7q\2\2\u0092\u0093\7"+
		"p\2\2\u0093\u0094\7v\2\2\u0094\u0095\7k\2\2\u0095\u0096\7p\2\2\u0096\u0097"+
		"\7w\2\2\u0097\u0098\7g\2\2\u0098\26\3\2\2\2\u0099\u009a\7\177\2\2\u009a"+
		"\30\3\2\2\2\u009b\u009c\5\33\16\2\u009c\u00a0\7\60\2\2\u009d\u009f\5\37"+
		"\20\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a5\5#"+
		"\22\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00b4\3\2\2\2\u00a6"+
		"\u00a8\5\33\16\2\u00a7\u00a9\5#\22\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9\3"+
		"\2\2\2\u00a9\u00b4\3\2\2\2\u00aa\u00ac\7\60\2\2\u00ab\u00ad\5\37\20\2"+
		"\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af"+
		"\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00b2\5#\22\2\u00b1\u00b0\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u009b\3\2\2\2\u00b3\u00a6\3\2"+
		"\2\2\u00b3\u00aa\3\2\2\2\u00b4\32\3\2\2\2\u00b5\u00bb\7\62\2\2\u00b6\u00b8"+
		"\5!\21\2\u00b7\u00b9\5\37\20\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2"+
		"\u00b9\u00bb\3\2\2\2\u00ba\u00b5\3\2\2\2\u00ba\u00b6\3\2\2\2\u00bb\34"+
		"\3\2\2\2\u00bc\u00bd\4\62;\2\u00bd\36\3\2\2\2\u00be\u00c0\5\35\17\2\u00bf"+
		"\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2 \3\2\2\2\u00c3\u00c4\4\63;\2\u00c4\"\3\2\2\2\u00c5\u00c6\5"+
		"%\23\2\u00c6\u00c7\5\'\24\2\u00c7$\3\2\2\2\u00c8\u00c9\t\2\2\2\u00c9&"+
		"\3\2\2\2\u00ca\u00d0\5\37\20\2\u00cb\u00cc\7-\2\2\u00cc\u00d0\5\37\20"+
		"\2\u00cd\u00ce\7/\2\2\u00ce\u00d0\5\37\20\2\u00cf\u00ca\3\2\2\2\u00cf"+
		"\u00cb\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0(\3\2\2\2\u00d1\u00d2\7\62\2\2"+
		"\u00d2\u00d3\7z\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d6\5+\26\2\u00d5\u00d4"+
		"\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00e2\3\2\2\2\u00d9\u00da\7\62\2\2\u00da\u00db\7Z\2\2\u00db\u00dd\3\2"+
		"\2\2\u00dc\u00de\5+\26\2\u00dd\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00d1\3\2"+
		"\2\2\u00e1\u00d9\3\2\2\2\u00e2*\3\2\2\2\u00e3\u00e6\5\35\17\2\u00e4\u00e6"+
		"\t\3\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6,\3\2\2\2\u00e7"+
		"\u00eb\t\4\2\2\u00e8\u00ea\t\5\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00ed\3\2"+
		"\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec.\3\2\2\2\u00ed\u00eb"+
		"\3\2\2\2\u00ee\u00f2\5\61\31\2\u00ef\u00f2\5\65\33\2\u00f0\u00f2\5\63"+
		"\32\2\u00f1\u00ee\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2"+
		"\60\3\2\2\2\u00f3\u00f4\t\6\2\2\u00f4\62\3\2\2\2\u00f5\u00f6\7\61\2\2"+
		"\u00f6\u00f7\7\61\2\2\u00f7\u00fb\3\2\2\2\u00f8\u00fa\n\7\2\2\u00f9\u00f8"+
		"\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"\u0100\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u0101\5\65\33\2\u00ff\u0101\7"+
		"\2\2\3\u0100\u00fe\3\2\2\2\u0100\u00ff\3\2\2\2\u0101\64\3\2\2\2\u0102"+
		"\u0103\7\17\2\2\u0103\u0106\7\f\2\2\u0104\u0106\t\7\2\2\u0105\u0102\3"+
		"\2\2\2\u0105\u0104\3\2\2\2\u0106\66\3\2\2\2\u0107\u010a\5\31\r\2\u0108"+
		"\u010a\5)\25\2\u0109\u0107\3\2\2\2\u0109\u0108\3\2\2\2\u010a8\3\2\2\2"+
		"\u010b\u010c\7v\2\2\u010c\u010d\7t\2\2\u010d\u010e\7w\2\2\u010e\u0115"+
		"\7g\2\2\u010f\u0110\7h\2\2\u0110\u0111\7c\2\2\u0111\u0112\7n\2\2\u0112"+
		"\u0113\7u\2\2\u0113\u0115\7g\2\2\u0114\u010b\3\2\2\2\u0114\u010f\3\2\2"+
		"\2\u0115:\3\2\2\2\u0116\u0117\7p\2\2\u0117\u0118\7w\2\2\u0118\u0119\7"+
		"n\2\2\u0119\u011a\7n\2\2\u011a<\3\2\2\2\u011b\u011f\7$\2\2\u011c\u011e"+
		"\n\b\2\2\u011d\u011c\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120\u0122\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u012c\7$"+
		"\2\2\u0123\u0127\7)\2\2\u0124\u0126\n\t\2\2\u0125\u0124\3\2\2\2\u0126"+
		"\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a\3\2"+
		"\2\2\u0129\u0127\3\2\2\2\u012a\u012c\7)\2\2\u012b\u011b\3\2\2\2\u012b"+
		"\u0123\3\2\2\2\u012c>\3\2\2\2\u012d\u012e\7*\2\2\u012e@\3\2\2\2\u012f"+
		"\u0130\7+\2\2\u0130B\3\2\2\2\u0131\u0132\7}\2\2\u0132D\3\2\2\2\u0133\u0134"+
		"\7\177\2\2\u0134F\3\2\2\2\u0135\u0136\7=\2\2\u0136H\3\2\2\2\u0137\u0138"+
		"\7?\2\2\u0138J\3\2\2\2\u0139\u013a\7?\2\2\u013a\u013b\7?\2\2\u013bL\3"+
		"\2\2\2\u013c\u013d\7-\2\2\u013dN\3\2\2\2\u013e\u013f\7/\2\2\u013fP\3\2"+
		"\2\2\u0140\u0141\7,\2\2\u0141R\3\2\2\2\u0142\u0143\7\61\2\2\u0143T\3\2"+
		"\2\2\u0144\u0145\7#\2\2\u0145V\3\2\2\2\u0146\u0147\7>\2\2\u0147X\3\2\2"+
		"\2\u0148\u0149\7@\2\2\u0149Z\3\2\2\2\u014a\u014b\7>\2\2\u014b\u014c\7"+
		"?\2\2\u014c\\\3\2\2\2\u014d\u014e\7@\2\2\u014e\u014f\7?\2\2\u014f^\3\2"+
		"\2\2\u0150\u0151\7.\2\2\u0151`\3\2\2\2\u0152\u0153\7<\2\2\u0153b\3\2\2"+
		"\2\u0154\u0155\7r\2\2\u0155\u0156\7t\2\2\u0156\u0157\7k\2\2\u0157\u0158"+
		"\7p\2\2\u0158\u0159\7v\2\2\u0159d\3\2\2\2\u015a\u015b\7x\2\2\u015b\u015c"+
		"\7c\2\2\u015c\u015d\7t\2\2\u015df\3\2\2\2\u015e\u015f\5-\27\2\u015fh\3"+
		"\2\2\2\u0160\u0162\5/\30\2\u0161\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		"\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\b\65"+
		"\2\2\u0166j\3\2\2\2\34\2\u00a0\u00a4\u00a8\u00ae\u00b1\u00b3\u00b8\u00ba"+
		"\u00c1\u00cf\u00d7\u00df\u00e1\u00e5\u00eb\u00f1\u00fb\u0100\u0105\u0109"+
		"\u0114\u011f\u0127\u012b\u0163";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}