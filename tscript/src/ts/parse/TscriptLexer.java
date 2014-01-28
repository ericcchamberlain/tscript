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
		NUMERIC_LITERAL=1, LPAREN=2, RPAREN=3, SEMICOLON=4, EQUAL=5, PLUS=6, ASTERISK=7, 
		LOGICAL_NOT=8, PRINT=9, VAR=10, IDENTIFIER=11, WhiteSpace=12;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"NUMERIC_LITERAL", "LPAREN", "RPAREN", "SEMICOLON", "EQUAL", "PLUS", "ASTERISK", 
		"LOGICAL_NOT", "'print'", "'var'", "IDENTIFIER", "WhiteSpace"
	};
	public static final String[] ruleNames = {
		"DIGIT", "IdentifierCharacters", "SpaceTokens", "SpaceChars", "EndOfLineComment", 
		"LineTerminator", "NUMERIC_LITERAL", "LPAREN", "RPAREN", "SEMICOLON", 
		"EQUAL", "PLUS", "ASTERISK", "LOGICAL_NOT", "PRINT", "VAR", "IDENTIFIER", 
		"WhiteSpace"
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
		case 17: WhiteSpace_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WhiteSpace_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\16o\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\7\3,\n\3\f\3\16\3/\13\3\3\4\3\4\3\4\5\4\64"+
		"\n\4\3\5\3\5\3\6\3\6\3\6\3\6\7\6<\n\6\f\6\16\6?\13\6\3\6\3\6\5\6C\n\6"+
		"\3\7\3\7\3\7\5\7H\n\7\3\b\6\bK\n\b\r\b\16\bL\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\23\6\23j\n\23\r\23\16\23k\3\23\3\23\2\24\3"+
		"\2\1\5\2\1\7\2\1\t\2\1\13\2\1\r\2\1\17\3\1\21\4\1\23\5\1\25\6\1\27\7\1"+
		"\31\b\1\33\t\1\35\n\1\37\13\1!\f\1#\r\1%\16\2\3\2\16\3\2\62;\6\2&&C\\"+
		"aac|\7\2&&\62;C\\aac|\5\2\13\13\16\16\"\"\4\2\f\f\17\17\3\2**\3\2++\3"+
		"\2==\3\2??\3\2--\3\2,,\3\2##p\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5)\3\2\2\2\7\63\3"+
		"\2\2\2\t\65\3\2\2\2\13\67\3\2\2\2\rG\3\2\2\2\17J\3\2\2\2\21N\3\2\2\2\23"+
		"P\3\2\2\2\25R\3\2\2\2\27T\3\2\2\2\31V\3\2\2\2\33X\3\2\2\2\35Z\3\2\2\2"+
		"\37\\\3\2\2\2!b\3\2\2\2#f\3\2\2\2%i\3\2\2\2\'(\t\2\2\2(\4\3\2\2\2)-\t"+
		"\3\2\2*,\t\4\2\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\6\3\2\2\2/-"+
		"\3\2\2\2\60\64\5\t\5\2\61\64\5\r\7\2\62\64\5\13\6\2\63\60\3\2\2\2\63\61"+
		"\3\2\2\2\63\62\3\2\2\2\64\b\3\2\2\2\65\66\t\5\2\2\66\n\3\2\2\2\678\7\61"+
		"\2\289\7\61\2\29=\3\2\2\2:<\n\6\2\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3"+
		"\2\2\2>B\3\2\2\2?=\3\2\2\2@C\5\r\7\2AC\7\2\2\3B@\3\2\2\2BA\3\2\2\2C\f"+
		"\3\2\2\2DE\7\17\2\2EH\7\f\2\2FH\t\6\2\2GD\3\2\2\2GF\3\2\2\2H\16\3\2\2"+
		"\2IK\5\3\2\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\20\3\2\2\2NO\t\7"+
		"\2\2O\22\3\2\2\2PQ\t\b\2\2Q\24\3\2\2\2RS\t\t\2\2S\26\3\2\2\2TU\t\n\2\2"+
		"U\30\3\2\2\2VW\t\13\2\2W\32\3\2\2\2XY\t\f\2\2Y\34\3\2\2\2Z[\t\r\2\2[\36"+
		"\3\2\2\2\\]\7r\2\2]^\7t\2\2^_\7k\2\2_`\7p\2\2`a\7v\2\2a \3\2\2\2bc\7x"+
		"\2\2cd\7c\2\2de\7t\2\2e\"\3\2\2\2fg\5\5\3\2g$\3\2\2\2hj\5\7\4\2ih\3\2"+
		"\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\b\23\2\2n&\3\2\2\2\n\2"+
		"-\63=BGLk";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}