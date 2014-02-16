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
		"DecimalLiteral", "DecimalIntegerLiteral", "DecimalDigit", "DecimalDigits", 
		"NonZeroDigit", "ExponentPart", "ExponentIndicator", "SignedInteger", 
		"HexIntegerLiteral", "HexDigit", "IdentifierCharacters", "SpaceTokens", 
		"SpaceChars", "EndOfLineComment", "LineTerminator", "NUMERIC_LITERAL", 
		"BOOLEAN_LITERAL", "NULL_LITERAL", "STRING_LITERAL", "LPAREN", "RPAREN", 
		"SEMICOLON", "ASSIGN", "EQUALITY", "PLUS", "MINUS", "ASTERISK", "DIVIDE", 
		"LOGICAL_NOT", "LESS", "GREATER", "LESS_OR_EQUAL", "GREATER_OR_EQUAL", 
		"PRINT", "VAR", "IDENTIFIER", "WhiteSpace"
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
		case 36: WhiteSpace_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WhiteSpace_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\30\u010f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\7\2Q\n\2\f\2\16\2"+
		"T\13\2\3\2\5\2W\n\2\3\2\5\2Z\n\2\3\2\6\2]\n\2\r\2\16\2^\3\2\5\2b\n\2\5"+
		"\2d\n\2\3\3\3\3\3\3\5\3i\n\3\5\3k\n\3\3\4\3\4\3\5\6\5p\n\5\r\5\16\5q\3"+
		"\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t\u0080\n\t\3\n\3\n\3"+
		"\n\3\n\6\n\u0086\n\n\r\n\16\n\u0087\3\n\3\n\3\n\3\n\6\n\u008e\n\n\r\n"+
		"\16\n\u008f\5\n\u0092\n\n\3\13\3\13\5\13\u0096\n\13\3\f\3\f\7\f\u009a"+
		"\n\f\f\f\16\f\u009d\13\f\3\r\3\r\3\r\5\r\u00a2\n\r\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\7\17\u00aa\n\17\f\17\16\17\u00ad\13\17\3\17\3\17\5\17\u00b1"+
		"\n\17\3\20\3\20\3\20\5\20\u00b6\n\20\3\21\3\21\5\21\u00ba\n\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00c5\n\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\7\24\u00ce\n\24\f\24\16\24\u00d1\13\24\3\24\3\24"+
		"\3\24\7\24\u00d6\n\24\f\24\16\24\u00d9\13\24\3\24\5\24\u00dc\n\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3"+
		"#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3&\6&\u010a\n&\r&\16&\u010b\3&\3&\2"+
		"\'\3\2\1\5\2\1\7\2\1\t\2\1\13\2\1\r\2\1\17\2\1\21\2\1\23\2\1\25\2\1\27"+
		"\2\1\31\2\1\33\2\1\35\2\1\37\2\1!\3\1#\4\1%\5\1\'\6\1)\7\1+\b\1-\t\1/"+
		"\n\1\61\13\1\63\f\1\65\r\1\67\16\19\17\1;\20\1=\21\1?\22\1A\23\1C\24\1"+
		"E\25\1G\26\1I\27\1K\30\2\3\2\27\3\2\62;\3\2\63;\4\2GGgg\4\2CHch\6\2&&"+
		"C\\aac|\7\2&&\62;C\\aac|\5\2\13\13\16\16\"\"\4\2\f\f\17\17\5\2\f\f\17"+
		"\17$$\5\2\f\f\17\17))\3\2**\3\2++\3\2==\3\2??\3\2--\3\2//\3\2,,\3\2\61"+
		"\61\3\2##\3\2>>\3\2@@\u011a\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3"+
		"c\3\2\2\2\5j\3\2\2\2\7l\3\2\2\2\to\3\2\2\2\13s\3\2\2\2\ru\3\2\2\2\17x"+
		"\3\2\2\2\21\177\3\2\2\2\23\u0091\3\2\2\2\25\u0095\3\2\2\2\27\u0097\3\2"+
		"\2\2\31\u00a1\3\2\2\2\33\u00a3\3\2\2\2\35\u00a5\3\2\2\2\37\u00b5\3\2\2"+
		"\2!\u00b9\3\2\2\2#\u00c4\3\2\2\2%\u00c6\3\2\2\2\'\u00db\3\2\2\2)\u00dd"+
		"\3\2\2\2+\u00df\3\2\2\2-\u00e1\3\2\2\2/\u00e3\3\2\2\2\61\u00e5\3\2\2\2"+
		"\63\u00e8\3\2\2\2\65\u00ea\3\2\2\2\67\u00ec\3\2\2\29\u00ee\3\2\2\2;\u00f0"+
		"\3\2\2\2=\u00f2\3\2\2\2?\u00f4\3\2\2\2A\u00f6\3\2\2\2C\u00f9\3\2\2\2E"+
		"\u00fc\3\2\2\2G\u0102\3\2\2\2I\u0106\3\2\2\2K\u0109\3\2\2\2MN\5\5\3\2"+
		"NR\7\60\2\2OQ\5\t\5\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SV\3\2\2"+
		"\2TR\3\2\2\2UW\5\r\7\2VU\3\2\2\2VW\3\2\2\2Wd\3\2\2\2XZ\7\60\2\2YX\3\2"+
		"\2\2YZ\3\2\2\2Z\\\3\2\2\2[]\5\t\5\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_"+
		"\3\2\2\2_a\3\2\2\2`b\5\r\7\2a`\3\2\2\2ab\3\2\2\2bd\3\2\2\2cM\3\2\2\2c"+
		"Y\3\2\2\2d\4\3\2\2\2ek\7\62\2\2fh\5\13\6\2gi\5\t\5\2hg\3\2\2\2hi\3\2\2"+
		"\2ik\3\2\2\2je\3\2\2\2jf\3\2\2\2k\6\3\2\2\2lm\t\2\2\2m\b\3\2\2\2np\5\7"+
		"\4\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\n\3\2\2\2st\t\3\2\2t\f\3"+
		"\2\2\2uv\5\17\b\2vw\5\21\t\2w\16\3\2\2\2xy\t\4\2\2y\20\3\2\2\2z\u0080"+
		"\5\t\5\2{|\7-\2\2|\u0080\5\t\5\2}~\7/\2\2~\u0080\5\t\5\2\177z\3\2\2\2"+
		"\177{\3\2\2\2\177}\3\2\2\2\u0080\22\3\2\2\2\u0081\u0082\7\62\2\2\u0082"+
		"\u0083\7z\2\2\u0083\u0085\3\2\2\2\u0084\u0086\5\25\13\2\u0085\u0084\3"+
		"\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u0092\3\2\2\2\u0089\u008a\7\62\2\2\u008a\u008b\7Z\2\2\u008b\u008d\3\2"+
		"\2\2\u008c\u008e\5\25\13\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u0081\3\2"+
		"\2\2\u0091\u0089\3\2\2\2\u0092\24\3\2\2\2\u0093\u0096\5\7\4\2\u0094\u0096"+
		"\t\5\2\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2\2\2\u0096\26\3\2\2\2\u0097"+
		"\u009b\t\6\2\2\u0098\u009a\t\7\2\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2"+
		"\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\30\3\2\2\2\u009d\u009b"+
		"\3\2\2\2\u009e\u00a2\5\33\16\2\u009f\u00a2\5\37\20\2\u00a0\u00a2\5\35"+
		"\17\2\u00a1\u009e\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2"+
		"\32\3\2\2\2\u00a3\u00a4\t\b\2\2\u00a4\34\3\2\2\2\u00a5\u00a6\7\61\2\2"+
		"\u00a6\u00a7\7\61\2\2\u00a7\u00ab\3\2\2\2\u00a8\u00aa\n\t\2\2\u00a9\u00a8"+
		"\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00b0\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b1\5\37\20\2\u00af\u00b1\7"+
		"\2\2\3\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\36\3\2\2\2\u00b2"+
		"\u00b3\7\17\2\2\u00b3\u00b6\7\f\2\2\u00b4\u00b6\t\t\2\2\u00b5\u00b2\3"+
		"\2\2\2\u00b5\u00b4\3\2\2\2\u00b6 \3\2\2\2\u00b7\u00ba\5\3\2\2\u00b8\u00ba"+
		"\5\23\n\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\"\3\2\2\2\u00bb"+
		"\u00bc\7v\2\2\u00bc\u00bd\7t\2\2\u00bd\u00be\7w\2\2\u00be\u00c5\7g\2\2"+
		"\u00bf\u00c0\7h\2\2\u00c0\u00c1\7c\2\2\u00c1\u00c2\7n\2\2\u00c2\u00c3"+
		"\7u\2\2\u00c3\u00c5\7g\2\2\u00c4\u00bb\3\2\2\2\u00c4\u00bf\3\2\2\2\u00c5"+
		"$\3\2\2\2\u00c6\u00c7\7p\2\2\u00c7\u00c8\7w\2\2\u00c8\u00c9\7n\2\2\u00c9"+
		"\u00ca\7n\2\2\u00ca&\3\2\2\2\u00cb\u00cf\7$\2\2\u00cc\u00ce\n\n\2\2\u00cd"+
		"\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00dc\7$\2\2\u00d3"+
		"\u00d7\7)\2\2\u00d4\u00d6\n\13\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3\2"+
		"\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00da\u00dc\7)\2\2\u00db\u00cb\3\2\2\2\u00db\u00d3\3\2"+
		"\2\2\u00dc(\3\2\2\2\u00dd\u00de\t\f\2\2\u00de*\3\2\2\2\u00df\u00e0\t\r"+
		"\2\2\u00e0,\3\2\2\2\u00e1\u00e2\t\16\2\2\u00e2.\3\2\2\2\u00e3\u00e4\t"+
		"\17\2\2\u00e4\60\3\2\2\2\u00e5\u00e6\t\17\2\2\u00e6\u00e7\t\17\2\2\u00e7"+
		"\62\3\2\2\2\u00e8\u00e9\t\20\2\2\u00e9\64\3\2\2\2\u00ea\u00eb\t\21\2\2"+
		"\u00eb\66\3\2\2\2\u00ec\u00ed\t\22\2\2\u00ed8\3\2\2\2\u00ee\u00ef\t\23"+
		"\2\2\u00ef:\3\2\2\2\u00f0\u00f1\t\24\2\2\u00f1<\3\2\2\2\u00f2\u00f3\t"+
		"\25\2\2\u00f3>\3\2\2\2\u00f4\u00f5\t\26\2\2\u00f5@\3\2\2\2\u00f6\u00f7"+
		"\t\25\2\2\u00f7\u00f8\t\17\2\2\u00f8B\3\2\2\2\u00f9\u00fa\t\26\2\2\u00fa"+
		"\u00fb\t\17\2\2\u00fbD\3\2\2\2\u00fc\u00fd\7r\2\2\u00fd\u00fe\7t\2\2\u00fe"+
		"\u00ff\7k\2\2\u00ff\u0100\7p\2\2\u0100\u0101\7v\2\2\u0101F\3\2\2\2\u0102"+
		"\u0103\7x\2\2\u0103\u0104\7c\2\2\u0104\u0105\7t\2\2\u0105H\3\2\2\2\u0106"+
		"\u0107\5\27\f\2\u0107J\3\2\2\2\u0108\u010a\5\31\r\2\u0109\u0108\3\2\2"+
		"\2\u010a\u010b\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d"+
		"\3\2\2\2\u010d\u010e\b&\2\2\u010eL\3\2\2\2\34\2RVY^achjq\177\u0087\u008f"+
		"\u0091\u0095\u009b\u00a1\u00ab\u00b0\u00b5\u00b9\u00c4\u00cf\u00d7\u00db"+
		"\u010b";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}