grammar OpenWeatherMapAPI;

options {
	language = Java;
	k = 1; // Compilatore con prospettiva 1
}

@lexer::header {
	//package myCompiler;
}

@lexer::members {
	int prova1;
}

@header {
	//package myCompiler;
}

@members {
	int prova2;
}

// Qui inizia la specifica del parser
myStartExample
	: mainblock
	;

mainblock
	: GO (block)* GC ;
	
block
	: stringa DUEP sublock VIRG?; // TODO: L'ultimo blocco non ha la virgola (sia quelli grossi che innestati)
	
stringa
	: VIRGUP NAME VIRGUP;

sublock
	: INT | FLOAT | stringa | (QO? GO (block)+ GC QC?) ;

	
/*
expression
	: atom (x=OP {System.out.println("Ho trovato questa operazione: \t" + $x.getText());} atom)* ;


atom
	: 	( INT
		| FLOAT
		| ID
		| LP expression RP
		)
	;
*/


// SYNTAX RULES
/*
COORD 
	:	'coord';
WEATHER 
	:	'weather';
MAIN
	:	'main';
WIND 
	:	'wind';
CLOUDS 
	:	'clouds';
SYS
	:	'sys';
*/

// Qui inizia la specifica del lexer
GO	: '{' ;

GC	: '}' ;

QO	: '[' ;

QC	: ']' ;
    
VIRG	: ',' ;

VIRGUP	: '"' ;

DUEP	: ':' ;

NAME  :	(('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|INT|' '|'_')*) | (INT ('a'..'z'|'A'..'Z'|' '|'_') ('a'..'z'|'A'..'Z'|INT|' '|'_')*) ; // TODO: Non possono essre finali underscore o spazio, Possono essere solo da una lista

INT :	'0'..'9'+
    ;
    
    


	
	

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

ERROR_TOKEN
	: . {$channel=HIDDEN;}
	;