package proyecto.analizadores;
import java_cup.runtime.*;
import javax.swing.JOptionPane;
import proyecto.main.*;

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
   yycolumn=1;
%init} 


blancos = [ \t\r\n]+
letra = [a-zA-Z]
digito = [0-9]+
decimal= [0-9]+"."[0-9]+ 
charascii=("'""$""{"{digito}"}""'")
caracter = "'"(["("|")"|"/"|"!"|"#"|"$"|"&"|"@"|"`"|"<"|"["|"]"|"^"|"_"|"\\"|[a-zA-Z]|[0-9]])"'"

cadena = (\"([^\"\\\n]|\\.|"\n")*\")
var_identificador = "_"({letra}({letra}|"_"|{digito})*)"_"
identificador = {letra}({letra}|"_"|{digito})*

comentariolinea = ("//".*\n)|("//".*\r)
cmultilinea = ("/""*"[^\!]*"*""/") 
%{
%}

%%
"=" {return new Symbol(sym.igual,yycolumn,yyline,yytext());}
"+" {return new Symbol(sym.suma,yycolumn,yyline,yytext());}
"*" {return new Symbol(sym.por,yycolumn,yyline,yytext());}
"/" {return new Symbol(sym.div,yycolumn,yyline,yytext());}

"POTENCIA" {return new Symbol(sym.potencia,yycolumn,yyline,yytext());}
"MOD" {return new Symbol(sym.modulo,yycolumn,yyline,yytext());}
"->" {return new Symbol(sym.flecha,yycolumn,yyline,yytext());}

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
"mayor" {return new Symbol(sym.mayor,yycolumn,yyline,yytext());}
"menor" {return new Symbol(sym.menor,yycolumn,yyline,yytext());}
"mayor_o_igual" {return new Symbol(sym.mayorigual,yycolumn,yyline,yytext());}
"menor_o_igual" {return new Symbol(sym.menorigual,yycolumn,yyline,yytext());}

"es_igual" {return new Symbol(sym.esigual,yycolumn,yyline,yytext());}
"es_diferente" {return new Symbol(sym.esdiferente,yycolumn,yyline,yytext());}

"or" {return new Symbol(sym.or,yycolumn,yyline,yytext());}
"and" {return new Symbol(sym.and,yycolumn,yyline,yytext());}
"not" {return new Symbol(sym.not,yycolumn,yyline,yytext());}


")" {return new Symbol(sym.cparentecis,yycolumn,yyline,yytext());}
"(" {return new Symbol(sym.aparentecis,yycolumn,yyline,yytext());}

"[" {return new Symbol(sym.acorchete,yycolumn,yyline,yytext());}
"]" {return new Symbol(sym.ccorchete,yycolumn,yyline,yytext());}
//ESPECIALES
"\\n" {return new Symbol(sym.salto,yycolumn,yyline,yytext());}
"\\'" {return new Symbol(sym.comillasimple,yycolumn,yyline,yytext());}
"\\\"" {return new Symbol(sym.comillasd,yycolumn,yyline,yytext());}
//tipos de dato
"NUMERO" {return new Symbol(sym.tnumero,yycolumn,yyline,yytext());}
"CADENA" {return new Symbol(sym.tcadena,yycolumn,yyline,yytext());}
"BOOLEAN" {return new Symbol(sym.tbooleano,yycolumn,yyline,yytext());}
"CARACTER" {return new Symbol(sym.tcaracter,yycolumn,yyline,yytext());}

//inicio y fin
"INICIO" {return new Symbol(sym.inicio,yycolumn,yyline,yytext());}
"FIN" {return new Symbol(sym.fin,yycolumn,yyline,yytext());}
//declaracion variables
"INGRESAR" {return new Symbol(sym.ingresar,yycolumn,yyline,yytext());}
"COMO" {return new Symbol(sym.como,yycolumn,yyline,yytext());}
"CON_VALOR" {return new Symbol(sym.con_valor,yycolumn,yyline,yytext());}

//condicion Si o if
"SI" {return new Symbol(sym.si,yycolumn,yyline,yytext());}
"ENTONCES" {return new Symbol(sym.enton,yycolumn,yyline,yytext());}
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
"INCREMENTAL" {return new Symbol(sym.incremental,yycolumn,yyline,yytext());}
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
"CON_PARAMETROS" {return new Symbol(sym.con_parametros,yycolumn,yyline,yytext());}

//llamada de funciones y metodos
"EJECUTAR" {return new Symbol(sym.ejecutar,yycolumn,yyline,yytext());}

//impresion
"IMPRIMIR" {return new Symbol(sym.imprimir,yycolumn,yyline,yytext());}
"IMPRIMIR_NL" {return new Symbol(sym.imprimir_nl,yycolumn,yyline,yytext());}

"VERDADERO" {return new Symbol(sym.verdadero,yycolumn,yyline,yytext());}
"FALSO" {return new Symbol(sym.falso,yycolumn,yyline,yytext());}


{var_identificador} {return new Symbol(sym.var_identificador,yycolumn,yyline,yytext());}

{cadena} {return new Symbol(sym.cadena,yycolumn,yyline,yytext());}
{identificador} {return new Symbol(sym.identificador,yycolumn,yyline,yytext());}
{digito} {return new Symbol(sym.digito,yycolumn,yyline,yytext());}
{decimal} {return new Symbol(sym.decimal,yycolumn,yyline,yytext());}
{charascii} {return new Symbol(sym.carAscii,yycolumn,yyline,yytext());}

{caracter} {return new Symbol(sym.caracter,yycolumn,yyline,yytext());}

{blancos} {/*Se ignoran*/} // Espacios en Blanco
{comentariolinea} {return new Symbol(sym.comentariolinea,yycolumn,yyline,yytext());}
{cmultilinea} {return new Symbol(sym.cmultilinea,yycolumn,yyline,yytext());}


. {
   int[] arregloError = new int[2];
   arregloError[0]= yyline;
   arregloError[1]= yycolumn+1;
   Datos.listaErrores.add(arregloError);
   System.err.println("Error lexico: "+yytext()+ " Linea:"+(yyline)+" Columna:"+(yycolumn));
   yycolumn++;
    //ErrorLexicoySintactico.listaerrores.add(new ErrorLexicoySintactico("Error Lexico", "El caracter :"+yytext()+"no pertenece al lenguaje",  (yyline), (yycolumn)));
     //ErrorLexicoySintactico.contadorerror++;
  }