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
		T__11=1, T__10=2, T__9=3, T__8=4, T__7=5, T__6=6, T__5=7, T__4=8, T__3=9, 
		T__2=10, T__1=11, T__0=12, NUMERIC_LITERAL=13, BOOLEAN_LITERAL=14, NULL_LITERAL=15, 
		STRING_LITERAL=16, LPAREN=17, RPAREN=18, LBRACE=19, RBRACE=20, SEMICOLON=21, 
		ASSIGN=22, EQUALITY=23, PLUS=24, MINUS=25, ASTERISK=26, DIVIDE=27, LOGICAL_NOT=28, 
		LESS=29, GREATER=30, LESS_OR_EQUAL=31, GREATER_OR_EQUAL=32, COMMA=33, 
		COLON=34, PRINT=35, VAR=36, IDENTIFIER=37, WhiteSpace=38;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'{'", "'function'", "')'", "','", "'break'", "'while'", "'('", "'if'", 
		"'else'", "'continue'", "'return'", "'}'", "NUMERIC_LITERAL", "BOOLEAN_LITERAL", 
		"'null'", "STRING_LITERAL", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "SEMICOLON", 
		"ASSIGN", "EQUALITY", "PLUS", "MINUS", "ASTERISK", "DIVIDE", "LOGICAL_NOT", 
		"LESS", "GREATER", "LESS_OR_EQUAL", "GREATER_OR_EQUAL", "COMMA", "COLON", 
		"'print'", "'var'", "IDENTIFIER", "WhiteSpace"
	};
	public static final String[] ruleNames = {
		"T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", 
		"T__2", "T__1", "T__0", "DecimalLiteral", "DecimalIntegerLiteral", "DecimalDigit", 
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
		case 52: WhiteSpace_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WhiteSpace_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2(\u0170\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\7\16\u00a8"+
		"\n\16\f\16\16\16\u00ab\13\16\3\16\5\16\u00ae\n\16\3\16\3\16\5\16\u00b2"+
		"\n\16\3\16\3\16\6\16\u00b6\n\16\r\16\16\16\u00b7\3\16\5\16\u00bb\n\16"+
		"\5\16\u00bd\n\16\3\17\3\17\3\17\5\17\u00c2\n\17\5\17\u00c4\n\17\3\20\3"+
		"\20\3\21\6\21\u00c9\n\21\r\21\16\21\u00ca\3\22\3\22\3\23\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\5\25\u00d9\n\25\3\26\3\26\3\26\3\26\6\26"+
		"\u00df\n\26\r\26\16\26\u00e0\3\26\3\26\3\26\3\26\6\26\u00e7\n\26\r\26"+
		"\16\26\u00e8\5\26\u00eb\n\26\3\27\3\27\5\27\u00ef\n\27\3\30\3\30\7\30"+
		"\u00f3\n\30\f\30\16\30\u00f6\13\30\3\31\3\31\3\31\5\31\u00fb\n\31\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\7\33\u0103\n\33\f\33\16\33\u0106\13\33\3\33"+
		"\3\33\5\33\u010a\n\33\3\34\3\34\3\34\5\34\u010f\n\34\3\35\3\35\5\35\u0113"+
		"\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u011e\n\36\3\37"+
		"\3\37\3\37\3\37\3\37\3 \3 \7 \u0127\n \f \16 \u012a\13 \3 \3 \3 \7 \u012f"+
		"\n \f \16 \u0132\13 \3 \5 \u0135\n \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3"+
		"&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3"+
		"\60\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3"+
		"\64\3\64\3\64\3\65\3\65\3\66\6\66\u016b\n\66\r\66\16\66\u016c\3\66\3\66"+
		"\2\67\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f"+
		"\1\27\r\1\31\16\1\33\2\1\35\2\1\37\2\1!\2\1#\2\1%\2\1\'\2\1)\2\1+\2\1"+
		"-\2\1/\2\1\61\2\1\63\2\1\65\2\1\67\2\19\17\1;\20\1=\21\1?\22\1A\23\1C"+
		"\24\1E\25\1G\26\1I\27\1K\30\1M\31\1O\32\1Q\33\1S\34\1U\35\1W\36\1Y\37"+
		"\1[ \1]!\1_\"\1a#\1c$\1e%\1g&\1i\'\1k(\2\3\2\n\4\2GGgg\4\2CHch\5\2C\\"+
		"aac|\6\2\62;C\\aac|\5\2\13\13\16\16\"\"\4\2\f\f\17\17\5\2\f\f\17\17$$"+
		"\5\2\f\f\17\17))\u017c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2"+
		"e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\3m\3\2\2\2\5o\3\2\2\2\7x\3"+
		"\2\2\2\tz\3\2\2\2\13|\3\2\2\2\r\u0082\3\2\2\2\17\u0088\3\2\2\2\21\u008a"+
		"\3\2\2\2\23\u008d\3\2\2\2\25\u0092\3\2\2\2\27\u009b\3\2\2\2\31\u00a2\3"+
		"\2\2\2\33\u00bc\3\2\2\2\35\u00c3\3\2\2\2\37\u00c5\3\2\2\2!\u00c8\3\2\2"+
		"\2#\u00cc\3\2\2\2%\u00ce\3\2\2\2\'\u00d1\3\2\2\2)\u00d8\3\2\2\2+\u00ea"+
		"\3\2\2\2-\u00ee\3\2\2\2/\u00f0\3\2\2\2\61\u00fa\3\2\2\2\63\u00fc\3\2\2"+
		"\2\65\u00fe\3\2\2\2\67\u010e\3\2\2\29\u0112\3\2\2\2;\u011d\3\2\2\2=\u011f"+
		"\3\2\2\2?\u0134\3\2\2\2A\u0136\3\2\2\2C\u0138\3\2\2\2E\u013a\3\2\2\2G"+
		"\u013c\3\2\2\2I\u013e\3\2\2\2K\u0140\3\2\2\2M\u0142\3\2\2\2O\u0145\3\2"+
		"\2\2Q\u0147\3\2\2\2S\u0149\3\2\2\2U\u014b\3\2\2\2W\u014d\3\2\2\2Y\u014f"+
		"\3\2\2\2[\u0151\3\2\2\2]\u0153\3\2\2\2_\u0156\3\2\2\2a\u0159\3\2\2\2c"+
		"\u015b\3\2\2\2e\u015d\3\2\2\2g\u0163\3\2\2\2i\u0167\3\2\2\2k\u016a\3\2"+
		"\2\2mn\7}\2\2n\4\3\2\2\2op\7h\2\2pq\7w\2\2qr\7p\2\2rs\7e\2\2st\7v\2\2"+
		"tu\7k\2\2uv\7q\2\2vw\7p\2\2w\6\3\2\2\2xy\7+\2\2y\b\3\2\2\2z{\7.\2\2{\n"+
		"\3\2\2\2|}\7d\2\2}~\7t\2\2~\177\7g\2\2\177\u0080\7c\2\2\u0080\u0081\7"+
		"m\2\2\u0081\f\3\2\2\2\u0082\u0083\7y\2\2\u0083\u0084\7j\2\2\u0084\u0085"+
		"\7k\2\2\u0085\u0086\7n\2\2\u0086\u0087\7g\2\2\u0087\16\3\2\2\2\u0088\u0089"+
		"\7*\2\2\u0089\20\3\2\2\2\u008a\u008b\7k\2\2\u008b\u008c\7h\2\2\u008c\22"+
		"\3\2\2\2\u008d\u008e\7g\2\2\u008e\u008f\7n\2\2\u008f\u0090\7u\2\2\u0090"+
		"\u0091\7g\2\2\u0091\24\3\2\2\2\u0092\u0093\7e\2\2\u0093\u0094\7q\2\2\u0094"+
		"\u0095\7p\2\2\u0095\u0096\7v\2\2\u0096\u0097\7k\2\2\u0097\u0098\7p\2\2"+
		"\u0098\u0099\7w\2\2\u0099\u009a\7g\2\2\u009a\26\3\2\2\2\u009b\u009c\7"+
		"t\2\2\u009c\u009d\7g\2\2\u009d\u009e\7v\2\2\u009e\u009f\7w\2\2\u009f\u00a0"+
		"\7t\2\2\u00a0\u00a1\7p\2\2\u00a1\30\3\2\2\2\u00a2\u00a3\7\177\2\2\u00a3"+
		"\32\3\2\2\2\u00a4\u00a5\5\35\17\2\u00a5\u00a9\7\60\2\2\u00a6\u00a8\5!"+
		"\21\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ae\5%"+
		"\23\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00bd\3\2\2\2\u00af"+
		"\u00b1\5\35\17\2\u00b0\u00b2\5%\23\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3"+
		"\2\2\2\u00b2\u00bd\3\2\2\2\u00b3\u00b5\7\60\2\2\u00b4\u00b6\5!\21\2\u00b5"+
		"\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2"+
		"\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00bb\5%\23\2\u00ba\u00b9\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00a4\3\2\2\2\u00bc\u00af\3\2"+
		"\2\2\u00bc\u00b3\3\2\2\2\u00bd\34\3\2\2\2\u00be\u00c4\7\62\2\2\u00bf\u00c1"+
		"\5#\22\2\u00c0\u00c2\5!\21\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c4\3\2\2\2\u00c3\u00be\3\2\2\2\u00c3\u00bf\3\2\2\2\u00c4\36\3\2\2"+
		"\2\u00c5\u00c6\4\62;\2\u00c6 \3\2\2\2\u00c7\u00c9\5\37\20\2\u00c8\u00c7"+
		"\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\"\3\2\2\2\u00cc\u00cd\4\63;\2\u00cd$\3\2\2\2\u00ce\u00cf\5\'\24\2\u00cf"+
		"\u00d0\5)\25\2\u00d0&\3\2\2\2\u00d1\u00d2\t\2\2\2\u00d2(\3\2\2\2\u00d3"+
		"\u00d9\5!\21\2\u00d4\u00d5\7-\2\2\u00d5\u00d9\5!\21\2\u00d6\u00d7\7/\2"+
		"\2\u00d7\u00d9\5!\21\2\u00d8\u00d3\3\2\2\2\u00d8\u00d4\3\2\2\2\u00d8\u00d6"+
		"\3\2\2\2\u00d9*\3\2\2\2\u00da\u00db\7\62\2\2\u00db\u00dc\7z\2\2\u00dc"+
		"\u00de\3\2\2\2\u00dd\u00df\5-\27\2\u00de\u00dd\3\2\2\2\u00df\u00e0\3\2"+
		"\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00eb\3\2\2\2\u00e2"+
		"\u00e3\7\62\2\2\u00e3\u00e4\7Z\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e7\5-"+
		"\27\2\u00e6\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00da\3\2\2\2\u00ea\u00e2\3\2"+
		"\2\2\u00eb,\3\2\2\2\u00ec\u00ef\5\37\20\2\u00ed\u00ef\t\3\2\2\u00ee\u00ec"+
		"\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef.\3\2\2\2\u00f0\u00f4\t\4\2\2\u00f1"+
		"\u00f3\t\5\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2"+
		"\2\2\u00f4\u00f5\3\2\2\2\u00f5\60\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00fb"+
		"\5\63\32\2\u00f8\u00fb\5\67\34\2\u00f9\u00fb\5\65\33\2\u00fa\u00f7\3\2"+
		"\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb\62\3\2\2\2\u00fc\u00fd"+
		"\t\6\2\2\u00fd\64\3\2\2\2\u00fe\u00ff\7\61\2\2\u00ff\u0100\7\61\2\2\u0100"+
		"\u0104\3\2\2\2\u0101\u0103\n\7\2\2\u0102\u0101\3\2\2\2\u0103\u0106\3\2"+
		"\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0109\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0107\u010a\5\67\34\2\u0108\u010a\7\2\2\3\u0109\u0107\3"+
		"\2\2\2\u0109\u0108\3\2\2\2\u010a\66\3\2\2\2\u010b\u010c\7\17\2\2\u010c"+
		"\u010f\7\f\2\2\u010d\u010f\t\7\2\2\u010e\u010b\3\2\2\2\u010e\u010d\3\2"+
		"\2\2\u010f8\3\2\2\2\u0110\u0113\5\33\16\2\u0111\u0113\5+\26\2\u0112\u0110"+
		"\3\2\2\2\u0112\u0111\3\2\2\2\u0113:\3\2\2\2\u0114\u0115\7v\2\2\u0115\u0116"+
		"\7t\2\2\u0116\u0117\7w\2\2\u0117\u011e\7g\2\2\u0118\u0119\7h\2\2\u0119"+
		"\u011a\7c\2\2\u011a\u011b\7n\2\2\u011b\u011c\7u\2\2\u011c\u011e\7g\2\2"+
		"\u011d\u0114\3\2\2\2\u011d\u0118\3\2\2\2\u011e<\3\2\2\2\u011f\u0120\7"+
		"p\2\2\u0120\u0121\7w\2\2\u0121\u0122\7n\2\2\u0122\u0123\7n\2\2\u0123>"+
		"\3\2\2\2\u0124\u0128\7$\2\2\u0125\u0127\n\b\2\2\u0126\u0125\3\2\2\2\u0127"+
		"\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012b\3\2"+
		"\2\2\u012a\u0128\3\2\2\2\u012b\u0135\7$\2\2\u012c\u0130\7)\2\2\u012d\u012f"+
		"\n\t\2\2\u012e\u012d\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u0133\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0135\7)"+
		"\2\2\u0134\u0124\3\2\2\2\u0134\u012c\3\2\2\2\u0135@\3\2\2\2\u0136\u0137"+
		"\7*\2\2\u0137B\3\2\2\2\u0138\u0139\7+\2\2\u0139D\3\2\2\2\u013a\u013b\7"+
		"}\2\2\u013bF\3\2\2\2\u013c\u013d\7\177\2\2\u013dH\3\2\2\2\u013e\u013f"+
		"\7=\2\2\u013fJ\3\2\2\2\u0140\u0141\7?\2\2\u0141L\3\2\2\2\u0142\u0143\7"+
		"?\2\2\u0143\u0144\7?\2\2\u0144N\3\2\2\2\u0145\u0146\7-\2\2\u0146P\3\2"+
		"\2\2\u0147\u0148\7/\2\2\u0148R\3\2\2\2\u0149\u014a\7,\2\2\u014aT\3\2\2"+
		"\2\u014b\u014c\7\61\2\2\u014cV\3\2\2\2\u014d\u014e\7#\2\2\u014eX\3\2\2"+
		"\2\u014f\u0150\7>\2\2\u0150Z\3\2\2\2\u0151\u0152\7@\2\2\u0152\\\3\2\2"+
		"\2\u0153\u0154\7>\2\2\u0154\u0155\7?\2\2\u0155^\3\2\2\2\u0156\u0157\7"+
		"@\2\2\u0157\u0158\7?\2\2\u0158`\3\2\2\2\u0159\u015a\7.\2\2\u015ab\3\2"+
		"\2\2\u015b\u015c\7<\2\2\u015cd\3\2\2\2\u015d\u015e\7r\2\2\u015e\u015f"+
		"\7t\2\2\u015f\u0160\7k\2\2\u0160\u0161\7p\2\2\u0161\u0162\7v\2\2\u0162"+
		"f\3\2\2\2\u0163\u0164\7x\2\2\u0164\u0165\7c\2\2\u0165\u0166\7t\2\2\u0166"+
		"h\3\2\2\2\u0167\u0168\5/\30\2\u0168j\3\2\2\2\u0169\u016b\5\61\31\2\u016a"+
		"\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2"+
		"\2\2\u016d\u016e\3\2\2\2\u016e\u016f\b\66\2\2\u016fl\3\2\2\2\34\2\u00a9"+
		"\u00ad\u00b1\u00b7\u00ba\u00bc\u00c1\u00c3\u00ca\u00d8\u00e0\u00e8\u00ea"+
		"\u00ee\u00f4\u00fa\u0104\u0109\u010e\u0112\u011d\u0128\u0130\u0134\u016c";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}