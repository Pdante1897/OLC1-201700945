package proyecto.analizadores;
import java_cup.runtime.*;
%%

%class Lexico
%public 
%line 
%char 
%cup 
%unicode
%ignorecase

%init{ 
	yyline = 1; 
	yychar = 1; 
%init} 


blancos = [ \t\r\n]+
letra = [a-zA-Z]
digito = [0-9]+
caracter = ["("|")"|"/"|"!"|"#"|"$"|"&"|"'"|"@"|"`"|"<"|"["|"]"|"^"|"_"|"\\"]+
cadena = (\"([^\"\\\n]|\\.)*\")
identificador = {letra}({letra}|"_"|{digito})*
comentariolinea = ("//".*\n)|("//".*\r)
cmultilinea = ("/""*"[^\!]*"*""/") 
%{
%}

%%
\n {yycolumn=1;}
"+" {return new Symbol(sym.suma,yycolumn,yyline,yytext());}
"*" {return new Symbol(sym.por,yycolumn,yyline,yytext());}
"|" {return new Symbol(sym.disyuncion,yycolumn,yyline,yytext());}
"." {return new Symbol(sym.punto,yycolumn,yyline,yytext());}
"¿" {return new Symbol(sym.interrogacionA,yycolumn,yyline,yytext());}
"?" {return new Symbol(sym.interrogacionC,yycolumn,yyline,yytext());}
//
"-" {return new Symbol(sym.resta,yycolumn,yyline,yytext());}
"," {return new Symbol(sym.coma,yycolumn,yyline,yytext());}
"~" {return new Symbol(sym.colocho,yycolumn,yyline,yytext());}
"%" {return new Symbol(sym.porcentaje,yycolumn,yyline,yytext());}
":" {return new Symbol(sym.dospuntos,yycolumn,yyline,yytext());}
";" {return new Symbol(sym.puntocoma,yycolumn,yyline,yytext());}
">" {return new Symbol(sym.mayor,yycolumn,yyline,yytext());}
"}" {return new Symbol(sym.cllave,yycolumn,yyline,yytext());}
"{" {return new Symbol(sym.allave,yycolumn,yyline,yytext());}
//ESPECIALES
"\\n" {return new Symbol(sym.salto,yycolumn,yyline,yytext());}
"\\'" {return new Symbol(sym.comillasimple,yycolumn,yyline,yytext());}
"\\\"" {return new Symbol(sym.comillasd,yycolumn,yyline,yytext());}
//inicio y fin
"INICIO" {return new Symbol(sym.inicio,yycolumn,yyline,yytext());}
"FIN" {return new Symbol(sym.fin,yycolumn,yyline,yytext());}
//condicion Si o if
"SI" {return new Symbol(sym.si,yycolumn,yyline,yytext());}
"ENTONCES" {return new Symbol(sym.entonces,yycolumn,yyline,yytext());}
"DE_LO_CONTRARIO" {return new Symbol(sym.de_lo_contrario,yycolumn,yyline,yytext());}
"O_SI" {return new Symbol(sym.o_si,yycolumn,yyline,yytext());}
"FIN_SI" {return new Symbol(sym.fin_si,yycolumn,yyline,yytext());}
//condicion Segun o case switch 
"SEGUN" {return new Symbol(sym.segun,yycolumn,yyline,yytext());}
"HACER" {return new Symbol(sym.hacer,yycolumn,yyline,yytext());}
"FIN_SEGUN" {return new Symbol(sym.fin_segun,yycolumn,yyline,yytext());}
//ciclo para o for
"PARA" {return new Symbol(sym.para,yycolumn,yyline,yytext());}
"HASTA" {return new Symbol(sym.hasta,yycolumn,yyline,yytext());}
"CON" {return new Symbol(sym.con,yycolumn,yyline,yytext());}
"PASITO" {return new Symbol(sym.pasito,yycolumn,yyline,yytext());}
"FIN_PARA" {return new Symbol(sym.fin_para,yycolumn,yyline,yytext());}
//ciclo mientras o while
"MIENTRAS" {return new Symbol(sym.mientras,yycolumn,yyline,yytext());}
"FIN_MIENTRAS" {return new Symbol(sym.fin_mientras,yycolumn,yyline,yytext());}
//cliclo repetir hasta o do while
"REPETIR" {return new Symbol(sym.repetir,yycolumn,yyline,yytext());}
"HASTA_QUE" {return new Symbol(sym.hasta_que,yycolumn,yyline,yytext());}
//retornar o return
"RETORNAR" {return new Symbol(sym.retornar,yycolumn,yyline,yytext());}
//metodo 
"METODO" {return new Symbol(sym.metodo,yycolumn,yyline,yytext());}
"FIN_METODO" {return new Symbol(sym.fin_metodo,yycolumn,yyline,yytext());}
//funciones
"FUNCION" {return new Symbol(sym.funcion,yycolumn,yyline,yytext());}
"FIN_FUNCION" {return new Symbol(sym.fin_funcion,yycolumn,yyline,yytext());}
//llamada de funciones y metodos
"EJECUTAR" {return new Symbol(sym.ejecutar,yycolumn,yyline,yytext());}


{cadena} {return new Symbol(sym.cadena,yycolumn,yyline,yytext());}
{identificador} {return new Symbol(sym.identificador,yycolumn,yyline,yytext());}
{digito} {return new Symbol(sym.digito,yycolumn,yyline,yytext());}
{caracter} {return new Symbol(sym.caracter,yycolumn,yyline,yytext());}
{blancos} {/*Se ignoran*/} // Espacios en Blanco
{comentariolinea} {/*Se ignoran*/}
{cmultilinea} {/*Se ignoran*/}
. {
   // JOptionPane.showMessageDialog(null, "Se Encontraron Errores Lexicos");
  // System.err.println("Error lexico: "+yytext()+ " Linea:"+(yyline)+" Columna:"+(yycolumn));
    //ErrorLexicoySintactico.listaerrores.add(new ErrorLexicoySintactico("Error Lexico", "El caracter :"+yytext()+"no pertenece al lenguaje",  (yyline), (yycolumn)));
     //ErrorLexicoySintactico.contadorerror++;
  }