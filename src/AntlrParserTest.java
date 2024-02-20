import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AntlrParserTest {
    String htmlStart = "<html><head><meta charset=\"UTF-8\"/></head><body><p>";
    String htmlEnd = "</p></body></html>";

    String removeNewLineChars (String strIn) {
        return strIn.replaceAll(">\n", ">").replaceAll("\n<", "<");
    }

    @Test
    void transpileMDToHTML() {
        assertEquals(
                "",
                removeNewLineChars(AntlrParser.transpileMDToHTML(
                        "", ""
                )
            )
        );
        assertEquals(
            htmlStart +
                    "This is a plain text file." +
                    htmlEnd,
                removeNewLineChars(AntlrParser.transpileMDToHTML(
                        "This is a plain text file.\n", ""
                )
            )
        );
        assertEquals(
                htmlStart +
                "<h1> This is an h1 header</h1>" +
                htmlEnd,
                removeNewLineChars(
                        AntlrParser.transpileMDToHTML(
                                "# This is an h1 header\n", ""
                        )
                )
        );
        assertEquals(
                htmlStart +
                "<h2> This is an h2 header</h2>" +
                htmlEnd,
                removeNewLineChars(
                        AntlrParser.transpileMDToHTML(
                                "## This is an h2 header\n", ""
                        )
                )
        );
        assertEquals(
                htmlStart +
                "<h3> This is an h3 header</h3>" +
                htmlEnd,
                removeNewLineChars(
                        AntlrParser.transpileMDToHTML(
                                "### This is an h3 header\n", ""
                        )
                )
        );
        assertEquals(
                htmlStart +
                "<h3> This is an ### h3 ### header</h3>" +
                htmlEnd,
                removeNewLineChars(
                        AntlrParser.transpileMDToHTML(
                                "### This is an ### h3 ### header\n", ""
                        )
                )
        );
        assertEquals(
                htmlStart +
                "This</p><p>is</p><p>some simple text</p><p>which has been spread out</p><p>across multiple lines." +
                htmlEnd,
                removeNewLineChars(
                        AntlrParser.transpileMDToHTML(
                                "This\nis\nsome simple text\nwhich has been spread out\nacross multiple lines.\n", ""
                        )
                )
        );
        assertEquals(
                htmlStart +
                "This is a first line.</p><p>Paragraph one." +
                htmlEnd,
                removeNewLineChars(
                        AntlrParser.transpileMDToHTML(
                                "This is a first line.\n\nParagraph one.\n", ""
                        )
                )
        );
        assertEquals(
                htmlStart +
                "This is a first line.</p><p>Paragraph one.</p><p>Paragraph two." +
                htmlEnd,
                removeNewLineChars(
                        AntlrParser.transpileMDToHTML(
                                "This is a first line.\n\nParagraph one.\n\nParagraph two.\n", ""
                        )
                )
        );
        assertEquals(
                htmlStart +
                "<i>italic text</i>" +
                htmlEnd,
                removeNewLineChars(
                        AntlrParser.transpileMDToHTML(
                                "*italic text*\n", ""
                        )
                )
        );
        assertEquals(
                htmlStart +
                "<b>bold text</b>" +
                htmlEnd,
                removeNewLineChars(
                        AntlrParser.transpileMDToHTML(
                                "**bold text**\n", ""
                        )
                )
        );
        assertEquals(
                htmlStart +
                "<i><b>bold text</b></i>" +
                htmlEnd,
                removeNewLineChars(
                        AntlrParser.transpileMDToHTML(
                                "***bold text***\n", ""
                        )
                )
        );
        assertEquals(
                htmlStart +
                "This is a file &apos; which is &lt;filled&gt; with &ndash; HTML &quot;entities&quot; of interest." +
                htmlEnd,
                removeNewLineChars(
                        AntlrParser.transpileMDToHTML(
                                "This is a file ' which is <filled> with - HTML \"entities\" of interest.\n", ""
                        )
                )
        );
        assertEquals(
                htmlStart +
                "<code></code>" +
                htmlEnd,
                removeNewLineChars(
                        AntlrParser.transpileMDToHTML(
                                "``\n", ""
                        )
                )
        );
        assertEquals(
                htmlStart +
                "<code>This is a simple inline code block</code>" +
                htmlEnd,
                removeNewLineChars(
                        AntlrParser.transpileMDToHTML(
                                "`This is a simple inline code block`\n", ""
                        )
                )
        );
        assertEquals(
                htmlStart +
                "This is some text surrounding <code>and inline code block</code>." +
                htmlEnd,
                removeNewLineChars(
                        AntlrParser.transpileMDToHTML(
                                "This is some text surrounding `and inline code block`.\n", ""
                        )
                )
        );
        assertEquals(
                htmlStart +
                "This file contains <code>a code block</code> with <code>a number of &apos; &lt;&gt; &ndash; &quot; </code> html entities in it." +
                htmlEnd,
                removeNewLineChars(
                        AntlrParser.transpileMDToHTML(
                                "This file contains `a code block` with `a number of ' <> - \" ` html entities in it.\n", ""
                        )
                )
        );
        assertEquals(
                htmlStart +
                "<pre><code>This is a multiline code block.\nLine one,\nLine two,\nLine three.</code></pre>" +
                htmlEnd,
                removeNewLineChars(
                        AntlrParser.transpileMDToHTML(
                                "```programming_language\nThis is a multiline code block.\nLine one,\nLine two,\nLine three.\n```\n", ""
                        )
                )
        );
        assertEquals(
                htmlStart +
                "<pre><code>This is a line.\n\nHere is another line. It should not be in paragraph tags.\n\nA final line.</code></pre>" +
                htmlEnd,
                removeNewLineChars(
                        AntlrParser.transpileMDToHTML(
                                "```someprogramminglanguage\nThis is a line.\n\nHere is another line. It should not be in paragraph tags.\n\nA final line.\n```\n", ""
                        )
                )
        );
        assertEquals(
                htmlStart +
                "This is a line.</p><p>Paragraph <code>with a code block</code> in it." +
                htmlEnd,
                removeNewLineChars(
                        AntlrParser.transpileMDToHTML(
                                "This is a line.\n\nParagraph `with a code block` in it.\n", ""
                        )
                )
        );
        assertEquals(
                htmlStart +
                "This is a line.</p><p>Here is a multi&ndash;line code block:</p><p><pre><code>Line one,\n\nLine two,\n\nline three.</code></pre></p><p>That&apos;s the end of the code block." +
                htmlEnd,
                removeNewLineChars(
                        AntlrParser.transpileMDToHTML(
                                "This is a line.\n\nHere is a multi-line code block:\n\n```code\nLine one,\n\nLine two,\n\nline three.\n```\n\nThat's the end of the code block.\n", ""
                        )
                )
        );
        assertEquals(
                htmlStart +
                "<pre><code>&ndash; dashboard\n&vert; &ndash; frontend\n&vert; &ndash; backend</code></pre>" +
                htmlEnd,
                removeNewLineChars(
                        AntlrParser.transpileMDToHTML(
                                "```dir\n- dashboard\n| - frontend\n| - backend\n```\n", ""
                        )
                )
        );
        assertEquals(
                htmlStart +
                "<pre><code>import * as echarts from &apos;echarts&apos;;</code></pre>" +
                htmlEnd,
                removeNewLineChars(
                        AntlrParser.transpileMDToHTML(
                                "```js\nimport * as echarts from 'echarts';\n```\n", ""
                        )
                )
        );
        assertEquals(
                htmlStart +
                "Here is a footnote.<a id=\"footnote-anchor-1\" href=\"#footnote-1\">[1]</a>" +
                htmlEnd,
                removeNewLineChars(
                        AntlrParser.transpileMDToHTML(
                                "Here is a footnote.[^1]\n", ""
                        )
                )
        );
        assertEquals(
                htmlStart +
                "Here is a footnote<a id=\"footnote-anchor-1\" href=\"#footnote-1\">[1]</a> and another footnote.<a id=\"footnote-anchor-2\" href=\"#footnote-2\">[2]</a>" +
                htmlEnd,
                removeNewLineChars(
                        AntlrParser.transpileMDToHTML(
                                "Here is a footnote[^1] and another footnote.[^2]\n", ""
                        )
                )
        );
        assertEquals(
                htmlStart +
                "Here is a footnote<a id=\"footnote-anchor-1\" href=\"#footnote-1\">[1]</a> and another footnote.<a id=\"footnote-anchor-2\" href=\"#footnote-2\">[2]</a>" +
                htmlEnd,
                removeNewLineChars(
                        AntlrParser.transpileMDToHTML(
                                "Here is a footnote[^2] and another footnote.[^1]\n", ""
                        )
                )
        );
        assertEquals(
                htmlStart +
                "<h1> This is a heading</h1></p><p>Here is a footnote.<a id=\"footnote-anchor-1\" href=\"#footnote-1\">[1]</a>" +
                htmlEnd,
                removeNewLineChars(
                        AntlrParser.transpileMDToHTML(
                                "# This is a heading\n\nHere is a footnote.[^1]\n", ""
                        )
                )
        );
        assertEquals(
                htmlStart +
                "<h1> This is a heading</h1></p><p>Here is a footnote.<a id=\"footnote-anchor-1\" href=\"#footnote-1\">[1]</a> Here&apos;s another.<a id=\"footnote-anchor-2\" href=\"#footnote-2\">[2]</a>" +
                htmlEnd,
                removeNewLineChars(
                        AntlrParser.transpileMDToHTML(
                                "# This is a heading\n\nHere is a footnote.[^2] Here's another.[^1]\n", ""
                        )
                )
        );
        assertEquals(
                htmlStart +
                "Throwaway line</p><p>This paragraph references a footnote.<a id=\"footnote-anchor-1\" href=\"#footnote-1\">[1]</a></p><p><p id=\"footnote-1\"><a href=\"#footnote-anchor-1\">[1]</a> This is the reference.</p>" +
                htmlEnd,
                removeNewLineChars(
                        AntlrParser.transpileMDToHTML(
                                "Throwaway line\n\nThis paragraph references a footnote.[^1]\n\n[^1]: This is the reference.\n", ""
                        )
                )
        );
        assertEquals(
                htmlStart +
                "Throwaway line</p><p>This paragraph references a footnote.<a id=\"footnote-anchor-1\" href=\"#footnote-1\">[1]</a></p><p>This paragraph<a id=\"footnote-anchor-2\" href=\"#footnote-2\">[2]</a> also has a footnote.</p><p><p id=\"footnote-1\"><a href=\"#footnote-anchor-1\">[1]</a> This is the reference.</p><p id=\"footnote-2\"><a href=\"#footnote-anchor-2\">[2]</a> This is a footnote.</p>" +
                htmlEnd,
                removeNewLineChars(
                        AntlrParser.transpileMDToHTML(
                                "Throwaway line\n\nThis paragraph references a footnote.[^1]\n\nThis paragraph[^2] also has a footnote.\n\n[^1]: This is the reference.\n[^2]: This is a footnote.\n", ""
                        )
                )
        );
        assertEquals(
                htmlStart +
                "Throwaway line</p><p>This paragraph references a footnote.<a id=\"footnote-anchor-1\" href=\"#footnote-1\">[1]</a></p><p>This paragraph<a id=\"footnote-anchor-2\" href=\"#footnote-2\">[2]</a> also has a footnote.</p><p><p id=\"footnote-1\"><a href=\"#footnote-anchor-1\">[1]</a> This is a footnote.</p><p id=\"footnote-2\"><a href=\"#footnote-anchor-2\">[2]</a> This is the reference.</p>" +
                htmlEnd,
                removeNewLineChars(
                        AntlrParser.transpileMDToHTML(
                                "Throwaway line\n\nThis paragraph references a footnote.[^2]\n\nThis paragraph[^1] also has a footnote.\n\n[^1]: This is the reference.\n[^2]: This is a footnote.\n", ""
                        )
                )
        );
        assertEquals(
                htmlStart +
                "Throwaway line</p><p>This<a id=\"footnote-anchor-1\" href=\"#footnote-1\">[1]</a> paragraph references a footnote.<a id=\"footnote-anchor-2\" href=\"#footnote-2\">[2]</a></p><p>This paragraph<a id=\"footnote-anchor-3\" href=\"#footnote-3\">[3]</a> also has<a id=\"footnote-anchor-4\" href=\"#footnote-4\">[4]</a> a footnote.</p><p><p id=\"footnote-1\"><a href=\"#footnote-anchor-1\">[1]</a> Fourth note.</p><p id=\"footnote-2\"><a href=\"#footnote-anchor-2\">[2]</a> Surprise!</p><p id=\"footnote-3\"><a href=\"#footnote-anchor-3\">[3]</a> This is the reference.</p><p id=\"footnote-4\"><a href=\"#footnote-anchor-4\">[4]</a> This is a footnote.</p>" +
                htmlEnd,
                removeNewLineChars(
                        AntlrParser.transpileMDToHTML(
                                "Throwaway line\n\nThis[^4] paragraph references a footnote.[^3]\n\nThis paragraph[^1] also has[^2] a footnote.\n\n[^1]: This is the reference.\n[^2]: This is a footnote.\n[^3]: Surprise!\n[^4]: Fourth note.\n", ""
                        )
                )
        );
        assertEquals(
                htmlStart +
                "Throwaway line</p><p>This paragraph references a footnote.<a id=\"footnote-anchor-1\" href=\"#footnote-1\">[1]</a></p><p><p id=\"footnote-1\"><a href=\"#footnote-anchor-1\">[1]</a> This is the reference, it has a url: https://this&ndash;is&ndash;not&ndash;a&ndash;real&ndash;url.blue/database?query=#a&ndash;query.</p>" +
                htmlEnd,
                removeNewLineChars(
                        AntlrParser.transpileMDToHTML(
                                "Throwaway line\n\nThis paragraph references a footnote.[^1]\n\n[^1]: This is the reference, it has a url: https://this-is-not-a-real-url.blue/database?query=#a-query.\n", ""
                        )
                )
        );
        assertEquals(
                htmlStart +
                "Throwaway line</p><p><a id=\"footnote-anchor-1\" href=\"#footnote-1\">[1]</a></p><p><a id=\"footnote-anchor-2\" href=\"#footnote-2\">[2]</a></p><p><a id=\"footnote-anchor-3\" href=\"#footnote-3\">[3]</a></p><p><a id=\"footnote-anchor-4\" href=\"#footnote-4\">[4]</a></p><p><a id=\"footnote-anchor-5\" href=\"#footnote-5\">[5]</a></p><p><a id=\"footnote-anchor-6\" href=\"#footnote-6\">[6]</a></p><p><a id=\"footnote-anchor-7\" href=\"#footnote-7\">[7]</a></p><p><a id=\"footnote-anchor-8\" href=\"#footnote-8\">[8]</a></p><p><a id=\"footnote-anchor-9\" href=\"#footnote-9\">[9]</a></p><p><a id=\"footnote-anchor-10\" href=\"#footnote-10\">[10]</a></p><p><a id=\"footnote-anchor-11\" href=\"#footnote-11\">[11]</a></p><p><a id=\"footnote-anchor-12\" href=\"#footnote-12\">[12]</a></p><p><p id=\"footnote-1\"><a href=\"#footnote-anchor-1\">[1]</a> 1</p><p id=\"footnote-2\"><a href=\"#footnote-anchor-2\">[2]</a> 2</p><p id=\"footnote-3\"><a href=\"#footnote-anchor-3\">[3]</a> 3</p><p id=\"footnote-4\"><a href=\"#footnote-anchor-4\">[4]</a> 4</p><p id=\"footnote-5\"><a href=\"#footnote-anchor-5\">[5]</a> 5</p><p id=\"footnote-6\"><a href=\"#footnote-anchor-6\">[6]</a> 6</p><p id=\"footnote-7\"><a href=\"#footnote-anchor-7\">[7]</a> 7</p><p id=\"footnote-8\"><a href=\"#footnote-anchor-8\">[8]</a> 8</p><p id=\"footnote-9\"><a href=\"#footnote-anchor-9\">[9]</a> 9</p><p id=\"footnote-10\"><a href=\"#footnote-anchor-10\">[10]</a> 10</p><p id=\"footnote-11\"><a href=\"#footnote-anchor-11\">[11]</a> 11</p><p id=\"footnote-12\"><a href=\"#footnote-anchor-12\">[12]</a> 12</p>" +
                htmlEnd,
                removeNewLineChars(
                        AntlrParser.transpileMDToHTML(
                                "Throwaway line\n\n[^1]\n[^2]\n[^3]\n[^4]\n[^5]\n[^6]\n[^7]\n[^8]\n[^9]\n[^10]\n[^11]\n[^12]\n\n[^1]: 1\n[^2]: 2\n[^3]: 3\n[^4]: 4\n[^5]: 5\n[^6]: 6\n[^7]: 7\n[^8]: 8\n[^9]: 9\n[^10]: 10\n[^11]: 11\n[^12]: 12\n", ""
                        )
                )
        );
        assertEquals(
                htmlStart +
                "<h1> Unordered List!</h1></p><p><ul><li> This is an unordered list with a &ndash; dash.</li><li> One,</li><li> Two,</li><li> Three.</li></ul>" +
                htmlEnd,
                removeNewLineChars(
                        AntlrParser.transpileMDToHTML(
                                "# Unordered List!\n\n- This is an unordered list with a - dash.\n- One,\n- Two,\n- Three.\n\n", ""
                        )
                )
        );
        assertEquals(
                htmlStart +
                "<table class=\"table is-hoverable\"><thead><tr><th> col name one </th><th> col name two </th></tr></thead><tbody><tr><td> row contents one </td><td> row contents two </td></tr></tbody></table>" +
                htmlEnd,
                removeNewLineChars(
                        AntlrParser.transpileMDToHTML(
                                "| col name one | col name two |\n|-|-|\n| row contents one | row contents two |\n", ""
                        )
                )
        );
        assertEquals(
                htmlStart +
                "<table class=\"table is-hoverable\"><thead><tr><th> col name one </th><th> col name two </th></tr></thead><tbody><tr><td> A non&ndash;entity / </td><td> Some entities &ndash; &apos; </td></tr><tr><td> &lt; More entities &gt; </td><td> &quot;And I quote...&quot; </td></tr></tbody></table>" +
                htmlEnd,
                removeNewLineChars(
                        AntlrParser.transpileMDToHTML(
                                "| col name one | col name two |\n|-|-|\n| A non-entity / | Some entities - ' |\n| < More entities > | \"And I quote...\" |\n", ""
                        )
                )
        );
        assertEquals(
                htmlStart +
                "<figure class=\"image\"><img src=\"/directory_name/image_name.png\"></figure>" +
                htmlEnd,
                removeNewLineChars(
                        AntlrParser.transpileMDToHTML(
                                "![[image_name.png]]\n", ""
                        )
                )
        );
        assertEquals(
                htmlStart +
                "<figure class=\"image\"><img src=\"/some_path/image_name.png\"></figure>" +
                htmlEnd,
                removeNewLineChars(
                        AntlrParser.transpileMDToHTML(
                                "![[image_name.png]]\n", "/some_path/"
                        )
                )
        );
        assertEquals(
                htmlStart +
                "A sentence!" +
                htmlEnd,
                removeNewLineChars(
                        AntlrParser.transpileMDToHTML(
                                "A sentence!\n", ""
                        )
                )
        );
        assertEquals(
                htmlStart +
                "<h1> A header with html &lt; &gt; &quot; &apos; &ndash; elements</h1>" +
                htmlEnd,
                removeNewLineChars(
                        AntlrParser.transpileMDToHTML(
                                "# A header with html < > \" ' - elements\n", ""
                        )
                )
        );
        assertEquals(
                htmlStart +
                "<h1> Header</h1></p><p><ul><li> Unordered</li><li> List</li></ul></p><p>End of file." +
                htmlEnd,
                removeNewLineChars(
                        AntlrParser.transpileMDToHTML(
                                "# Header\n\n- Unordered\n- List\n\nEnd of file.\n", ""
                        )
                )
        );
        assertEquals(
                htmlStart +
                "For example:</p><p><ul><li> paragraphs<a id=\"footnote-anchor-1\" href=\"#footnote-1\">[1]</a></li><li> &quot;0 &lt; 1&quot;</li><li> &quot;2 &gt; 1&quot;</li><li> <b>and</b></li><li> <i><b>headings</b></i></li><li> <code>Code blocks</code></li></ul>" +
                htmlEnd,
                removeNewLineChars(
                        AntlrParser.transpileMDToHTML(
                                "For example:\n\n- paragraphs[^1]\n- \"0 < 1\"\n- \"2 > 1\"\n- **and**\n- ***headings***\n- `Code blocks`\n\n", ""
                        )
                )
        );
        assertEquals(
                htmlStart +
                "For example:</p><p><code>Code @ blocks</code>" +
                htmlEnd,
                removeNewLineChars(
                        AntlrParser.transpileMDToHTML(
                                "For example:\n\n`Code @ blocks`\n", ""
                        )
                )
        );
        assertEquals(
                htmlStart +
                "<h1> Introduction</h1></p><p><figure class=\"image\"><img src=\"/directory_name/image_name.png\"></figure></p><p>For example:" +
                htmlEnd,
                removeNewLineChars(
                        AntlrParser.transpileMDToHTML(
                                "# Introduction\n\n![[image_name.png]]\n\nFor example:\n", ""
                        )
                )
        );
        assertEquals(
                htmlStart +
                "<h1> Introduction</h1></p><p><h2> A Small File</h2></p><p>This is a <i>small</i> file." +
                htmlEnd,
                removeNewLineChars(
                        AntlrParser.transpileMDToHTML(
                                "# Introduction\n\n## A Small File\n\nThis is a *small* file.\n", ""
                        )
                )
        );
        assertEquals(
                htmlStart +
                "<h1> Introduction</h1></p><p><h2> A Small File</h2></p><p>This is a <i>small</i> file. It contains &ndash; neigh &ndash; requires the program to correctly translate a variety of different Obsidian Markdown elements into the HTML elements I want.</p><p><figure class=\"image\"><img src=\"/directory_name/image_name.png\"></figure></p><p>For example:</p><p><ul><li> paragraphs<a id=\"footnote-anchor-1\" href=\"#footnote-1\">[1]</a></li><li> &quot;0 &lt; 1&quot;</li><li> &quot;2 &gt; 1&quot;</li><li> <b>and</b></li><li> <i><b>headings</b></i></li><li> <code>Code blocks</code></li></ul></p><p><pre><code>fn removeCharacterFromList(remList list, charToRemove char) list {\n    match remList {\n        case x::[]:\n            match x {\n                charToRemove: []\n                _: x\n            }\n        case x::xs:\n            match x {\n                charToRemove: removeCharacterFromList(xs, charToRemove)\n                _: x::removeCharacterFromList(xs, charToRemove)\n            }\n    }\n}\n\nremoveCharacterFromList([&apos;a&apos;, &apos;b&apos;, &apos;c&apos;], &apos;a&apos;)</code></pre></p><p><h2> A table conclusion</h2></p><p>Another footnote.<a id=\"footnote-anchor-2\" href=\"#footnote-2\">[2]</a></p><p><table class=\"table is-hoverable\"><thead><tr><th> A table </th><th> must have </th><th> columns </th></tr></thead><tbody><tr><td> and rows. </td><td> which may have an arbitrary amount of content </td><td> </td></tr></tbody></table></p><p><p id=\"footnote-1\"><a href=\"#footnote-anchor-1\">[1]</a> With footnotes!</p><p id=\"footnote-2\"><a href=\"#footnote-anchor-2\">[2]</a> Pseudocode.</p>" +
                htmlEnd,
                removeNewLineChars(
                        AntlrParser.transpileMDToHTML(
                                "# Introduction\n\n## A Small File\n\nThis is a *small* file. It contains - neigh - requires the program to correctly translate a variety of different Obsidian Markdown elements into the HTML elements I want.\n\n![[image_name.png]]\n\nFor example:\n\n- paragraphs[^1]\n- \"0 < 1\"\n- \"2 > 1\"\n- **and**\n- ***headings***\n- `Code blocks`\n\n```Pseudocode\nfn removeCharacterFromList(remList list, charToRemove char) list {\n    match remList {\n        case x::[]:\n            match x {\n                charToRemove: []\n                _: x\n            }\n        case x::xs:\n            match x {\n                charToRemove: removeCharacterFromList(xs, charToRemove)\n                _: x::removeCharacterFromList(xs, charToRemove)\n            }\n    }\n}\n\nremoveCharacterFromList(['a', 'b', 'c'], 'a')\n```\n\n## A table conclusion\n\nAnother footnote.[^2]\n\n| A table | must have | columns |\n|--|--|--|\n| and rows. | which may have an arbitrary amount of content | |\n\n[^1]: With footnotes!\n[^2]: Pseudocode.\n", ""
                        )
                )
        );
    }
}