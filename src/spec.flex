// import sekcija

%%

// sekcija opcija i deklaracija
%class MPLexerLab17727
%function next_token
%line
%column
%debug
%type Yytoken

%eofval{
return new Yytoken( sym.EOF, null, yyline, yycolumn);
%eofval}

%{
//dodatni clanovi generisane klase
KWTable kwTable = new KWTable();
Yytoken getKW()
{
	return new Yytoken( kwTable.find( yytext() ),
	yytext(), yyline, yycolumn );
}
%}

//stanja
%xstate KOMENTAR
//makroi
slovo = [a-zA-Z]
cifra = [0-9]

%%

// pravila
\% { yybegin( KOMENTAR ); }
<KOMENTAR>~\% { yybegin( YYINITIAL ); }

[\t\n\r ] { ; }
\( { return new Yytoken( sym.LEFTPAR, yytext(), yyline, yycolumn ); }
\) { return new Yytoken( sym.RIGHTPAR, yytext(), yyline, yycolumn ); }
\{ { return new Yytoken( sym.LEFTCURLYPAR, yytext(), yyline, yycolumn ); }
\} { return new Yytoken( sym.RIGHTCURLYPAR, yytext(), yyline, yycolumn ); }

//operatori
\|\| { return new Yytoken( sym.OR,yytext(), yyline, yycolumn ); }
\&& { return new Yytoken( sym.AND,yytext(), yyline, yycolumn ); }
\< { return new Yytoken( sym.LOWER,yytext(), yyline, yycolumn ); }
\<= { return new Yytoken( sym.LOWEROREQUAL,yytext(), yyline, yycolumn ); }
== { return new Yytoken( sym.EQUAL,yytext(), yyline, yycolumn ); }
\!= { return new Yytoken( sym.NOTEQUAL,yytext(), yyline, yycolumn ); }
> { return new Yytoken( sym.GREATER,yytext(), yyline, yycolumn ); }
>= { return new Yytoken( sym.GREATEROREQUAL,yytext(), yyline, yycolumn ); }

//separatori
; { return new Yytoken( sym.SEMICOLON, yytext(), yyline, yycolumn ); }
, { return new Yytoken( sym.COMMA, yytext(), yyline, yycolumn ); }

true|false { return new Yytoken( sym.CONST,yytext(), yyline, yycolumn ); }
//kljucne reci
{slovo}+ { return getKW(); }

//identifikatori
({slovo}|_)({slovo}|{cifra}|_)* { return new Yytoken(sym.ID, yytext(),yyline, yycolumn ); }

//konstante
0#(o|x|d){cifra}+ { return new Yytoken( sym.CONST, yytext(), yyline, yycolumn ); }
0\.{cifra}+(E(\+|-){cifra}+) { return new Yytoken( sym.CONST,yytext(), yyline, yycolumn ); }
'[^]' { return new Yytoken( sym.CONST,yytext(), yyline, yycolumn ); }

//obrada gresaka
. { if (yytext() != null && yytext().length() > 0) System.out.println( "ERROR: " + yytext() ); }