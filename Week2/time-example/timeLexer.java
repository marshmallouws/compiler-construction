// Generated from time.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class timeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DATO=1, TIME=2, INT=3, FLOAT=4, IDENT=5, COMMENT=6, WHITESPACE=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DATO", "DAG", "MAANED", "TIME", "INT", "DIGIT", "FLOAT", "IDENT", "COMMENT", 
			"WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DATO", "TIME", "INT", "FLOAT", "IDENT", "COMMENT", "WHITESPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public timeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "time.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\tt\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\2\3\2\3\3\5\3\36\n\3\3\3\3\3\3\3\3\3\3\3\5\3%\n\3\3"+
		"\4\5\4(\n\4\3\4\3\4\3\4\5\4-\n\4\3\5\5\5\60\n\5\3\5\3\5\3\5\5\5\65\n\5"+
		"\3\5\3\5\3\5\3\5\3\6\5\6<\n\6\3\6\6\6?\n\6\r\6\16\6@\3\7\3\7\3\b\5\bF"+
		"\n\b\3\b\6\bI\n\b\r\b\16\bJ\3\b\3\b\6\bO\n\b\r\b\16\bP\5\bS\n\b\3\b\3"+
		"\b\6\bW\n\b\r\b\16\bX\5\b[\n\b\3\t\3\t\7\t_\n\t\f\t\16\tb\13\t\3\n\3\n"+
		"\3\n\3\n\7\nh\n\n\f\n\16\nk\13\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\2"+
		"\2\f\3\3\5\2\7\2\t\4\13\5\r\2\17\6\21\7\23\b\25\t\3\2\r\3\2\63;\3\2\63"+
		"\64\3\2\62;\3\2\62\63\3\2\62\64\3\2\62\65\3\2\62\67\5\2C\\aac|\6\2\62"+
		";C\\aac|\3\2\f\f\4\2\13\f\"\"\2\u0081\2\3\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\3\27\3\2\2\2"+
		"\5$\3\2\2\2\7,\3\2\2\2\t\64\3\2\2\2\13;\3\2\2\2\rB\3\2\2\2\17E\3\2\2\2"+
		"\21\\\3\2\2\2\23c\3\2\2\2\25p\3\2\2\2\27\30\5\5\3\2\30\31\7\60\2\2\31"+
		"\32\5\7\4\2\32\33\7\60\2\2\33\4\3\2\2\2\34\36\7\62\2\2\35\34\3\2\2\2\35"+
		"\36\3\2\2\2\36\37\3\2\2\2\37%\t\2\2\2 !\t\3\2\2!%\t\4\2\2\"#\7\65\2\2"+
		"#%\t\5\2\2$\35\3\2\2\2$ \3\2\2\2$\"\3\2\2\2%\6\3\2\2\2&(\7\62\2\2\'&\3"+
		"\2\2\2\'(\3\2\2\2()\3\2\2\2)-\t\2\2\2*+\7\63\2\2+-\t\6\2\2,\'\3\2\2\2"+
		",*\3\2\2\2-\b\3\2\2\2.\60\t\5\2\2/.\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2"+
		"\61\65\t\4\2\2\62\63\7\64\2\2\63\65\t\7\2\2\64/\3\2\2\2\64\62\3\2\2\2"+
		"\65\66\3\2\2\2\66\67\t\b\2\2\678\t\4\2\289\7\f\2\29\n\3\2\2\2:<\7/\2\2"+
		";:\3\2\2\2;<\3\2\2\2<>\3\2\2\2=?\5\r\7\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2"+
		"@A\3\2\2\2A\f\3\2\2\2BC\t\4\2\2C\16\3\2\2\2DF\7/\2\2ED\3\2\2\2EF\3\2\2"+
		"\2FH\3\2\2\2GI\5\r\7\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2KR\3\2\2"+
		"\2LN\7\60\2\2MO\5\r\7\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QS\3\2"+
		"\2\2RL\3\2\2\2RS\3\2\2\2SZ\3\2\2\2TV\7G\2\2UW\5\r\7\2VU\3\2\2\2WX\3\2"+
		"\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZT\3\2\2\2Z[\3\2\2\2[\20\3\2\2\2\\`"+
		"\t\t\2\2]_\t\n\2\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\22\3\2\2\2"+
		"b`\3\2\2\2cd\7\61\2\2de\7\61\2\2ei\3\2\2\2fh\n\13\2\2gf\3\2\2\2hk\3\2"+
		"\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\7\f\2\2mn\3\2\2\2no\b\n"+
		"\2\2o\24\3\2\2\2pq\t\f\2\2qr\3\2\2\2rs\b\13\2\2s\26\3\2\2\2\23\2\35$\'"+
		",/\64;@EJPRXZ`i\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}