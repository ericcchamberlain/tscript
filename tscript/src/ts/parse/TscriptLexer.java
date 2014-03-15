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
		T__4=1, T__3=2, T__2=3, T__1=4, T__0=5, NUMERIC_LITERAL=6, BOOLEAN_LITERAL=7, 
		NULL_LITERAL=8, STRING_LITERAL=9, LPAREN=10, RPAREN=11, LBRACE=12, RBRACE=13, 
		SEMICOLON=14, ASSIGN=15, EQUALITY=16, PLUS=17, MINUS=18, ASTERISK=19, 
		DIVIDE=20, LOGICAL_NOT=21, LESS=22, GREATER=23, LESS_OR_EQUAL=24, GREATER_OR_EQUAL=25, 
		COMMA=26, COLON=27, PRINT=28, VAR=29, IDENTIFIER=30, WhiteSpace=31;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'break'", "'while'", "'if'", "'else'", "'continue'", "NUMERIC_LITERAL", 
		"BOOLEAN_LITERAL", "'null'", "STRING_LITERAL", "LPAREN", "RPAREN", "LBRACE", 
		"RBRACE", "SEMICOLON", "ASSIGN", "EQUALITY", "PLUS", "MINUS", "ASTERISK", 
		"DIVIDE", "LOGICAL_NOT", "LESS", "GREATER", "LESS_OR_EQUAL", "GREATER_OR_EQUAL", 
		"COMMA", "COLON", "'print'", "'var'", "IDENTIFIER", "WhiteSpace"
	};
	public static final String[] ruleNames = {
		"T__4", "T__3", "T__2", "T__1", "T__0", "DecimalLiteral", "DecimalIntegerLiteral", 
		"DecimalDigit", "DecimalDigits", "NonZeroDigit", "ExponentPart", "ExponentIndicator", 
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
		case 45: WhiteSpace_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WhiteSpace_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2!\u0148\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\7\7\u0080\n\7\f\7\16\7\u0083\13\7\3\7\5\7\u0086\n\7\3\7\3\7"+
		"\5\7\u008a\n\7\3\7\3\7\6\7\u008e\n\7\r\7\16\7\u008f\3\7\5\7\u0093\n\7"+
		"\5\7\u0095\n\7\3\b\3\b\3\b\5\b\u009a\n\b\5\b\u009c\n\b\3\t\3\t\3\n\6\n"+
		"\u00a1\n\n\r\n\16\n\u00a2\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u00b1\n\16\3\17\3\17\3\17\3\17\6\17\u00b7\n\17\r\17\16"+
		"\17\u00b8\3\17\3\17\3\17\3\17\6\17\u00bf\n\17\r\17\16\17\u00c0\5\17\u00c3"+
		"\n\17\3\20\3\20\5\20\u00c7\n\20\3\21\3\21\7\21\u00cb\n\21\f\21\16\21\u00ce"+
		"\13\21\3\22\3\22\3\22\5\22\u00d3\n\22\3\23\3\23\3\24\3\24\3\24\3\24\7"+
		"\24\u00db\n\24\f\24\16\24\u00de\13\24\3\24\3\24\5\24\u00e2\n\24\3\25\3"+
		"\25\3\25\5\25\u00e7\n\25\3\26\3\26\5\26\u00eb\n\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\5\27\u00f6\n\27\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\7\31\u00ff\n\31\f\31\16\31\u0102\13\31\3\31\3\31\3\31\7\31\u0107"+
		"\n\31\f\31\16\31\u010a\13\31\3\31\5\31\u010d\n\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#"+
		"\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3+\3+\3,\3,\3,\3,\3"+
		",\3,\3-\3-\3-\3-\3.\3.\3/\6/\u0143\n/\r/\16/\u0144\3/\3/\2\60\3\3\1\5"+
		"\4\1\7\5\1\t\6\1\13\7\1\r\2\1\17\2\1\21\2\1\23\2\1\25\2\1\27\2\1\31\2"+
		"\1\33\2\1\35\2\1\37\2\1!\2\1#\2\1%\2\1\'\2\1)\2\1+\b\1-\t\1/\n\1\61\13"+
		"\1\63\f\1\65\r\1\67\16\19\17\1;\20\1=\21\1?\22\1A\23\1C\24\1E\25\1G\26"+
		"\1I\27\1K\30\1M\31\1O\32\1Q\33\1S\34\1U\35\1W\36\1Y\37\1[ \1]!\2\3\2\n"+
		"\4\2GGgg\4\2CHch\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\13\16\16\"\"\4\2\f\f"+
		"\17\17\5\2\f\f\17\17$$\5\2\f\f\17\17))\u0154\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3_\3\2\2\2\5e\3\2\2"+
		"\2\7k\3\2\2\2\tn\3\2\2\2\13s\3\2\2\2\r\u0094\3\2\2\2\17\u009b\3\2\2\2"+
		"\21\u009d\3\2\2\2\23\u00a0\3\2\2\2\25\u00a4\3\2\2\2\27\u00a6\3\2\2\2\31"+
		"\u00a9\3\2\2\2\33\u00b0\3\2\2\2\35\u00c2\3\2\2\2\37\u00c6\3\2\2\2!\u00c8"+
		"\3\2\2\2#\u00d2\3\2\2\2%\u00d4\3\2\2\2\'\u00d6\3\2\2\2)\u00e6\3\2\2\2"+
		"+\u00ea\3\2\2\2-\u00f5\3\2\2\2/\u00f7\3\2\2\2\61\u010c\3\2\2\2\63\u010e"+
		"\3\2\2\2\65\u0110\3\2\2\2\67\u0112\3\2\2\29\u0114\3\2\2\2;\u0116\3\2\2"+
		"\2=\u0118\3\2\2\2?\u011a\3\2\2\2A\u011d\3\2\2\2C\u011f\3\2\2\2E\u0121"+
		"\3\2\2\2G\u0123\3\2\2\2I\u0125\3\2\2\2K\u0127\3\2\2\2M\u0129\3\2\2\2O"+
		"\u012b\3\2\2\2Q\u012e\3\2\2\2S\u0131\3\2\2\2U\u0133\3\2\2\2W\u0135\3\2"+
		"\2\2Y\u013b\3\2\2\2[\u013f\3\2\2\2]\u0142\3\2\2\2_`\7d\2\2`a\7t\2\2ab"+
		"\7g\2\2bc\7c\2\2cd\7m\2\2d\4\3\2\2\2ef\7y\2\2fg\7j\2\2gh\7k\2\2hi\7n\2"+
		"\2ij\7g\2\2j\6\3\2\2\2kl\7k\2\2lm\7h\2\2m\b\3\2\2\2no\7g\2\2op\7n\2\2"+
		"pq\7u\2\2qr\7g\2\2r\n\3\2\2\2st\7e\2\2tu\7q\2\2uv\7p\2\2vw\7v\2\2wx\7"+
		"k\2\2xy\7p\2\2yz\7w\2\2z{\7g\2\2{\f\3\2\2\2|}\5\17\b\2}\u0081\7\60\2\2"+
		"~\u0080\5\23\n\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0086\5\27"+
		"\f\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0095\3\2\2\2\u0087"+
		"\u0089\5\17\b\2\u0088\u008a\5\27\f\2\u0089\u0088\3\2\2\2\u0089\u008a\3"+
		"\2\2\2\u008a\u0095\3\2\2\2\u008b\u008d\7\60\2\2\u008c\u008e\5\23\n\2\u008d"+
		"\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\u0092\3\2\2\2\u0091\u0093\5\27\f\2\u0092\u0091\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094|\3\2\2\2\u0094\u0087\3\2\2\2"+
		"\u0094\u008b\3\2\2\2\u0095\16\3\2\2\2\u0096\u009c\7\62\2\2\u0097\u0099"+
		"\5\25\13\2\u0098\u009a\5\23\n\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2"+
		"\2\u009a\u009c\3\2\2\2\u009b\u0096\3\2\2\2\u009b\u0097\3\2\2\2\u009c\20"+
		"\3\2\2\2\u009d\u009e\4\62;\2\u009e\22\3\2\2\2\u009f\u00a1\5\21\t\2\u00a0"+
		"\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3\24\3\2\2\2\u00a4\u00a5\4\63;\2\u00a5\26\3\2\2\2\u00a6\u00a7"+
		"\5\31\r\2\u00a7\u00a8\5\33\16\2\u00a8\30\3\2\2\2\u00a9\u00aa\t\2\2\2\u00aa"+
		"\32\3\2\2\2\u00ab\u00b1\5\23\n\2\u00ac\u00ad\7-\2\2\u00ad\u00b1\5\23\n"+
		"\2\u00ae\u00af\7/\2\2\u00af\u00b1\5\23\n\2\u00b0\u00ab\3\2\2\2\u00b0\u00ac"+
		"\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\34\3\2\2\2\u00b2\u00b3\7\62\2\2\u00b3"+
		"\u00b4\7z\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b7\5\37\20\2\u00b6\u00b5\3"+
		"\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00c3\3\2\2\2\u00ba\u00bb\7\62\2\2\u00bb\u00bc\7Z\2\2\u00bc\u00be\3\2"+
		"\2\2\u00bd\u00bf\5\37\20\2\u00be\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00b2\3\2"+
		"\2\2\u00c2\u00ba\3\2\2\2\u00c3\36\3\2\2\2\u00c4\u00c7\5\21\t\2\u00c5\u00c7"+
		"\t\3\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7 \3\2\2\2\u00c8"+
		"\u00cc\t\4\2\2\u00c9\u00cb\t\5\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2"+
		"\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\"\3\2\2\2\u00ce\u00cc"+
		"\3\2\2\2\u00cf\u00d3\5%\23\2\u00d0\u00d3\5)\25\2\u00d1\u00d3\5\'\24\2"+
		"\u00d2\u00cf\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3$\3"+
		"\2\2\2\u00d4\u00d5\t\6\2\2\u00d5&\3\2\2\2\u00d6\u00d7\7\61\2\2\u00d7\u00d8"+
		"\7\61\2\2\u00d8\u00dc\3\2\2\2\u00d9\u00db\n\7\2\2\u00da\u00d9\3\2\2\2"+
		"\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00e1"+
		"\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e2\5)\25\2\u00e0\u00e2\7\2\2\3\u00e1"+
		"\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2(\3\2\2\2\u00e3\u00e4\7\17\2\2"+
		"\u00e4\u00e7\7\f\2\2\u00e5\u00e7\t\7\2\2\u00e6\u00e3\3\2\2\2\u00e6\u00e5"+
		"\3\2\2\2\u00e7*\3\2\2\2\u00e8\u00eb\5\r\7\2\u00e9\u00eb\5\35\17\2\u00ea"+
		"\u00e8\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb,\3\2\2\2\u00ec\u00ed\7v\2\2\u00ed"+
		"\u00ee\7t\2\2\u00ee\u00ef\7w\2\2\u00ef\u00f6\7g\2\2\u00f0\u00f1\7h\2\2"+
		"\u00f1\u00f2\7c\2\2\u00f2\u00f3\7n\2\2\u00f3\u00f4\7u\2\2\u00f4\u00f6"+
		"\7g\2\2\u00f5\u00ec\3\2\2\2\u00f5\u00f0\3\2\2\2\u00f6.\3\2\2\2\u00f7\u00f8"+
		"\7p\2\2\u00f8\u00f9\7w\2\2\u00f9\u00fa\7n\2\2\u00fa\u00fb\7n\2\2\u00fb"+
		"\60\3\2\2\2\u00fc\u0100\7$\2\2\u00fd\u00ff\n\b\2\2\u00fe\u00fd\3\2\2\2"+
		"\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103"+
		"\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u010d\7$\2\2\u0104\u0108\7)\2\2\u0105"+
		"\u0107\n\t\2\2\u0106\u0105\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2"+
		"\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2\2\2\u010a\u0108\3\2\2\2\u010b"+
		"\u010d\7)\2\2\u010c\u00fc\3\2\2\2\u010c\u0104\3\2\2\2\u010d\62\3\2\2\2"+
		"\u010e\u010f\7*\2\2\u010f\64\3\2\2\2\u0110\u0111\7+\2\2\u0111\66\3\2\2"+
		"\2\u0112\u0113\7}\2\2\u01138\3\2\2\2\u0114\u0115\7\177\2\2\u0115:\3\2"+
		"\2\2\u0116\u0117\7=\2\2\u0117<\3\2\2\2\u0118\u0119\7?\2\2\u0119>\3\2\2"+
		"\2\u011a\u011b\7?\2\2\u011b\u011c\7?\2\2\u011c@\3\2\2\2\u011d\u011e\7"+
		"-\2\2\u011eB\3\2\2\2\u011f\u0120\7/\2\2\u0120D\3\2\2\2\u0121\u0122\7,"+
		"\2\2\u0122F\3\2\2\2\u0123\u0124\7\61\2\2\u0124H\3\2\2\2\u0125\u0126\7"+
		"#\2\2\u0126J\3\2\2\2\u0127\u0128\7>\2\2\u0128L\3\2\2\2\u0129\u012a\7@"+
		"\2\2\u012aN\3\2\2\2\u012b\u012c\7>\2\2\u012c\u012d\7?\2\2\u012dP\3\2\2"+
		"\2\u012e\u012f\7@\2\2\u012f\u0130\7?\2\2\u0130R\3\2\2\2\u0131\u0132\7"+
		".\2\2\u0132T\3\2\2\2\u0133\u0134\7<\2\2\u0134V\3\2\2\2\u0135\u0136\7r"+
		"\2\2\u0136\u0137\7t\2\2\u0137\u0138\7k\2\2\u0138\u0139\7p\2\2\u0139\u013a"+
		"\7v\2\2\u013aX\3\2\2\2\u013b\u013c\7x\2\2\u013c\u013d\7c\2\2\u013d\u013e"+
		"\7t\2\2\u013eZ\3\2\2\2\u013f\u0140\5!\21\2\u0140\\\3\2\2\2\u0141\u0143"+
		"\5#\22\2\u0142\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0142\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\b/\2\2\u0147^\3\2\2\2\34"+
		"\2\u0081\u0085\u0089\u008f\u0092\u0094\u0099\u009b\u00a2\u00b0\u00b8\u00c0"+
		"\u00c2\u00c6\u00cc\u00d2\u00dc\u00e1\u00e6\u00ea\u00f5\u0100\u0108\u010c"+
		"\u0144";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}