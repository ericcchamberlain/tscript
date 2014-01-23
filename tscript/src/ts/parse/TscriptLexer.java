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
		PRINT=8, VAR=9, IDENTIFIER=10, WhiteSpace=11;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"NUMERIC_LITERAL", "LPAREN", "RPAREN", "SEMICOLON", "EQUAL", "PLUS", "ASTERISK", 
		"'print'", "'var'", "IDENTIFIER", "WhiteSpace"
	};
	public static final String[] ruleNames = {
		"DIGIT", "IdentifierCharacters", "SpaceTokens", "SpaceChars", "EndOfLineComment", 
		"LineTerminator", "NUMERIC_LITERAL", "LPAREN", "RPAREN", "SEMICOLON", 
		"EQUAL", "PLUS", "ASTERISK", "PRINT", "VAR", "IDENTIFIER", "WhiteSpace"
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
		case 16: WhiteSpace_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WhiteSpace_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\rk\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\7\3*\n\3\f\3\16\3-\13\3\3\4\3\4\3\4\5\4\62\n\4\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\7\6:\n\6\f\6\16\6=\13\6\3\6\3\6\5\6A\n\6\3\7\3\7\3"+
		"\7\5\7F\n\7\3\b\6\bI\n\b\r\b\16\bJ\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\22\6\22f\n\22\r\22\16\22g\3\22\3\22\2\23\3\2\1\5\2\1\7\2\1\t\2"+
		"\1\13\2\1\r\2\1\17\3\1\21\4\1\23\5\1\25\6\1\27\7\1\31\b\1\33\t\1\35\n"+
		"\1\37\13\1!\f\1#\r\2\3\2\r\3\2\62;\6\2&&C\\aac|\7\2&&\62;C\\aac|\5\2\13"+
		"\13\16\16\"\"\4\2\f\f\17\17\3\2**\3\2++\3\2==\3\2??\3\2--\3\2,,l\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3"+
		"\2\2\2\5\'\3\2\2\2\7\61\3\2\2\2\t\63\3\2\2\2\13\65\3\2\2\2\rE\3\2\2\2"+
		"\17H\3\2\2\2\21L\3\2\2\2\23N\3\2\2\2\25P\3\2\2\2\27R\3\2\2\2\31T\3\2\2"+
		"\2\33V\3\2\2\2\35X\3\2\2\2\37^\3\2\2\2!b\3\2\2\2#e\3\2\2\2%&\t\2\2\2&"+
		"\4\3\2\2\2\'+\t\3\2\2(*\t\4\2\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2"+
		"\2,\6\3\2\2\2-+\3\2\2\2.\62\5\t\5\2/\62\5\r\7\2\60\62\5\13\6\2\61.\3\2"+
		"\2\2\61/\3\2\2\2\61\60\3\2\2\2\62\b\3\2\2\2\63\64\t\5\2\2\64\n\3\2\2\2"+
		"\65\66\7\61\2\2\66\67\7\61\2\2\67;\3\2\2\28:\n\6\2\298\3\2\2\2:=\3\2\2"+
		"\2;9\3\2\2\2;<\3\2\2\2<@\3\2\2\2=;\3\2\2\2>A\5\r\7\2?A\7\2\2\3@>\3\2\2"+
		"\2@?\3\2\2\2A\f\3\2\2\2BC\7\17\2\2CF\7\f\2\2DF\t\6\2\2EB\3\2\2\2ED\3\2"+
		"\2\2F\16\3\2\2\2GI\5\3\2\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\20"+
		"\3\2\2\2LM\t\7\2\2M\22\3\2\2\2NO\t\b\2\2O\24\3\2\2\2PQ\t\t\2\2Q\26\3\2"+
		"\2\2RS\t\n\2\2S\30\3\2\2\2TU\t\13\2\2U\32\3\2\2\2VW\t\f\2\2W\34\3\2\2"+
		"\2XY\7r\2\2YZ\7t\2\2Z[\7k\2\2[\\\7p\2\2\\]\7v\2\2]\36\3\2\2\2^_\7x\2\2"+
		"_`\7c\2\2`a\7t\2\2a \3\2\2\2bc\5\5\3\2c\"\3\2\2\2df\5\7\4\2ed\3\2\2\2"+
		"fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\b\22\2\2j$\3\2\2\2\n\2+\61"+
		";@EJg";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}