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
		IF=32, ELSE=33, TRY=34, CATCH=35, FINALLY=36, NEW=37, THIS=38, IDENTIFIER=39, 
		WhiteSpace=40;
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
		"'try'", "'catch'", "'finally'", "'new'", "'this'", "IDENTIFIER", "WhiteSpace"
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
		"CATCH", "FINALLY", "NEW", "THIS", "IDENTIFIER", "WhiteSpace"
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
		case 54: WhiteSpace_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WhiteSpace_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2*\u018d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\2\7\2u\n\2\f\2\16\2"+
		"x\13\2\3\2\5\2{\n\2\3\2\3\2\5\2\177\n\2\3\2\3\2\6\2\u0083\n\2\r\2\16\2"+
		"\u0084\3\2\5\2\u0088\n\2\5\2\u008a\n\2\3\3\3\3\3\3\5\3\u008f\n\3\5\3\u0091"+
		"\n\3\3\4\3\4\3\5\6\5\u0096\n\5\r\5\16\5\u0097\3\6\3\6\3\7\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\5\t\u00a6\n\t\3\n\3\n\3\n\3\n\6\n\u00ac\n\n\r"+
		"\n\16\n\u00ad\3\n\3\n\3\n\3\n\6\n\u00b4\n\n\r\n\16\n\u00b5\5\n\u00b8\n"+
		"\n\3\13\3\13\5\13\u00bc\n\13\3\f\3\f\7\f\u00c0\n\f\f\f\16\f\u00c3\13\f"+
		"\3\r\3\r\3\r\5\r\u00c8\n\r\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u00d0\n"+
		"\17\f\17\16\17\u00d3\13\17\3\17\3\17\5\17\u00d7\n\17\3\20\3\20\3\20\5"+
		"\20\u00dc\n\20\3\21\3\21\5\21\u00e0\n\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u00eb\n\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\7\24"+
		"\u00f4\n\24\f\24\16\24\u00f7\13\24\3\24\3\24\3\24\7\24\u00fc\n\24\f\24"+
		"\16\24\u00ff\13\24\3\24\5\24\u0102\n\24\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'"+
		"\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3"+
		"+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3"+
		".\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62"+
		"\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\67\3\67"+
		"\38\68\u0188\n8\r8\168\u0189\38\38\29\3\2\1\5\2\1\7\2\1\t\2\1\13\2\1\r"+
		"\2\1\17\2\1\21\2\1\23\2\1\25\2\1\27\2\1\31\2\1\33\2\1\35\2\1\37\2\1!\3"+
		"\1#\4\1%\5\1\'\6\1)\7\1+\b\1-\t\1/\n\1\61\13\1\63\f\1\65\r\1\67\16\19"+
		"\17\1;\20\1=\21\1?\22\1A\23\1C\24\1E\25\1G\26\1I\27\1K\30\1M\31\1O\32"+
		"\1Q\33\1S\34\1U\35\1W\36\1Y\37\1[ \1]!\1_\"\1a#\1c$\1e%\1g&\1i\'\1k(\1"+
		"m)\1o*\2\3\2\n\4\2GGgg\4\2CHch\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\13\16"+
		"\16\"\"\4\2\f\f\17\17\5\2\f\f\17\17$$\5\2\f\f\17\17))\u0199\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2"+
		"m\3\2\2\2\2o\3\2\2\2\3\u0089\3\2\2\2\5\u0090\3\2\2\2\7\u0092\3\2\2\2\t"+
		"\u0095\3\2\2\2\13\u0099\3\2\2\2\r\u009b\3\2\2\2\17\u009e\3\2\2\2\21\u00a5"+
		"\3\2\2\2\23\u00b7\3\2\2\2\25\u00bb\3\2\2\2\27\u00bd\3\2\2\2\31\u00c7\3"+
		"\2\2\2\33\u00c9\3\2\2\2\35\u00cb\3\2\2\2\37\u00db\3\2\2\2!\u00df\3\2\2"+
		"\2#\u00ea\3\2\2\2%\u00ec\3\2\2\2\'\u0101\3\2\2\2)\u0103\3\2\2\2+\u0105"+
		"\3\2\2\2-\u0107\3\2\2\2/\u0109\3\2\2\2\61\u010b\3\2\2\2\63\u010d\3\2\2"+
		"\2\65\u010f\3\2\2\2\67\u0112\3\2\2\29\u0114\3\2\2\2;\u0116\3\2\2\2=\u0118"+
		"\3\2\2\2?\u011a\3\2\2\2A\u011c\3\2\2\2C\u011e\3\2\2\2E\u0120\3\2\2\2G"+
		"\u0123\3\2\2\2I\u0126\3\2\2\2K\u0128\3\2\2\2M\u012a\3\2\2\2O\u012c\3\2"+
		"\2\2Q\u0132\3\2\2\2S\u0136\3\2\2\2U\u013f\3\2\2\2W\u0146\3\2\2\2Y\u014f"+
		"\3\2\2\2[\u0155\3\2\2\2]\u015b\3\2\2\2_\u0161\3\2\2\2a\u0164\3\2\2\2c"+
		"\u0169\3\2\2\2e\u016d\3\2\2\2g\u0173\3\2\2\2i\u017b\3\2\2\2k\u017f\3\2"+
		"\2\2m\u0184\3\2\2\2o\u0187\3\2\2\2qr\5\5\3\2rv\7\60\2\2su\5\t\5\2ts\3"+
		"\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wz\3\2\2\2xv\3\2\2\2y{\5\r\7\2zy\3"+
		"\2\2\2z{\3\2\2\2{\u008a\3\2\2\2|~\5\5\3\2}\177\5\r\7\2~}\3\2\2\2~\177"+
		"\3\2\2\2\177\u008a\3\2\2\2\u0080\u0082\7\60\2\2\u0081\u0083\5\t\5\2\u0082"+
		"\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2"+
		"\2\2\u0085\u0087\3\2\2\2\u0086\u0088\5\r\7\2\u0087\u0086\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089q\3\2\2\2\u0089|\3\2\2\2\u0089"+
		"\u0080\3\2\2\2\u008a\4\3\2\2\2\u008b\u0091\7\62\2\2\u008c\u008e\5\13\6"+
		"\2\u008d\u008f\5\t\5\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091"+
		"\3\2\2\2\u0090\u008b\3\2\2\2\u0090\u008c\3\2\2\2\u0091\6\3\2\2\2\u0092"+
		"\u0093\4\62;\2\u0093\b\3\2\2\2\u0094\u0096\5\7\4\2\u0095\u0094\3\2\2\2"+
		"\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\n\3"+
		"\2\2\2\u0099\u009a\4\63;\2\u009a\f\3\2\2\2\u009b\u009c\5\17\b\2\u009c"+
		"\u009d\5\21\t\2\u009d\16\3\2\2\2\u009e\u009f\t\2\2\2\u009f\20\3\2\2\2"+
		"\u00a0\u00a6\5\t\5\2\u00a1\u00a2\7-\2\2\u00a2\u00a6\5\t\5\2\u00a3\u00a4"+
		"\7/\2\2\u00a4\u00a6\5\t\5\2\u00a5\u00a0\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a6\22\3\2\2\2\u00a7\u00a8\7\62\2\2\u00a8\u00a9\7z\2"+
		"\2\u00a9\u00ab\3\2\2\2\u00aa\u00ac\5\25\13\2\u00ab\u00aa\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b8\3\2"+
		"\2\2\u00af\u00b0\7\62\2\2\u00b0\u00b1\7Z\2\2\u00b1\u00b3\3\2\2\2\u00b2"+
		"\u00b4\5\25\13\2\u00b3\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3"+
		"\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00a7\3\2\2\2\u00b7"+
		"\u00af\3\2\2\2\u00b8\24\3\2\2\2\u00b9\u00bc\5\7\4\2\u00ba\u00bc\t\3\2"+
		"\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\26\3\2\2\2\u00bd\u00c1"+
		"\t\4\2\2\u00be\u00c0\t\5\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\30\3\2\2\2\u00c3\u00c1\3\2\2"+
		"\2\u00c4\u00c8\5\33\16\2\u00c5\u00c8\5\37\20\2\u00c6\u00c8\5\35\17\2\u00c7"+
		"\u00c4\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\32\3\2\2"+
		"\2\u00c9\u00ca\t\6\2\2\u00ca\34\3\2\2\2\u00cb\u00cc\7\61\2\2\u00cc\u00cd"+
		"\7\61\2\2\u00cd\u00d1\3\2\2\2\u00ce\u00d0\n\7\2\2\u00cf\u00ce\3\2\2\2"+
		"\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d6"+
		"\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d7\5\37\20\2\u00d5\u00d7\7\2\2\3"+
		"\u00d6\u00d4\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7\36\3\2\2\2\u00d8\u00d9"+
		"\7\17\2\2\u00d9\u00dc\7\f\2\2\u00da\u00dc\t\7\2\2\u00db\u00d8\3\2\2\2"+
		"\u00db\u00da\3\2\2\2\u00dc \3\2\2\2\u00dd\u00e0\5\3\2\2\u00de\u00e0\5"+
		"\23\n\2\u00df\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00e0\"\3\2\2\2\u00e1"+
		"\u00e2\7v\2\2\u00e2\u00e3\7t\2\2\u00e3\u00e4\7w\2\2\u00e4\u00eb\7g\2\2"+
		"\u00e5\u00e6\7h\2\2\u00e6\u00e7\7c\2\2\u00e7\u00e8\7n\2\2\u00e8\u00e9"+
		"\7u\2\2\u00e9\u00eb\7g\2\2\u00ea\u00e1\3\2\2\2\u00ea\u00e5\3\2\2\2\u00eb"+
		"$\3\2\2\2\u00ec\u00ed\7p\2\2\u00ed\u00ee\7w\2\2\u00ee\u00ef\7n\2\2\u00ef"+
		"\u00f0\7n\2\2\u00f0&\3\2\2\2\u00f1\u00f5\7$\2\2\u00f2\u00f4\n\b\2\2\u00f3"+
		"\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2"+
		"\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u0102\7$\2\2\u00f9"+
		"\u00fd\7)\2\2\u00fa\u00fc\n\t\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2"+
		"\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u0100\u0102\7)\2\2\u0101\u00f1\3\2\2\2\u0101\u00f9\3\2"+
		"\2\2\u0102(\3\2\2\2\u0103\u0104\7*\2\2\u0104*\3\2\2\2\u0105\u0106\7+\2"+
		"\2\u0106,\3\2\2\2\u0107\u0108\7}\2\2\u0108.\3\2\2\2\u0109\u010a\7\177"+
		"\2\2\u010a\60\3\2\2\2\u010b\u010c\7=\2\2\u010c\62\3\2\2\2\u010d\u010e"+
		"\7?\2\2\u010e\64\3\2\2\2\u010f\u0110\7?\2\2\u0110\u0111\7?\2\2\u0111\66"+
		"\3\2\2\2\u0112\u0113\7-\2\2\u01138\3\2\2\2\u0114\u0115\7/\2\2\u0115:\3"+
		"\2\2\2\u0116\u0117\7,\2\2\u0117<\3\2\2\2\u0118\u0119\7\61\2\2\u0119>\3"+
		"\2\2\2\u011a\u011b\7#\2\2\u011b@\3\2\2\2\u011c\u011d\7>\2\2\u011dB\3\2"+
		"\2\2\u011e\u011f\7@\2\2\u011fD\3\2\2\2\u0120\u0121\7>\2\2\u0121\u0122"+
		"\7?\2\2\u0122F\3\2\2\2\u0123\u0124\7@\2\2\u0124\u0125\7?\2\2\u0125H\3"+
		"\2\2\2\u0126\u0127\7.\2\2\u0127J\3\2\2\2\u0128\u0129\7<\2\2\u0129L\3\2"+
		"\2\2\u012a\u012b\7\60\2\2\u012bN\3\2\2\2\u012c\u012d\7r\2\2\u012d\u012e"+
		"\7t\2\2\u012e\u012f\7k\2\2\u012f\u0130\7p\2\2\u0130\u0131\7v\2\2\u0131"+
		"P\3\2\2\2\u0132\u0133\7x\2\2\u0133\u0134\7c\2\2\u0134\u0135\7t\2\2\u0135"+
		"R\3\2\2\2\u0136\u0137\7h\2\2\u0137\u0138\7w\2\2\u0138\u0139\7p\2\2\u0139"+
		"\u013a\7e\2\2\u013a\u013b\7v\2\2\u013b\u013c\7k\2\2\u013c\u013d\7q\2\2"+
		"\u013d\u013e\7p\2\2\u013eT\3\2\2\2\u013f\u0140\7t\2\2\u0140\u0141\7g\2"+
		"\2\u0141\u0142\7v\2\2\u0142\u0143\7w\2\2\u0143\u0144\7t\2\2\u0144\u0145"+
		"\7p\2\2\u0145V\3\2\2\2\u0146\u0147\7e\2\2\u0147\u0148\7q\2\2\u0148\u0149"+
		"\7p\2\2\u0149\u014a\7v\2\2\u014a\u014b\7k\2\2\u014b\u014c\7p\2\2\u014c"+
		"\u014d\7w\2\2\u014d\u014e\7g\2\2\u014eX\3\2\2\2\u014f\u0150\7d\2\2\u0150"+
		"\u0151\7t\2\2\u0151\u0152\7g\2\2\u0152\u0153\7c\2\2\u0153\u0154\7m\2\2"+
		"\u0154Z\3\2\2\2\u0155\u0156\7v\2\2\u0156\u0157\7j\2\2\u0157\u0158\7t\2"+
		"\2\u0158\u0159\7q\2\2\u0159\u015a\7y\2\2\u015a\\\3\2\2\2\u015b\u015c\7"+
		"y\2\2\u015c\u015d\7j\2\2\u015d\u015e\7k\2\2\u015e\u015f\7n\2\2\u015f\u0160"+
		"\7g\2\2\u0160^\3\2\2\2\u0161\u0162\7k\2\2\u0162\u0163\7h\2\2\u0163`\3"+
		"\2\2\2\u0164\u0165\7g\2\2\u0165\u0166\7n\2\2\u0166\u0167\7u\2\2\u0167"+
		"\u0168\7g\2\2\u0168b\3\2\2\2\u0169\u016a\7v\2\2\u016a\u016b\7t\2\2\u016b"+
		"\u016c\7{\2\2\u016cd\3\2\2\2\u016d\u016e\7e\2\2\u016e\u016f\7c\2\2\u016f"+
		"\u0170\7v\2\2\u0170\u0171\7e\2\2\u0171\u0172\7j\2\2\u0172f\3\2\2\2\u0173"+
		"\u0174\7h\2\2\u0174\u0175\7k\2\2\u0175\u0176\7p\2\2\u0176\u0177\7c\2\2"+
		"\u0177\u0178\7n\2\2\u0178\u0179\7n\2\2\u0179\u017a\7{\2\2\u017ah\3\2\2"+
		"\2\u017b\u017c\7p\2\2\u017c\u017d\7g\2\2\u017d\u017e\7y\2\2\u017ej\3\2"+
		"\2\2\u017f\u0180\7v\2\2\u0180\u0181\7j\2\2\u0181\u0182\7k\2\2\u0182\u0183"+
		"\7u\2\2\u0183l\3\2\2\2\u0184\u0185\5\27\f\2\u0185n\3\2\2\2\u0186\u0188"+
		"\5\31\r\2\u0187\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u0187\3\2\2\2"+
		"\u0189\u018a\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c\b8\2\2\u018cp\3\2"+
		"\2\2\34\2vz~\u0084\u0087\u0089\u008e\u0090\u0097\u00a5\u00ad\u00b5\u00b7"+
		"\u00bb\u00c1\u00c7\u00d1\u00d6\u00db\u00df\u00ea\u00f5\u00fd\u0101\u0189";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}