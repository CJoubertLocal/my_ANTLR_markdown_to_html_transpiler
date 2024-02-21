# My ANTLR markdown to html transpiler

This repository contains Java code used to convert a subset of Markdown into HTML tags and CSS-classes for my blog. It uses [ANTLR](https://www.antlr.org/index.html) by Terrance Parr.

The grammar accounts for:

- Headers,
- Unordered lists,
- Multi-line code blocks,
- Inline code blocks,
- Images,
- Footnotes,
- Emboldened text,
- Italicised text,
- Tables,
- URLs.

Note that it is assumed that footnotes may have been added out-of-order, such that the footnote number '2' may appear before '1' in the text. In-text footnotes are renumbered from 1 onwards, and the footnotes at the end of the document are reordered to match.

The grammar allows for some characters which would normally indicate the start of a new parser rule to appear in other rules. For example, '!' is both used to indicate that tokens for an image may be present, but is also allowed within a header.
