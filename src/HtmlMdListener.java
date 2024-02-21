import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Objects;
import java.util.HashMap;

public class HtmlMdListener implements myMDToHTMLListener {
    
    private final StringBuilder OutString = new StringBuilder();
    
    private String imagePath = "/directory_name/";
    
    private final HashMap<String, String> htmlEntityMap = new HashMap<String, String>();
    
    private int currentInlineFootnoteNumber = 1;
    private final HashMap<Integer, Integer> footnoteMap = new HashMap<Integer, Integer>();
    
    private boolean addingTextBetweenAnchorBrackets = false;
    private final StringBuilder textBetweenAnchorBrackets = new StringBuilder();
    
    private boolean addingEndNotes = false;
    private final StringBuilder currentEndNoteString = new StringBuilder();
    private final HashMap<Integer, String> endNotes = new HashMap<Integer, String>();
    
    private int currentHeaderCount = 0;
    
    public HtmlMdListener(String pathToImageDirectory) {
        this.htmlEntityMap.put("\"", "&quot;");
        this.htmlEntityMap.put("&", "&amp;");
        this.htmlEntityMap.put("<", "&lt;");
        this.htmlEntityMap.put(">", "&gt;");
        this.htmlEntityMap.put("-", "&ndash;");
        this.htmlEntityMap.put("'", "&apos;");
        this.htmlEntityMap.put("|", "&vert;");
        
        if (!Objects.equals(pathToImageDirectory, "")) {
            this.imagePath = pathToImageDirectory;
        }
    }

    public String getOutString() {
        return this.OutString.toString();
    }


    @Override
    public void enterMdfile(myMDToHTMLParser.MdfileContext ctx) {
        this.OutString.append("<html>\n<head>\n<meta charset=\"UTF-8\"/>\n</head>\n<body>\n<div class=\"content\">");
    }

    @Override
    public void exitMdfile(myMDToHTMLParser.MdfileContext ctx) {
        if (addingEndNotes) {
            for (int i = 1; i < currentInlineFootnoteNumber; i++) {
                this.OutString
                        .append("<p id=\"footnote-")
                        .append(i)
                        .append("\">\n")
                        .append("<a href=\"#footnote-anchor-")
                        .append(i)
                        .append("\">\n")
                        .append("[")
                        .append(i)
                        .append("]\n</a>\n");

                this.OutString.append(endNotes.get(i));

                this.OutString.append("</p>\n");
            }
            this.OutString.append("</p>\n");
        }
        this.OutString.append("</div>\n</body>\n</html>");
    }

    @Override
    public void enterSentence(myMDToHTMLParser.SentenceContext ctx) {
        this.OutString.append("<p>\n");
    }

    @Override
    public void exitSentence(myMDToHTMLParser.SentenceContext ctx) {
        if (!addingEndNotes) {
            this.OutString.append("\n</p>\n");
        }
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
        if (addingEndNotes) {
            this.currentEndNoteString.append("<i>\n<b>\n");
        } else {
            this.OutString.append("<i>\n<b>\n");
        }
    }

    @Override
    public void exitItalicsAndBold(myMDToHTMLParser.ItalicsAndBoldContext ctx) {
        if (addingEndNotes) {
            this.currentEndNoteString.append("</b>\n</i>\n");
        } else {
            this.OutString.append("</b>\n</i>\n");
        }
    }

    @Override
    public void enterBold(myMDToHTMLParser.BoldContext ctx) {
        if (addingEndNotes) {
            this.currentEndNoteString.append("<b>\n");
        } else {
            this.OutString.append("<b>\n");
        }
    }

    @Override
    public void exitBold(myMDToHTMLParser.BoldContext ctx) {
        if (addingEndNotes) {
            this.currentEndNoteString.append("</b>\n");
        } else {
            this.OutString.append("</b>\n");
        }
    }

    @Override
    public void enterItalics(myMDToHTMLParser.ItalicsContext ctx) {
        if (addingEndNotes) {
            this.currentEndNoteString.append("<i>\n");
        } else {
            this.OutString.append("<i>\n");
        }
    }

    @Override
    public void exitItalics(myMDToHTMLParser.ItalicsContext ctx) {
        if (addingEndNotes) {
            this.currentEndNoteString.append("</i>\n");
        } else {
            this.OutString.append("</i>\n");
        }
    }

    @Override
    public void enterEndOfFileFootnote(myMDToHTMLParser.EndOfFileFootnoteContext ctx) {
        if (!addingEndNotes) {
            addingEndNotes = true;
        }
    }

