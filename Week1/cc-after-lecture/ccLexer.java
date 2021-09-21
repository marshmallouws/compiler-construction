// Generated from cc.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ccLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, NAVN=4, CCNUM=5, CCEXP=6, WHITESPACE=7, COMMENT=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "NAVN", "CCNUM", "CCBLOCK", "CCEXP", "MONTH", 
			"WHITESPACE", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Holder:'", "'Number:'", "'Expiry:'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "NAVN", "CCNUM", "CCEXP", "WHITESPACE", "COMMENT"
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


	public ccLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "cc.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\no\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\6\5\61\n\5\r\5\16\5\62\3\5\3\5\6\5"+
		"\67\n\5\r\5\16\58\7\5;\n\5\f\5\16\5>\13\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\7\7J\n\7\f\7\16\7M\13\7\3\b\3\b\3\b\3\b\3\b\3\t\5\tU\n\t"+
		"\3\t\3\t\3\t\5\tZ\n\t\3\n\6\n]\n\n\r\n\16\n^\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\7\13g\n\13\f\13\16\13j\13\13\3\13\3\13\3\13\3\13\2\2\f\3\3\5\4\7\5"+
		"\t\6\13\7\r\2\17\b\21\2\23\t\25\n\3\2\b\5\2//C\\c|\3\2\62;\3\2\63;\3\2"+
		"\62\64\4\2\13\f\"\"\3\2\f\f\2t\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\17\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\3\27\3\2"+
		"\2\2\5\37\3\2\2\2\7\'\3\2\2\2\t\60\3\2\2\2\13?\3\2\2\2\rD\3\2\2\2\17N"+
		"\3\2\2\2\21Y\3\2\2\2\23\\\3\2\2\2\25b\3\2\2\2\27\30\7J\2\2\30\31\7q\2"+
		"\2\31\32\7n\2\2\32\33\7f\2\2\33\34\7g\2\2\34\35\7t\2\2\35\36\7<\2\2\36"+
		"\4\3\2\2\2\37 \7P\2\2 !\7w\2\2!\"\7o\2\2\"#\7d\2\2#$\7g\2\2$%\7t\2\2%"+
		"&\7<\2\2&\6\3\2\2\2\'(\7G\2\2()\7z\2\2)*\7r\2\2*+\7k\2\2+,\7t\2\2,-\7"+
		"{\2\2-.\7<\2\2.\b\3\2\2\2/\61\t\2\2\2\60/\3\2\2\2\61\62\3\2\2\2\62\60"+
		"\3\2\2\2\62\63\3\2\2\2\63<\3\2\2\2\64\66\7\"\2\2\65\67\t\2\2\2\66\65\3"+
		"\2\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:\64\3\2\2\2;>\3\2\2"+
		"\2<:\3\2\2\2<=\3\2\2\2=\n\3\2\2\2><\3\2\2\2?@\5\r\7\2@A\5\r\7\2AB\5\r"+
		"\7\2BC\5\r\7\2C\f\3\2\2\2DE\t\3\2\2EF\t\3\2\2FG\t\3\2\2GK\t\3\2\2HJ\7"+
		"\"\2\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\16\3\2\2\2MK\3\2\2\2N"+
		"O\5\21\t\2OP\7\61\2\2PQ\t\3\2\2QR\t\3\2\2R\20\3\2\2\2SU\7\62\2\2TS\3\2"+
		"\2\2TU\3\2\2\2UV\3\2\2\2VZ\t\4\2\2WX\7\63\2\2XZ\t\5\2\2YT\3\2\2\2YW\3"+
		"\2\2\2Z\22\3\2\2\2[]\t\6\2\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2"+
		"_`\3\2\2\2`a\b\n\2\2a\24\3\2\2\2bc\7\61\2\2cd\7\61\2\2dh\3\2\2\2eg\n\7"+
		"\2\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2jh\3\2\2\2kl\7\f"+
		"\2\2lm\3\2\2\2mn\b\13\2\2n\26\3\2\2\2\13\2\628<KTY^h\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}