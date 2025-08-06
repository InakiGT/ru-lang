grammar Ru;

programa
 : bloque EOF
 ;

bloque
 : sentencia*
 ;

sentencia
 : asignacion 
 | sentencia_if
 | sentencia_while
 | sentencia_funcion
 | sentencia_for
 | imprimir
 | llamada_funcion
 | OTRO {System.err.println("caracter desconocido: " + $OTRO.text);}
 ;

asignacion
 : ID ASIGNA expr PTOCOMA
 ;

sentencia_if
 : IF bloque_condicional (ELSE IF bloque_condicional)* (ELSE bloque_de_sentencia)?
 ;

bloque_condicional
 : APAR expr CPAR bloque_de_sentencia
 ;

bloque_de_sentencia
 : ALLAVE bloque CLLAVE
 | sentencia
 ;

sentencia_while
 : WHILE expr bloque_de_sentencia
 ;

 sentencia_for
 : FOR APAR asignacion expr PTOCOMA asignacion CPAR bloque_de_sentencia
 ;

 sentencia_funcion
 : FUNC ID APAR (ID ':' TIPO (',' ID ':' TIPO)*)? CPAR (':' TIPO)?  bloque_de_sentencia_func
 ;

 bloque_de_sentencia_func
 : ALLAVE bloque_func CLLAVE
 ;

 bloque_func
 : sentencia* (RETURN expr PTOCOMA)?
 ;

 
imprimir
 : IMPRIMIR expr PTOCOMA
 ;

llamada_funcion
 : ID APAR (expr (',' expr)*)? CPAR PTOCOMA
 ;


expr
 : expr POW<assoc=right> expr                      # powExpr
 | MENOS expr                                      # MenosUnarioExpr
 | llamada_funcion                                 # llamadaFuncionExpr                                
 | NOT expr                                        # notExpr
 | expr op=(MULT | DIV | MOD) expr                 # multiplicacionExpr
 | expr op=(MAS | MENOS) expr                      # aditivaExpr
 | expr op=(MAYIG | MENIG | MENORQ | MAYORQ) expr  # relacionalExpr
 | expr op=(IGUAL | DIFQ) expr                     # igualdadExpr
 | expr AND expr                                   # andExpr
 | expr OR expr                                    # orExpr
 | LOG expr PTOCOMA                                # logExpr
 | atomo                                           # atomExpr
 ;

atomo
 : APAR expr CPAR # parExpr
 | (INT | FLOAT)  # numberAtom
 | (TRUE | FALSE) # booleanAtom
 | ID             # idAtom
 | STRING         # stringAtom
 | NIL            # nilAtom
 ;

OR : '||';
AND : '&&';
IGUAL : '==';
DIFQ : '!=';
MAYORQ : '>';
MENORQ : '<';
MENIG : '<=';
MAYIG : '>=';
MAS : '+';
MENOS : '-';
MULT : '*';
DIV : '/';
MOD : '%';
POW : '^';
NOT : '!';

PTOCOMA : ';';
ASIGNA : '=';
APAR : '(';
CPAR : ')';
ALLAVE : '{';
CLLAVE : '}';

TRUE : 'true';
FALSE : 'false';
NIL : 'nil';
IF : 'if';
ELSE : 'else';
WHILE : 'while';
FOR : 'for';
LOG : 'log';
FUNC: 'func';
RETURN: 'return';

IMPRIMIR : 'imprime';

TIPO 
 : 'float' 
 | 'int' 
 | 'string' 
 | 'bool' 
 ;

ID
 : [a-zA-Z_] [a-zA-Z_0-9]*
 ;

INT
 : [0-9]+
 ;

FLOAT
 : [0-9]+ '.' [0-9]* 
 | '.' [0-9]+
 ;

STRING
 : '"' (~["\r\n] | '""')* '"'
 ;
COMENTARIO
 : '#' ~[\r\n]* -> skip
 ;
ESPACIO
 : [ \t\r\n] -> skip
 ;
OTRO
 : . 
 ;
