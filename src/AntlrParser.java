import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class AntlrParser {

    public static String transpileMDToHTML(String mdToTranspile, String pathToImage) {

        if (mdToTranspile.isEmpty()) {
            return "";
        }

        CharStream charStream = CharStreams.fromString(mdToTranspile);
        myMDToHTMLLexer mdToHTMLLexer = new myMDToHTMLLexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(mdToHTMLLexer);
        myMDToHTMLParser myMDToHTMLParser = new myMDToHTMLParser(commonTokenStream);

        myMDToHTMLParser.setBuildParseTree(true);
        myMDToHTMLParser.MdfileContext tree = myMDToHTMLParser.mdfile();
        HtmlMdListener htmlMD = new HtmlMdListener(pathToImage);
        ParseTreeWalker.DEFAULT.walk(htmlMD, tree);

        return htmlMD.getOutString();
    }
}
