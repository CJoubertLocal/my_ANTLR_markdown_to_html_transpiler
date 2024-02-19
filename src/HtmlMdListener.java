import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Objects;
import java.util.HashMap;

public class HtmlMdListener implements myMDToHTMLListener {
    private final StringBuilder OutString = new StringBuilder();
    private HashMap<String, String> htmlEntityMap = new HashMap<String, String>();
    private int currentInlineFootnoteNumber = 1;
    private HashMap<Integer, Integer> footnoteMap = new HashMap<Integer, Integer>();
    private int currentHeaderCount = 0;
    public HtmlMdListener() {
        this.htmlEntityMap.put("\"", "&quot;");
        this.htmlEntityMap.put("&", "&amp;");
        this.htmlEntityMap.put("<", "&lt;");
        this.htmlEntityMap.put(">", "&gt;");
        this.htmlEntityMap.put("-", "&ndash;");
        this.htmlEntityMap.put("'", "&apos;");
        this.htmlEntityMap.put("|", "&vert;");
    }

    public String getOutString() {
        return this.OutString.toString();
    }


    @Override
    public void enterMdfile(myMDToHTMLParser.MdfileContext ctx) {
        this.OutString.append("<html>\n<head>\n<meta charset=\"UTF-8\"/>\n</head>\n<body>\n");
    }

    @Override
    public void exitMdfile(myMDToHTMLParser.MdfileContext ctx) {
        this.OutString.append("</body>\n</html>");
    }

    @Override
    public void enterSentence(myMDToHTMLParser.SentenceContext ctx) {
        this.OutString.append("<p>\n");
    }

    @Override
    public void exitSentence(myMDToHTMLParser.SentenceContext ctx) {
        this.OutString.append("\n</p>\n");
    }

    @Override
    public void enterMarkdownItem(myMDToHTMLParser.MarkdownItemContext ctx) {

    }

    @Override
    public void exitMarkdownItem(myMDToHTMLParser.MarkdownItemContext ctx) {

    }

    @Override
    public void enterHeader(myMDToHTMLParser.HeaderContext ctx) {
        for (org.antlr.v4.runtime.tree.ParseTree c : ctx.children) {
            if (Objects.equals(c.getText(), "#")) {
                currentHeaderCount++;

            } else {
                break;
            }
        }

        this.OutString
                .append("<h")
                .append(currentHeaderCount)
                .append(">\n");
    }

    @Override
    public void exitHeader(myMDToHTMLParser.HeaderContext ctx) {
        this.OutString
                .append("\n</h")
                .append(currentHeaderCount)
                .append(">\n");

        currentHeaderCount = 0;
    }

    @Override
    public void enterMultilineCodeBlock(myMDToHTMLParser.MultilineCodeBlockContext ctx) {
        this.OutString
                .append("<pre>\n")
                .append("<code>\n");
    }

    @Override
    public void exitMultilineCodeBlock(myMDToHTMLParser.MultilineCodeBlockContext ctx) {
        this.OutString
                .append("</code>\n")
                .append("</pre>\n");
    }

    @Override
    public void enterInlineCodeBlock(myMDToHTMLParser.InlineCodeBlockContext ctx) {
        this.OutString.append("<code>\n");
    }

    @Override
    public void exitInlineCodeBlock(myMDToHTMLParser.InlineCodeBlockContext ctx) {
        this.OutString.append("</code>\n");
    }

    @Override
    public void enterItalicsAndBold(myMDToHTMLParser.ItalicsAndBoldContext ctx) {
        this.OutString.append("<i>\n<b>\n");
    }

    @Override
    public void exitItalicsAndBold(myMDToHTMLParser.ItalicsAndBoldContext ctx) {
        skipAsterisks(ctx.children);
        this.OutString.append("</b>\n</i>\n");
    }

    private void skipAsterisks(java.util.List<org.antlr.v4.runtime.tree.ParseTree> ctxChildren) {
        for (org.antlr.v4.runtime.tree.ParseTree c : ctxChildren) {
            if (!Objects.equals(c.getText(), "*")) {
                this.OutString.append(c.getText());
            }
        }
    }

    @Override
    public void enterBold(myMDToHTMLParser.BoldContext ctx) {
        this.OutString.append("<b>\n");
    }

    @Override
    public void exitBold(myMDToHTMLParser.BoldContext ctx) {
        skipAsterisks(ctx.children);
        this.OutString.append("</b>\n");
    }

    @Override
    public void enterItalics(myMDToHTMLParser.ItalicsContext ctx) {
        this.OutString.append("<i>\n");
    }

    @Override
    public void exitItalics(myMDToHTMLParser.ItalicsContext ctx) {
        skipAsterisks(ctx.children);
        this.OutString.append("</i>\n");
    }

    @Override
    public void enterEndOfFileFootnote(myMDToHTMLParser.EndOfFileFootnoteContext ctx) {
        this.OutString
                .append("<p id=\"footnote-")
                .append(ctx.NUMBER())
                .append("\">\n")
                .append("<a href=\"#footnote-anchor-")
                .append(ctx.NUMBER())
                .append("\">\n")
                .append("[")
                .append(ctx.NUMBER())
                .append("]\n</a>\n");
    }

    @Override
    public void exitEndOfFileFootnote(myMDToHTMLParser.EndOfFileFootnoteContext ctx) {
        this.OutString.append("</p>\n");
    }

    @Override
    public void enterInlineFootnote(myMDToHTMLParser.InlineFootnoteContext ctx) {
    }

