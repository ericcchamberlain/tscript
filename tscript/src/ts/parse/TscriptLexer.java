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
		NUMERIC_LITERAL=1, BOOLEAN_LITERAL=2, NULL_LITERAL=3, LPAREN=4, RPAREN=5, 
		SEMICOLON=6, ASSIGN=7, EQUALITY=8, PLUS=9, ASTERISK=10, LOGICAL_NOT=11, 
		LESS=12, GREATER=13, LESS_OR_EQUAL=14, GREATER_OR_EQUAL=15, PRINT=16, 
		VAR=17, IDENTIFIER=18, WhiteSpace=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"NUMERIC_LITERAL", "BOOLEAN_LITERAL", "'null'", "LPAREN", "RPAREN", "SEMICOLON", 
		"ASSIGN", "EQUALITY", "PLUS", "ASTERISK", "LOGICAL_NOT", "LESS", "GREATER", 
		"LESS_OR_EQUAL", "GREATER_OR_EQUAL", "'print'", "'var'", "IDENTIFIER", 
		"WhiteSpace"
	};
	public static final String[] ruleNames = {
		"DIGIT", "IdentifierCharacters", "SpaceTokens", "SpaceChars", "EndOfLineComment", 
		"LineTerminator", "NUMERIC_LITERAL", "BOOLEAN_LITERAL", "NULL_LITERAL", 
		"LPAREN", "RPAREN", "SEMICOLON", "ASSIGN", "EQUALITY", "PLUS", "ASTERISK", 
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
		case 24: WhiteSpace_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WhiteSpace_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\25\u009a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\3\3\3\7\3:\n\3\f\3\16\3=\13\3\3\4\3\4\3\4\5"+
		"\4B\n\4\3\5\3\5\3\6\3\6\3\6\3\6\7\6J\n\6\f\6\16\6M\13\6\3\6\3\6\5\6Q\n"+
		"\6\3\7\3\7\3\7\5\7V\n\7\3\b\6\bY\n\b\r\b\16\bZ\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\tf\n\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\3\31\3\31\3\32\6\32\u0095\n\32\r\32\16\32\u0096\3\32\3\32"+
		"\2\33\3\2\1\5\2\1\7\2\1\t\2\1\13\2\1\r\2\1\17\3\1\21\4\1\23\5\1\25\6\1"+
		"\27\7\1\31\b\1\33\t\1\35\n\1\37\13\1!\f\1#\r\1%\16\1\'\17\1)\20\1+\21"+
		"\1-\22\1/\23\1\61\24\1\63\25\2\3\2\20\3\2\62;\6\2&&C\\aac|\7\2&&\62;C"+
		"\\aac|\5\2\13\13\16\16\"\"\4\2\f\f\17\17\3\2**\3\2++\3\2==\3\2??\3\2-"+
		"-\3\2,,\3\2##\3\2>>\3\2@@\u009c\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5"+
		"\67\3\2\2\2\7A\3\2\2\2\tC\3\2\2\2\13E\3\2\2\2\rU\3\2\2\2\17X\3\2\2\2\21"+
		"e\3\2\2\2\23g\3\2\2\2\25l\3\2\2\2\27n\3\2\2\2\31p\3\2\2\2\33r\3\2\2\2"+
		"\35t\3\2\2\2\37w\3\2\2\2!y\3\2\2\2#{\3\2\2\2%}\3\2\2\2\'\177\3\2\2\2)"+
		"\u0081\3\2\2\2+\u0084\3\2\2\2-\u0087\3\2\2\2/\u008d\3\2\2\2\61\u0091\3"+
		"\2\2\2\63\u0094\3\2\2\2\65\66\t\2\2\2\66\4\3\2\2\2\67;\t\3\2\28:\t\4\2"+
		"\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\6\3\2\2\2=;\3\2\2\2>B\5\t"+
		"\5\2?B\5\r\7\2@B\5\13\6\2A>\3\2\2\2A?\3\2\2\2A@\3\2\2\2B\b\3\2\2\2CD\t"+
		"\5\2\2D\n\3\2\2\2EF\7\61\2\2FG\7\61\2\2GK\3\2\2\2HJ\n\6\2\2IH\3\2\2\2"+
		"JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LP\3\2\2\2MK\3\2\2\2NQ\5\r\7\2OQ\7\2\2\3"+
		"PN\3\2\2\2PO\3\2\2\2Q\f\3\2\2\2RS\7\17\2\2SV\7\f\2\2TV\t\6\2\2UR\3\2\2"+
		"\2UT\3\2\2\2V\16\3\2\2\2WY\5\3\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2"+
		"\2\2[\20\3\2\2\2\\]\7v\2\2]^\7t\2\2^_\7w\2\2_f\7g\2\2`a\7h\2\2ab\7c\2"+
		"\2bc\7n\2\2cd\7u\2\2df\7g\2\2e\\\3\2\2\2e`\3\2\2\2f\22\3\2\2\2gh\7p\2"+
		"\2hi\7w\2\2ij\7n\2\2jk\7n\2\2k\24\3\2\2\2lm\t\7\2\2m\26\3\2\2\2no\t\b"+
		"\2\2o\30\3\2\2\2pq\t\t\2\2q\32\3\2\2\2rs\t\n\2\2s\34\3\2\2\2tu\t\n\2\2"+
		"uv\t\n\2\2v\36\3\2\2\2wx\t\13\2\2x \3\2\2\2yz\t\f\2\2z\"\3\2\2\2{|\t\r"+
		"\2\2|$\3\2\2\2}~\t\16\2\2~&\3\2\2\2\177\u0080\t\17\2\2\u0080(\3\2\2\2"+
		"\u0081\u0082\t\16\2\2\u0082\u0083\t\n\2\2\u0083*\3\2\2\2\u0084\u0085\t"+
		"\17\2\2\u0085\u0086\t\n\2\2\u0086,\3\2\2\2\u0087\u0088\7r\2\2\u0088\u0089"+
		"\7t\2\2\u0089\u008a\7k\2\2\u008a\u008b\7p\2\2\u008b\u008c\7v\2\2\u008c"+
		".\3\2\2\2\u008d\u008e\7x\2\2\u008e\u008f\7c\2\2\u008f\u0090\7t\2\2\u0090"+
		"\60\3\2\2\2\u0091\u0092\5\5\3\2\u0092\62\3\2\2\2\u0093\u0095\5\7\4\2\u0094"+
		"\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\u0098\3\2\2\2\u0098\u0099\b\32\2\2\u0099\64\3\2\2\2\13\2;A"+
		"KPUZe\u0096";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}