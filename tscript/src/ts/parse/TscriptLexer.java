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
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, NUMERIC_LITERAL=7, BOOLEAN_LITERAL=8, 
		NULL_LITERAL=9, STRING_LITERAL=10, LPAREN=11, RPAREN=12, LBRACE=13, RBRACE=14, 
		SEMICOLON=15, ASSIGN=16, EQUALITY=17, PLUS=18, MINUS=19, ASTERISK=20, 
		DIVIDE=21, LOGICAL_NOT=22, LESS=23, GREATER=24, LESS_OR_EQUAL=25, GREATER_OR_EQUAL=26, 
		COMMA=27, COLON=28, PRINT=29, VAR=30, FUNCTION=31, IDENTIFIER=32, WhiteSpace=33;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'break'", "'while'", "'if'", "'else'", "'continue'", "'return'", "NUMERIC_LITERAL", 
		"BOOLEAN_LITERAL", "'null'", "STRING_LITERAL", "LPAREN", "RPAREN", "LBRACE", 
		"RBRACE", "SEMICOLON", "ASSIGN", "EQUALITY", "PLUS", "MINUS", "ASTERISK", 
		"DIVIDE", "LOGICAL_NOT", "LESS", "GREATER", "LESS_OR_EQUAL", "GREATER_OR_EQUAL", 
		"COMMA", "COLON", "'print'", "'var'", "'function'", "IDENTIFIER", "WhiteSpace"
	};
	public static final String[] ruleNames = {
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "DecimalLiteral", "DecimalIntegerLiteral", 
		"DecimalDigit", "DecimalDigits", "NonZeroDigit", "ExponentPart", "ExponentIndicator", 
		"SignedInteger", "HexIntegerLiteral", "HexDigit", "IdentifierCharacters", 
		"SpaceTokens", "SpaceChars", "EndOfLineComment", "LineTerminator", "NUMERIC_LITERAL", 
		"BOOLEAN_LITERAL", "NULL_LITERAL", "STRING_LITERAL", "LPAREN", "RPAREN", 
		"LBRACE", "RBRACE", "SEMICOLON", "ASSIGN", "EQUALITY", "PLUS", "MINUS", 
		"ASTERISK", "DIVIDE", "LOGICAL_NOT", "LESS", "GREATER", "LESS_OR_EQUAL", 
		"GREATER_OR_EQUAL", "COMMA", "COLON", "PRINT", "VAR", "FUNCTION", "IDENTIFIER", 
		"WhiteSpace"
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
		case 47: WhiteSpace_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WhiteSpace_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2#\u015c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\7\b\u008b\n"+
		"\b\f\b\16\b\u008e\13\b\3\b\5\b\u0091\n\b\3\b\3\b\5\b\u0095\n\b\3\b\3\b"+
		"\6\b\u0099\n\b\r\b\16\b\u009a\3\b\5\b\u009e\n\b\5\b\u00a0\n\b\3\t\3\t"+
		"\3\t\5\t\u00a5\n\t\5\t\u00a7\n\t\3\n\3\n\3\13\6\13\u00ac\n\13\r\13\16"+
		"\13\u00ad\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u00bc\n\17\3\20\3\20\3\20\3\20\6\20\u00c2\n\20\r\20\16\20\u00c3\3\20"+
		"\3\20\3\20\3\20\6\20\u00ca\n\20\r\20\16\20\u00cb\5\20\u00ce\n\20\3\21"+
		"\3\21\5\21\u00d2\n\21\3\22\3\22\7\22\u00d6\n\22\f\22\16\22\u00d9\13\22"+
		"\3\23\3\23\3\23\5\23\u00de\n\23\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u00e6"+
		"\n\25\f\25\16\25\u00e9\13\25\3\25\3\25\5\25\u00ed\n\25\3\26\3\26\3\26"+
		"\5\26\u00f2\n\26\3\27\3\27\5\27\u00f6\n\27\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\5\30\u0101\n\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\7\32\u010a\n\32\f\32\16\32\u010d\13\32\3\32\3\32\3\32\7\32\u0112\n\32"+
		"\f\32\16\32\u0115\13\32\3\32\5\32\u0118\n\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&"+
		"\3&\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3,\3,\3-\3-\3-\3-\3-\3-\3.\3"+
		".\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\61\6\61\u0157\n\61\r\61"+
		"\16\61\u0158\3\61\3\61\2\62\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\2"+
		"\1\21\2\1\23\2\1\25\2\1\27\2\1\31\2\1\33\2\1\35\2\1\37\2\1!\2\1#\2\1%"+
		"\2\1\'\2\1)\2\1+\2\1-\t\1/\n\1\61\13\1\63\f\1\65\r\1\67\16\19\17\1;\20"+
		"\1=\21\1?\22\1A\23\1C\24\1E\25\1G\26\1I\27\1K\30\1M\31\1O\32\1Q\33\1S"+
		"\34\1U\35\1W\36\1Y\37\1[ \1]!\1_\"\1a#\2\3\2\n\4\2GGgg\4\2CHch\5\2C\\"+
		"aac|\6\2\62;C\\aac|\5\2\13\13\16\16\"\"\4\2\f\f\17\17\5\2\f\f\17\17$$"+
		"\5\2\f\f\17\17))\u0168\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\3c\3\2\2\2\5i\3\2"+
		"\2\2\7o\3\2\2\2\tr\3\2\2\2\13w\3\2\2\2\r\u0080\3\2\2\2\17\u009f\3\2\2"+
		"\2\21\u00a6\3\2\2\2\23\u00a8\3\2\2\2\25\u00ab\3\2\2\2\27\u00af\3\2\2\2"+
		"\31\u00b1\3\2\2\2\33\u00b4\3\2\2\2\35\u00bb\3\2\2\2\37\u00cd\3\2\2\2!"+
		"\u00d1\3\2\2\2#\u00d3\3\2\2\2%\u00dd\3\2\2\2\'\u00df\3\2\2\2)\u00e1\3"+
		"\2\2\2+\u00f1\3\2\2\2-\u00f5\3\2\2\2/\u0100\3\2\2\2\61\u0102\3\2\2\2\63"+
		"\u0117\3\2\2\2\65\u0119\3\2\2\2\67\u011b\3\2\2\29\u011d\3\2\2\2;\u011f"+
		"\3\2\2\2=\u0121\3\2\2\2?\u0123\3\2\2\2A\u0125\3\2\2\2C\u0128\3\2\2\2E"+
		"\u012a\3\2\2\2G\u012c\3\2\2\2I\u012e\3\2\2\2K\u0130\3\2\2\2M\u0132\3\2"+
		"\2\2O\u0134\3\2\2\2Q\u0136\3\2\2\2S\u0139\3\2\2\2U\u013c\3\2\2\2W\u013e"+
		"\3\2\2\2Y\u0140\3\2\2\2[\u0146\3\2\2\2]\u014a\3\2\2\2_\u0153\3\2\2\2a"+
		"\u0156\3\2\2\2cd\7d\2\2de\7t\2\2ef\7g\2\2fg\7c\2\2gh\7m\2\2h\4\3\2\2\2"+
		"ij\7y\2\2jk\7j\2\2kl\7k\2\2lm\7n\2\2mn\7g\2\2n\6\3\2\2\2op\7k\2\2pq\7"+
		"h\2\2q\b\3\2\2\2rs\7g\2\2st\7n\2\2tu\7u\2\2uv\7g\2\2v\n\3\2\2\2wx\7e\2"+
		"\2xy\7q\2\2yz\7p\2\2z{\7v\2\2{|\7k\2\2|}\7p\2\2}~\7w\2\2~\177\7g\2\2\177"+
		"\f\3\2\2\2\u0080\u0081\7t\2\2\u0081\u0082\7g\2\2\u0082\u0083\7v\2\2\u0083"+
		"\u0084\7w\2\2\u0084\u0085\7t\2\2\u0085\u0086\7p\2\2\u0086\16\3\2\2\2\u0087"+
		"\u0088\5\21\t\2\u0088\u008c\7\60\2\2\u0089\u008b\5\25\13\2\u008a\u0089"+
		"\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0091\5\31\r\2\u0090\u008f\3"+
		"\2\2\2\u0090\u0091\3\2\2\2\u0091\u00a0\3\2\2\2\u0092\u0094\5\21\t\2\u0093"+
		"\u0095\5\31\r\2\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u00a0\3"+
		"\2\2\2\u0096\u0098\7\60\2\2\u0097\u0099\5\25\13\2\u0098\u0097\3\2\2\2"+
		"\u0099\u009a\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d"+
		"\3\2\2\2\u009c\u009e\5\31\r\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2"+
		"\u009e\u00a0\3\2\2\2\u009f\u0087\3\2\2\2\u009f\u0092\3\2\2\2\u009f\u0096"+
		"\3\2\2\2\u00a0\20\3\2\2\2\u00a1\u00a7\7\62\2\2\u00a2\u00a4\5\27\f\2\u00a3"+
		"\u00a5\5\25\13\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3"+
		"\2\2\2\u00a6\u00a1\3\2\2\2\u00a6\u00a2\3\2\2\2\u00a7\22\3\2\2\2\u00a8"+
		"\u00a9\4\62;\2\u00a9\24\3\2\2\2\u00aa\u00ac\5\23\n\2\u00ab\u00aa\3\2\2"+
		"\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\26"+
		"\3\2\2\2\u00af\u00b0\4\63;\2\u00b0\30\3\2\2\2\u00b1\u00b2\5\33\16\2\u00b2"+
		"\u00b3\5\35\17\2\u00b3\32\3\2\2\2\u00b4\u00b5\t\2\2\2\u00b5\34\3\2\2\2"+
		"\u00b6\u00bc\5\25\13\2\u00b7\u00b8\7-\2\2\u00b8\u00bc\5\25\13\2\u00b9"+
		"\u00ba\7/\2\2\u00ba\u00bc\5\25\13\2\u00bb\u00b6\3\2\2\2\u00bb\u00b7\3"+
		"\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\36\3\2\2\2\u00bd\u00be\7\62\2\2\u00be"+
		"\u00bf\7z\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00c2\5!\21\2\u00c1\u00c0\3\2"+
		"\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\u00ce\3\2\2\2\u00c5\u00c6\7\62\2\2\u00c6\u00c7\7Z\2\2\u00c7\u00c9\3\2"+
		"\2\2\u00c8\u00ca\5!\21\2\u00c9\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00bd\3\2"+
		"\2\2\u00cd\u00c5\3\2\2\2\u00ce \3\2\2\2\u00cf\u00d2\5\23\n\2\u00d0\u00d2"+
		"\t\3\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\"\3\2\2\2\u00d3"+
		"\u00d7\t\4\2\2\u00d4\u00d6\t\5\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3\2"+
		"\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8$\3\2\2\2\u00d9\u00d7"+
		"\3\2\2\2\u00da\u00de\5\'\24\2\u00db\u00de\5+\26\2\u00dc\u00de\5)\25\2"+
		"\u00dd\u00da\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de&\3"+
		"\2\2\2\u00df\u00e0\t\6\2\2\u00e0(\3\2\2\2\u00e1\u00e2\7\61\2\2\u00e2\u00e3"+
		"\7\61\2\2\u00e3\u00e7\3\2\2\2\u00e4\u00e6\n\7\2\2\u00e5\u00e4\3\2\2\2"+
		"\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ec"+
		"\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00ed\5+\26\2\u00eb\u00ed\7\2\2\3\u00ec"+
		"\u00ea\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed*\3\2\2\2\u00ee\u00ef\7\17\2\2"+
		"\u00ef\u00f2\7\f\2\2\u00f0\u00f2\t\7\2\2\u00f1\u00ee\3\2\2\2\u00f1\u00f0"+
		"\3\2\2\2\u00f2,\3\2\2\2\u00f3\u00f6\5\17\b\2\u00f4\u00f6\5\37\20\2\u00f5"+
		"\u00f3\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6.\3\2\2\2\u00f7\u00f8\7v\2\2\u00f8"+
		"\u00f9\7t\2\2\u00f9\u00fa\7w\2\2\u00fa\u0101\7g\2\2\u00fb\u00fc\7h\2\2"+
		"\u00fc\u00fd\7c\2\2\u00fd\u00fe\7n\2\2\u00fe\u00ff\7u\2\2\u00ff\u0101"+
		"\7g\2\2\u0100\u00f7\3\2\2\2\u0100\u00fb\3\2\2\2\u0101\60\3\2\2\2\u0102"+
		"\u0103\7p\2\2\u0103\u0104\7w\2\2\u0104\u0105\7n\2\2\u0105\u0106\7n\2\2"+
		"\u0106\62\3\2\2\2\u0107\u010b\7$\2\2\u0108\u010a\n\b\2\2\u0109\u0108\3"+
		"\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"\u010e\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u0118\7$\2\2\u010f\u0113\7)\2"+
		"\2\u0110\u0112\n\t\2\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111"+
		"\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0113\3\2\2\2\u0116"+
		"\u0118\7)\2\2\u0117\u0107\3\2\2\2\u0117\u010f\3\2\2\2\u0118\64\3\2\2\2"+
		"\u0119\u011a\7*\2\2\u011a\66\3\2\2\2\u011b\u011c\7+\2\2\u011c8\3\2\2\2"+
		"\u011d\u011e\7}\2\2\u011e:\3\2\2\2\u011f\u0120\7\177\2\2\u0120<\3\2\2"+
		"\2\u0121\u0122\7=\2\2\u0122>\3\2\2\2\u0123\u0124\7?\2\2\u0124@\3\2\2\2"+
		"\u0125\u0126\7?\2\2\u0126\u0127\7?\2\2\u0127B\3\2\2\2\u0128\u0129\7-\2"+
		"\2\u0129D\3\2\2\2\u012a\u012b\7/\2\2\u012bF\3\2\2\2\u012c\u012d\7,\2\2"+
		"\u012dH\3\2\2\2\u012e\u012f\7\61\2\2\u012fJ\3\2\2\2\u0130\u0131\7#\2\2"+
		"\u0131L\3\2\2\2\u0132\u0133\7>\2\2\u0133N\3\2\2\2\u0134\u0135\7@\2\2\u0135"+
		"P\3\2\2\2\u0136\u0137\7>\2\2\u0137\u0138\7?\2\2\u0138R\3\2\2\2\u0139\u013a"+
		"\7@\2\2\u013a\u013b\7?\2\2\u013bT\3\2\2\2\u013c\u013d\7.\2\2\u013dV\3"+
		"\2\2\2\u013e\u013f\7<\2\2\u013fX\3\2\2\2\u0140\u0141\7r\2\2\u0141\u0142"+
		"\7t\2\2\u0142\u0143\7k\2\2\u0143\u0144\7p\2\2\u0144\u0145\7v\2\2\u0145"+
		"Z\3\2\2\2\u0146\u0147\7x\2\2\u0147\u0148\7c\2\2\u0148\u0149\7t\2\2\u0149"+
		"\\\3\2\2\2\u014a\u014b\7h\2\2\u014b\u014c\7w\2\2\u014c\u014d\7p\2\2\u014d"+
		"\u014e\7e\2\2\u014e\u014f\7v\2\2\u014f\u0150\7k\2\2\u0150\u0151\7q\2\2"+
		"\u0151\u0152\7p\2\2\u0152^\3\2\2\2\u0153\u0154\5#\22\2\u0154`\3\2\2\2"+
		"\u0155\u0157\5%\23\2\u0156\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0156"+
		"\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\b\61\2\2"+
		"\u015bb\3\2\2\2\34\2\u008c\u0090\u0094\u009a\u009d\u009f\u00a4\u00a6\u00ad"+
		"\u00bb\u00c3\u00cb\u00cd\u00d1\u00d7\u00dd\u00e7\u00ec\u00f1\u00f5\u0100"+
		"\u010b\u0113\u0117\u0158";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}