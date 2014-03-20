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
		LESS_OR_EQUAL=19, GREATER_OR_EQUAL=20, COMMA=21, COLON=22, PRINT=23, VAR=24, 
		FUNCTION=25, RETURN=26, CONTINUE=27, BREAK=28, THROW=29, WHILE=30, IF=31, 
		ELSE=32, IDENTIFIER=33, WhiteSpace=34;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"NUMERIC_LITERAL", "BOOLEAN_LITERAL", "'null'", "STRING_LITERAL", "LPAREN", 
		"RPAREN", "LBRACE", "RBRACE", "SEMICOLON", "ASSIGN", "EQUALITY", "PLUS", 
		"MINUS", "ASTERISK", "DIVIDE", "LOGICAL_NOT", "LESS", "GREATER", "LESS_OR_EQUAL", 
		"GREATER_OR_EQUAL", "COMMA", "COLON", "'print'", "'var'", "'function'", 
		"'return'", "'continue'", "'break'", "'throw'", "'while'", "'if'", "'else'", 
		"IDENTIFIER", "WhiteSpace"
	};
	public static final String[] ruleNames = {
		"DecimalLiteral", "DecimalIntegerLiteral", "DecimalDigit", "DecimalDigits", 
		"NonZeroDigit", "ExponentPart", "ExponentIndicator", "SignedInteger", 
		"HexIntegerLiteral", "HexDigit", "IdentifierCharacters", "SpaceTokens", 
		"SpaceChars", "EndOfLineComment", "LineTerminator", "NUMERIC_LITERAL", 
		"BOOLEAN_LITERAL", "NULL_LITERAL", "STRING_LITERAL", "LPAREN", "RPAREN", 
		"LBRACE", "RBRACE", "SEMICOLON", "ASSIGN", "EQUALITY", "PLUS", "MINUS", 
		"ASTERISK", "DIVIDE", "LOGICAL_NOT", "LESS", "GREATER", "LESS_OR_EQUAL", 
		"GREATER_OR_EQUAL", "COMMA", "COLON", "PRINT", "VAR", "FUNCTION", "RETURN", 
		"CONTINUE", "BREAK", "THROW", "WHILE", "IF", "ELSE", "IDENTIFIER", "WhiteSpace"
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
		case 48: WhiteSpace_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WhiteSpace_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2$\u0164\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\7\2i"+
		"\n\2\f\2\16\2l\13\2\3\2\5\2o\n\2\3\2\3\2\5\2s\n\2\3\2\3\2\6\2w\n\2\r\2"+
		"\16\2x\3\2\5\2|\n\2\5\2~\n\2\3\3\3\3\3\3\5\3\u0083\n\3\5\3\u0085\n\3\3"+
		"\4\3\4\3\5\6\5\u008a\n\5\r\5\16\5\u008b\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\u009a\n\t\3\n\3\n\3\n\3\n\6\n\u00a0\n\n\r\n\16"+
		"\n\u00a1\3\n\3\n\3\n\3\n\6\n\u00a8\n\n\r\n\16\n\u00a9\5\n\u00ac\n\n\3"+
		"\13\3\13\5\13\u00b0\n\13\3\f\3\f\7\f\u00b4\n\f\f\f\16\f\u00b7\13\f\3\r"+
		"\3\r\3\r\5\r\u00bc\n\r\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u00c4\n\17\f"+
		"\17\16\17\u00c7\13\17\3\17\3\17\5\17\u00cb\n\17\3\20\3\20\3\20\5\20\u00d0"+
		"\n\20\3\21\3\21\5\21\u00d4\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u00df\n\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\7\24\u00e8\n"+
		"\24\f\24\16\24\u00eb\13\24\3\24\3\24\3\24\7\24\u00f0\n\24\f\24\16\24\u00f3"+
		"\13\24\3\24\5\24\u00f6\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3"+
		"\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3"+
		"\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3"+
		".\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\62\6\62\u015f"+
		"\n\62\r\62\16\62\u0160\3\62\3\62\2\63\3\2\1\5\2\1\7\2\1\t\2\1\13\2\1\r"+
		"\2\1\17\2\1\21\2\1\23\2\1\25\2\1\27\2\1\31\2\1\33\2\1\35\2\1\37\2\1!\3"+
		"\1#\4\1%\5\1\'\6\1)\7\1+\b\1-\t\1/\n\1\61\13\1\63\f\1\65\r\1\67\16\19"+
		"\17\1;\20\1=\21\1?\22\1A\23\1C\24\1E\25\1G\26\1I\27\1K\30\1M\31\1O\32"+
		"\1Q\33\1S\34\1U\35\1W\36\1Y\37\1[ \1]!\1_\"\1a#\1c$\2\3\2\n\4\2GGgg\4"+
		"\2CHch\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\13\16\16\"\"\4\2\f\f\17\17\5\2"+
		"\f\f\17\17$$\5\2\f\f\17\17))\u0170\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2"+
		"\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2"+
		"\3}\3\2\2\2\5\u0084\3\2\2\2\7\u0086\3\2\2\2\t\u0089\3\2\2\2\13\u008d\3"+
		"\2\2\2\r\u008f\3\2\2\2\17\u0092\3\2\2\2\21\u0099\3\2\2\2\23\u00ab\3\2"+
		"\2\2\25\u00af\3\2\2\2\27\u00b1\3\2\2\2\31\u00bb\3\2\2\2\33\u00bd\3\2\2"+
		"\2\35\u00bf\3\2\2\2\37\u00cf\3\2\2\2!\u00d3\3\2\2\2#\u00de\3\2\2\2%\u00e0"+
		"\3\2\2\2\'\u00f5\3\2\2\2)\u00f7\3\2\2\2+\u00f9\3\2\2\2-\u00fb\3\2\2\2"+
		"/\u00fd\3\2\2\2\61\u00ff\3\2\2\2\63\u0101\3\2\2\2\65\u0103\3\2\2\2\67"+
		"\u0106\3\2\2\29\u0108\3\2\2\2;\u010a\3\2\2\2=\u010c\3\2\2\2?\u010e\3\2"+
		"\2\2A\u0110\3\2\2\2C\u0112\3\2\2\2E\u0114\3\2\2\2G\u0117\3\2\2\2I\u011a"+
		"\3\2\2\2K\u011c\3\2\2\2M\u011e\3\2\2\2O\u0124\3\2\2\2Q\u0128\3\2\2\2S"+
		"\u0131\3\2\2\2U\u0138\3\2\2\2W\u0141\3\2\2\2Y\u0147\3\2\2\2[\u014d\3\2"+
		"\2\2]\u0153\3\2\2\2_\u0156\3\2\2\2a\u015b\3\2\2\2c\u015e\3\2\2\2ef\5\5"+
		"\3\2fj\7\60\2\2gi\5\t\5\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2kn\3"+
		"\2\2\2lj\3\2\2\2mo\5\r\7\2nm\3\2\2\2no\3\2\2\2o~\3\2\2\2pr\5\5\3\2qs\5"+
		"\r\7\2rq\3\2\2\2rs\3\2\2\2s~\3\2\2\2tv\7\60\2\2uw\5\t\5\2vu\3\2\2\2wx"+
		"\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2z|\5\r\7\2{z\3\2\2\2{|\3\2\2\2|"+
		"~\3\2\2\2}e\3\2\2\2}p\3\2\2\2}t\3\2\2\2~\4\3\2\2\2\177\u0085\7\62\2\2"+
		"\u0080\u0082\5\13\6\2\u0081\u0083\5\t\5\2\u0082\u0081\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\u0085\3\2\2\2\u0084\177\3\2\2\2\u0084\u0080\3\2\2\2\u0085"+
		"\6\3\2\2\2\u0086\u0087\4\62;\2\u0087\b\3\2\2\2\u0088\u008a\5\7\4\2\u0089"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2"+
		"\2\2\u008c\n\3\2\2\2\u008d\u008e\4\63;\2\u008e\f\3\2\2\2\u008f\u0090\5"+
		"\17\b\2\u0090\u0091\5\21\t\2\u0091\16\3\2\2\2\u0092\u0093\t\2\2\2\u0093"+
		"\20\3\2\2\2\u0094\u009a\5\t\5\2\u0095\u0096\7-\2\2\u0096\u009a\5\t\5\2"+
		"\u0097\u0098\7/\2\2\u0098\u009a\5\t\5\2\u0099\u0094\3\2\2\2\u0099\u0095"+
		"\3\2\2\2\u0099\u0097\3\2\2\2\u009a\22\3\2\2\2\u009b\u009c\7\62\2\2\u009c"+
		"\u009d\7z\2\2\u009d\u009f\3\2\2\2\u009e\u00a0\5\25\13\2\u009f\u009e\3"+
		"\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00ac\3\2\2\2\u00a3\u00a4\7\62\2\2\u00a4\u00a5\7Z\2\2\u00a5\u00a7\3\2"+
		"\2\2\u00a6\u00a8\5\25\13\2\u00a7\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u009b\3\2"+
		"\2\2\u00ab\u00a3\3\2\2\2\u00ac\24\3\2\2\2\u00ad\u00b0\5\7\4\2\u00ae\u00b0"+
		"\t\3\2\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0\26\3\2\2\2\u00b1"+
		"\u00b5\t\4\2\2\u00b2\u00b4\t\5\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3\2"+
		"\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\30\3\2\2\2\u00b7\u00b5"+
		"\3\2\2\2\u00b8\u00bc\5\33\16\2\u00b9\u00bc\5\37\20\2\u00ba\u00bc\5\35"+
		"\17\2\u00bb\u00b8\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc"+
		"\32\3\2\2\2\u00bd\u00be\t\6\2\2\u00be\34\3\2\2\2\u00bf\u00c0\7\61\2\2"+
		"\u00c0\u00c1\7\61\2\2\u00c1\u00c5\3\2\2\2\u00c2\u00c4\n\7\2\2\u00c3\u00c2"+
		"\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00ca\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00cb\5\37\20\2\u00c9\u00cb\7"+
		"\2\2\3\u00ca\u00c8\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb\36\3\2\2\2\u00cc"+
		"\u00cd\7\17\2\2\u00cd\u00d0\7\f\2\2\u00ce\u00d0\t\7\2\2\u00cf\u00cc\3"+
		"\2\2\2\u00cf\u00ce\3\2\2\2\u00d0 \3\2\2\2\u00d1\u00d4\5\3\2\2\u00d2\u00d4"+
		"\5\23\n\2\u00d3\u00d1\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4\"\3\2\2\2\u00d5"+
		"\u00d6\7v\2\2\u00d6\u00d7\7t\2\2\u00d7\u00d8\7w\2\2\u00d8\u00df\7g\2\2"+
		"\u00d9\u00da\7h\2\2\u00da\u00db\7c\2\2\u00db\u00dc\7n\2\2\u00dc\u00dd"+
		"\7u\2\2\u00dd\u00df\7g\2\2\u00de\u00d5\3\2\2\2\u00de\u00d9\3\2\2\2\u00df"+
		"$\3\2\2\2\u00e0\u00e1\7p\2\2\u00e1\u00e2\7w\2\2\u00e2\u00e3\7n\2\2\u00e3"+
		"\u00e4\7n\2\2\u00e4&\3\2\2\2\u00e5\u00e9\7$\2\2\u00e6\u00e8\n\b\2\2\u00e7"+
		"\u00e6\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2"+
		"\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00f6\7$\2\2\u00ed"+
		"\u00f1\7)\2\2\u00ee\u00f0\n\t\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f3\3\2"+
		"\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f4\u00f6\7)\2\2\u00f5\u00e5\3\2\2\2\u00f5\u00ed\3\2"+
		"\2\2\u00f6(\3\2\2\2\u00f7\u00f8\7*\2\2\u00f8*\3\2\2\2\u00f9\u00fa\7+\2"+
		"\2\u00fa,\3\2\2\2\u00fb\u00fc\7}\2\2\u00fc.\3\2\2\2\u00fd\u00fe\7\177"+
		"\2\2\u00fe\60\3\2\2\2\u00ff\u0100\7=\2\2\u0100\62\3\2\2\2\u0101\u0102"+
		"\7?\2\2\u0102\64\3\2\2\2\u0103\u0104\7?\2\2\u0104\u0105\7?\2\2\u0105\66"+
		"\3\2\2\2\u0106\u0107\7-\2\2\u01078\3\2\2\2\u0108\u0109\7/\2\2\u0109:\3"+
		"\2\2\2\u010a\u010b\7,\2\2\u010b<\3\2\2\2\u010c\u010d\7\61\2\2\u010d>\3"+
		"\2\2\2\u010e\u010f\7#\2\2\u010f@\3\2\2\2\u0110\u0111\7>\2\2\u0111B\3\2"+
		"\2\2\u0112\u0113\7@\2\2\u0113D\3\2\2\2\u0114\u0115\7>\2\2\u0115\u0116"+
		"\7?\2\2\u0116F\3\2\2\2\u0117\u0118\7@\2\2\u0118\u0119\7?\2\2\u0119H\3"+
		"\2\2\2\u011a\u011b\7.\2\2\u011bJ\3\2\2\2\u011c\u011d\7<\2\2\u011dL\3\2"+
		"\2\2\u011e\u011f\7r\2\2\u011f\u0120\7t\2\2\u0120\u0121\7k\2\2\u0121\u0122"+
		"\7p\2\2\u0122\u0123\7v\2\2\u0123N\3\2\2\2\u0124\u0125\7x\2\2\u0125\u0126"+
		"\7c\2\2\u0126\u0127\7t\2\2\u0127P\3\2\2\2\u0128\u0129\7h\2\2\u0129\u012a"+
		"\7w\2\2\u012a\u012b\7p\2\2\u012b\u012c\7e\2\2\u012c\u012d\7v\2\2\u012d"+
		"\u012e\7k\2\2\u012e\u012f\7q\2\2\u012f\u0130\7p\2\2\u0130R\3\2\2\2\u0131"+
		"\u0132\7t\2\2\u0132\u0133\7g\2\2\u0133\u0134\7v\2\2\u0134\u0135\7w\2\2"+
		"\u0135\u0136\7t\2\2\u0136\u0137\7p\2\2\u0137T\3\2\2\2\u0138\u0139\7e\2"+
		"\2\u0139\u013a\7q\2\2\u013a\u013b\7p\2\2\u013b\u013c\7v\2\2\u013c\u013d"+
		"\7k\2\2\u013d\u013e\7p\2\2\u013e\u013f\7w\2\2\u013f\u0140\7g\2\2\u0140"+
		"V\3\2\2\2\u0141\u0142\7d\2\2\u0142\u0143\7t\2\2\u0143\u0144\7g\2\2\u0144"+
		"\u0145\7c\2\2\u0145\u0146\7m\2\2\u0146X\3\2\2\2\u0147\u0148\7v\2\2\u0148"+
		"\u0149\7j\2\2\u0149\u014a\7t\2\2\u014a\u014b\7q\2\2\u014b\u014c\7y\2\2"+
		"\u014cZ\3\2\2\2\u014d\u014e\7y\2\2\u014e\u014f\7j\2\2\u014f\u0150\7k\2"+
		"\2\u0150\u0151\7n\2\2\u0151\u0152\7g\2\2\u0152\\\3\2\2\2\u0153\u0154\7"+
		"k\2\2\u0154\u0155\7h\2\2\u0155^\3\2\2\2\u0156\u0157\7g\2\2\u0157\u0158"+
		"\7n\2\2\u0158\u0159\7u\2\2\u0159\u015a\7g\2\2\u015a`\3\2\2\2\u015b\u015c"+
		"\5\27\f\2\u015cb\3\2\2\2\u015d\u015f\5\31\r\2\u015e\u015d\3\2\2\2\u015f"+
		"\u0160\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\3\2"+
		"\2\2\u0162\u0163\b\62\2\2\u0163d\3\2\2\2\34\2jnrx{}\u0082\u0084\u008b"+
		"\u0099\u00a1\u00a9\u00ab\u00af\u00b5\u00bb\u00c5\u00ca\u00cf\u00d3\u00de"+
		"\u00e9\u00f1\u00f5\u0160";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}