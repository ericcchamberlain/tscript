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
		ELSE=32, TRY=33, CATCH=34, FINALLY=35, IDENTIFIER=36, WhiteSpace=37;
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
		"'try'", "'catch'", "'finally'", "IDENTIFIER", "WhiteSpace"
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
		"CONTINUE", "BREAK", "THROW", "WHILE", "IF", "ELSE", "TRY", "CATCH", "FINALLY", 
		"IDENTIFIER", "WhiteSpace"
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\'\u017c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\3\2\3\2\3\2\7\2o\n\2\f\2\16\2r\13\2\3\2\5\2u\n\2\3\2\3\2"+
		"\5\2y\n\2\3\2\3\2\6\2}\n\2\r\2\16\2~\3\2\5\2\u0082\n\2\5\2\u0084\n\2\3"+
		"\3\3\3\3\3\5\3\u0089\n\3\5\3\u008b\n\3\3\4\3\4\3\5\6\5\u0090\n\5\r\5\16"+
		"\5\u0091\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t\u00a0\n\t"+
		"\3\n\3\n\3\n\3\n\6\n\u00a6\n\n\r\n\16\n\u00a7\3\n\3\n\3\n\3\n\6\n\u00ae"+
		"\n\n\r\n\16\n\u00af\5\n\u00b2\n\n\3\13\3\13\5\13\u00b6\n\13\3\f\3\f\7"+
		"\f\u00ba\n\f\f\f\16\f\u00bd\13\f\3\r\3\r\3\r\5\r\u00c2\n\r\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\7\17\u00ca\n\17\f\17\16\17\u00cd\13\17\3\17\3\17\5"+
		"\17\u00d1\n\17\3\20\3\20\3\20\5\20\u00d6\n\20\3\21\3\21\5\21\u00da\n\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00e5\n\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\7\24\u00ee\n\24\f\24\16\24\u00f1\13\24\3\24"+
		"\3\24\3\24\7\24\u00f6\n\24\f\24\16\24\u00f9\13\24\3\24\5\24\u00fc\n\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3"+
		"#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		",\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3\60\3\60"+
		"\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\65\6\65\u0177\n\65\r\65"+
		"\16\65\u0178\3\65\3\65\2\66\3\2\1\5\2\1\7\2\1\t\2\1\13\2\1\r\2\1\17\2"+
		"\1\21\2\1\23\2\1\25\2\1\27\2\1\31\2\1\33\2\1\35\2\1\37\2\1!\3\1#\4\1%"+
		"\5\1\'\6\1)\7\1+\b\1-\t\1/\n\1\61\13\1\63\f\1\65\r\1\67\16\19\17\1;\20"+
		"\1=\21\1?\22\1A\23\1C\24\1E\25\1G\26\1I\27\1K\30\1M\31\1O\32\1Q\33\1S"+
		"\34\1U\35\1W\36\1Y\37\1[ \1]!\1_\"\1a#\1c$\1e%\1g&\1i\'\2\3\2\n\4\2GG"+
		"gg\4\2CHch\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\13\16\16\"\"\4\2\f\f\17\17"+
		"\5\2\f\f\17\17$$\5\2\f\f\17\17))\u0188\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2"+
		"\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\3\u0083\3\2\2\2\5\u008a\3\2\2\2"+
		"\7\u008c\3\2\2\2\t\u008f\3\2\2\2\13\u0093\3\2\2\2\r\u0095\3\2\2\2\17\u0098"+
		"\3\2\2\2\21\u009f\3\2\2\2\23\u00b1\3\2\2\2\25\u00b5\3\2\2\2\27\u00b7\3"+
		"\2\2\2\31\u00c1\3\2\2\2\33\u00c3\3\2\2\2\35\u00c5\3\2\2\2\37\u00d5\3\2"+
		"\2\2!\u00d9\3\2\2\2#\u00e4\3\2\2\2%\u00e6\3\2\2\2\'\u00fb\3\2\2\2)\u00fd"+
		"\3\2\2\2+\u00ff\3\2\2\2-\u0101\3\2\2\2/\u0103\3\2\2\2\61\u0105\3\2\2\2"+
		"\63\u0107\3\2\2\2\65\u0109\3\2\2\2\67\u010c\3\2\2\29\u010e\3\2\2\2;\u0110"+
		"\3\2\2\2=\u0112\3\2\2\2?\u0114\3\2\2\2A\u0116\3\2\2\2C\u0118\3\2\2\2E"+
		"\u011a\3\2\2\2G\u011d\3\2\2\2I\u0120\3\2\2\2K\u0122\3\2\2\2M\u0124\3\2"+
		"\2\2O\u012a\3\2\2\2Q\u012e\3\2\2\2S\u0137\3\2\2\2U\u013e\3\2\2\2W\u0147"+
		"\3\2\2\2Y\u014d\3\2\2\2[\u0153\3\2\2\2]\u0159\3\2\2\2_\u015c\3\2\2\2a"+
		"\u0161\3\2\2\2c\u0165\3\2\2\2e\u016b\3\2\2\2g\u0173\3\2\2\2i\u0176\3\2"+
		"\2\2kl\5\5\3\2lp\7\60\2\2mo\5\t\5\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3"+
		"\2\2\2qt\3\2\2\2rp\3\2\2\2su\5\r\7\2ts\3\2\2\2tu\3\2\2\2u\u0084\3\2\2"+
		"\2vx\5\5\3\2wy\5\r\7\2xw\3\2\2\2xy\3\2\2\2y\u0084\3\2\2\2z|\7\60\2\2{"+
		"}\5\t\5\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2"+
		"\u0080\u0082\5\r\7\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084"+
		"\3\2\2\2\u0083k\3\2\2\2\u0083v\3\2\2\2\u0083z\3\2\2\2\u0084\4\3\2\2\2"+
		"\u0085\u008b\7\62\2\2\u0086\u0088\5\13\6\2\u0087\u0089\5\t\5\2\u0088\u0087"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0085\3\2\2\2\u008a"+
		"\u0086\3\2\2\2\u008b\6\3\2\2\2\u008c\u008d\4\62;\2\u008d\b\3\2\2\2\u008e"+
		"\u0090\5\7\4\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\n\3\2\2\2\u0093\u0094\4\63;\2\u0094\f\3"+
		"\2\2\2\u0095\u0096\5\17\b\2\u0096\u0097\5\21\t\2\u0097\16\3\2\2\2\u0098"+
		"\u0099\t\2\2\2\u0099\20\3\2\2\2\u009a\u00a0\5\t\5\2\u009b\u009c\7-\2\2"+
		"\u009c\u00a0\5\t\5\2\u009d\u009e\7/\2\2\u009e\u00a0\5\t\5\2\u009f\u009a"+
		"\3\2\2\2\u009f\u009b\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\22\3\2\2\2\u00a1"+
		"\u00a2\7\62\2\2\u00a2\u00a3\7z\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a6\5\25"+
		"\13\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00b2\3\2\2\2\u00a9\u00aa\7\62\2\2\u00aa\u00ab\7"+
		"Z\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00ae\5\25\13\2\u00ad\u00ac\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2"+
		"\2\2\u00b1\u00a1\3\2\2\2\u00b1\u00a9\3\2\2\2\u00b2\24\3\2\2\2\u00b3\u00b6"+
		"\5\7\4\2\u00b4\u00b6\t\3\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6"+
		"\26\3\2\2\2\u00b7\u00bb\t\4\2\2\u00b8\u00ba\t\5\2\2\u00b9\u00b8\3\2\2"+
		"\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\30"+
		"\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00c2\5\33\16\2\u00bf\u00c2\5\37\20"+
		"\2\u00c0\u00c2\5\35\17\2\u00c1\u00be\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1"+
		"\u00c0\3\2\2\2\u00c2\32\3\2\2\2\u00c3\u00c4\t\6\2\2\u00c4\34\3\2\2\2\u00c5"+
		"\u00c6\7\61\2\2\u00c6\u00c7\7\61\2\2\u00c7\u00cb\3\2\2\2\u00c8\u00ca\n"+
		"\7\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00d0\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d1\5\37"+
		"\20\2\u00cf\u00d1\7\2\2\3\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1"+
		"\36\3\2\2\2\u00d2\u00d3\7\17\2\2\u00d3\u00d6\7\f\2\2\u00d4\u00d6\t\7\2"+
		"\2\u00d5\u00d2\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6 \3\2\2\2\u00d7\u00da"+
		"\5\3\2\2\u00d8\u00da\5\23\n\2\u00d9\u00d7\3\2\2\2\u00d9\u00d8\3\2\2\2"+
		"\u00da\"\3\2\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd\7t\2\2\u00dd\u00de\7w"+
		"\2\2\u00de\u00e5\7g\2\2\u00df\u00e0\7h\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2"+
		"\7n\2\2\u00e2\u00e3\7u\2\2\u00e3\u00e5\7g\2\2\u00e4\u00db\3\2\2\2\u00e4"+
		"\u00df\3\2\2\2\u00e5$\3\2\2\2\u00e6\u00e7\7p\2\2\u00e7\u00e8\7w\2\2\u00e8"+
		"\u00e9\7n\2\2\u00e9\u00ea\7n\2\2\u00ea&\3\2\2\2\u00eb\u00ef\7$\2\2\u00ec"+
		"\u00ee\n\b\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2"+
		"\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2"+
		"\u00fc\7$\2\2\u00f3\u00f7\7)\2\2\u00f4\u00f6\n\t\2\2\u00f5\u00f4\3\2\2"+
		"\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa"+
		"\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fc\7)\2\2\u00fb\u00eb\3\2\2\2\u00fb"+
		"\u00f3\3\2\2\2\u00fc(\3\2\2\2\u00fd\u00fe\7*\2\2\u00fe*\3\2\2\2\u00ff"+
		"\u0100\7+\2\2\u0100,\3\2\2\2\u0101\u0102\7}\2\2\u0102.\3\2\2\2\u0103\u0104"+
		"\7\177\2\2\u0104\60\3\2\2\2\u0105\u0106\7=\2\2\u0106\62\3\2\2\2\u0107"+
		"\u0108\7?\2\2\u0108\64\3\2\2\2\u0109\u010a\7?\2\2\u010a\u010b\7?\2\2\u010b"+
		"\66\3\2\2\2\u010c\u010d\7-\2\2\u010d8\3\2\2\2\u010e\u010f\7/\2\2\u010f"+
		":\3\2\2\2\u0110\u0111\7,\2\2\u0111<\3\2\2\2\u0112\u0113\7\61\2\2\u0113"+
		">\3\2\2\2\u0114\u0115\7#\2\2\u0115@\3\2\2\2\u0116\u0117\7>\2\2\u0117B"+
		"\3\2\2\2\u0118\u0119\7@\2\2\u0119D\3\2\2\2\u011a\u011b\7>\2\2\u011b\u011c"+
		"\7?\2\2\u011cF\3\2\2\2\u011d\u011e\7@\2\2\u011e\u011f\7?\2\2\u011fH\3"+
		"\2\2\2\u0120\u0121\7.\2\2\u0121J\3\2\2\2\u0122\u0123\7<\2\2\u0123L\3\2"+
		"\2\2\u0124\u0125\7r\2\2\u0125\u0126\7t\2\2\u0126\u0127\7k\2\2\u0127\u0128"+
		"\7p\2\2\u0128\u0129\7v\2\2\u0129N\3\2\2\2\u012a\u012b\7x\2\2\u012b\u012c"+
		"\7c\2\2\u012c\u012d\7t\2\2\u012dP\3\2\2\2\u012e\u012f\7h\2\2\u012f\u0130"+
		"\7w\2\2\u0130\u0131\7p\2\2\u0131\u0132\7e\2\2\u0132\u0133\7v\2\2\u0133"+
		"\u0134\7k\2\2\u0134\u0135\7q\2\2\u0135\u0136\7p\2\2\u0136R\3\2\2\2\u0137"+
		"\u0138\7t\2\2\u0138\u0139\7g\2\2\u0139\u013a\7v\2\2\u013a\u013b\7w\2\2"+
		"\u013b\u013c\7t\2\2\u013c\u013d\7p\2\2\u013dT\3\2\2\2\u013e\u013f\7e\2"+
		"\2\u013f\u0140\7q\2\2\u0140\u0141\7p\2\2\u0141\u0142\7v\2\2\u0142\u0143"+
		"\7k\2\2\u0143\u0144\7p\2\2\u0144\u0145\7w\2\2\u0145\u0146\7g\2\2\u0146"+
		"V\3\2\2\2\u0147\u0148\7d\2\2\u0148\u0149\7t\2\2\u0149\u014a\7g\2\2\u014a"+
		"\u014b\7c\2\2\u014b\u014c\7m\2\2\u014cX\3\2\2\2\u014d\u014e\7v\2\2\u014e"+
		"\u014f\7j\2\2\u014f\u0150\7t\2\2\u0150\u0151\7q\2\2\u0151\u0152\7y\2\2"+
		"\u0152Z\3\2\2\2\u0153\u0154\7y\2\2\u0154\u0155\7j\2\2\u0155\u0156\7k\2"+
		"\2\u0156\u0157\7n\2\2\u0157\u0158\7g\2\2\u0158\\\3\2\2\2\u0159\u015a\7"+
		"k\2\2\u015a\u015b\7h\2\2\u015b^\3\2\2\2\u015c\u015d\7g\2\2\u015d\u015e"+
		"\7n\2\2\u015e\u015f\7u\2\2\u015f\u0160\7g\2\2\u0160`\3\2\2\2\u0161\u0162"+
		"\7v\2\2\u0162\u0163\7t\2\2\u0163\u0164\7{\2\2\u0164b\3\2\2\2\u0165\u0166"+
		"\7e\2\2\u0166\u0167\7c\2\2\u0167\u0168\7v\2\2\u0168\u0169\7e\2\2\u0169"+
		"\u016a\7j\2\2\u016ad\3\2\2\2\u016b\u016c\7h\2\2\u016c\u016d\7k\2\2\u016d"+
		"\u016e\7p\2\2\u016e\u016f\7c\2\2\u016f\u0170\7n\2\2\u0170\u0171\7n\2\2"+
		"\u0171\u0172\7{\2\2\u0172f\3\2\2\2\u0173\u0174\5\27\f\2\u0174h\3\2\2\2"+
		"\u0175\u0177\5\31\r\2\u0176\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0176"+
		"\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\b\65\2\2"+
		"\u017bj\3\2\2\2\34\2ptx~\u0081\u0083\u0088\u008a\u0091\u009f\u00a7\u00af"+
		"\u00b1\u00b5\u00bb\u00c1\u00cb\u00d0\u00d5\u00d9\u00e4\u00ef\u00f7\u00fb"+
		"\u0178";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}