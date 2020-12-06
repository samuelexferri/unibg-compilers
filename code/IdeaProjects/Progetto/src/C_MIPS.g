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
start	: INCLUDE? (type_name identifier ((global_var? SEMICOL) | function) )* EOF
				;

global_var : (ASS type_value) 
				;
				
function : LPAREN (type_name identifier (COMMA type_name identifier)*)? RPAREN codeblock
				;
				
codeblock : LCURL (assignment SEMICOL)* RETURN valore SEMICOL RCURL   
	    | SEMICOL				
				;
 
						
assignment		: type_name? identifier (MIN | PLUS | MULT | DIV)? (ASS type_value)?
			;

type_name		: (K_INT | K_FLOAT| K_CHAR)
				; 
				
identifier		: WORD 
				;

type_value		: (INT | FLOAT)
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
PLUS 			: '+' ;
MIN 			: '-' ;
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
ARROW 			: '->' ;
S_QUOTE 		: '\'' ;
D_QUOTE 		: '"' ;
COMMA			: ',' ;
AMP      		: '&' ;

INT			: DIGIT_NO_ZERO DIGIT* ;
FLOAT			: DIGIT+ COMMA DIGIT+ ;

WORD 			: ('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | UNDRSCR | DIGIT)* ;



TOKEN_ERROR		: . {printMsg();} ;