    @Override
    public void exitEndOfFileFootnote(myMDToHTMLParser.EndOfFileFootnoteContext ctx) {
        this.endNotes.put(this.footnoteMap.get(Integer.valueOf(ctx.NUMBER().toString())), this.currentEndNoteString.toString());
        this.currentEndNoteString.setLength(0); //https://stackoverflow.com/questions/5192512/how-can-i-clear-or-empty-a-stringbuilder
    }

    @Override
    public void enterInlineFootnote(myMDToHTMLParser.InlineFootnoteContext ctx) {
    }

    @Override
    public void exitInlineFootnote(myMDToHTMLParser.InlineFootnoteContext ctx) {
        footnoteMap.put(Integer.valueOf(ctx.NUMBER().toString()), currentInlineFootnoteNumber);

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
                .append("<img src=\"")
                .append(imagePath)
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
    public void enterBoldItalicsInterior(myMDToHTMLParser.BoldItalicsInteriorContext ctx) {

    }

    @Override
    public void exitBoldItalicsInterior(myMDToHTMLParser.BoldItalicsInteriorContext ctx) {

    }

    @Override
    public void enterPound(myMDToHTMLParser.PoundContext ctx) {

    }

    @Override
    public void exitPound(myMDToHTMLParser.PoundContext ctx) {
        if (addingEndNotes) {
            this.currentEndNoteString.append("#");
        } else {
            this.OutString.append("#");
        }
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
    public void enterDash(myMDToHTMLParser.DashContext ctx) {

    }

    @Override
    public void exitDash(myMDToHTMLParser.DashContext ctx) {
        if (addingEndNotes) {
            this.currentEndNoteString.append("-");

        } else if (addingTextBetweenAnchorBrackets) {
            textBetweenAnchorBrackets.append(htmlEntityMap.get("-"));

        } else {
            this.OutString.append(htmlEntityMap.get("-"));
        }
    }

    @Override
    public void enterBackquote(myMDToHTMLParser.BackquoteContext ctx) {

    }

    @Override
    public void exitBackquote(myMDToHTMLParser.BackquoteContext ctx) {
        this.OutString.append("`");
    }

    @Override
    public void enterCarat(myMDToHTMLParser.CaratContext ctx) {

    }

    @Override
    public void exitCarat(myMDToHTMLParser.CaratContext ctx) {
        this.OutString.append("^");
    }

    @Override
    public void enterExclamationMark(myMDToHTMLParser.ExclamationMarkContext ctx) {

    }

    @Override
    public void exitExclamationMark(myMDToHTMLParser.ExclamationMarkContext ctx) {
        if (addingEndNotes) {
            this.currentEndNoteString.append("!");

        } else if (addingTextBetweenAnchorBrackets) {
            textBetweenAnchorBrackets.append("!");

        } else {
            this.OutString.append("!");
        }
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
    public void enterLink(myMDToHTMLParser.LinkContext ctx) {

    }

    @Override
    public void exitLink(myMDToHTMLParser.LinkContext ctx) {
    }

    @Override
    public void enterLinkStart(myMDToHTMLParser.LinkStartContext ctx) {
        this.addingTextBetweenAnchorBrackets = true;
    }

    @Override
    public void exitLinkStart(myMDToHTMLParser.LinkStartContext ctx) {
        this.addingTextBetweenAnchorBrackets = false;
    }

    @Override
    public void enterLinkEnd(myMDToHTMLParser.LinkEndContext ctx) {
        this.OutString.append("<a href=\"");
    }

    @Override
    public void exitLinkEnd(myMDToHTMLParser.LinkEndContext ctx) {
        this.OutString.append("\">").append(this.textBetweenAnchorBrackets.toString()).append("</a>\n");
    }

    @Override
    public void enterDefault(myMDToHTMLParser.DefaultContext ctx) {

    }

    @Override
    public void exitDefault(myMDToHTMLParser.DefaultContext ctx) {
        if (htmlEntityMap.containsKey(ctx.getText())) {

            if (addingEndNotes) {
                this.currentEndNoteString.append(htmlEntityMap.get(ctx.getText()));

            } else if (addingTextBetweenAnchorBrackets) {
                textBetweenAnchorBrackets.append(htmlEntityMap.get(ctx.getText()));

            } else {
                this.OutString.append(htmlEntityMap.get(ctx.getText()));
            }

        } else {

            if (addingEndNotes) {
                this.currentEndNoteString.append(ctx.getText());

            } else if (addingTextBetweenAnchorBrackets) {
                textBetweenAnchorBrackets.append(ctx.getText());

            } else {
                this.OutString.append(ctx.getText());
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