    @Override
    public void exitInlineFootnote(myMDToHTMLParser.InlineFootnoteContext ctx) {
        footnoteMap.put(Integer.getInteger(ctx.NUMBER().toString()), currentInlineFootnoteNumber);
        this.OutString
                .append("<a id=\"footnote-anchor-")
                .append(currentInlineFootnoteNumber)
                .append("\" href=\"#footnote-")
                .append(currentInlineFootnoteNumber)
                .append("\">[")
                .append(currentInlineFootnoteNumber)
                .append("]</a>\n");

        currentInlineFootnoteNumber++;
    }

    @Override
    public void enterImage(myMDToHTMLParser.ImageContext ctx) {

    }

    @Override
    public void exitImage(myMDToHTMLParser.ImageContext ctx) {
        this.OutString
                .append("<figure class=\"image\">\n")
                .append("<img src=\"/directory_name/") // TODO: replace with user-provided path
                .append(ctx.imageName().getText())
                .append("\">\n")
                .append("</figure>\n");
    }

    @Override
    public void enterImageName(myMDToHTMLParser.ImageNameContext ctx) {

    }

    @Override
    public void exitImageName(myMDToHTMLParser.ImageNameContext ctx) {

    }

    @Override
    public void enterCodeBlockLine(myMDToHTMLParser.CodeBlockLineContext ctx) {

    }

    @Override
    public void exitCodeBlockLine(myMDToHTMLParser.CodeBlockLineContext ctx) {
        this.OutString.append("\n");
    }

    @Override
    public void enterPound(myMDToHTMLParser.PoundContext ctx) {

    }

    @Override
    public void exitPound(myMDToHTMLParser.PoundContext ctx) {
        this.OutString.append("#");
    }

    @Override
    public void enterVerticalLine(myMDToHTMLParser.VerticalLineContext ctx) {

    }

    @Override
    public void exitVerticalLine(myMDToHTMLParser.VerticalLineContext ctx) {
        this.OutString.append(htmlEntityMap.get("|"));
    }

    @Override
    public void enterAsterisk(myMDToHTMLParser.AsteriskContext ctx) {

    }

    @Override
    public void exitAsterisk(myMDToHTMLParser.AsteriskContext ctx) {
        this.OutString.append("*");
    }

    @Override
    public void enterList(myMDToHTMLParser.ListContext ctx) {
        this.OutString.append("\n<ul>\n");
    }

    @Override
    public void exitList(myMDToHTMLParser.ListContext ctx) {
        this.OutString.append("</ul>\n");
    }

    @Override
    public void enterListLine(myMDToHTMLParser.ListLineContext ctx) {
        this.OutString.append("<li>\n");
    }

    @Override
    public void exitListLine(myMDToHTMLParser.ListLineContext ctx) {
        this.OutString.append("</li>\n");
    }

    @Override
    public void enterTable(myMDToHTMLParser.TableContext ctx) {
        this.OutString.append("<table class=\"table is-hoverable\">\n");
    }

    @Override
    public void exitTable(myMDToHTMLParser.TableContext ctx) {
        this.OutString.append("</tbody>\n").append("</table>\n");
    }

    @Override
    public void enterTableHeader(myMDToHTMLParser.TableHeaderContext ctx) {
        this.OutString.append("<thead>\n").append("<tr>\n");
    }

    @Override
    public void exitTableHeader(myMDToHTMLParser.TableHeaderContext ctx) {
        this.OutString.append("</tr>\n").append("</thead>\n");
    }

    @Override
    public void enterTableBorder(myMDToHTMLParser.TableBorderContext ctx) {

    }

    @Override
    public void exitTableBorder(myMDToHTMLParser.TableBorderContext ctx) {
        this.OutString.append("<tbody>\n");
    }

    @Override
    public void enterTableBodyRow(myMDToHTMLParser.TableBodyRowContext ctx) {
        this.OutString.append("<tr>\n");
    }

    @Override
    public void exitTableBodyRow(myMDToHTMLParser.TableBodyRowContext ctx) {
        this.OutString.append("</tr>\n");
    }

    @Override
    public void enterTableHeaderCell(myMDToHTMLParser.TableHeaderCellContext ctx) {
        this.OutString.append("<th>\n");
    }

    @Override
    public void exitTableHeaderCell(myMDToHTMLParser.TableHeaderCellContext ctx) {
        this.OutString.append("</th>\n");
    }

    @Override
    public void enterTableCell(myMDToHTMLParser.TableCellContext ctx) {
        this.OutString.append("<td>\n");
    }

    @Override
    public void exitTableCell(myMDToHTMLParser.TableCellContext ctx) {
        this.OutString.append("</td>\n");
    }

    @Override
    public void enterDefault(myMDToHTMLParser.DefaultContext ctx) {

    }

    @Override
    public void exitDefault(myMDToHTMLParser.DefaultContext ctx) {
        for (org.antlr.v4.runtime.tree.ParseTree c : ctx.children) {
            if (htmlEntityMap.containsKey(c.getText())) {
                this.OutString.append(htmlEntityMap.get(c.getText()));

            } else {
                this.OutString.append(c.getText());
            }
        }
    }

    @Override
    public void enterFootnoteSentence(myMDToHTMLParser.FootnoteSentenceContext ctx) {

    }

    @Override
    public void exitFootnoteSentence(myMDToHTMLParser.FootnoteSentenceContext ctx) {
    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
