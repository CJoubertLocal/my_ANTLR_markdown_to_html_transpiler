import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class AntlrParser {

    private static String testInput = "# Introduction\n" +
            "\n" +
            "## A Small File\n" +
            "\n" +
            "This is a *small* file. It contains - neigh - requires the program to correctly translate a variety of different Obsidian Markdown elements into the HTML elements I want.\n" +
            "\n" +
            "![[image_name.png]]\n" +
            "\n" +
            "For example:\n" +
            "\n" +
            "- paragraphs[^1]\n" +
            "- \"0 < 1\"\n" +
            "- \"2 > 1\"\n" +
            "- **and**\n" +
            "- ***headings***\n" +
            "- `Code blocks`\n" +
            "\n" +
            "```Pseudocode\n" +
            "fn removeCharacterFromList(remList list, charToRemove char) list {\n" +
            "    match remList {\n" +
            "        case x::[]:\n" +
            "            match x {\n" +
            "                charToRemove: []\n" +
            "                _: x\n" +
            "            }\n" +
            "        case x::xs:\n" +
            "            match x {\n" +
            "                charToRemove: removeCharacterFromList(xs, charToRemove)\n" +
            "                _: x::removeCharacterFromList(xs, charToRemove)\n" +
            "            }\n" +
            "    }\n" +
            "}\n" +
            "\n" +
            "removeCharacterFromList(['a', 'b', 'c'], 'a')\n" +
            "```\n" +
            "\n" +
            "## A table conclusion\n" +
            "\n" +
            "Another footnote.[^2]\n" +
            "\n" +
            "| A table | must have | columns |\n" +
            "|--|--|--|\n" +
            "| and rows. | which may have an arbitrary amount of content | |\n" +
            "\n" +
            "[^1]: With footnotes!\n" +
            "[^2]: Pseudocode.\n";
    public static boolean main (String[] args) throws IOException {

        CharStream charStream = CharStreams.fromString(testInput);
        myMDToHTMLLexer mdToHTMLLexer = new myMDToHTMLLexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(mdToHTMLLexer);
        myMDToHTMLParser myMDToHTMLParser = new myMDToHTMLParser(commonTokenStream);

        myMDToHTMLParser.setBuildParseTree(true);
        myMDToHTMLParser.MdfileContext tree = myMDToHTMLParser.mdfile();
        HtmlMdListener htmlMD = new HtmlMdListener();
        ParseTreeWalker.DEFAULT.walk(htmlMD, tree);
        System.out.println(htmlMD.getOutString());
        return false;
    }

    public static String transpileMDToHTML(String mdToTranspile) {

        if (mdToTranspile.isEmpty()) {
            return "";
        }

        CharStream charStream = CharStreams.fromString(mdToTranspile);
        myMDToHTMLLexer mdToHTMLLexer = new myMDToHTMLLexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(mdToHTMLLexer);
        myMDToHTMLParser myMDToHTMLParser = new myMDToHTMLParser(commonTokenStream);

        myMDToHTMLParser.setBuildParseTree(true);
        myMDToHTMLParser.MdfileContext tree = myMDToHTMLParser.mdfile();
        HtmlMdListener htmlMD = new HtmlMdListener();
        ParseTreeWalker.DEFAULT.walk(htmlMD, tree);
        return htmlMD.getOutString();
    }
}
