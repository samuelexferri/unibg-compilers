grammar C_MIPS;

options {
	language = Java;
	k = 1; // Compilatore con prospettiva 1
}

@lexer::header {
	// package myCompiler;
}

@lexer::members {
	int nErrori = 0;
	
	void printMsg () {
		nErrori++;
		System.out.println("Numero errori Trovati: \t" + nErrori);
	}
}

@header {
	// package myCompiler;
}

@members {
	// int test;
}



// PARSER
start			: INCLUDE? ( VOID identifier function | type_name? (puntator SEMICOL | identifier ((((variable_ass? (COMMA identifier variable_ass?)*) | vector) SEMICOL) | function)))* EOF
				;

variable_ass 	: ASS (expression | AMP identifier) // Gestisce anche l'indirizzo puntato
				;
				
vector 			: LBRACK INT? RBRACK (ASS ((LCURL expression (COMMA expression)* RCURL) | expression))?
				;
				
puntator		: MULT identifier (ASS ((AMP identifier) | (expression)))? 
				;
					
function 		: LPAREN (type_name identifier (COMMA type_name identifier)*)? RPAREN codeblock
				;

call_function 	: LPAREN (((D_QUOTE anything* D_QUOTE) | identifier) (COMMA ((D_QUOTE anything* D_QUOTE) | identifier))*)? RPAREN
				;
				
anything		: INT | FLOAT | CHAR | WORD | IF | WHILE | FOR | PERC | SPACE | ADD | SUB | MULT | DIV | AMP | HASHTAG | ASS | WS // TODO
				;
				
codeblock 		: LCURL (statement)* RCURL   
	    		| SEMICOL // SEMICOL di function	
				;

statement 		: type_name? (identifier (assignment | call_function | vector) | puntator) SEMICOL
				| ifStat
				| whileStat
				| forStat
			  	| RETURN value SEMICOL 
			  	;
			  	
ifStat			: IF LPAREN (expression compare expression) RPAREN codeblock (ELSE (codeblock | ifStat | whileStat))? // TODO: Operatori logici
				;
				
whileStat		: WHILE LPAREN (expression compare expression) RPAREN codeblock
				;
				
forStat			: FOR LPAREN (type_name? identifier ASS expression) SEMICOL (identifier compare expression) SEMICOL (identifier compare expression) RPAREN codeblock 
				;
				
assignment		: ((ADD | SUB | MULT | DIV)? ASS (expression | AMP identifier))?
				;

type_name		: (K_INT | K_FLOAT | K_CHAR)
				; 
				
identifier		: (WORD | CHAR)
				;

expression 		: multiply_exp (ADD multiply_exp | SUB multiply_exp)* 
    			;
    
multiply_exp 	: atom_exp (MULT atom_exp | DIV atom_exp)*
    			;

atom_exp 		: INT
				| FLOAT  
				| CHAR_QUOTE
				| identifier (LBRACK INT RBRACK)? // Variable or Vector   
    			| LPAREN expression RPAREN
    			;

value 			: (INT | (MULT | AMP)? identifier)
				;

compare			: EQ | NEQ | LT | GT | LE | GE | ((ADD | SUB | MULT | DIV)? ASS) // TODO: ASS negli If
				;
				
			

// LEXER

INCLUDE	: '#include <stdio.h>' | '#include <stdlib.h>';

fragment DIGIT	: '0'..'9' ;
fragment DIGIT_NO_ZERO	: '1'..'9' ;
fragment UNDRSCR: '_' ;
fragment SPACE	: ' ' ;
fragment TAB	: '\t';
fragment NEWL   : '\n';
fragment SLASHR : '\r';

WS 	: ( SPACE 
	| TAB 
	| NEWL 
	| SLASHR 
	){$channel=HIDDEN;}
	;

K_INT		: 'int' ;
K_FLOAT		: 'float' ;
K_CHAR		: 'char' ;

VOID 		: 'void' ;
WHILE 	 	: 'while' ;
FOR 		: 'for' ;
IF 			: 'if' ;
ELSE 		: 'else' ;
RETURN 		: 'return' ;

EQ 			: '==' ;
NEQ			: '!=' ;
GT 			: '>' ;
LT 			: '<' ;
GE			: '>=' ;
LE 			: '<=' ;

ADD 		: '+' ;
SUB 		: '-' ;
MULT 		: '*' ;
DIV 		: '/' ;
ASS 		: '=' ;
LPAREN    	: '(' ;
RPAREN 		: ')' ;
LBRACK 		: '[' ;
RBRACK   	: ']' ;
LCURL 		: '{' ;
RCURL 		: '}' ;
SEMICOL		: ';' ;
DOT 		: '.' ; // Float
ARROW 		: '->' ; // Arrow
S_QUOTE 	: '\'' ;
D_QUOTE 	: '"' ;
COMMA		: ',' ;
AMP      	: '&' ;
PERC		: '%' ;
HASHTAG		: '#' ;

INT			: DIGIT_NO_ZERO DIGIT* | '0' ;
FLOAT		: DIGIT+ DOT DIGIT+ ;
CHAR 		: ('a'..'z' | 'A'..'Z') ;
CHAR_QUOTE	: S_QUOTE ('a'..'z' | 'A'..'Z') S_QUOTE ;

WORD 		: CHAR ('a'..'z' | 'A'..'Z' | UNDRSCR | DIGIT)+ ;

COMMENT		: '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    		| '/*' (options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
 			;

TOKEN_ERROR	: . {printMsg();} ;