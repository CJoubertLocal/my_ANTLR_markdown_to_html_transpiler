grammar myMDToHTML;

/*
 * Parser Rules
 */

mdfile                  : sentence+ EOF ;

sentence                : markdownItem+  NEWLINE+ ;

markdownItem            : header
                        | codeBlock
                        | italicsAndBold
                        | bold
                        | italics
                        | footnote
                        | table
                        | image
                        | list
                        | link
                        | exclamationMark
                        | default+
                        ;

header                  : '#'+ (pound | exclamationMark | default)+ ;

codeBlock               : '```' WORD NEWLINE codeBlockLine+ '```'                          # multilineCodeBlock // have all backquotes within a single string to avoid a mix-up with an inline code block
                        | ('``' | '`' (default | verticalLine | pound | asterisk | exclamationMark)+ '`')    # inlineCodeBlock
                        ;

italicsAndBold          : '*' '*' '*' boldItalicsInterior+ '*' '*' '*' ;

bold                    : '*' '*' boldItalicsInterior+ '*' '*' ;

italics                 : '*' boldItalicsInterior+ '*' ;

footnote                : '[' '^' NUMBER ']' ':' footnoteSentence                            # endOfFileFootnote
                        | '[' '^' NUMBER ']'                                                 # inlineFootnote
                        ;

image                   : '!' '[' '[' imageName ']' ']' ;

list                    : ('-' listLine)+ ;

listLine                : (codeBlock | italicsAndBold | bold | italics | footnote | link | exclamationMark | default)+ NEWLINE ;
// The NEWLINE here requires that all lists at the end of a file have two NEWLINES if immediately before EOF. Otherwise, one NEWLINE before a new markdown item.
table                   : tableHeader tableBorder tableBodyRow+ ;

tableHeader             : '|' (tableHeaderCell+ '|')+ NEWLINE ;

tableBorder             : '|' ('-'+ '|')+ NEWLINE ;

tableBodyRow            : '|' (tableCell '|')+ NEWLINE? ;

tableHeaderCell         : default+ ;

tableCell               : default+ ;

link                    : linkStart linkEnd ;

linkStart               : '[' default+ ']' ;

linkEnd                 : '(' default+ ')' ;

default                 : WORD
                        | NUMBER
                        | WHITESPACE
                        | ':'
                        | '-'
                        | '"'
                        | '\''
                        | '<'
                        | '>'
                        | '('
                        | ')'
                        | '{'
                        | '}'
                        | '['
                        | ']'
                        | ','
                        | '.'
                        | '_'
                        | ';'
                        | '/'
                        | '?'
                        | '='
                        | '@'
                        | '‘'
                        | '’'
                        | '+'
                        | '\\'
                        | '&'
                        | '%'
                        ;

footnoteSentence        : (italicsAndBold | bold | italics | pound | exclamationMark | dash | default)+  NEWLINE* ;
// '#' included for urls

imageName               : (WORD | NUMBER | WHITESPACE | '_')+ '.' WORD+ ;

codeBlockLine           : (verticalLine | asterisk | pound | exclamationMark | backquote | carat | default)* NEWLINE ;

boldItalicsInterior     : default
                        | pound
                        | verticalLine
                        | dash
                        | carat
                        | exclamationMark
                        ;

pound                   : '#' ;

verticalLine            : '|' ;

asterisk                : '*' ;

dash                    : '-' ;

backquote               : '`' ;

carat                   : '^' ;

exclamationMark         : '!' ;

/*
 * Lexer Rules
 */

NUMBER                  : [0-9]+ ;

WORD                    : ([a-zA-Z] | '_')+ ;

WHITESPACE              : (' ' | '\t') ;

NEWLINE                 : ('\r'? '\n' | '\r') ; // multi-line code blocks require new lines to be kept separate.

WORDNUMBERWHITESPACE    : WORD
                        | NUMBER
                        | WHITESPACE
                        ;
