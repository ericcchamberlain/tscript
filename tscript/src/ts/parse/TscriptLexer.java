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
		GREATER_OR_EQUAL=18, COMMA=19, PRINT=20, VAR=21, IDENTIFIER=22, WhiteSpace=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"NUMERIC_LITERAL", "BOOLEAN_LITERAL", "'null'", "STRING_LITERAL", "LPAREN", 
		"RPAREN", "SEMICOLON", "ASSIGN", "EQUALITY", "PLUS", "MINUS", "ASTERISK", 
		"DIVIDE", "LOGICAL_NOT", "LESS", "GREATER", "LESS_OR_EQUAL", "GREATER_OR_EQUAL", 
		"COMMA", "'print'", "'var'", "IDENTIFIER", "WhiteSpace"
	};
	public static final String[] ruleNames = {
		"DecimalLiteral", "DecimalIntegerLiteral", "DecimalDigit", "DecimalDigits", 
		"NonZeroDigit", "ExponentPart", "ExponentIndicator", "SignedInteger", 
		"HexIntegerLiteral", "HexDigit", "IdentifierCharacters", "SpaceTokens", 
		"SpaceChars", "EndOfLineComment", "LineTerminator", "NUMERIC_LITERAL", 
		"BOOLEAN_LITERAL", "NULL_LITERAL", "STRING_LITERAL", "LPAREN", "RPAREN", 
		"SEMICOLON", "ASSIGN", "EQUALITY", "PLUS", "MINUS", "ASTERISK", "DIVIDE", 
		"LOGICAL_NOT", "LESS", "GREATER", "LESS_OR_EQUAL", "GREATER_OR_EQUAL", 
		"COMMA", "PRINT", "VAR", "IDENTIFIER", "WhiteSpace"
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
		case 37: WhiteSpace_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WhiteSpace_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\31\u0115\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\7\2S\n\2\f"+
		"\2\16\2V\13\2\3\2\5\2Y\n\2\3\2\3\2\5\2]\n\2\3\2\3\2\6\2a\n\2\r\2\16\2"+
		"b\3\2\5\2f\n\2\5\2h\n\2\3\3\3\3\3\3\5\3m\n\3\5\3o\n\3\3\4\3\4\3\5\6\5"+
		"t\n\5\r\5\16\5u\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t\u0084"+
		"\n\t\3\n\3\n\3\n\3\n\6\n\u008a\n\n\r\n\16\n\u008b\3\n\3\n\3\n\3\n\6\n"+
		"\u0092\n\n\r\n\16\n\u0093\5\n\u0096\n\n\3\13\3\13\5\13\u009a\n\13\3\f"+
		"\3\f\7\f\u009e\n\f\f\f\16\f\u00a1\13\f\3\r\3\r\3\r\5\r\u00a6\n\r\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\7\17\u00ae\n\17\f\17\16\17\u00b1\13\17\3\17"+
		"\3\17\5\17\u00b5\n\17\3\20\3\20\3\20\5\20\u00ba\n\20\3\21\3\21\5\21\u00be"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00c9\n\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\7\24\u00d2\n\24\f\24\16\24\u00d5\13\24"+
		"\3\24\3\24\3\24\7\24\u00da\n\24\f\24\16\24\u00dd\13\24\3\24\5\24\u00e0"+
		"\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3\""+
		"\3\"\3\"\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3\'\6\'\u0110\n\'\r"+
		"\'\16\'\u0111\3\'\3\'\2(\3\2\1\5\2\1\7\2\1\t\2\1\13\2\1\r\2\1\17\2\1\21"+
		"\2\1\23\2\1\25\2\1\27\2\1\31\2\1\33\2\1\35\2\1\37\2\1!\3\1#\4\1%\5\1\'"+
		"\6\1)\7\1+\b\1-\t\1/\n\1\61\13\1\63\f\1\65\r\1\67\16\19\17\1;\20\1=\21"+
		"\1?\22\1A\23\1C\24\1E\25\1G\26\1I\27\1K\30\1M\31\2\3\2\30\3\2\62;\3\2"+
		"\63;\4\2GGgg\4\2CHch\6\2&&C\\aac|\7\2&&\62;C\\aac|\5\2\13\13\16\16\"\""+
		"\4\2\f\f\17\17\5\2\f\f\17\17$$\5\2\f\f\17\17))\3\2**\3\2++\3\2==\3\2?"+
		"?\3\2--\3\2//\3\2,,\3\2\61\61\3\2##\3\2>>\3\2@@\3\2..\u0121\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3g\3\2\2\2\5n\3\2\2\2\7p\3"+
		"\2\2\2\ts\3\2\2\2\13w\3\2\2\2\ry\3\2\2\2\17|\3\2\2\2\21\u0083\3\2\2\2"+
		"\23\u0095\3\2\2\2\25\u0099\3\2\2\2\27\u009b\3\2\2\2\31\u00a5\3\2\2\2\33"+
		"\u00a7\3\2\2\2\35\u00a9\3\2\2\2\37\u00b9\3\2\2\2!\u00bd\3\2\2\2#\u00c8"+
		"\3\2\2\2%\u00ca\3\2\2\2\'\u00df\3\2\2\2)\u00e1\3\2\2\2+\u00e3\3\2\2\2"+
		"-\u00e5\3\2\2\2/\u00e7\3\2\2\2\61\u00e9\3\2\2\2\63\u00ec\3\2\2\2\65\u00ee"+
		"\3\2\2\2\67\u00f0\3\2\2\29\u00f2\3\2\2\2;\u00f4\3\2\2\2=\u00f6\3\2\2\2"+
		"?\u00f8\3\2\2\2A\u00fa\3\2\2\2C\u00fd\3\2\2\2E\u0100\3\2\2\2G\u0102\3"+
		"\2\2\2I\u0108\3\2\2\2K\u010c\3\2\2\2M\u010f\3\2\2\2OP\5\5\3\2PT\7\60\2"+
		"\2QS\5\t\5\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UX\3\2\2\2VT\3\2\2"+
		"\2WY\5\r\7\2XW\3\2\2\2XY\3\2\2\2Yh\3\2\2\2Z\\\5\5\3\2[]\5\r\7\2\\[\3\2"+
		"\2\2\\]\3\2\2\2]h\3\2\2\2^`\7\60\2\2_a\5\t\5\2`_\3\2\2\2ab\3\2\2\2b`\3"+
		"\2\2\2bc\3\2\2\2ce\3\2\2\2df\5\r\7\2ed\3\2\2\2ef\3\2\2\2fh\3\2\2\2gO\3"+
		"\2\2\2gZ\3\2\2\2g^\3\2\2\2h\4\3\2\2\2io\7\62\2\2jl\5\13\6\2km\5\t\5\2"+
		"lk\3\2\2\2lm\3\2\2\2mo\3\2\2\2ni\3\2\2\2nj\3\2\2\2o\6\3\2\2\2pq\t\2\2"+
		"\2q\b\3\2\2\2rt\5\7\4\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2v\n\3\2"+
		"\2\2wx\t\3\2\2x\f\3\2\2\2yz\5\17\b\2z{\5\21\t\2{\16\3\2\2\2|}\t\4\2\2"+
		"}\20\3\2\2\2~\u0084\5\t\5\2\177\u0080\7-\2\2\u0080\u0084\5\t\5\2\u0081"+
		"\u0082\7/\2\2\u0082\u0084\5\t\5\2\u0083~\3\2\2\2\u0083\177\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0084\22\3\2\2\2\u0085\u0086\7\62\2\2\u0086\u0087\7z\2"+
		"\2\u0087\u0089\3\2\2\2\u0088\u008a\5\25\13\2\u0089\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u0096\3\2"+
		"\2\2\u008d\u008e\7\62\2\2\u008e\u008f\7Z\2\2\u008f\u0091\3\2\2\2\u0090"+
		"\u0092\5\25\13\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3"+
		"\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0085\3\2\2\2\u0095"+
		"\u008d\3\2\2\2\u0096\24\3\2\2\2\u0097\u009a\5\7\4\2\u0098\u009a\t\5\2"+
		"\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a\26\3\2\2\2\u009b\u009f"+
		"\t\6\2\2\u009c\u009e\t\7\2\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\30\3\2\2\2\u00a1\u009f\3\2\2"+
		"\2\u00a2\u00a6\5\33\16\2\u00a3\u00a6\5\37\20\2\u00a4\u00a6\5\35\17\2\u00a5"+
		"\u00a2\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\32\3\2\2"+
		"\2\u00a7\u00a8\t\b\2\2\u00a8\34\3\2\2\2\u00a9\u00aa\7\61\2\2\u00aa\u00ab"+
		"\7\61\2\2\u00ab\u00af\3\2\2\2\u00ac\u00ae\n\t\2\2\u00ad\u00ac\3\2\2\2"+
		"\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b4"+
		"\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b5\5\37\20\2\u00b3\u00b5\7\2\2\3"+
		"\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\36\3\2\2\2\u00b6\u00b7"+
		"\7\17\2\2\u00b7\u00ba\7\f\2\2\u00b8\u00ba\t\t\2\2\u00b9\u00b6\3\2\2\2"+
		"\u00b9\u00b8\3\2\2\2\u00ba \3\2\2\2\u00bb\u00be\5\3\2\2\u00bc\u00be\5"+
		"\23\n\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be\"\3\2\2\2\u00bf"+
		"\u00c0\7v\2\2\u00c0\u00c1\7t\2\2\u00c1\u00c2\7w\2\2\u00c2\u00c9\7g\2\2"+
		"\u00c3\u00c4\7h\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7n\2\2\u00c6\u00c7"+
		"\7u\2\2\u00c7\u00c9\7g\2\2\u00c8\u00bf\3\2\2\2\u00c8\u00c3\3\2\2\2\u00c9"+
		"$\3\2\2\2\u00ca\u00cb\7p\2\2\u00cb\u00cc\7w\2\2\u00cc\u00cd\7n\2\2\u00cd"+
		"\u00ce\7n\2\2\u00ce&\3\2\2\2\u00cf\u00d3\7$\2\2\u00d0\u00d2\n\n\2\2\u00d1"+
		"\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00e0\7$\2\2\u00d7"+
		"\u00db\7)\2\2\u00d8\u00da\n\13\2\2\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2"+
		"\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd"+
		"\u00db\3\2\2\2\u00de\u00e0\7)\2\2\u00df\u00cf\3\2\2\2\u00df\u00d7\3\2"+
		"\2\2\u00e0(\3\2\2\2\u00e1\u00e2\t\f\2\2\u00e2*\3\2\2\2\u00e3\u00e4\t\r"+
		"\2\2\u00e4,\3\2\2\2\u00e5\u00e6\t\16\2\2\u00e6.\3\2\2\2\u00e7\u00e8\t"+
		"\17\2\2\u00e8\60\3\2\2\2\u00e9\u00ea\t\17\2\2\u00ea\u00eb\t\17\2\2\u00eb"+
		"\62\3\2\2\2\u00ec\u00ed\t\20\2\2\u00ed\64\3\2\2\2\u00ee\u00ef\t\21\2\2"+
		"\u00ef\66\3\2\2\2\u00f0\u00f1\t\22\2\2\u00f18\3\2\2\2\u00f2\u00f3\t\23"+
		"\2\2\u00f3:\3\2\2\2\u00f4\u00f5\t\24\2\2\u00f5<\3\2\2\2\u00f6\u00f7\t"+
		"\25\2\2\u00f7>\3\2\2\2\u00f8\u00f9\t\26\2\2\u00f9@\3\2\2\2\u00fa\u00fb"+
		"\t\25\2\2\u00fb\u00fc\t\17\2\2\u00fcB\3\2\2\2\u00fd\u00fe\t\26\2\2\u00fe"+
		"\u00ff\t\17\2\2\u00ffD\3\2\2\2\u0100\u0101\t\27\2\2\u0101F\3\2\2\2\u0102"+
		"\u0103\7r\2\2\u0103\u0104\7t\2\2\u0104\u0105\7k\2\2\u0105\u0106\7p\2\2"+
		"\u0106\u0107\7v\2\2\u0107H\3\2\2\2\u0108\u0109\7x\2\2\u0109\u010a\7c\2"+
		"\2\u010a\u010b\7t\2\2\u010bJ\3\2\2\2\u010c\u010d\5\27\f\2\u010dL\3\2\2"+
		"\2\u010e\u0110\5\31\r\2\u010f\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\b\'"+
		"\2\2\u0114N\3\2\2\2\34\2TX\\beglnu\u0083\u008b\u0093\u0095\u0099\u009f"+
		"\u00a5\u00af\u00b4\u00b9\u00bd\u00c8\u00d3\u00db\u00df\u0111";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}