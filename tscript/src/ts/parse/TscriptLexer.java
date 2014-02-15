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
		LPAREN=5, RPAREN=6, SEMICOLON=7, ASSIGN=8, EQUALITY=9, PLUS=10, ASTERISK=11, 
		LOGICAL_NOT=12, LESS=13, GREATER=14, LESS_OR_EQUAL=15, GREATER_OR_EQUAL=16, 
		PRINT=17, VAR=18, IDENTIFIER=19, WhiteSpace=20;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"NUMERIC_LITERAL", "BOOLEAN_LITERAL", "'null'", "STRING_LITERAL", "LPAREN", 
		"RPAREN", "SEMICOLON", "ASSIGN", "EQUALITY", "PLUS", "ASTERISK", "LOGICAL_NOT", 
		"LESS", "GREATER", "LESS_OR_EQUAL", "GREATER_OR_EQUAL", "'print'", "'var'", 
		"IDENTIFIER", "WhiteSpace"
	};
	public static final String[] ruleNames = {
		"DIGIT", "IdentifierCharacters", "SpaceTokens", "SpaceChars", "EndOfLineComment", 
		"LineTerminator", "NUMERIC_LITERAL", "BOOLEAN_LITERAL", "NULL_LITERAL", 
		"STRING_LITERAL", "LPAREN", "RPAREN", "SEMICOLON", "ASSIGN", "EQUALITY", 
		"PLUS", "ASTERISK", "LOGICAL_NOT", "LESS", "GREATER", "LESS_OR_EQUAL", 
		"GREATER_OR_EQUAL", "PRINT", "VAR", "IDENTIFIER", "WhiteSpace"
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
		case 25: WhiteSpace_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WhiteSpace_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\26\u00ae\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\7\3<\n\3\f\3\16\3?\13\3\3\4"+
		"\3\4\3\4\5\4D\n\4\3\5\3\5\3\6\3\6\3\6\3\6\7\6L\n\6\f\6\16\6O\13\6\3\6"+
		"\3\6\5\6S\n\6\3\7\3\7\3\7\5\7X\n\7\3\b\6\b[\n\b\r\b\16\b\\\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\th\n\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\7\13q"+
		"\n\13\f\13\16\13t\13\13\3\13\3\13\3\13\7\13y\n\13\f\13\16\13|\13\13\3"+
		"\13\5\13\177\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3"+
		"\33\6\33\u00a9\n\33\r\33\16\33\u00aa\3\33\3\33\2\34\3\2\1\5\2\1\7\2\1"+
		"\t\2\1\13\2\1\r\2\1\17\3\1\21\4\1\23\5\1\25\6\1\27\7\1\31\b\1\33\t\1\35"+
		"\n\1\37\13\1!\f\1#\r\1%\16\1\'\17\1)\20\1+\21\1-\22\1/\23\1\61\24\1\63"+
		"\25\1\65\26\2\3\2\24\3\2\62;\6\2&&C\\aac|\7\2&&\62;C\\aac|\5\2\13\13\16"+
		"\16\"\"\4\2\f\f\17\17\3\2$$\5\2\f\f\17\17$$\3\2))\5\2\f\f\17\17))\3\2"+
		"**\3\2++\3\2==\3\2??\3\2--\3\2,,\3\2##\3\2>>\3\2@@\u00b3\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\59\3\2\2\2\7C\3\2\2\2\tE\3\2\2\2"+
		"\13G\3\2\2\2\rW\3\2\2\2\17Z\3\2\2\2\21g\3\2\2\2\23i\3\2\2\2\25~\3\2\2"+
		"\2\27\u0080\3\2\2\2\31\u0082\3\2\2\2\33\u0084\3\2\2\2\35\u0086\3\2\2\2"+
		"\37\u0088\3\2\2\2!\u008b\3\2\2\2#\u008d\3\2\2\2%\u008f\3\2\2\2\'\u0091"+
		"\3\2\2\2)\u0093\3\2\2\2+\u0095\3\2\2\2-\u0098\3\2\2\2/\u009b\3\2\2\2\61"+
		"\u00a1\3\2\2\2\63\u00a5\3\2\2\2\65\u00a8\3\2\2\2\678\t\2\2\28\4\3\2\2"+
		"\29=\t\3\2\2:<\t\4\2\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\6\3\2"+
		"\2\2?=\3\2\2\2@D\5\t\5\2AD\5\r\7\2BD\5\13\6\2C@\3\2\2\2CA\3\2\2\2CB\3"+
		"\2\2\2D\b\3\2\2\2EF\t\5\2\2F\n\3\2\2\2GH\7\61\2\2HI\7\61\2\2IM\3\2\2\2"+
		"JL\n\6\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NR\3\2\2\2OM\3\2\2\2"+
		"PS\5\r\7\2QS\7\2\2\3RP\3\2\2\2RQ\3\2\2\2S\f\3\2\2\2TU\7\17\2\2UX\7\f\2"+
		"\2VX\t\6\2\2WT\3\2\2\2WV\3\2\2\2X\16\3\2\2\2Y[\5\3\2\2ZY\3\2\2\2[\\\3"+
		"\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\20\3\2\2\2^_\7v\2\2_`\7t\2\2`a\7w\2\2ah"+
		"\7g\2\2bc\7h\2\2cd\7c\2\2de\7n\2\2ef\7u\2\2fh\7g\2\2g^\3\2\2\2gb\3\2\2"+
		"\2h\22\3\2\2\2ij\7p\2\2jk\7w\2\2kl\7n\2\2lm\7n\2\2m\24\3\2\2\2nr\t\7\2"+
		"\2oq\n\b\2\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2"+
		"\2u\177\t\7\2\2vz\t\t\2\2wy\n\n\2\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3"+
		"\2\2\2{}\3\2\2\2|z\3\2\2\2}\177\t\t\2\2~n\3\2\2\2~v\3\2\2\2\177\26\3\2"+
		"\2\2\u0080\u0081\t\13\2\2\u0081\30\3\2\2\2\u0082\u0083\t\f\2\2\u0083\32"+
		"\3\2\2\2\u0084\u0085\t\r\2\2\u0085\34\3\2\2\2\u0086\u0087\t\16\2\2\u0087"+
		"\36\3\2\2\2\u0088\u0089\t\16\2\2\u0089\u008a\t\16\2\2\u008a \3\2\2\2\u008b"+
		"\u008c\t\17\2\2\u008c\"\3\2\2\2\u008d\u008e\t\20\2\2\u008e$\3\2\2\2\u008f"+
		"\u0090\t\21\2\2\u0090&\3\2\2\2\u0091\u0092\t\22\2\2\u0092(\3\2\2\2\u0093"+
		"\u0094\t\23\2\2\u0094*\3\2\2\2\u0095\u0096\t\22\2\2\u0096\u0097\t\16\2"+
		"\2\u0097,\3\2\2\2\u0098\u0099\t\23\2\2\u0099\u009a\t\16\2\2\u009a.\3\2"+
		"\2\2\u009b\u009c\7r\2\2\u009c\u009d\7t\2\2\u009d\u009e\7k\2\2\u009e\u009f"+
		"\7p\2\2\u009f\u00a0\7v\2\2\u00a0\60\3\2\2\2\u00a1\u00a2\7x\2\2\u00a2\u00a3"+
		"\7c\2\2\u00a3\u00a4\7t\2\2\u00a4\62\3\2\2\2\u00a5\u00a6\5\5\3\2\u00a6"+
		"\64\3\2\2\2\u00a7\u00a9\5\7\4\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2\2"+
		"\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad"+
		"\b\33\2\2\u00ad\66\3\2\2\2\16\2=CMRW\\grz~\u00aa";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}