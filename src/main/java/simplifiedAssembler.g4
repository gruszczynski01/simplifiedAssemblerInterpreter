grammar simplifiedAssembler;
parser_rule: (INT_RULE | push_rule | mov_rule | xor_rule) EOL;
INT_RULE: ('int 0x80' | 'INT 0x80');
push_rule: PUSH exp;
mov_rule: MOV exp SEPARATOR REGISTER;
xor_rule: XOR exp SEPARATOR REGISTER;
exp: exp PLUS term | exp MINUS term | term;
term: term MULTIPY factor | factor;
factor: L_BRACKET exp P_BRACKET | value;
value: DIGIT | REGISTER;
PUSH: ('push ' | 'PUSH ');
MOV: ('mov ' | 'MOV ');
XOR: ('xor ' | 'XOR ');
PLUS: '+';
MINUS: '-';
DIGIT: [0-9]+;
SEPARATOR: ',';
MULTIPY: '*';
L_BRACKET: '(';
P_BRACKET: ')';
REGISTER: ('%eax' | '%ebx' | '%ecx' | '%edx' | '%EAX' | '%EBX' | '%ECX' | '%EDX');
EOL: '\n';
WS: (' ' | '\t' | EOL) -> skip;
