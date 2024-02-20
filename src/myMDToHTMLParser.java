// Generated from ./grammar/myMDToHTML.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class myMDToHTMLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, NUMBER=29, WORD=30, WHITESPACE=31, 
		NEWLINE=32, WORDNUMBERWHITESPACE=33;
	public static final int
		RULE_mdfile = 0, RULE_sentence = 1, RULE_markdownItem = 2, RULE_header = 3, 
		RULE_codeBlock = 4, RULE_italicsAndBold = 5, RULE_bold = 6, RULE_italics = 7, 
		RULE_footnote = 8, RULE_image = 9, RULE_list = 10, RULE_listLine = 11, 
		RULE_table = 12, RULE_tableHeader = 13, RULE_tableBorder = 14, RULE_tableBodyRow = 15, 
		RULE_tableHeaderCell = 16, RULE_tableCell = 17, RULE_default = 18, RULE_footnoteSentence = 19, 
		RULE_imageName = 20, RULE_codeBlockLine = 21, RULE_pound = 22, RULE_verticalLine = 23, 
		RULE_asterisk = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"mdfile", "sentence", "markdownItem", "header", "codeBlock", "italicsAndBold", 
			"bold", "italics", "footnote", "image", "list", "listLine", "table", 
			"tableHeader", "tableBorder", "tableBodyRow", "tableHeaderCell", "tableCell", 
			"default", "footnoteSentence", "imageName", "codeBlockLine", "pound", 
			"verticalLine", "asterisk"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#'", "'```'", "'``'", "'`'", "'*'", "'['", "'^'", "']'", "':'", 
			"'!'", "'-'", "'|'", "'\"'", "'''", "'<'", "'>'", "'('", "')'", "'{'", 
			"'}'", "','", "'.'", "'_'", "';'", "'/'", "'?'", "'='", "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "NUMBER", "WORD", "WHITESPACE", "NEWLINE", 
			"WORDNUMBERWHITESPACE"
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
	public String getGrammarFileName() { return "myMDToHTML.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public myMDToHTMLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MdfileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(myMDToHTMLParser.EOF, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public MdfileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mdfile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).enterMdfile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).exitMdfile(this);
		}
	}

	public final MdfileContext mdfile() throws RecognitionException {
		MdfileContext _localctx = new MdfileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mdfile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50);
				sentence();
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4294967166L) != 0) );
			setState(55);
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
	public static class SentenceContext extends ParserRuleContext {
		public List<MarkdownItemContext> markdownItem() {
			return getRuleContexts(MarkdownItemContext.class);
		}
		public MarkdownItemContext markdownItem(int i) {
			return getRuleContext(MarkdownItemContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(myMDToHTMLParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(myMDToHTMLParser.NEWLINE, i);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).exitSentence(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(57);
				markdownItem();
				}
				}
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4294967166L) != 0) );
			setState(63); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(62);
				match(NEWLINE);
				}
				}
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
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
	public static class MarkdownItemContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public ItalicsAndBoldContext italicsAndBold() {
			return getRuleContext(ItalicsAndBoldContext.class,0);
		}
		public BoldContext bold() {
			return getRuleContext(BoldContext.class,0);
		}
		public ItalicsContext italics() {
			return getRuleContext(ItalicsContext.class,0);
		}
		public FootnoteContext footnote() {
			return getRuleContext(FootnoteContext.class,0);
		}
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public ImageContext image() {
			return getRuleContext(ImageContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public List<DefaultContext> default_() {
			return getRuleContexts(DefaultContext.class);
		}
		public DefaultContext default_(int i) {
			return getRuleContext(DefaultContext.class,i);
		}
		public MarkdownItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_markdownItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).enterMarkdownItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).exitMarkdownItem(this);
		}
	}

	public final MarkdownItemContext markdownItem() throws RecognitionException {
		MarkdownItemContext _localctx = new MarkdownItemContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_markdownItem);
		try {
			int _alt;
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				header();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				codeBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				italicsAndBold();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
				bold();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(71);
				italics();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(72);
				footnote();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(73);
				table();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(74);
				image();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(75);
				list();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(77); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(76);
						default_();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(79); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class HeaderContext extends ParserRuleContext {
		public List<PoundContext> pound() {
			return getRuleContexts(PoundContext.class);
		}
		public PoundContext pound(int i) {
			return getRuleContext(PoundContext.class,i);
		}
		public List<DefaultContext> default_() {
			return getRuleContexts(DefaultContext.class);
		}
		public DefaultContext default_(int i) {
			return getRuleContext(DefaultContext.class,i);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).exitHeader(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_header);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(84); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(83);
					match(T__0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(86); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(90); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(90);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
						{
						setState(88);
						pound();
						}
						break;
					case T__5:
					case T__7:
					case T__8:
					case T__9:
					case T__10:
					case T__12:
					case T__13:
					case T__14:
					case T__15:
					case T__16:
					case T__17:
					case T__18:
					case T__19:
					case T__20:
					case T__21:
					case T__22:
					case T__23:
					case T__24:
					case T__25:
					case T__26:
					case T__27:
					case NUMBER:
					case WORD:
					case WHITESPACE:
						{
						setState(89);
						default_();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(92); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class CodeBlockContext extends ParserRuleContext {
		public CodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeBlock; }
	 
		public CodeBlockContext() { }
		public void copyFrom(CodeBlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InlineCodeBlockContext extends CodeBlockContext {
		public List<DefaultContext> default_() {
			return getRuleContexts(DefaultContext.class);
		}
		public DefaultContext default_(int i) {
			return getRuleContext(DefaultContext.class,i);
		}
		public InlineCodeBlockContext(CodeBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).enterInlineCodeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).exitInlineCodeBlock(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultilineCodeBlockContext extends CodeBlockContext {
		public TerminalNode WORD() { return getToken(myMDToHTMLParser.WORD, 0); }
		public TerminalNode NEWLINE() { return getToken(myMDToHTMLParser.NEWLINE, 0); }
		public List<CodeBlockLineContext> codeBlockLine() {
			return getRuleContexts(CodeBlockLineContext.class);
		}
		public CodeBlockLineContext codeBlockLine(int i) {
			return getRuleContext(CodeBlockLineContext.class,i);
		}
		public MultilineCodeBlockContext(CodeBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).enterMultilineCodeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).exitMultilineCodeBlock(this);
		}
	}

	public final CodeBlockContext codeBlock() throws RecognitionException {
		CodeBlockContext _localctx = new CodeBlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_codeBlock);
		int _la;
		try {
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				_localctx = new MultilineCodeBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(T__1);
				setState(95);
				match(WORD);
				setState(96);
				match(NEWLINE);
				setState(98); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(97);
					codeBlockLine();
					}
					}
					setState(100); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8589934432L) != 0) );
				setState(102);
				match(T__1);
				}
				break;
			case T__2:
			case T__3:
				_localctx = new InlineCodeBlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(104);
					match(T__2);
					}
					break;
				case T__3:
					{
					setState(105);
					match(T__3);
					setState(107); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(106);
						default_();
						}
						}
						setState(109); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4294963008L) != 0) );
					setState(111);
					match(T__3);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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
	public static class ItalicsAndBoldContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(myMDToHTMLParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(myMDToHTMLParser.WORD, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(myMDToHTMLParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(myMDToHTMLParser.NUMBER, i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(myMDToHTMLParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(myMDToHTMLParser.WHITESPACE, i);
		}
		public ItalicsAndBoldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_italicsAndBold; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).enterItalicsAndBold(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).exitItalicsAndBold(this);
		}
	}

	public final ItalicsAndBoldContext italicsAndBold() throws RecognitionException {
		ItalicsAndBoldContext _localctx = new ItalicsAndBoldContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_italicsAndBold);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__4);
			setState(118);
			match(T__4);
			setState(119);
			match(T__4);
			setState(121); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(120);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3758096384L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(123); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 3758096384L) != 0) );
			setState(125);
			match(T__4);
			setState(126);
			match(T__4);
			setState(127);
			match(T__4);
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
	public static class BoldContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(myMDToHTMLParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(myMDToHTMLParser.WORD, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(myMDToHTMLParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(myMDToHTMLParser.NUMBER, i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(myMDToHTMLParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(myMDToHTMLParser.WHITESPACE, i);
		}
		public BoldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bold; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).enterBold(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).exitBold(this);
		}
	}

	public final BoldContext bold() throws RecognitionException {
		BoldContext _localctx = new BoldContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bold);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__4);
			setState(130);
			match(T__4);
			setState(132); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(131);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3758096384L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(134); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 3758096384L) != 0) );
			setState(136);
			match(T__4);
			setState(137);
			match(T__4);
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
	public static class ItalicsContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(myMDToHTMLParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(myMDToHTMLParser.WORD, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(myMDToHTMLParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(myMDToHTMLParser.NUMBER, i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(myMDToHTMLParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(myMDToHTMLParser.WHITESPACE, i);
		}
		public ItalicsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_italics; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).enterItalics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).exitItalics(this);
		}
	}

	public final ItalicsContext italics() throws RecognitionException {
		ItalicsContext _localctx = new ItalicsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_italics);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(T__4);
			setState(141); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(140);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3758096384L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(143); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 3758096384L) != 0) );
			setState(145);
			match(T__4);
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
	public static class FootnoteContext extends ParserRuleContext {
		public FootnoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_footnote; }
	 
		public FootnoteContext() { }
		public void copyFrom(FootnoteContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EndOfFileFootnoteContext extends FootnoteContext {
		public TerminalNode NUMBER() { return getToken(myMDToHTMLParser.NUMBER, 0); }
		public FootnoteSentenceContext footnoteSentence() {
			return getRuleContext(FootnoteSentenceContext.class,0);
		}
		public EndOfFileFootnoteContext(FootnoteContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).enterEndOfFileFootnote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).exitEndOfFileFootnote(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InlineFootnoteContext extends FootnoteContext {
		public TerminalNode NUMBER() { return getToken(myMDToHTMLParser.NUMBER, 0); }
		public InlineFootnoteContext(FootnoteContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).enterInlineFootnote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).exitInlineFootnote(this);
		}
	}

	public final FootnoteContext footnote() throws RecognitionException {
		FootnoteContext _localctx = new FootnoteContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_footnote);
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new EndOfFileFootnoteContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(T__5);
				setState(148);
				match(T__6);
				setState(149);
				match(NUMBER);
				setState(150);
				match(T__7);
				setState(151);
				match(T__8);
				setState(152);
				footnoteSentence();
				}
				break;
			case 2:
				_localctx = new InlineFootnoteContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(T__5);
				setState(154);
				match(T__6);
				setState(155);
				match(NUMBER);
				setState(156);
				match(T__7);
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
	public static class ImageContext extends ParserRuleContext {
		public ImageNameContext imageName() {
			return getRuleContext(ImageNameContext.class,0);
		}
		public ImageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_image; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).enterImage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).exitImage(this);
		}
	}

	public final ImageContext image() throws RecognitionException {
		ImageContext _localctx = new ImageContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_image);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(T__9);
			setState(160);
			match(T__5);
			setState(161);
			match(T__5);
			setState(162);
			imageName();
			setState(163);
			match(T__7);
			setState(164);
			match(T__7);
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
	public static class ListContext extends ParserRuleContext {
		public List<ListLineContext> listLine() {
			return getRuleContexts(ListLineContext.class);
		}
		public ListLineContext listLine(int i) {
			return getRuleContext(ListLineContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(168); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(166);
					match(T__10);
					setState(167);
					listLine();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(170); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class ListLineContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(myMDToHTMLParser.NEWLINE, 0); }
		public List<CodeBlockContext> codeBlock() {
			return getRuleContexts(CodeBlockContext.class);
		}
		public CodeBlockContext codeBlock(int i) {
			return getRuleContext(CodeBlockContext.class,i);
		}
		public List<ItalicsAndBoldContext> italicsAndBold() {
			return getRuleContexts(ItalicsAndBoldContext.class);
		}
		public ItalicsAndBoldContext italicsAndBold(int i) {
			return getRuleContext(ItalicsAndBoldContext.class,i);
		}
		public List<BoldContext> bold() {
			return getRuleContexts(BoldContext.class);
		}
		public BoldContext bold(int i) {
			return getRuleContext(BoldContext.class,i);
		}
		public List<ItalicsContext> italics() {
			return getRuleContexts(ItalicsContext.class);
		}
		public ItalicsContext italics(int i) {
			return getRuleContext(ItalicsContext.class,i);
		}
		public List<FootnoteContext> footnote() {
			return getRuleContexts(FootnoteContext.class);
		}
		public FootnoteContext footnote(int i) {
			return getRuleContext(FootnoteContext.class,i);
		}
		public List<DefaultContext> default_() {
			return getRuleContexts(DefaultContext.class);
		}
		public DefaultContext default_(int i) {
			return getRuleContext(DefaultContext.class,i);
		}
		public ListLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).enterListLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).exitListLine(this);
		}
	}

	public final ListLineContext listLine() throws RecognitionException {
		ListLineContext _localctx = new ListLineContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_listLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(178);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(172);
					codeBlock();
					}
					break;
				case 2:
					{
					setState(173);
					italicsAndBold();
					}
					break;
				case 3:
					{
					setState(174);
					bold();
					}
					break;
				case 4:
					{
					setState(175);
					italics();
					}
					break;
				case 5:
					{
					setState(176);
					footnote();
					}
					break;
				case 6:
					{
					setState(177);
					default_();
					}
					break;
				}
				}
				setState(180); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4294963068L) != 0) );
			setState(182);
			match(NEWLINE);
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
	public static class TableContext extends ParserRuleContext {
		public TableHeaderContext tableHeader() {
			return getRuleContext(TableHeaderContext.class,0);
		}
		public TableBorderContext tableBorder() {
			return getRuleContext(TableBorderContext.class,0);
		}
		public List<TableBodyRowContext> tableBodyRow() {
			return getRuleContexts(TableBodyRowContext.class);
		}
		public TableBodyRowContext tableBodyRow(int i) {
			return getRuleContext(TableBodyRowContext.class,i);
		}
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).exitTable(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_table);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			tableHeader();
			setState(185);
			tableBorder();
			setState(187); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(186);
					tableBodyRow();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(189); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class TableHeaderContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(myMDToHTMLParser.NEWLINE, 0); }
		public List<TableHeaderCellContext> tableHeaderCell() {
			return getRuleContexts(TableHeaderCellContext.class);
		}
		public TableHeaderCellContext tableHeaderCell(int i) {
			return getRuleContext(TableHeaderCellContext.class,i);
		}
		public TableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).enterTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).exitTableHeader(this);
		}
	}

	public final TableHeaderContext tableHeader() throws RecognitionException {
		TableHeaderContext _localctx = new TableHeaderContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(T__11);
			setState(199); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(193); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(192);
					tableHeaderCell();
					}
					}
					setState(195); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4294963008L) != 0) );
				setState(197);
				match(T__11);
				}
				}
				setState(201); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4294963008L) != 0) );
			setState(203);
			match(NEWLINE);
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
	public static class TableBorderContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(myMDToHTMLParser.NEWLINE, 0); }
		public TableBorderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableBorder; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).enterTableBorder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).exitTableBorder(this);
		}
	}

	public final TableBorderContext tableBorder() throws RecognitionException {
		TableBorderContext _localctx = new TableBorderContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tableBorder);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(T__11);
			setState(212); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(207); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(206);
					match(T__10);
					}
					}
					setState(209); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__10 );
				setState(211);
				match(T__11);
				}
				}
				setState(214); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__10 );
			setState(216);
			match(NEWLINE);
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
	public static class TableBodyRowContext extends ParserRuleContext {
		public List<TableCellContext> tableCell() {
			return getRuleContexts(TableCellContext.class);
		}
		public TableCellContext tableCell(int i) {
			return getRuleContext(TableCellContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(myMDToHTMLParser.NEWLINE, 0); }
		public TableBodyRowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableBodyRow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).enterTableBodyRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).exitTableBodyRow(this);
		}
	}

	public final TableBodyRowContext tableBodyRow() throws RecognitionException {
		TableBodyRowContext _localctx = new TableBodyRowContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tableBodyRow);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(T__11);
			setState(222); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(219);
					tableCell();
					setState(220);
					match(T__11);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(224); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(226);
				match(NEWLINE);
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
	public static class TableHeaderCellContext extends ParserRuleContext {
		public List<DefaultContext> default_() {
			return getRuleContexts(DefaultContext.class);
		}
		public DefaultContext default_(int i) {
			return getRuleContext(DefaultContext.class,i);
		}
		public TableHeaderCellContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableHeaderCell; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).enterTableHeaderCell(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).exitTableHeaderCell(this);
		}
	}

	public final TableHeaderCellContext tableHeaderCell() throws RecognitionException {
		TableHeaderCellContext _localctx = new TableHeaderCellContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tableHeaderCell);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(230); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(229);
					default_();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(232); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class TableCellContext extends ParserRuleContext {
		public List<DefaultContext> default_() {
			return getRuleContexts(DefaultContext.class);
		}
		public DefaultContext default_(int i) {
			return getRuleContext(DefaultContext.class,i);
		}
		public TableCellContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableCell; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).enterTableCell(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).exitTableCell(this);
		}
	}

	public final TableCellContext tableCell() throws RecognitionException {
		TableCellContext _localctx = new TableCellContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tableCell);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(234);
				default_();
				}
				}
				setState(237); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4294963008L) != 0) );
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
	public static class DefaultContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(myMDToHTMLParser.WORD, 0); }
		public TerminalNode NUMBER() { return getToken(myMDToHTMLParser.NUMBER, 0); }
		public TerminalNode WHITESPACE() { return getToken(myMDToHTMLParser.WHITESPACE, 0); }
		public DefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).enterDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).exitDefault(this);
		}
	}

	public final DefaultContext default_() throws RecognitionException {
		DefaultContext _localctx = new DefaultContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_default);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4294963008L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class FootnoteSentenceContext extends ParserRuleContext {
		public List<ItalicsAndBoldContext> italicsAndBold() {
			return getRuleContexts(ItalicsAndBoldContext.class);
		}
		public ItalicsAndBoldContext italicsAndBold(int i) {
			return getRuleContext(ItalicsAndBoldContext.class,i);
		}
		public List<BoldContext> bold() {
			return getRuleContexts(BoldContext.class);
		}
		public BoldContext bold(int i) {
			return getRuleContext(BoldContext.class,i);
		}
		public List<ItalicsContext> italics() {
			return getRuleContexts(ItalicsContext.class);
		}
		public ItalicsContext italics(int i) {
			return getRuleContext(ItalicsContext.class,i);
		}
		public List<PoundContext> pound() {
			return getRuleContexts(PoundContext.class);
		}
		public PoundContext pound(int i) {
			return getRuleContext(PoundContext.class,i);
		}
		public List<DefaultContext> default_() {
			return getRuleContexts(DefaultContext.class);
		}
		public DefaultContext default_(int i) {
			return getRuleContext(DefaultContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(myMDToHTMLParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(myMDToHTMLParser.NEWLINE, i);
		}
		public FootnoteSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_footnoteSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).enterFootnoteSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).exitFootnoteSentence(this);
		}
	}

	public final FootnoteSentenceContext footnoteSentence() throws RecognitionException {
		FootnoteSentenceContext _localctx = new FootnoteSentenceContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_footnoteSentence);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(246); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(246);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						setState(241);
						italicsAndBold();
						}
						break;
					case 2:
						{
						setState(242);
						bold();
						}
						break;
					case 3:
						{
						setState(243);
						italics();
						}
						break;
					case 4:
						{
						setState(244);
						pound();
						}
						break;
					case 5:
						{
						setState(245);
						default_();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(248); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(253);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(250);
					match(NEWLINE);
					}
					} 
				}
				setState(255);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
	public static class ImageNameContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(myMDToHTMLParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(myMDToHTMLParser.WORD, i);
		}
		public ImageNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imageName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).enterImageName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).exitImageName(this);
		}
	}

	public final ImageNameContext imageName() throws RecognitionException {
		ImageNameContext _localctx = new ImageNameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_imageName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(256);
				_la = _input.LA(1);
				if ( !(_la==T__22 || _la==WORD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(259); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__22 || _la==WORD );
			setState(261);
			match(T__21);
			setState(263); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(262);
				match(WORD);
				}
				}
				setState(265); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
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
	public static class CodeBlockLineContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(myMDToHTMLParser.NEWLINE, 0); }
		public List<DefaultContext> default_() {
			return getRuleContexts(DefaultContext.class);
		}
		public DefaultContext default_(int i) {
			return getRuleContext(DefaultContext.class,i);
		}
		public List<VerticalLineContext> verticalLine() {
			return getRuleContexts(VerticalLineContext.class);
		}
		public VerticalLineContext verticalLine(int i) {
			return getRuleContext(VerticalLineContext.class,i);
		}
		public List<AsteriskContext> asterisk() {
			return getRuleContexts(AsteriskContext.class);
		}
		public AsteriskContext asterisk(int i) {
			return getRuleContext(AsteriskContext.class,i);
		}
		public CodeBlockLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeBlockLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).enterCodeBlockLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).exitCodeBlockLine(this);
		}
	}

	public final CodeBlockLineContext codeBlockLine() throws RecognitionException {
		CodeBlockLineContext _localctx = new CodeBlockLineContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_codeBlockLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4294967136L) != 0)) {
				{
				setState(270);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__5:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case T__20:
				case T__21:
				case T__22:
				case T__23:
				case T__24:
				case T__25:
				case T__26:
				case T__27:
				case NUMBER:
				case WORD:
				case WHITESPACE:
					{
					setState(267);
					default_();
					}
					break;
				case T__11:
					{
					setState(268);
					verticalLine();
					}
					break;
				case T__4:
					{
					setState(269);
					asterisk();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(275);
			match(NEWLINE);
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
	public static class PoundContext extends ParserRuleContext {
		public PoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).enterPound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).exitPound(this);
		}
	}

	public final PoundContext pound() throws RecognitionException {
		PoundContext _localctx = new PoundContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_pound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(T__0);
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
	public static class VerticalLineContext extends ParserRuleContext {
		public VerticalLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verticalLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).enterVerticalLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).exitVerticalLine(this);
		}
	}

	public final VerticalLineContext verticalLine() throws RecognitionException {
		VerticalLineContext _localctx = new VerticalLineContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_verticalLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(T__11);
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
	public static class AsteriskContext extends ParserRuleContext {
		public AsteriskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asterisk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).enterAsterisk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof myMDToHTMLListener ) ((myMDToHTMLListener)listener).exitAsterisk(this);
		}
	}

	public final AsteriskContext asterisk() throws RecognitionException {
		AsteriskContext _localctx = new AsteriskContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_asterisk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(T__4);
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

	public static final String _serializedATN =
		"\u0004\u0001!\u011c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0001\u0000\u0004\u00004\b\u0000\u000b\u0000\f\u00005\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0004\u0001;\b\u0001\u000b\u0001\f\u0001<\u0001\u0001"+
		"\u0004\u0001@\b\u0001\u000b\u0001\f\u0001A\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0004\u0002N\b\u0002\u000b\u0002\f\u0002O\u0003\u0002"+
		"R\b\u0002\u0001\u0003\u0004\u0003U\b\u0003\u000b\u0003\f\u0003V\u0001"+
		"\u0003\u0001\u0003\u0004\u0003[\b\u0003\u000b\u0003\f\u0003\\\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004c\b\u0004\u000b\u0004"+
		"\f\u0004d\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0004\u0004l\b\u0004\u000b\u0004\f\u0004m\u0001\u0004\u0001\u0004\u0003"+
		"\u0004r\b\u0004\u0003\u0004t\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0004\u0005z\b\u0005\u000b\u0005\f\u0005{\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0004"+
		"\u0006\u0085\b\u0006\u000b\u0006\f\u0006\u0086\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0004\u0007\u008e\b\u0007\u000b\u0007"+
		"\f\u0007\u008f\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u009e\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0004"+
		"\n\u00a9\b\n\u000b\n\f\n\u00aa\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u00b3\b\u000b\u000b\u000b\f"+
		"\u000b\u00b4\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0004\f\u00bc"+
		"\b\f\u000b\f\f\f\u00bd\u0001\r\u0001\r\u0004\r\u00c2\b\r\u000b\r\f\r\u00c3"+
		"\u0001\r\u0001\r\u0004\r\u00c8\b\r\u000b\r\f\r\u00c9\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0004\u000e\u00d0\b\u000e\u000b\u000e\f\u000e\u00d1"+
		"\u0001\u000e\u0004\u000e\u00d5\b\u000e\u000b\u000e\f\u000e\u00d6\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0004"+
		"\u000f\u00df\b\u000f\u000b\u000f\f\u000f\u00e0\u0001\u000f\u0003\u000f"+
		"\u00e4\b\u000f\u0001\u0010\u0004\u0010\u00e7\b\u0010\u000b\u0010\f\u0010"+
		"\u00e8\u0001\u0011\u0004\u0011\u00ec\b\u0011\u000b\u0011\f\u0011\u00ed"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0004\u0013\u00f7\b\u0013\u000b\u0013\f\u0013\u00f8\u0001"+
		"\u0013\u0005\u0013\u00fc\b\u0013\n\u0013\f\u0013\u00ff\t\u0013\u0001\u0014"+
		"\u0004\u0014\u0102\b\u0014\u000b\u0014\f\u0014\u0103\u0001\u0014\u0001"+
		"\u0014\u0004\u0014\u0108\b\u0014\u000b\u0014\f\u0014\u0109\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0005\u0015\u010f\b\u0015\n\u0015\f\u0015\u0112"+
		"\t\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0000\u0000\u0019\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.0\u0000\u0003\u0001\u0000\u001d\u001f\u0003\u0000\u0006\u0006"+
		"\b\u000b\r\u001f\u0002\u0000\u0017\u0017\u001e\u001e\u0135\u00003\u0001"+
		"\u0000\u0000\u0000\u0002:\u0001\u0000\u0000\u0000\u0004Q\u0001\u0000\u0000"+
		"\u0000\u0006T\u0001\u0000\u0000\u0000\bs\u0001\u0000\u0000\u0000\nu\u0001"+
		"\u0000\u0000\u0000\f\u0081\u0001\u0000\u0000\u0000\u000e\u008b\u0001\u0000"+
		"\u0000\u0000\u0010\u009d\u0001\u0000\u0000\u0000\u0012\u009f\u0001\u0000"+
		"\u0000\u0000\u0014\u00a8\u0001\u0000\u0000\u0000\u0016\u00b2\u0001\u0000"+
		"\u0000\u0000\u0018\u00b8\u0001\u0000\u0000\u0000\u001a\u00bf\u0001\u0000"+
		"\u0000\u0000\u001c\u00cd\u0001\u0000\u0000\u0000\u001e\u00da\u0001\u0000"+
		"\u0000\u0000 \u00e6\u0001\u0000\u0000\u0000\"\u00eb\u0001\u0000\u0000"+
		"\u0000$\u00ef\u0001\u0000\u0000\u0000&\u00f6\u0001\u0000\u0000\u0000("+
		"\u0101\u0001\u0000\u0000\u0000*\u0110\u0001\u0000\u0000\u0000,\u0115\u0001"+
		"\u0000\u0000\u0000.\u0117\u0001\u0000\u0000\u00000\u0119\u0001\u0000\u0000"+
		"\u000024\u0003\u0002\u0001\u000032\u0001\u0000\u0000\u000045\u0001\u0000"+
		"\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u000067\u0001"+
		"\u0000\u0000\u000078\u0005\u0000\u0000\u00018\u0001\u0001\u0000\u0000"+
		"\u00009;\u0003\u0004\u0002\u0000:9\u0001\u0000\u0000\u0000;<\u0001\u0000"+
		"\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=?\u0001"+
		"\u0000\u0000\u0000>@\u0005 \u0000\u0000?>\u0001\u0000\u0000\u0000@A\u0001"+
		"\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000"+
		"B\u0003\u0001\u0000\u0000\u0000CR\u0003\u0006\u0003\u0000DR\u0003\b\u0004"+
		"\u0000ER\u0003\n\u0005\u0000FR\u0003\f\u0006\u0000GR\u0003\u000e\u0007"+
		"\u0000HR\u0003\u0010\b\u0000IR\u0003\u0018\f\u0000JR\u0003\u0012\t\u0000"+
		"KR\u0003\u0014\n\u0000LN\u0003$\u0012\u0000ML\u0001\u0000\u0000\u0000"+
		"NO\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000"+
		"\u0000PR\u0001\u0000\u0000\u0000QC\u0001\u0000\u0000\u0000QD\u0001\u0000"+
		"\u0000\u0000QE\u0001\u0000\u0000\u0000QF\u0001\u0000\u0000\u0000QG\u0001"+
		"\u0000\u0000\u0000QH\u0001\u0000\u0000\u0000QI\u0001\u0000\u0000\u0000"+
		"QJ\u0001\u0000\u0000\u0000QK\u0001\u0000\u0000\u0000QM\u0001\u0000\u0000"+
		"\u0000R\u0005\u0001\u0000\u0000\u0000SU\u0005\u0001\u0000\u0000TS\u0001"+
		"\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000"+
		"VW\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000X[\u0003,\u0016\u0000"+
		"Y[\u0003$\u0012\u0000ZX\u0001\u0000\u0000\u0000ZY\u0001\u0000\u0000\u0000"+
		"[\\\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000"+
		"\u0000\u0000]\u0007\u0001\u0000\u0000\u0000^_\u0005\u0002\u0000\u0000"+
		"_`\u0005\u001e\u0000\u0000`b\u0005 \u0000\u0000ac\u0003*\u0015\u0000b"+
		"a\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000db\u0001\u0000\u0000"+
		"\u0000de\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0005\u0002"+
		"\u0000\u0000gt\u0001\u0000\u0000\u0000hr\u0005\u0003\u0000\u0000ik\u0005"+
		"\u0004\u0000\u0000jl\u0003$\u0012\u0000kj\u0001\u0000\u0000\u0000lm\u0001"+
		"\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000"+
		"no\u0001\u0000\u0000\u0000op\u0005\u0004\u0000\u0000pr\u0001\u0000\u0000"+
		"\u0000qh\u0001\u0000\u0000\u0000qi\u0001\u0000\u0000\u0000rt\u0001\u0000"+
		"\u0000\u0000s^\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000t\t\u0001"+
		"\u0000\u0000\u0000uv\u0005\u0005\u0000\u0000vw\u0005\u0005\u0000\u0000"+
		"wy\u0005\u0005\u0000\u0000xz\u0007\u0000\u0000\u0000yx\u0001\u0000\u0000"+
		"\u0000z{\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000"+
		"\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0005\u0005\u0000\u0000~\u007f"+
		"\u0005\u0005\u0000\u0000\u007f\u0080\u0005\u0005\u0000\u0000\u0080\u000b"+
		"\u0001\u0000\u0000\u0000\u0081\u0082\u0005\u0005\u0000\u0000\u0082\u0084"+
		"\u0005\u0005\u0000\u0000\u0083\u0085\u0007\u0000\u0000\u0000\u0084\u0083"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0084"+
		"\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0005\u0005\u0000\u0000\u0089\u008a"+
		"\u0005\u0005\u0000\u0000\u008a\r\u0001\u0000\u0000\u0000\u008b\u008d\u0005"+
		"\u0005\u0000\u0000\u008c\u008e\u0007\u0000\u0000\u0000\u008d\u008c\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u008d\u0001"+
		"\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0091\u0001"+
		"\u0000\u0000\u0000\u0091\u0092\u0005\u0005\u0000\u0000\u0092\u000f\u0001"+
		"\u0000\u0000\u0000\u0093\u0094\u0005\u0006\u0000\u0000\u0094\u0095\u0005"+
		"\u0007\u0000\u0000\u0095\u0096\u0005\u001d\u0000\u0000\u0096\u0097\u0005"+
		"\b\u0000\u0000\u0097\u0098\u0005\t\u0000\u0000\u0098\u009e\u0003&\u0013"+
		"\u0000\u0099\u009a\u0005\u0006\u0000\u0000\u009a\u009b\u0005\u0007\u0000"+
		"\u0000\u009b\u009c\u0005\u001d\u0000\u0000\u009c\u009e\u0005\b\u0000\u0000"+
		"\u009d\u0093\u0001\u0000\u0000\u0000\u009d\u0099\u0001\u0000\u0000\u0000"+
		"\u009e\u0011\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\n\u0000\u0000\u00a0"+
		"\u00a1\u0005\u0006\u0000\u0000\u00a1\u00a2\u0005\u0006\u0000\u0000\u00a2"+
		"\u00a3\u0003(\u0014\u0000\u00a3\u00a4\u0005\b\u0000\u0000\u00a4\u00a5"+
		"\u0005\b\u0000\u0000\u00a5\u0013\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005"+
		"\u000b\u0000\u0000\u00a7\u00a9\u0003\u0016\u000b\u0000\u00a8\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u0015\u0001"+
		"\u0000\u0000\u0000\u00ac\u00b3\u0003\b\u0004\u0000\u00ad\u00b3\u0003\n"+
		"\u0005\u0000\u00ae\u00b3\u0003\f\u0006\u0000\u00af\u00b3\u0003\u000e\u0007"+
		"\u0000\u00b0\u00b3\u0003\u0010\b\u0000\u00b1\u00b3\u0003$\u0012\u0000"+
		"\u00b2\u00ac\u0001\u0000\u0000\u0000\u00b2\u00ad\u0001\u0000\u0000\u0000"+
		"\u00b2\u00ae\u0001\u0000\u0000\u0000\u00b2\u00af\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b7\u0005 \u0000\u0000\u00b7\u0017\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b9\u0003\u001a\r\u0000\u00b9\u00bb\u0003\u001c\u000e\u0000\u00ba\u00bc"+
		"\u0003\u001e\u000f\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd"+
		"\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be"+
		"\u0001\u0000\u0000\u0000\u00be\u0019\u0001\u0000\u0000\u0000\u00bf\u00c7"+
		"\u0005\f\u0000\u0000\u00c0\u00c2\u0003 \u0010\u0000\u00c1\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c6\u0005\f\u0000\u0000\u00c6\u00c8\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c1\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000"+
		"\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005 \u0000"+
		"\u0000\u00cc\u001b\u0001\u0000\u0000\u0000\u00cd\u00d4\u0005\f\u0000\u0000"+
		"\u00ce\u00d0\u0005\u000b\u0000\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000"+
		"\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d5\u0005\f\u0000\u0000\u00d4\u00cf\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d9\u0005 \u0000\u0000\u00d9\u001d\u0001\u0000\u0000\u0000\u00da\u00de"+
		"\u0005\f\u0000\u0000\u00db\u00dc\u0003\"\u0011\u0000\u00dc\u00dd\u0005"+
		"\f\u0000\u0000\u00dd\u00df\u0001\u0000\u0000\u0000\u00de\u00db\u0001\u0000"+
		"\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e4\u0005 \u0000\u0000\u00e3\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u001f\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e7\u0003$\u0012\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9!\u0001\u0000\u0000\u0000\u00ea"+
		"\u00ec\u0003$\u0012\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ed"+
		"\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee"+
		"\u0001\u0000\u0000\u0000\u00ee#\u0001\u0000\u0000\u0000\u00ef\u00f0\u0007"+
		"\u0001\u0000\u0000\u00f0%\u0001\u0000\u0000\u0000\u00f1\u00f7\u0003\n"+
		"\u0005\u0000\u00f2\u00f7\u0003\f\u0006\u0000\u00f3\u00f7\u0003\u000e\u0007"+
		"\u0000\u00f4\u00f7\u0003,\u0016\u0000\u00f5\u00f7\u0003$\u0012\u0000\u00f6"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f6\u00f2\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f3\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f5\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9"+
		"\u00fd\u0001\u0000\u0000\u0000\u00fa\u00fc\u0005 \u0000\u0000\u00fb\u00fa"+
		"\u0001\u0000\u0000\u0000\u00fc\u00ff\u0001\u0000\u0000\u0000\u00fd\u00fb"+
		"\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\'\u0001"+
		"\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u0100\u0102\u0007"+
		"\u0002\u0000\u0000\u0101\u0100\u0001\u0000\u0000\u0000\u0102\u0103\u0001"+
		"\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0104\u0001"+
		"\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0107\u0005"+
		"\u0016\u0000\u0000\u0106\u0108\u0005\u001e\u0000\u0000\u0107\u0106\u0001"+
		"\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u0107\u0001"+
		"\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a)\u0001\u0000"+
		"\u0000\u0000\u010b\u010f\u0003$\u0012\u0000\u010c\u010f\u0003.\u0017\u0000"+
		"\u010d\u010f\u00030\u0018\u0000\u010e\u010b\u0001\u0000\u0000\u0000\u010e"+
		"\u010c\u0001\u0000\u0000\u0000\u010e\u010d\u0001\u0000\u0000\u0000\u010f"+
		"\u0112\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0110"+
		"\u0111\u0001\u0000\u0000\u0000\u0111\u0113\u0001\u0000\u0000\u0000\u0112"+
		"\u0110\u0001\u0000\u0000\u0000\u0113\u0114\u0005 \u0000\u0000\u0114+\u0001"+
		"\u0000\u0000\u0000\u0115\u0116\u0005\u0001\u0000\u0000\u0116-\u0001\u0000"+
		"\u0000\u0000\u0117\u0118\u0005\f\u0000\u0000\u0118/\u0001\u0000\u0000"+
		"\u0000\u0119\u011a\u0005\u0005\u0000\u0000\u011a1\u0001\u0000\u0000\u0000"+
		"#5<AOQVZ\\dmqs{\u0086\u008f\u009d\u00aa\u00b2\u00b4\u00bd\u00c3\u00c9"+
		"\u00d1\u00d6\u00e0\u00e3\u00e8\u00ed\u00f6\u00f8\u00fd\u0103\u0109\u010e"+
		"\u0110";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}