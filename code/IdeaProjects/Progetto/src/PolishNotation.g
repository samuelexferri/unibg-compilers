grammar PolishNotation;

options { 
  language = Java;
  k = 1;
}

@lexer::header{
  // package compilerPackage;
}

@header{
  // package compilerPackage;

  import util.*;
  import java.util.Hashtable;
}

@members {
  ParserEnvironment env;
  ParserSemantic sem;
 
  void init (boolean par, boolean postfissa) {
    System.out.println("Inizio l'analisi\n");
    env = new ParserEnvironment(par, postfissa);
    sem = new ParserSemantic(env);
  }
  
  public String getTranslation () {
    return env.translation.toString();
  }
    
  public Hashtable<String, Double> getVariables() {
    return env.symbolTable;
  }
}

/* This will be the entry point of our parser */
start [boolean pars, boolean postfissa]
@init { init (pars, postfissa); }
    : ( assignment )+
    ;

assignment 
    : varName=ID 
      EQ 
      exp=expression { sem.registerVar ($varName, $exp.value); 
                       sem.translateExp ($varName, $exp.value, $exp.subTranslation); }
      SC
    ;
    
/* Addition and subtraction have the lowest precedence */
expression returns [double value, String subTranslation]
    : v1=multiplyExp { $value=$v1.value; 
                       $subTranslation=$v1.subTranslation; }
       ( ADD v2=multiplyExp { $value=sem.doAdd($value, $v2.value); 
                              $subTranslation = sem.translateOp ($subTranslation, $v2.subTranslation, "+"); }
       | SUB v2=multiplyExp { $value=sem.doSub($value, $v2.value); 
                              $subTranslation = sem.translateOp ($subTranslation, $v2.subTranslation, "-"); }
       )* 
    ;

/* Multiplication and division have a higher precedence */
multiplyExp returns [double value, String subTranslation]
    : v1=atomExp { $value=$v1.value; 
                    $subTranslation = $v1.subTranslation; }
       ( MUL v2=atomExp { $value=sem.doMul($value, $v2.value); 
                          $subTranslation = sem.translateOp ($subTranslation, $v2.subTranslation, "*"); }
       | tk=DIV v2=atomExp { $value=sem.doDiv($value, $v2.value);  
                             $subTranslation = sem.translateOp ($subTranslation, $v2.subTranslation, "/"); }
       )*
    ;

/* An expression atom is the smallest part of an expression: a number. Or 
   when we encounter parenthesis, we're making a recursive call back to the
   rule 'additionExp'. As you can see, an 'atomExp' has the highest precedence */
atomExp returns [double value, String subTranslation]
    : n=INT    { $value = sem.getValue($n); 
                 $subTranslation = sem.translateValue ($n); }
    | n=FLOAT  { $value = sem.getValue($n); 
                 $subTranslation = sem.translateValue ($n); }
    | x=ID     { $value = sem.getVarValue ($x); 
                 $subTranslation = sem.translateValue ($x); }
    | LP exp=expression { $value = $exp.value; 
                          $subTranslation = $exp.subTranslation; } 
      RP
    ;

// LEXER TOKENS

SC    // Semi Colon
    : ';'
    ;

LP    // Left Parenthesis
    : '('
    ;

RP    // Right Parenthesis 
    : ')' 
    ;

EQ   
    : '=' 
    ;

ADD   
    : '+' 
    ;

SUB   
    : '-' 
    ;

MUL   
    : '*' 
    ;

DIV   
    : '/' 
    ;

INT : ('1'..'9') ('0'..'9')* | '0'
    ;

FLOAT
    :   ('1'..'9') ('0'..'9')* '.' ('0'..'9')* 
    |   '0''.' ('0'..'9')+ 
    |   '.' ('0'..'9')+ 
    ;

INTTYPE : 'INT'
;

FLOATTYPE : 'FLOAT'
;

ID  : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

WS  :   ( ' '           
        | '\t'
        | '\r'
        | '\n'
        ) {skip();  /* $channel=HIDDEN; */}
    ;
    
SCAN_ERROR   
    : . 
    ; 