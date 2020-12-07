grammar C_MIPS;

options {
	language = Java;
	k = 1; // Compilatore con prospettiva 1
}

@lexer::header {
	//package myCompiler;
}

@lexer::members {
	int nErrori = 0;
	
	void printMsg () {
		nErrori++;
		System.out.println("Numero errori Trovati: \t" + nErrori);
	}
}

@header {
	//package myCompiler;
}

@members {
	// int test;
}




//PARSER
start	: INCLUDE? (VOID function SEMICOL | type_name identifier (((global_var | vector_globals)? SEMICOL) | function) )* EOF
				;

global_var : (ASS type_value)  
				;
				
vector_globals 	: LBRACK INT? RBRACK ( ASS ((LCURL (INT|FLOAT|CHAR)(COMMA (INT|FLOAT|CHAR))* RCURL) | (INT|FLOAT|CHAR)))?
				;

				
function : LPAREN (type_name identifier (COMMA type_name identifier)*)? RPAREN codeblock
				;

call_function 	:  LPAREN ( identifier (COMMA  identifier)*)? RPAREN
				;

vector 	:	LBRACK INT? RBRACK ( ASS ((LCURL (INT|FLOAT|CHAR)(COMMA (INT|FLOAT|CHAR))* RCURL) | (INT|FLOAT|CHAR)))? 
				;
				
codeblock : LCURL (statement SEMICOL)*  RCURL   
	    | SEMICOL				
				;
 
statement 		: type_name? identifier (assignment |call_function |vector )
			  |RETURN valore 

			;
						
assignment		: (SUB | ADD | MULT | DIV)? (ASS type_value)?
			;

type_name		: (K_INT | K_FLOAT| K_CHAR)
				; 
				
identifier		: WORD | CHAR 
				;

type_value		: (INT | FLOAT | expression)
	
				;

expression 
    : multiplyExp ( ADD multiplyExp  | SUB multiplyExp  )* 
    ;
    
multiplyExp 
    : atomExp ( MULT atomExp  | DIV atomExp  )*
    ;

atomExp : 
	INT    
    | FLOAT  
    | identifier     
    | LPAREN expression RPAREN
    ;


valore 	:  (INT | identifier)
				;



//LEXER

INCLUDE	: '#include <stdio.h>' | '#include <stdlib.h>';

fragment DIGIT	: '0'..'9' ;
fragment DIGIT_NO_ZERO	: '1'..'9' ;
fragment UNDRSCR: '_' ;
fragment SPACE	: ' ' ;
fragment TAB	: '\t';
fragment NEWL   : '\n';
fragment SLASHR : '\r';

WS : (
	SPACE 
	| TAB 
	| NEWL 
	| SLASHR) {$channel=HIDDEN;};

K_INT			: 'int' ;
K_FLOAT			: 'float' ;
K_CHAR			: 'char' ;

VOID 			: 'void' ;
WHILE 	 		: 'while' ;
FOR 			: 'for' ;
IF 			: 'if' ;
ELSE 			: 'else' ;
RETURN 			: 'return' ;
EQ 			: '==' ;
NEQ			: '!=' ;
GT 			: '>' ;
LT 			: '<' ;
GE			: '>=' ;
LE 			: '<=' ;
ADD 			: '+' ;
SUB 			: '-' ;
MULT 			: '*' ;
DIV 			: '/' ;
ASS 			: '=' ;
LPAREN    		: '(' ;
RPAREN 			: ')' ;
LBRACK 			: '[' ;
RBRACK   		: ']' ;
LCURL 			: '{' ;
RCURL 			: '}' ;
SEMICOL			: ';' ;
DOT 			: '.';
ARROW 			: '->' ;
S_QUOTE 		: '\'' ;
D_QUOTE 		: '"' ;
COMMA			: ',' ;
AMP      		: '&' ;

INT			: DIGIT_NO_ZERO DIGIT* ;
FLOAT			: DIGIT+ DOT DIGIT+ ;
CHAR 			: ('a'..'z' | 'A'..'Z')
			;

WORD 			: CHAR ('a'..'z' | 'A'..'Z' | UNDRSCR | DIGIT)+ ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

TOKEN_ERROR		: . {printMsg();} ;











