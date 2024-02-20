// Generated from ./grammar/myMDToHTML.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link myMDToHTMLParser}.
 */
public interface myMDToHTMLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link myMDToHTMLParser#mdfile}.
	 * @param ctx the parse tree
	 */
	void enterMdfile(myMDToHTMLParser.MdfileContext ctx);
	/**
	 * Exit a parse tree produced by {@link myMDToHTMLParser#mdfile}.
	 * @param ctx the parse tree
	 */
	void exitMdfile(myMDToHTMLParser.MdfileContext ctx);
	/**
	 * Enter a parse tree produced by {@link myMDToHTMLParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(myMDToHTMLParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link myMDToHTMLParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(myMDToHTMLParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link myMDToHTMLParser#markdownItem}.
	 * @param ctx the parse tree
	 */
	void enterMarkdownItem(myMDToHTMLParser.MarkdownItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link myMDToHTMLParser#markdownItem}.
	 * @param ctx the parse tree
	 */
	void exitMarkdownItem(myMDToHTMLParser.MarkdownItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link myMDToHTMLParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(myMDToHTMLParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link myMDToHTMLParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(myMDToHTMLParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multilineCodeBlock}
	 * labeled alternative in {@link myMDToHTMLParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void enterMultilineCodeBlock(myMDToHTMLParser.MultilineCodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multilineCodeBlock}
	 * labeled alternative in {@link myMDToHTMLParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void exitMultilineCodeBlock(myMDToHTMLParser.MultilineCodeBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inlineCodeBlock}
	 * labeled alternative in {@link myMDToHTMLParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void enterInlineCodeBlock(myMDToHTMLParser.InlineCodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inlineCodeBlock}
	 * labeled alternative in {@link myMDToHTMLParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void exitInlineCodeBlock(myMDToHTMLParser.InlineCodeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link myMDToHTMLParser#italicsAndBold}.
	 * @param ctx the parse tree
	 */
	void enterItalicsAndBold(myMDToHTMLParser.ItalicsAndBoldContext ctx);
	/**
	 * Exit a parse tree produced by {@link myMDToHTMLParser#italicsAndBold}.
	 * @param ctx the parse tree
	 */
	void exitItalicsAndBold(myMDToHTMLParser.ItalicsAndBoldContext ctx);
	/**
	 * Enter a parse tree produced by {@link myMDToHTMLParser#bold}.
	 * @param ctx the parse tree
	 */
	void enterBold(myMDToHTMLParser.BoldContext ctx);
	/**
	 * Exit a parse tree produced by {@link myMDToHTMLParser#bold}.
	 * @param ctx the parse tree
	 */
	void exitBold(myMDToHTMLParser.BoldContext ctx);
	/**
	 * Enter a parse tree produced by {@link myMDToHTMLParser#italics}.
	 * @param ctx the parse tree
	 */
	void enterItalics(myMDToHTMLParser.ItalicsContext ctx);
	/**
	 * Exit a parse tree produced by {@link myMDToHTMLParser#italics}.
	 * @param ctx the parse tree
	 */
	void exitItalics(myMDToHTMLParser.ItalicsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code endOfFileFootnote}
	 * labeled alternative in {@link myMDToHTMLParser#footnote}.
	 * @param ctx the parse tree
	 */
	void enterEndOfFileFootnote(myMDToHTMLParser.EndOfFileFootnoteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code endOfFileFootnote}
	 * labeled alternative in {@link myMDToHTMLParser#footnote}.
	 * @param ctx the parse tree
	 */
	void exitEndOfFileFootnote(myMDToHTMLParser.EndOfFileFootnoteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inlineFootnote}
	 * labeled alternative in {@link myMDToHTMLParser#footnote}.
	 * @param ctx the parse tree
	 */
	void enterInlineFootnote(myMDToHTMLParser.InlineFootnoteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inlineFootnote}
	 * labeled alternative in {@link myMDToHTMLParser#footnote}.
	 * @param ctx the parse tree
	 */
	void exitInlineFootnote(myMDToHTMLParser.InlineFootnoteContext ctx);
	/**
	 * Enter a parse tree produced by {@link myMDToHTMLParser#image}.
	 * @param ctx the parse tree
	 */
	void enterImage(myMDToHTMLParser.ImageContext ctx);
	/**
	 * Exit a parse tree produced by {@link myMDToHTMLParser#image}.
	 * @param ctx the parse tree
	 */
	void exitImage(myMDToHTMLParser.ImageContext ctx);
	/**
	 * Enter a parse tree produced by {@link myMDToHTMLParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(myMDToHTMLParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link myMDToHTMLParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(myMDToHTMLParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link myMDToHTMLParser#listLine}.
	 * @param ctx the parse tree
	 */
	void enterListLine(myMDToHTMLParser.ListLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link myMDToHTMLParser#listLine}.
	 * @param ctx the parse tree
	 */
	void exitListLine(myMDToHTMLParser.ListLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link myMDToHTMLParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(myMDToHTMLParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link myMDToHTMLParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(myMDToHTMLParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by {@link myMDToHTMLParser#tableHeader}.
	 * @param ctx the parse tree
	 */
	void enterTableHeader(myMDToHTMLParser.TableHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link myMDToHTMLParser#tableHeader}.
	 * @param ctx the parse tree
	 */
	void exitTableHeader(myMDToHTMLParser.TableHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link myMDToHTMLParser#tableBorder}.
	 * @param ctx the parse tree
	 */
	void enterTableBorder(myMDToHTMLParser.TableBorderContext ctx);
	/**
	 * Exit a parse tree produced by {@link myMDToHTMLParser#tableBorder}.
	 * @param ctx the parse tree
	 */
	void exitTableBorder(myMDToHTMLParser.TableBorderContext ctx);
	/**
	 * Enter a parse tree produced by {@link myMDToHTMLParser#tableBodyRow}.
	 * @param ctx the parse tree
	 */
	void enterTableBodyRow(myMDToHTMLParser.TableBodyRowContext ctx);
	/**
	 * Exit a parse tree produced by {@link myMDToHTMLParser#tableBodyRow}.
	 * @param ctx the parse tree
	 */
	void exitTableBodyRow(myMDToHTMLParser.TableBodyRowContext ctx);
	/**
	 * Enter a parse tree produced by {@link myMDToHTMLParser#tableHeaderCell}.
	 * @param ctx the parse tree
	 */
	void enterTableHeaderCell(myMDToHTMLParser.TableHeaderCellContext ctx);
	/**
	 * Exit a parse tree produced by {@link myMDToHTMLParser#tableHeaderCell}.
	 * @param ctx the parse tree
	 */
	void exitTableHeaderCell(myMDToHTMLParser.TableHeaderCellContext ctx);
	/**
	 * Enter a parse tree produced by {@link myMDToHTMLParser#tableCell}.
	 * @param ctx the parse tree
	 */
	void enterTableCell(myMDToHTMLParser.TableCellContext ctx);
	/**
	 * Exit a parse tree produced by {@link myMDToHTMLParser#tableCell}.
	 * @param ctx the parse tree
	 */
	void exitTableCell(myMDToHTMLParser.TableCellContext ctx);
	/**
	 * Enter a parse tree produced by {@link myMDToHTMLParser#default}.
	 * @param ctx the parse tree
	 */
	void enterDefault(myMDToHTMLParser.DefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link myMDToHTMLParser#default}.
	 * @param ctx the parse tree
	 */
	void exitDefault(myMDToHTMLParser.DefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link myMDToHTMLParser#footnoteSentence}.
	 * @param ctx the parse tree
	 */
	void enterFootnoteSentence(myMDToHTMLParser.FootnoteSentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link myMDToHTMLParser#footnoteSentence}.
	 * @param ctx the parse tree
	 */
	void exitFootnoteSentence(myMDToHTMLParser.FootnoteSentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link myMDToHTMLParser#imageName}.
	 * @param ctx the parse tree
	 */
	void enterImageName(myMDToHTMLParser.ImageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link myMDToHTMLParser#imageName}.
	 * @param ctx the parse tree
	 */
	void exitImageName(myMDToHTMLParser.ImageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link myMDToHTMLParser#codeBlockLine}.
	 * @param ctx the parse tree
	 */
	void enterCodeBlockLine(myMDToHTMLParser.CodeBlockLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link myMDToHTMLParser#codeBlockLine}.
	 * @param ctx the parse tree
	 */
	void exitCodeBlockLine(myMDToHTMLParser.CodeBlockLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link myMDToHTMLParser#pound}.
	 * @param ctx the parse tree
	 */
	void enterPound(myMDToHTMLParser.PoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link myMDToHTMLParser#pound}.
	 * @param ctx the parse tree
	 */
	void exitPound(myMDToHTMLParser.PoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link myMDToHTMLParser#verticalLine}.
	 * @param ctx the parse tree
	 */
	void enterVerticalLine(myMDToHTMLParser.VerticalLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link myMDToHTMLParser#verticalLine}.
	 * @param ctx the parse tree
	 */
	void exitVerticalLine(myMDToHTMLParser.VerticalLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link myMDToHTMLParser#asterisk}.
	 * @param ctx the parse tree
	 */
	void enterAsterisk(myMDToHTMLParser.AsteriskContext ctx);
	/**
	 * Exit a parse tree produced by {@link myMDToHTMLParser#asterisk}.
	 * @param ctx the parse tree
	 */
	void exitAsterisk(myMDToHTMLParser.AsteriskContext ctx);
}