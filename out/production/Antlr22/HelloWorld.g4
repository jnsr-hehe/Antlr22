grammar Calc;
sum: product (PLUS product)*;
product: NUMBER (MUL NUMBER)*;
NUMBER: [0-9]+;
MUL: '*';
PLUS: '+';
WS: [ \t\r\n]+ -> skip;