grammar myMDToHTML;

/*
 * Parser Rules
 */

mdfile                  : sentence+ EOF ;

sentence                : markdownItem+  NEWLINE* ;

markdownItem            : header
                        | codeBlock
                        | italicsAndBold
                        | bold
                        | italics
                        | footnote
                        | table
                        | image
                        | list
                        | default+
                        ;

header                  : '#'+ (pound | default)+ NEWLINE ;

codeBlock               : '```' WORD NEWLINE codeBlockLine+ '```'                # multilineCodeBlock // have all backquotes within a single string to avoid a mix-up with an inline code block
                        | ('``' | '`' default+ '`')                              # inlineCodeBlock
                        ;

italicsAndBold          : '*' '*' '*' (WORD | NUMBER | WHITESPACE)+ '*' '*' '*' ;

bold                    : '*' '*' (WORD | NUMBER | WHITESPACE)+ '*' '*' ;

italics                 : '*' (WORD | NUMBER | WHITESPACE)+ '*' ;

footnote                : '[' '^' NUMBER ']' ':' footnoteSentence                            # endOfFileFootnote
                        | '[' '^' NUMBER ']'                                                 # inlineFootnote
                        ;

image                   : '!' '[' '[' imageName ']' ']' ;

list                    : NEWLINE+ ('-' listLine)+ NEWLINE ;

listLine                : (codeBlock | italicsAndBold | bold | italics | footnote | default)+ NEWLINE* ;

table                   : tableHeader tableBorder tableBodyRow+ ;

tableHeader             : '|' (tableHeaderCell+ '|')+ NEWLINE ;

tableBorder             : '|' ('-'+ '|')+ NEWLINE ;

tableBodyRow            : '|' (tableCell '|')+ NEWLINE ;

tableHeaderCell         : default+ ;

tableCell               : default+ ;

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
                        | '!'
                        | '.'
                        | '_'
                        | ';'
                        | '/'
                        | '?'
                        | '='
                        | '!'
                        ;

footnoteSentence        : (italicsAndBold | bold | italics | pound | default)+  NEWLINE* ;
// '#' included for urls

imageName               : (WORD | '_')+ '.' WORD+ ;

codeBlockLine           : (default | verticalLine | asterisk)* NEWLINE ;

pound                   : '#' ;

verticalLine            : '|' ;

asterisk                : '*' ;
// '|'? is to prevent a conflict between a directory structure in a code block, and a table.
// redundant omment now that default has '|'

/*
 * Lexer Rules
 */

NUMBER                  : DIGITS+ ;

WORD                    : (UPPERCASE | LOWERCASE | '_')+ ;

WHITESPACE              : (' ' | '\t') ;

NEWLINE                 : ('\r'? '\n' | '\r') ; // multi-line code blocks require new lines to be kept separate.

WORDNUMBERWHITESPACE    : WORD
                        | NUMBER
                        | WHITESPACE
                        ;

POUND                   : '#' ;

fragment LOWERCASE      : [a-z] ;
fragment UPPERCASE      : [A-Z] ;
fragment DIGITS         : [0-9] ;