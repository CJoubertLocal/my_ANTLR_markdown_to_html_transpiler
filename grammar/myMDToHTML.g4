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
                        | default+
                        ;

header                  : '#'+ (pound | default)+ ;

codeBlock               : '```' WORD NEWLINE codeBlockLine+ '```'                          # multilineCodeBlock // have all backquotes within a single string to avoid a mix-up with an inline code block
                        | ('``' | '`' (default | verticalLine | pound | asterisk)+ '`')    # inlineCodeBlock
                        ;

italicsAndBold          : '*' '*' '*' (default | dash)+ '*' '*' '*' ;

bold                    : '*' '*' (default | dash)+ '*' '*' ;

italics                 : '*' (default | dash)+ '*' ;

footnote                : '[' '^' NUMBER ']' ':' footnoteSentence                            # endOfFileFootnote
                        | '[' '^' NUMBER ']'                                                 # inlineFootnote
                        ;

image                   : '!' '[' '[' imageName ']' ']' ;

list                    : ('-' listLine)+ ;

listLine                : (codeBlock | italicsAndBold | bold | italics | footnote | link | default)+ NEWLINE ;
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
                        | '!'
                        | '.'
                        | '_'
                        | ';'
                        | '/'
                        | '?'
                        | '='
                        | '!'
                        | '@'
                        | '‘'
                        | '’'
                        | '+'
                        | '\\'
                        | '&'
                        | '%'
                        ;

footnoteSentence        : (italicsAndBold | bold | italics | pound | default)+  NEWLINE* ;
// '#' included for urls

imageName               : (WORD | '_')+ '.' WORD+ ;

codeBlockLine           : (default | verticalLine | asterisk | pound | backquote | carat)* NEWLINE ;

pound                   : '#' ;

verticalLine            : '|' ;

asterisk                : '*' ;

dash                    : '-' ;

backquote               : '`' ;

carat                   : '^' ;

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
