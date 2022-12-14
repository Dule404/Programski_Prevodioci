// import sekcija
import java_cup.runtime.*;

%%

// sekcija opcija i deklaracija
%class MPLexer

%cup

%line
%column

%eofval{
return new Symbol( sym.EOF );
%eofval}

%{
   public int getLine()
   {
      return yyline;
   }
%}

//stanja
%xstate KOMENTAR
//makroi
slovo = [a-zA-Z]
dcifra = [0-9]
hcifra = [0-9A-Fa-f]
ocifra = [0-7]

%%

// pravila
\% { yybegin( KOMENTAR ); }
<KOMENTAR>~\% { yybegin( YYINITIAL ); }

[\t\n\r ] { ; }

\( { return new Symbol( sym.LEFTPAR ); }
\) { return new Symbol( sym.RIGHTPAR ); }
\{ { return new Symbol( sym.LEFTCURLYPAR ); }
\} { return new Symbol( sym.RIGHTCURLYPAR ); }

//operatori
\|\| { return new Symbol( sym.OR ); }
\&& { return new Symbol( sym.AND ); }
\< { return new Symbol( sym.LOWER ); }
\<= { return new Symbol( sym.LOWEROREQUAL ); }
== { return new Symbol( sym.EQUAL ); }
\!= { return new Symbol( sym.NOTEQUAL ); }
> { return new Symbol( sym.GREATER ); }
>= { return new Symbol( sym.GREATEROREQUAL ); }
= { return new Symbol( sym.ASSIGN ); }

//separatori
; { return new Symbol( sym.SEMICOLON ); }
, { return new Symbol( sym.COMMA ); }

true|false { return new Symbol( sym.BOOLCONST ); }

//kljucne reci
"main" { return new Symbol( sym.MAIN ); }
"int" { return new Symbol( sym.INT ); }
"char" { return new Symbol( sym.CHAR ); }
"float" { return new Symbol( sym.FLOAT ); }
"bool" { return new Symbol( sym.BOOL ); }
"loop" { return new Symbol( sym.LOOP ); }
"redo" { return new Symbol( sym.REDO ); }

//identifikatori
({slovo}|_)({slovo}|{dcifra}|_)* { return new Symbol(sym.ID ); }

//konstante
{dcifra}+ { return new Symbol( sym.INTCONST ); }
0#(o{ocifra}+|x{hcifra}+|d{dcifra}+) { return new Symbol( sym.INTCONST ); }
0\.{dcifra}+(E(\+|-){dcifra}+) { return new Symbol( sym.FLOATCONST ); }
'[^]' { return new Symbol( sym.CHARCONST ); }

//obrada gresaka
.  { System.out.println( "ERROR: " + yytext() ); }