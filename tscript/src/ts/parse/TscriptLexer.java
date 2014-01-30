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
		NUMERIC_LITERAL=1, BOOLEAN_LITERAL=2, LPAREN=3, RPAREN=4, SEMICOLON=5, 
		EQUAL=6, PLUS=7, ASTERISK=8, LOGICAL_NOT=9, LESS=10, GREATER=11, LESS_OR_EQUAL=12, 
		GREATER_OR_EQUAL=13, PRINT=14, VAR=15, IDENTIFIER=16, WhiteSpace=17;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"NUMERIC_LITERAL", "BOOLEAN_LITERAL", "LPAREN", "RPAREN", "SEMICOLON", 
		"EQUAL", "PLUS", "ASTERISK", "LOGICAL_NOT", "LESS", "GREATER", "LESS_OR_EQUAL", 
		"GREATER_OR_EQUAL", "'print'", "'var'", "IDENTIFIER", "WhiteSpace"
	};
	public static final String[] ruleNames = {
		"DIGIT", "IdentifierCharacters", "SpaceTokens", "SpaceChars", "EndOfLineComment", 
		"LineTerminator", "NUMERIC_LITERAL", "BOOLEAN_LITERAL", "LPAREN", "RPAREN", 
		"SEMICOLON", "EQUAL", "PLUS", "ASTERISK", "LOGICAL_NOT", "LESS", "GREATER", 
		"LESS_OR_EQUAL", "GREATER_OR_EQUAL", "PRINT", "VAR", "IDENTIFIER", "WhiteSpace"
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
		case 22: WhiteSpace_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WhiteSpace_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\23\u008e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\7\3\66\n\3\f\3\16\39\13\3\3\4\3\4\3\4\5\4>\n\4\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\7\6F\n\6\f\6\16\6I\13\6\3\6\3\6\5\6M\n\6\3\7\3\7\3\7\5"+
		"\7R\n\7\3\b\6\bU\n\b\r\b\16\bV\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"b\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\30\6\30\u0089\n\30\r\30\16"+
		"\30\u008a\3\30\3\30\2\31\3\2\1\5\2\1\7\2\1\t\2\1\13\2\1\r\2\1\17\3\1\21"+
		"\4\1\23\5\1\25\6\1\27\7\1\31\b\1\33\t\1\35\n\1\37\13\1!\f\1#\r\1%\16\1"+
		"\'\17\1)\20\1+\21\1-\22\1/\23\2\3\2\20\3\2\62;\6\2&&C\\aac|\7\2&&\62;"+
		"C\\aac|\5\2\13\13\16\16\"\"\4\2\f\f\17\17\3\2**\3\2++\3\2==\3\2??\3\2"+
		"--\3\2,,\3\2##\3\2>>\3\2@@\u0090\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\63\3\2\2\2\7=\3\2\2\2\t"+
		"?\3\2\2\2\13A\3\2\2\2\rQ\3\2\2\2\17T\3\2\2\2\21a\3\2\2\2\23c\3\2\2\2\25"+
		"e\3\2\2\2\27g\3\2\2\2\31i\3\2\2\2\33k\3\2\2\2\35m\3\2\2\2\37o\3\2\2\2"+
		"!q\3\2\2\2#s\3\2\2\2%u\3\2\2\2\'x\3\2\2\2){\3\2\2\2+\u0081\3\2\2\2-\u0085"+
		"\3\2\2\2/\u0088\3\2\2\2\61\62\t\2\2\2\62\4\3\2\2\2\63\67\t\3\2\2\64\66"+
		"\t\4\2\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\6\3\2\2"+
		"\29\67\3\2\2\2:>\5\t\5\2;>\5\r\7\2<>\5\13\6\2=:\3\2\2\2=;\3\2\2\2=<\3"+
		"\2\2\2>\b\3\2\2\2?@\t\5\2\2@\n\3\2\2\2AB\7\61\2\2BC\7\61\2\2CG\3\2\2\2"+
		"DF\n\6\2\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HL\3\2\2\2IG\3\2\2\2"+
		"JM\5\r\7\2KM\7\2\2\3LJ\3\2\2\2LK\3\2\2\2M\f\3\2\2\2NO\7\17\2\2OR\7\f\2"+
		"\2PR\t\6\2\2QN\3\2\2\2QP\3\2\2\2R\16\3\2\2\2SU\5\3\2\2TS\3\2\2\2UV\3\2"+
		"\2\2VT\3\2\2\2VW\3\2\2\2W\20\3\2\2\2XY\7v\2\2YZ\7t\2\2Z[\7w\2\2[b\7g\2"+
		"\2\\]\7h\2\2]^\7c\2\2^_\7n\2\2_`\7u\2\2`b\7g\2\2aX\3\2\2\2a\\\3\2\2\2"+
		"b\22\3\2\2\2cd\t\7\2\2d\24\3\2\2\2ef\t\b\2\2f\26\3\2\2\2gh\t\t\2\2h\30"+
		"\3\2\2\2ij\t\n\2\2j\32\3\2\2\2kl\t\13\2\2l\34\3\2\2\2mn\t\f\2\2n\36\3"+
		"\2\2\2op\t\r\2\2p \3\2\2\2qr\t\16\2\2r\"\3\2\2\2st\t\17\2\2t$\3\2\2\2"+
		"uv\t\16\2\2vw\t\n\2\2w&\3\2\2\2xy\t\17\2\2yz\t\n\2\2z(\3\2\2\2{|\7r\2"+
		"\2|}\7t\2\2}~\7k\2\2~\177\7p\2\2\177\u0080\7v\2\2\u0080*\3\2\2\2\u0081"+
		"\u0082\7x\2\2\u0082\u0083\7c\2\2\u0083\u0084\7t\2\2\u0084,\3\2\2\2\u0085"+
		"\u0086\5\5\3\2\u0086.\3\2\2\2\u0087\u0089\5\7\4\2\u0088\u0087\3\2\2\2"+
		"\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c"+
		"\3\2\2\2\u008c\u008d\b\30\2\2\u008d\60\3\2\2\2\13\2\67=GLQVa\u008a";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}