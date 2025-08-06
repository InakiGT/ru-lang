// Generated from Ru.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class RuParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, OR=3, AND=4, IGUAL=5, DIFQ=6, MAYORQ=7, MENORQ=8, MENIG=9, 
		MAYIG=10, MAS=11, MENOS=12, MULT=13, DIV=14, MOD=15, POW=16, NOT=17, PTOCOMA=18, 
		ASIGNA=19, APAR=20, CPAR=21, ALLAVE=22, CLLAVE=23, TRUE=24, FALSE=25, 
		NIL=26, IF=27, ELSE=28, WHILE=29, FOR=30, LOG=31, FUNC=32, RETURN=33, 
		IMPRIMIR=34, TIPO=35, ID=36, INT=37, FLOAT=38, STRING=39, COMENTARIO=40, 
		ESPACIO=41, OTRO=42;
	public static final int
		RULE_programa = 0, RULE_bloque = 1, RULE_sentencia = 2, RULE_asignacion = 3, 
		RULE_sentencia_if = 4, RULE_bloque_condicional = 5, RULE_bloque_de_sentencia = 6, 
		RULE_sentencia_while = 7, RULE_sentencia_for = 8, RULE_sentencia_funcion = 9, 
		RULE_bloque_de_sentencia_func = 10, RULE_bloque_func = 11, RULE_imprimir = 12, 
		RULE_llamada_funcion = 13, RULE_expr = 14, RULE_atomo = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "bloque", "sentencia", "asignacion", "sentencia_if", "bloque_condicional", 
			"bloque_de_sentencia", "sentencia_while", "sentencia_for", "sentencia_funcion", 
			"bloque_de_sentencia_func", "bloque_func", "imprimir", "llamada_funcion", 
			"expr", "atomo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "','", "'||'", "'&&'", "'=='", "'!='", "'>'", "'<'", "'<='", 
			"'>='", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'!'", "';'", "'='", 
			"'('", "')'", "'{'", "'}'", "'true'", "'false'", "'nil'", "'if'", "'else'", 
			"'while'", "'for'", "'log'", "'func'", "'return'", "'imprime'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "OR", "AND", "IGUAL", "DIFQ", "MAYORQ", "MENORQ", "MENIG", 
			"MAYIG", "MAS", "MENOS", "MULT", "DIV", "MOD", "POW", "NOT", "PTOCOMA", 
			"ASIGNA", "APAR", "CPAR", "ALLAVE", "CLLAVE", "TRUE", "FALSE", "NIL", 
			"IF", "ELSE", "WHILE", "FOR", "LOG", "FUNC", "RETURN", "IMPRIMIR", "TIPO", 
			"ID", "INT", "FLOAT", "STRING", "COMENTARIO", "ESPACIO", "OTRO"
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

	@Override
	public String getGrammarFileName() { return "Ru.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RuParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode EOF() { return getToken(RuParser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			bloque();
			setState(33);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BloqueContext extends ParserRuleContext {
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4489985654784L) != 0)) {
				{
				{
				setState(35);
				sentencia();
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaContext extends ParserRuleContext {
		public Token OTRO;
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public Sentencia_ifContext sentencia_if() {
			return getRuleContext(Sentencia_ifContext.class,0);
		}
		public Sentencia_whileContext sentencia_while() {
			return getRuleContext(Sentencia_whileContext.class,0);
		}
		public Sentencia_funcionContext sentencia_funcion() {
			return getRuleContext(Sentencia_funcionContext.class,0);
		}
		public Sentencia_forContext sentencia_for() {
			return getRuleContext(Sentencia_forContext.class,0);
		}
		public ImprimirContext imprimir() {
			return getRuleContext(ImprimirContext.class,0);
		}
		public Llamada_funcionContext llamada_funcion() {
			return getRuleContext(Llamada_funcionContext.class,0);
		}
		public TerminalNode OTRO() { return getToken(RuParser.OTRO, 0); }
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sentencia);
		try {
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				asignacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				sentencia_if();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				sentencia_while();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				sentencia_funcion();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(45);
				sentencia_for();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(46);
				imprimir();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(47);
				llamada_funcion();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(48);
				((SentenciaContext)_localctx).OTRO = match(OTRO);
				System.err.println("caracter desconocido: " + (((SentenciaContext)_localctx).OTRO!=null?((SentenciaContext)_localctx).OTRO.getText():null));
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RuParser.ID, 0); }
		public TerminalNode ASIGNA() { return getToken(RuParser.ASIGNA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PTOCOMA() { return getToken(RuParser.PTOCOMA, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(ID);
			setState(53);
			match(ASIGNA);
			setState(54);
			expr(0);
			setState(55);
			match(PTOCOMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Sentencia_ifContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(RuParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(RuParser.IF, i);
		}
		public List<Bloque_condicionalContext> bloque_condicional() {
			return getRuleContexts(Bloque_condicionalContext.class);
		}
		public Bloque_condicionalContext bloque_condicional(int i) {
			return getRuleContext(Bloque_condicionalContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(RuParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(RuParser.ELSE, i);
		}
		public Bloque_de_sentenciaContext bloque_de_sentencia() {
			return getRuleContext(Bloque_de_sentenciaContext.class,0);
		}
		public Sentencia_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterSentencia_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitSentencia_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitSentencia_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentencia_ifContext sentencia_if() throws RecognitionException {
		Sentencia_ifContext _localctx = new Sentencia_ifContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sentencia_if);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(IF);
			setState(58);
			bloque_condicional();
			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(59);
					match(ELSE);
					setState(60);
					match(IF);
					setState(61);
					bloque_condicional();
					}
					} 
				}
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(67);
				match(ELSE);
				setState(68);
				bloque_de_sentencia();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bloque_condicionalContext extends ParserRuleContext {
		public TerminalNode APAR() { return getToken(RuParser.APAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(RuParser.CPAR, 0); }
		public Bloque_de_sentenciaContext bloque_de_sentencia() {
			return getRuleContext(Bloque_de_sentenciaContext.class,0);
		}
		public Bloque_condicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterBloque_condicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitBloque_condicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitBloque_condicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_condicionalContext bloque_condicional() throws RecognitionException {
		Bloque_condicionalContext _localctx = new Bloque_condicionalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bloque_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(APAR);
			setState(72);
			expr(0);
			setState(73);
			match(CPAR);
			setState(74);
			bloque_de_sentencia();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bloque_de_sentenciaContext extends ParserRuleContext {
		public TerminalNode ALLAVE() { return getToken(RuParser.ALLAVE, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode CLLAVE() { return getToken(RuParser.CLLAVE, 0); }
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public Bloque_de_sentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_de_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterBloque_de_sentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitBloque_de_sentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitBloque_de_sentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_de_sentenciaContext bloque_de_sentencia() throws RecognitionException {
		Bloque_de_sentenciaContext _localctx = new Bloque_de_sentenciaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bloque_de_sentencia);
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALLAVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(ALLAVE);
				setState(77);
				bloque();
				setState(78);
				match(CLLAVE);
				}
				break;
			case IF:
			case WHILE:
			case FOR:
			case FUNC:
			case IMPRIMIR:
			case ID:
			case OTRO:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				sentencia();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Sentencia_whileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(RuParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Bloque_de_sentenciaContext bloque_de_sentencia() {
			return getRuleContext(Bloque_de_sentenciaContext.class,0);
		}
		public Sentencia_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterSentencia_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitSentencia_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitSentencia_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentencia_whileContext sentencia_while() throws RecognitionException {
		Sentencia_whileContext _localctx = new Sentencia_whileContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sentencia_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(WHILE);
			setState(84);
			expr(0);
			setState(85);
			bloque_de_sentencia();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Sentencia_forContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(RuParser.FOR, 0); }
		public TerminalNode APAR() { return getToken(RuParser.APAR, 0); }
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PTOCOMA() { return getToken(RuParser.PTOCOMA, 0); }
		public TerminalNode CPAR() { return getToken(RuParser.CPAR, 0); }
		public Bloque_de_sentenciaContext bloque_de_sentencia() {
			return getRuleContext(Bloque_de_sentenciaContext.class,0);
		}
		public Sentencia_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterSentencia_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitSentencia_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitSentencia_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentencia_forContext sentencia_for() throws RecognitionException {
		Sentencia_forContext _localctx = new Sentencia_forContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sentencia_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(FOR);
			setState(88);
			match(APAR);
			setState(89);
			asignacion();
			setState(90);
			expr(0);
			setState(91);
			match(PTOCOMA);
			setState(92);
			asignacion();
			setState(93);
			match(CPAR);
			setState(94);
			bloque_de_sentencia();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Sentencia_funcionContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(RuParser.FUNC, 0); }
		public List<TerminalNode> ID() { return getTokens(RuParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(RuParser.ID, i);
		}
		public TerminalNode APAR() { return getToken(RuParser.APAR, 0); }
		public TerminalNode CPAR() { return getToken(RuParser.CPAR, 0); }
		public Bloque_de_sentencia_funcContext bloque_de_sentencia_func() {
			return getRuleContext(Bloque_de_sentencia_funcContext.class,0);
		}
		public List<TerminalNode> TIPO() { return getTokens(RuParser.TIPO); }
		public TerminalNode TIPO(int i) {
			return getToken(RuParser.TIPO, i);
		}
		public Sentencia_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterSentencia_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitSentencia_funcion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitSentencia_funcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentencia_funcionContext sentencia_funcion() throws RecognitionException {
		Sentencia_funcionContext _localctx = new Sentencia_funcionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sentencia_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(FUNC);
			setState(97);
			match(ID);
			setState(98);
			match(APAR);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(99);
				match(ID);
				setState(100);
				match(T__0);
				setState(101);
				match(TIPO);
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(102);
					match(T__1);
					setState(103);
					match(ID);
					setState(104);
					match(T__0);
					setState(105);
					match(TIPO);
					}
					}
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(113);
			match(CPAR);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(114);
				match(T__0);
				setState(115);
				match(TIPO);
				}
			}

			setState(118);
			bloque_de_sentencia_func();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bloque_de_sentencia_funcContext extends ParserRuleContext {
		public TerminalNode ALLAVE() { return getToken(RuParser.ALLAVE, 0); }
		public Bloque_funcContext bloque_func() {
			return getRuleContext(Bloque_funcContext.class,0);
		}
		public TerminalNode CLLAVE() { return getToken(RuParser.CLLAVE, 0); }
		public Bloque_de_sentencia_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_de_sentencia_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterBloque_de_sentencia_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitBloque_de_sentencia_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitBloque_de_sentencia_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_de_sentencia_funcContext bloque_de_sentencia_func() throws RecognitionException {
		Bloque_de_sentencia_funcContext _localctx = new Bloque_de_sentencia_funcContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bloque_de_sentencia_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(ALLAVE);
			setState(121);
			bloque_func();
			setState(122);
			match(CLLAVE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bloque_funcContext extends ParserRuleContext {
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public TerminalNode RETURN() { return getToken(RuParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PTOCOMA() { return getToken(RuParser.PTOCOMA, 0); }
		public Bloque_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterBloque_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitBloque_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitBloque_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_funcContext bloque_func() throws RecognitionException {
		Bloque_funcContext _localctx = new Bloque_funcContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bloque_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4489985654784L) != 0)) {
				{
				{
				setState(124);
				sentencia();
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(130);
				match(RETURN);
				setState(131);
				expr(0);
				setState(132);
				match(PTOCOMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImprimirContext extends ParserRuleContext {
		public TerminalNode IMPRIMIR() { return getToken(RuParser.IMPRIMIR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PTOCOMA() { return getToken(RuParser.PTOCOMA, 0); }
		public ImprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterImprimir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitImprimir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitImprimir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprimirContext imprimir() throws RecognitionException {
		ImprimirContext _localctx = new ImprimirContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_imprimir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(IMPRIMIR);
			setState(137);
			expr(0);
			setState(138);
			match(PTOCOMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Llamada_funcionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RuParser.ID, 0); }
		public TerminalNode APAR() { return getToken(RuParser.APAR, 0); }
		public TerminalNode CPAR() { return getToken(RuParser.CPAR, 0); }
		public TerminalNode PTOCOMA() { return getToken(RuParser.PTOCOMA, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Llamada_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterLlamada_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitLlamada_funcion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitLlamada_funcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Llamada_funcionContext llamada_funcion() throws RecognitionException {
		Llamada_funcionContext _localctx = new Llamada_funcionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_llamada_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(ID);
			setState(141);
			match(APAR);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1033058258944L) != 0)) {
				{
				setState(142);
				expr(0);
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(143);
					match(T__1);
					setState(144);
					expr(0);
					}
					}
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(152);
			match(CPAR);
			setState(153);
			match(PTOCOMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MenosUnarioExprContext extends ExprContext {
		public TerminalNode MENOS() { return getToken(RuParser.MENOS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MenosUnarioExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterMenosUnarioExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitMenosUnarioExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitMenosUnarioExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExprContext extends ExprContext {
		public TerminalNode NOT() { return getToken(RuParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitNotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicacionExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(RuParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(RuParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(RuParser.MOD, 0); }
		public MultiplicacionExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterMultiplicacionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitMultiplicacionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitMultiplicacionExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomExprContext extends ExprContext {
		public AtomoContext atomo() {
			return getRuleContext(AtomoContext.class,0);
		}
		public AtomExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterAtomExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitAtomExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitAtomExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(RuParser.OR, 0); }
		public OrExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LlamadaFuncionExprContext extends ExprContext {
		public Llamada_funcionContext llamada_funcion() {
			return getRuleContext(Llamada_funcionContext.class,0);
		}
		public LlamadaFuncionExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterLlamadaFuncionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitLlamadaFuncionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitLlamadaFuncionExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PowExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POW() { return getToken(RuParser.POW, 0); }
		public PowExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterPowExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitPowExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitPowExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IgualdadExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode IGUAL() { return getToken(RuParser.IGUAL, 0); }
		public TerminalNode DIFQ() { return getToken(RuParser.DIFQ, 0); }
		public IgualdadExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterIgualdadExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitIgualdadExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitIgualdadExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelacionalExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MAYIG() { return getToken(RuParser.MAYIG, 0); }
		public TerminalNode MENIG() { return getToken(RuParser.MENIG, 0); }
		public TerminalNode MENORQ() { return getToken(RuParser.MENORQ, 0); }
		public TerminalNode MAYORQ() { return getToken(RuParser.MAYORQ, 0); }
		public RelacionalExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterRelacionalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitRelacionalExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitRelacionalExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogExprContext extends ExprContext {
		public TerminalNode LOG() { return getToken(RuParser.LOG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PTOCOMA() { return getToken(RuParser.PTOCOMA, 0); }
		public LogExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterLogExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitLogExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitLogExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AditivaExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MAS() { return getToken(RuParser.MAS, 0); }
		public TerminalNode MENOS() { return getToken(RuParser.MENOS, 0); }
		public AditivaExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterAditivaExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitAditivaExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitAditivaExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(RuParser.AND, 0); }
		public AndExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new MenosUnarioExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(156);
				match(MENOS);
				setState(157);
				expr(11);
				}
				break;
			case 2:
				{
				_localctx = new LlamadaFuncionExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(158);
				llamada_funcion();
				}
				break;
			case 3:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159);
				match(NOT);
				setState(160);
				expr(9);
				}
				break;
			case 4:
				{
				_localctx = new LogExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161);
				match(LOG);
				setState(162);
				expr(0);
				setState(163);
				match(PTOCOMA);
				}
				break;
			case 5:
				{
				_localctx = new AtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165);
				atomo();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(189);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new PowExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(168);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(169);
						match(POW);
						setState(170);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicacionExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(171);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(172);
						((MultiplicacionExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 57344L) != 0)) ) {
							((MultiplicacionExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(173);
						expr(9);
						}
						break;
					case 3:
						{
						_localctx = new AditivaExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(174);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(175);
						((AditivaExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MAS || _la==MENOS) ) {
							((AditivaExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(176);
						expr(8);
						}
						break;
					case 4:
						{
						_localctx = new RelacionalExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(177);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(178);
						((RelacionalExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1920L) != 0)) ) {
							((RelacionalExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(179);
						expr(7);
						}
						break;
					case 5:
						{
						_localctx = new IgualdadExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(180);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(181);
						((IgualdadExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==IGUAL || _la==DIFQ) ) {
							((IgualdadExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(182);
						expr(6);
						}
						break;
					case 6:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(183);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(184);
						match(AND);
						setState(185);
						expr(5);
						}
						break;
					case 7:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(186);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(187);
						match(OR);
						setState(188);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtomoContext extends ParserRuleContext {
		public AtomoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomo; }
	 
		public AtomoContext() { }
		public void copyFrom(AtomoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParExprContext extends AtomoContext {
		public TerminalNode APAR() { return getToken(RuParser.APAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(RuParser.CPAR, 0); }
		public ParExprContext(AtomoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterParExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitParExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitParExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanAtomContext extends AtomoContext {
		public TerminalNode TRUE() { return getToken(RuParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(RuParser.FALSE, 0); }
		public BooleanAtomContext(AtomoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterBooleanAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitBooleanAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitBooleanAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdAtomContext extends AtomoContext {
		public TerminalNode ID() { return getToken(RuParser.ID, 0); }
		public IdAtomContext(AtomoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterIdAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitIdAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitIdAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringAtomContext extends AtomoContext {
		public TerminalNode STRING() { return getToken(RuParser.STRING, 0); }
		public StringAtomContext(AtomoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterStringAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitStringAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitStringAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NilAtomContext extends AtomoContext {
		public TerminalNode NIL() { return getToken(RuParser.NIL, 0); }
		public NilAtomContext(AtomoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterNilAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitNilAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitNilAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberAtomContext extends AtomoContext {
		public TerminalNode INT() { return getToken(RuParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(RuParser.FLOAT, 0); }
		public NumberAtomContext(AtomoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).enterNumberAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuListener ) ((RuListener)listener).exitNumberAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuVisitor ) return ((RuVisitor<? extends T>)visitor).visitNumberAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomoContext atomo() throws RecognitionException {
		AtomoContext _localctx = new AtomoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_atomo);
		int _la;
		try {
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case APAR:
				_localctx = new ParExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(APAR);
				setState(195);
				expr(0);
				setState(196);
				match(CPAR);
				}
				break;
			case INT:
			case FLOAT:
				_localctx = new NumberAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==FLOAT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BooleanAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(199);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case ID:
				_localctx = new IdAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(200);
				match(ID);
				}
				break;
			case STRING:
				_localctx = new StringAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(201);
				match(STRING);
				}
				break;
			case NIL:
				_localctx = new NilAtomContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(202);
				match(NIL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001*\u00ce\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001%\b\u0001"+
		"\n\u0001\f\u0001(\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"3\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"?\b\u0004\n\u0004\f\u0004B\t\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"F\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"R\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005"+
		"\tk\b\t\n\t\f\tn\t\t\u0003\tp\b\t\u0001\t\u0001\t\u0001\t\u0003\tu\b\t"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0005\u000b"+
		"~\b\u000b\n\u000b\f\u000b\u0081\t\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u0087\b\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0092\b\r\n\r\f\r\u0095"+
		"\t\r\u0003\r\u0097\b\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00a7\b\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u00be\b\u000e\n\u000e\f\u000e\u00c1"+
		"\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00cc\b\u000f\u0001"+
		"\u000f\u0000\u0001\u001c\u0010\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0000\u0006\u0001\u0000\r\u000f"+
		"\u0001\u0000\u000b\f\u0001\u0000\u0007\n\u0001\u0000\u0005\u0006\u0001"+
		"\u0000%&\u0001\u0000\u0018\u0019\u00df\u0000 \u0001\u0000\u0000\u0000"+
		"\u0002&\u0001\u0000\u0000\u0000\u00042\u0001\u0000\u0000\u0000\u00064"+
		"\u0001\u0000\u0000\u0000\b9\u0001\u0000\u0000\u0000\nG\u0001\u0000\u0000"+
		"\u0000\fQ\u0001\u0000\u0000\u0000\u000eS\u0001\u0000\u0000\u0000\u0010"+
		"W\u0001\u0000\u0000\u0000\u0012`\u0001\u0000\u0000\u0000\u0014x\u0001"+
		"\u0000\u0000\u0000\u0016\u007f\u0001\u0000\u0000\u0000\u0018\u0088\u0001"+
		"\u0000\u0000\u0000\u001a\u008c\u0001\u0000\u0000\u0000\u001c\u00a6\u0001"+
		"\u0000\u0000\u0000\u001e\u00cb\u0001\u0000\u0000\u0000 !\u0003\u0002\u0001"+
		"\u0000!\"\u0005\u0000\u0000\u0001\"\u0001\u0001\u0000\u0000\u0000#%\u0003"+
		"\u0004\u0002\u0000$#\u0001\u0000\u0000\u0000%(\u0001\u0000\u0000\u0000"+
		"&$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\'\u0003\u0001\u0000"+
		"\u0000\u0000(&\u0001\u0000\u0000\u0000)3\u0003\u0006\u0003\u0000*3\u0003"+
		"\b\u0004\u0000+3\u0003\u000e\u0007\u0000,3\u0003\u0012\t\u0000-3\u0003"+
		"\u0010\b\u0000.3\u0003\u0018\f\u0000/3\u0003\u001a\r\u000001\u0005*\u0000"+
		"\u000013\u0006\u0002\uffff\uffff\u00002)\u0001\u0000\u0000\u00002*\u0001"+
		"\u0000\u0000\u00002+\u0001\u0000\u0000\u00002,\u0001\u0000\u0000\u0000"+
		"2-\u0001\u0000\u0000\u00002.\u0001\u0000\u0000\u00002/\u0001\u0000\u0000"+
		"\u000020\u0001\u0000\u0000\u00003\u0005\u0001\u0000\u0000\u000045\u0005"+
		"$\u0000\u000056\u0005\u0013\u0000\u000067\u0003\u001c\u000e\u000078\u0005"+
		"\u0012\u0000\u00008\u0007\u0001\u0000\u0000\u00009:\u0005\u001b\u0000"+
		"\u0000:@\u0003\n\u0005\u0000;<\u0005\u001c\u0000\u0000<=\u0005\u001b\u0000"+
		"\u0000=?\u0003\n\u0005\u0000>;\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000"+
		"\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AE\u0001\u0000"+
		"\u0000\u0000B@\u0001\u0000\u0000\u0000CD\u0005\u001c\u0000\u0000DF\u0003"+
		"\f\u0006\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000F\t"+
		"\u0001\u0000\u0000\u0000GH\u0005\u0014\u0000\u0000HI\u0003\u001c\u000e"+
		"\u0000IJ\u0005\u0015\u0000\u0000JK\u0003\f\u0006\u0000K\u000b\u0001\u0000"+
		"\u0000\u0000LM\u0005\u0016\u0000\u0000MN\u0003\u0002\u0001\u0000NO\u0005"+
		"\u0017\u0000\u0000OR\u0001\u0000\u0000\u0000PR\u0003\u0004\u0002\u0000"+
		"QL\u0001\u0000\u0000\u0000QP\u0001\u0000\u0000\u0000R\r\u0001\u0000\u0000"+
		"\u0000ST\u0005\u001d\u0000\u0000TU\u0003\u001c\u000e\u0000UV\u0003\f\u0006"+
		"\u0000V\u000f\u0001\u0000\u0000\u0000WX\u0005\u001e\u0000\u0000XY\u0005"+
		"\u0014\u0000\u0000YZ\u0003\u0006\u0003\u0000Z[\u0003\u001c\u000e\u0000"+
		"[\\\u0005\u0012\u0000\u0000\\]\u0003\u0006\u0003\u0000]^\u0005\u0015\u0000"+
		"\u0000^_\u0003\f\u0006\u0000_\u0011\u0001\u0000\u0000\u0000`a\u0005 \u0000"+
		"\u0000ab\u0005$\u0000\u0000bo\u0005\u0014\u0000\u0000cd\u0005$\u0000\u0000"+
		"de\u0005\u0001\u0000\u0000el\u0005#\u0000\u0000fg\u0005\u0002\u0000\u0000"+
		"gh\u0005$\u0000\u0000hi\u0005\u0001\u0000\u0000ik\u0005#\u0000\u0000j"+
		"f\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000"+
		"\u0000lm\u0001\u0000\u0000\u0000mp\u0001\u0000\u0000\u0000nl\u0001\u0000"+
		"\u0000\u0000oc\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pq\u0001"+
		"\u0000\u0000\u0000qt\u0005\u0015\u0000\u0000rs\u0005\u0001\u0000\u0000"+
		"su\u0005#\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000"+
		"uv\u0001\u0000\u0000\u0000vw\u0003\u0014\n\u0000w\u0013\u0001\u0000\u0000"+
		"\u0000xy\u0005\u0016\u0000\u0000yz\u0003\u0016\u000b\u0000z{\u0005\u0017"+
		"\u0000\u0000{\u0015\u0001\u0000\u0000\u0000|~\u0003\u0004\u0002\u0000"+
		"}|\u0001\u0000\u0000\u0000~\u0081\u0001\u0000\u0000\u0000\u007f}\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0086\u0001"+
		"\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082\u0083\u0005"+
		"!\u0000\u0000\u0083\u0084\u0003\u001c\u000e\u0000\u0084\u0085\u0005\u0012"+
		"\u0000\u0000\u0085\u0087\u0001\u0000\u0000\u0000\u0086\u0082\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0017\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0005\"\u0000\u0000\u0089\u008a\u0003\u001c\u000e"+
		"\u0000\u008a\u008b\u0005\u0012\u0000\u0000\u008b\u0019\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0005$\u0000\u0000\u008d\u0096\u0005\u0014\u0000\u0000"+
		"\u008e\u0093\u0003\u001c\u000e\u0000\u008f\u0090\u0005\u0002\u0000\u0000"+
		"\u0090\u0092\u0003\u001c\u000e\u0000\u0091\u008f\u0001\u0000\u0000\u0000"+
		"\u0092\u0095\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000"+
		"\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0097\u0001\u0000\u0000\u0000"+
		"\u0095\u0093\u0001\u0000\u0000\u0000\u0096\u008e\u0001\u0000\u0000\u0000"+
		"\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000"+
		"\u0098\u0099\u0005\u0015\u0000\u0000\u0099\u009a\u0005\u0012\u0000\u0000"+
		"\u009a\u001b\u0001\u0000\u0000\u0000\u009b\u009c\u0006\u000e\uffff\uffff"+
		"\u0000\u009c\u009d\u0005\f\u0000\u0000\u009d\u00a7\u0003\u001c\u000e\u000b"+
		"\u009e\u00a7\u0003\u001a\r\u0000\u009f\u00a0\u0005\u0011\u0000\u0000\u00a0"+
		"\u00a7\u0003\u001c\u000e\t\u00a1\u00a2\u0005\u001f\u0000\u0000\u00a2\u00a3"+
		"\u0003\u001c\u000e\u0000\u00a3\u00a4\u0005\u0012\u0000\u0000\u00a4\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a7\u0003\u001e\u000f\u0000\u00a6\u009b"+
		"\u0001\u0000\u0000\u0000\u00a6\u009e\u0001\u0000\u0000\u0000\u00a6\u009f"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a1\u0001\u0000\u0000\u0000\u00a6\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a7\u00bf\u0001\u0000\u0000\u0000\u00a8\u00a9"+
		"\n\f\u0000\u0000\u00a9\u00aa\u0005\u0010\u0000\u0000\u00aa\u00be\u0003"+
		"\u001c\u000e\r\u00ab\u00ac\n\b\u0000\u0000\u00ac\u00ad\u0007\u0000\u0000"+
		"\u0000\u00ad\u00be\u0003\u001c\u000e\t\u00ae\u00af\n\u0007\u0000\u0000"+
		"\u00af\u00b0\u0007\u0001\u0000\u0000\u00b0\u00be\u0003\u001c\u000e\b\u00b1"+
		"\u00b2\n\u0006\u0000\u0000\u00b2\u00b3\u0007\u0002\u0000\u0000\u00b3\u00be"+
		"\u0003\u001c\u000e\u0007\u00b4\u00b5\n\u0005\u0000\u0000\u00b5\u00b6\u0007"+
		"\u0003\u0000\u0000\u00b6\u00be\u0003\u001c\u000e\u0006\u00b7\u00b8\n\u0004"+
		"\u0000\u0000\u00b8\u00b9\u0005\u0004\u0000\u0000\u00b9\u00be\u0003\u001c"+
		"\u000e\u0005\u00ba\u00bb\n\u0003\u0000\u0000\u00bb\u00bc\u0005\u0003\u0000"+
		"\u0000\u00bc\u00be\u0003\u001c\u000e\u0004\u00bd\u00a8\u0001\u0000\u0000"+
		"\u0000\u00bd\u00ab\u0001\u0000\u0000\u0000\u00bd\u00ae\u0001\u0000\u0000"+
		"\u0000\u00bd\u00b1\u0001\u0000\u0000\u0000\u00bd\u00b4\u0001\u0000\u0000"+
		"\u0000\u00bd\u00b7\u0001\u0000\u0000\u0000\u00bd\u00ba\u0001\u0000\u0000"+
		"\u0000\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u001d\u0001\u0000\u0000"+
		"\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005\u0014\u0000"+
		"\u0000\u00c3\u00c4\u0003\u001c\u000e\u0000\u00c4\u00c5\u0005\u0015\u0000"+
		"\u0000\u00c5\u00cc\u0001\u0000\u0000\u0000\u00c6\u00cc\u0007\u0004\u0000"+
		"\u0000\u00c7\u00cc\u0007\u0005\u0000\u0000\u00c8\u00cc\u0005$\u0000\u0000"+
		"\u00c9\u00cc\u0005\'\u0000\u0000\u00ca\u00cc\u0005\u001a\u0000\u0000\u00cb"+
		"\u00c2\u0001\u0000\u0000\u0000\u00cb\u00c6\u0001\u0000\u0000\u0000\u00cb"+
		"\u00c7\u0001\u0000\u0000\u0000\u00cb\u00c8\u0001\u0000\u0000\u0000\u00cb"+
		"\u00c9\u0001\u0000\u0000\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cc"+
		"\u001f\u0001\u0000\u0000\u0000\u0010&2@EQlot\u007f\u0086\u0093\u0096\u00a6"+
		"\u00bd\u00bf\u00cb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}