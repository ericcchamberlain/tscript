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
		LESS_OR_EQUAL=19, GREATER_OR_EQUAL=20, COMMA=21, COLON=22, DOT=23, PRINT=24, 
		VAR=25, FUNCTION=26, RETURN=27, CONTINUE=28, BREAK=29, THROW=30, WHILE=31, 
		IF=32, ELSE=33, TRY=34, CATCH=35, FINALLY=36, NEW=37, IDENTIFIER=38, WhiteSpace=39;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"NUMERIC_LITERAL", "BOOLEAN_LITERAL", "'null'", "STRING_LITERAL", "LPAREN", 
		"RPAREN", "LBRACE", "RBRACE", "SEMICOLON", "ASSIGN", "EQUALITY", "PLUS", 
		"MINUS", "ASTERISK", "DIVIDE", "LOGICAL_NOT", "LESS", "GREATER", "LESS_OR_EQUAL", 
		"GREATER_OR_EQUAL", "COMMA", "COLON", "DOT", "'print'", "'var'", "'function'", 
		"'return'", "'continue'", "'break'", "'throw'", "'while'", "'if'", "'else'", 
		"'try'", "'catch'", "'finally'", "'new'", "IDENTIFIER", "WhiteSpace"
	};
	public static final String[] ruleNames = {
		"DecimalLiteral", "DecimalIntegerLiteral", "DecimalDigit", "DecimalDigits", 
		"NonZeroDigit", "ExponentPart", "ExponentIndicator", "SignedInteger", 
		"HexIntegerLiteral", "HexDigit", "IdentifierCharacters", "SpaceTokens", 
		"SpaceChars", "EndOfLineComment", "LineTerminator", "NUMERIC_LITERAL", 
		"BOOLEAN_LITERAL", "NULL_LITERAL", "STRING_LITERAL", "LPAREN", "RPAREN", 
		"LBRACE", "RBRACE", "SEMICOLON", "ASSIGN", "EQUALITY", "PLUS", "MINUS", 
		"ASTERISK", "DIVIDE", "LOGICAL_NOT", "LESS", "GREATER", "LESS_OR_EQUAL", 
		"GREATER_OR_EQUAL", "COMMA", "COLON", "DOT", "PRINT", "VAR", "FUNCTION", 
		"RETURN", "CONTINUE", "BREAK", "THROW", "WHILE", "IF", "ELSE", "TRY", 
		"CATCH", "FINALLY", "NEW", "IDENTIFIER", "WhiteSpace"
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
		case 53: WhiteSpace_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WhiteSpace_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2)\u0186\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\7\2s\n\2\f\2\16\2v\13\2"+
		"\3\2\5\2y\n\2\3\2\3\2\5\2}\n\2\3\2\3\2\6\2\u0081\n\2\r\2\16\2\u0082\3"+
		"\2\5\2\u0086\n\2\5\2\u0088\n\2\3\3\3\3\3\3\5\3\u008d\n\3\5\3\u008f\n\3"+
		"\3\4\3\4\3\5\6\5\u0094\n\5\r\5\16\5\u0095\3\6\3\6\3\7\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u00a4\n\t\3\n\3\n\3\n\3\n\6\n\u00aa\n\n\r\n\16"+
		"\n\u00ab\3\n\3\n\3\n\3\n\6\n\u00b2\n\n\r\n\16\n\u00b3\5\n\u00b6\n\n\3"+
		"\13\3\13\5\13\u00ba\n\13\3\f\3\f\7\f\u00be\n\f\f\f\16\f\u00c1\13\f\3\r"+
		"\3\r\3\r\5\r\u00c6\n\r\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u00ce\n\17\f"+
		"\17\16\17\u00d1\13\17\3\17\3\17\5\17\u00d5\n\17\3\20\3\20\3\20\5\20\u00da"+
		"\n\20\3\21\3\21\5\21\u00de\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u00e9\n\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\7\24\u00f2\n"+
		"\24\f\24\16\24\u00f5\13\24\3\24\3\24\3\24\7\24\u00fa\n\24\f\24\16\24\u00fd"+
		"\13\24\3\24\5\24\u0100\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3"+
		"\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3"+
		"\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3"+
		"(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3"+
		"+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3"+
		"/\3/\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3"+
		"\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\3\65\3\65\3\65\3\65\3\66\3\66\3\67\6\67\u0181\n\67\r\67\16\67\u0182"+
		"\3\67\3\67\28\3\2\1\5\2\1\7\2\1\t\2\1\13\2\1\r\2\1\17\2\1\21\2\1\23\2"+
		"\1\25\2\1\27\2\1\31\2\1\33\2\1\35\2\1\37\2\1!\3\1#\4\1%\5\1\'\6\1)\7\1"+
		"+\b\1-\t\1/\n\1\61\13\1\63\f\1\65\r\1\67\16\19\17\1;\20\1=\21\1?\22\1"+
		"A\23\1C\24\1E\25\1G\26\1I\27\1K\30\1M\31\1O\32\1Q\33\1S\34\1U\35\1W\36"+
		"\1Y\37\1[ \1]!\1_\"\1a#\1c$\1e%\1g&\1i\'\1k(\1m)\2\3\2\n\4\2GGgg\4\2C"+
		"Hch\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\13\16\16\"\"\4\2\f\f\17\17\5\2\f"+
		"\f\17\17$$\5\2\f\f\17\17))\u0192\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2"+
		"e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\3\u0087\3\2\2\2"+
		"\5\u008e\3\2\2\2\7\u0090\3\2\2\2\t\u0093\3\2\2\2\13\u0097\3\2\2\2\r\u0099"+
		"\3\2\2\2\17\u009c\3\2\2\2\21\u00a3\3\2\2\2\23\u00b5\3\2\2\2\25\u00b9\3"+
		"\2\2\2\27\u00bb\3\2\2\2\31\u00c5\3\2\2\2\33\u00c7\3\2\2\2\35\u00c9\3\2"+
		"\2\2\37\u00d9\3\2\2\2!\u00dd\3\2\2\2#\u00e8\3\2\2\2%\u00ea\3\2\2\2\'\u00ff"+
		"\3\2\2\2)\u0101\3\2\2\2+\u0103\3\2\2\2-\u0105\3\2\2\2/\u0107\3\2\2\2\61"+
		"\u0109\3\2\2\2\63\u010b\3\2\2\2\65\u010d\3\2\2\2\67\u0110\3\2\2\29\u0112"+
		"\3\2\2\2;\u0114\3\2\2\2=\u0116\3\2\2\2?\u0118\3\2\2\2A\u011a\3\2\2\2C"+
		"\u011c\3\2\2\2E\u011e\3\2\2\2G\u0121\3\2\2\2I\u0124\3\2\2\2K\u0126\3\2"+
		"\2\2M\u0128\3\2\2\2O\u012a\3\2\2\2Q\u0130\3\2\2\2S\u0134\3\2\2\2U\u013d"+
		"\3\2\2\2W\u0144\3\2\2\2Y\u014d\3\2\2\2[\u0153\3\2\2\2]\u0159\3\2\2\2_"+
		"\u015f\3\2\2\2a\u0162\3\2\2\2c\u0167\3\2\2\2e\u016b\3\2\2\2g\u0171\3\2"+
		"\2\2i\u0179\3\2\2\2k\u017d\3\2\2\2m\u0180\3\2\2\2op\5\5\3\2pt\7\60\2\2"+
		"qs\5\t\5\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2ux\3\2\2\2vt\3\2\2\2"+
		"wy\5\r\7\2xw\3\2\2\2xy\3\2\2\2y\u0088\3\2\2\2z|\5\5\3\2{}\5\r\7\2|{\3"+
		"\2\2\2|}\3\2\2\2}\u0088\3\2\2\2~\u0080\7\60\2\2\177\u0081\5\t\5\2\u0080"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2"+
		"\2\u0083\u0085\3\2\2\2\u0084\u0086\5\r\7\2\u0085\u0084\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\u0088\3\2\2\2\u0087o\3\2\2\2\u0087z\3\2\2\2\u0087~\3\2"+
		"\2\2\u0088\4\3\2\2\2\u0089\u008f\7\62\2\2\u008a\u008c\5\13\6\2\u008b\u008d"+
		"\5\t\5\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e"+
		"\u0089\3\2\2\2\u008e\u008a\3\2\2\2\u008f\6\3\2\2\2\u0090\u0091\4\62;\2"+
		"\u0091\b\3\2\2\2\u0092\u0094\5\7\4\2\u0093\u0092\3\2\2\2\u0094\u0095\3"+
		"\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\n\3\2\2\2\u0097\u0098"+
		"\4\63;\2\u0098\f\3\2\2\2\u0099\u009a\5\17\b\2\u009a\u009b\5\21\t\2\u009b"+
		"\16\3\2\2\2\u009c\u009d\t\2\2\2\u009d\20\3\2\2\2\u009e\u00a4\5\t\5\2\u009f"+
		"\u00a0\7-\2\2\u00a0\u00a4\5\t\5\2\u00a1\u00a2\7/\2\2\u00a2\u00a4\5\t\5"+
		"\2\u00a3\u009e\3\2\2\2\u00a3\u009f\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\22"+
		"\3\2\2\2\u00a5\u00a6\7\62\2\2\u00a6\u00a7\7z\2\2\u00a7\u00a9\3\2\2\2\u00a8"+
		"\u00aa\5\25\13\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3"+
		"\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00b6\3\2\2\2\u00ad\u00ae\7\62\2\2\u00ae"+
		"\u00af\7Z\2\2\u00af\u00b1\3\2\2\2\u00b0\u00b2\5\25\13\2\u00b1\u00b0\3"+
		"\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b6\3\2\2\2\u00b5\u00a5\3\2\2\2\u00b5\u00ad\3\2\2\2\u00b6\24\3\2\2"+
		"\2\u00b7\u00ba\5\7\4\2\u00b8\u00ba\t\3\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8"+
		"\3\2\2\2\u00ba\26\3\2\2\2\u00bb\u00bf\t\4\2\2\u00bc\u00be\t\5\2\2\u00bd"+
		"\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\30\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c6\5\33\16\2\u00c3"+
		"\u00c6\5\37\20\2\u00c4\u00c6\5\35\17\2\u00c5\u00c2\3\2\2\2\u00c5\u00c3"+
		"\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\32\3\2\2\2\u00c7\u00c8\t\6\2\2\u00c8"+
		"\34\3\2\2\2\u00c9\u00ca\7\61\2\2\u00ca\u00cb\7\61\2\2\u00cb\u00cf\3\2"+
		"\2\2\u00cc\u00ce\n\7\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d4\3\2\2\2\u00d1\u00cf\3\2"+
		"\2\2\u00d2\u00d5\5\37\20\2\u00d3\u00d5\7\2\2\3\u00d4\u00d2\3\2\2\2\u00d4"+
		"\u00d3\3\2\2\2\u00d5\36\3\2\2\2\u00d6\u00d7\7\17\2\2\u00d7\u00da\7\f\2"+
		"\2\u00d8\u00da\t\7\2\2\u00d9\u00d6\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da "+
		"\3\2\2\2\u00db\u00de\5\3\2\2\u00dc\u00de\5\23\n\2\u00dd\u00db\3\2\2\2"+
		"\u00dd\u00dc\3\2\2\2\u00de\"\3\2\2\2\u00df\u00e0\7v\2\2\u00e0\u00e1\7"+
		"t\2\2\u00e1\u00e2\7w\2\2\u00e2\u00e9\7g\2\2\u00e3\u00e4\7h\2\2\u00e4\u00e5"+
		"\7c\2\2\u00e5\u00e6\7n\2\2\u00e6\u00e7\7u\2\2\u00e7\u00e9\7g\2\2\u00e8"+
		"\u00df\3\2\2\2\u00e8\u00e3\3\2\2\2\u00e9$\3\2\2\2\u00ea\u00eb\7p\2\2\u00eb"+
		"\u00ec\7w\2\2\u00ec\u00ed\7n\2\2\u00ed\u00ee\7n\2\2\u00ee&\3\2\2\2\u00ef"+
		"\u00f3\7$\2\2\u00f0\u00f2\n\b\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2"+
		"\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f6\u0100\7$\2\2\u00f7\u00fb\7)\2\2\u00f8\u00fa\n\t\2"+
		"\2\u00f9\u00f8\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc"+
		"\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u0100\7)\2\2\u00ff"+
		"\u00ef\3\2\2\2\u00ff\u00f7\3\2\2\2\u0100(\3\2\2\2\u0101\u0102\7*\2\2\u0102"+
		"*\3\2\2\2\u0103\u0104\7+\2\2\u0104,\3\2\2\2\u0105\u0106\7}\2\2\u0106."+
		"\3\2\2\2\u0107\u0108\7\177\2\2\u0108\60\3\2\2\2\u0109\u010a\7=\2\2\u010a"+
		"\62\3\2\2\2\u010b\u010c\7?\2\2\u010c\64\3\2\2\2\u010d\u010e\7?\2\2\u010e"+
		"\u010f\7?\2\2\u010f\66\3\2\2\2\u0110\u0111\7-\2\2\u01118\3\2\2\2\u0112"+
		"\u0113\7/\2\2\u0113:\3\2\2\2\u0114\u0115\7,\2\2\u0115<\3\2\2\2\u0116\u0117"+
		"\7\61\2\2\u0117>\3\2\2\2\u0118\u0119\7#\2\2\u0119@\3\2\2\2\u011a\u011b"+
		"\7>\2\2\u011bB\3\2\2\2\u011c\u011d\7@\2\2\u011dD\3\2\2\2\u011e\u011f\7"+
		">\2\2\u011f\u0120\7?\2\2\u0120F\3\2\2\2\u0121\u0122\7@\2\2\u0122\u0123"+
		"\7?\2\2\u0123H\3\2\2\2\u0124\u0125\7.\2\2\u0125J\3\2\2\2\u0126\u0127\7"+
		"<\2\2\u0127L\3\2\2\2\u0128\u0129\7\60\2\2\u0129N\3\2\2\2\u012a\u012b\7"+
		"r\2\2\u012b\u012c\7t\2\2\u012c\u012d\7k\2\2\u012d\u012e\7p\2\2\u012e\u012f"+
		"\7v\2\2\u012fP\3\2\2\2\u0130\u0131\7x\2\2\u0131\u0132\7c\2\2\u0132\u0133"+
		"\7t\2\2\u0133R\3\2\2\2\u0134\u0135\7h\2\2\u0135\u0136\7w\2\2\u0136\u0137"+
		"\7p\2\2\u0137\u0138\7e\2\2\u0138\u0139\7v\2\2\u0139\u013a\7k\2\2\u013a"+
		"\u013b\7q\2\2\u013b\u013c\7p\2\2\u013cT\3\2\2\2\u013d\u013e\7t\2\2\u013e"+
		"\u013f\7g\2\2\u013f\u0140\7v\2\2\u0140\u0141\7w\2\2\u0141\u0142\7t\2\2"+
		"\u0142\u0143\7p\2\2\u0143V\3\2\2\2\u0144\u0145\7e\2\2\u0145\u0146\7q\2"+
		"\2\u0146\u0147\7p\2\2\u0147\u0148\7v\2\2\u0148\u0149\7k\2\2\u0149\u014a"+
		"\7p\2\2\u014a\u014b\7w\2\2\u014b\u014c\7g\2\2\u014cX\3\2\2\2\u014d\u014e"+
		"\7d\2\2\u014e\u014f\7t\2\2\u014f\u0150\7g\2\2\u0150\u0151\7c\2\2\u0151"+
		"\u0152\7m\2\2\u0152Z\3\2\2\2\u0153\u0154\7v\2\2\u0154\u0155\7j\2\2\u0155"+
		"\u0156\7t\2\2\u0156\u0157\7q\2\2\u0157\u0158\7y\2\2\u0158\\\3\2\2\2\u0159"+
		"\u015a\7y\2\2\u015a\u015b\7j\2\2\u015b\u015c\7k\2\2\u015c\u015d\7n\2\2"+
		"\u015d\u015e\7g\2\2\u015e^\3\2\2\2\u015f\u0160\7k\2\2\u0160\u0161\7h\2"+
		"\2\u0161`\3\2\2\2\u0162\u0163\7g\2\2\u0163\u0164\7n\2\2\u0164\u0165\7"+
		"u\2\2\u0165\u0166\7g\2\2\u0166b\3\2\2\2\u0167\u0168\7v\2\2\u0168\u0169"+
		"\7t\2\2\u0169\u016a\7{\2\2\u016ad\3\2\2\2\u016b\u016c\7e\2\2\u016c\u016d"+
		"\7c\2\2\u016d\u016e\7v\2\2\u016e\u016f\7e\2\2\u016f\u0170\7j\2\2\u0170"+
		"f\3\2\2\2\u0171\u0172\7h\2\2\u0172\u0173\7k\2\2\u0173\u0174\7p\2\2\u0174"+
		"\u0175\7c\2\2\u0175\u0176\7n\2\2\u0176\u0177\7n\2\2\u0177\u0178\7{\2\2"+
		"\u0178h\3\2\2\2\u0179\u017a\7p\2\2\u017a\u017b\7g\2\2\u017b\u017c\7y\2"+
		"\2\u017cj\3\2\2\2\u017d\u017e\5\27\f\2\u017el\3\2\2\2\u017f\u0181\5\31"+
		"\r\2\u0180\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0180\3\2\2\2\u0182"+
		"\u0183\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\b\67\2\2\u0185n\3\2\2\2"+
		"\34\2tx|\u0082\u0085\u0087\u008c\u008e\u0095\u00a3\u00ab\u00b3\u00b5\u00b9"+
		"\u00bf\u00c5\u00cf\u00d4\u00d9\u00dd\u00e8\u00f3\u00fb\u00ff\u0182";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}