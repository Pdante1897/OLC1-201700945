/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.estructuras;

import java.util.ArrayList;

public class Traduccion {
    
    public boolean lenguaje; //verdadero golang, falso python 
    public static int ntabulaciones=0;
    public static int nombres = 0;
    public static boolean flagIngresar=false;
    public static boolean flagBool=false;
    public static boolean flagFor=false;  
    public static boolean flagIf=false;
    public static boolean flagElIf=false;
    public static boolean flagPrint = false;
    public static boolean flagPrintln = false;

    public static ArrayList<String> listaAsign= new ArrayList<String>();

    public Traduccion() {
    }

    public Traduccion(boolean lenguaje, String cadena) {
        this.lenguaje = lenguaje;
    }
    
    public String Golang(ArrayList<NodoAST> nodo){
        String cadena="";
        boolean metodo = false;
        int indice=0;
        String tabulacion="";
        for (int i = 0; i < nodo.size(); i++) {
            if (ntabulaciones!=0) {
                
            }
            cadena+=enumGolang(nodo.get(i), nodo, i, metodo);
        }
        
        return cadena;
    }
    
    public String enumGolang(NodoAST nodo, ArrayList<NodoAST> padre, int index, boolean metodo){
        String tabulaciones="";
        String token = nodo.getToken();
        NodoAST nodito;
        String expresion="";
        String asignacion="";
        switch(token.toLowerCase()){
            case "inicio":
                return "func main (){\n";
            case "fin":
                return "\n}";
            case "ingresar":
                flagIngresar=true;
                return "\tvar ";
            case "si":    
                flagIf = true;
                ntabulaciones++;
                return "\tif (";
            case "o_si":    
                flagElIf = true;
                return "\n"+tabulacion()+"}else if (";
            case "de_lo_contrario":    
                return "\n"+tabulacion()+"}else {\n\t";
            case "fin_si":
                ntabulaciones--;
                return "\n\t"+tabulacion()+"}";
            case "entonces":    
                if (flagIf) {
                     int j=0;
                    while(!padre.get(index-j).getToken().equals("si")){
                        j++;
                        System.out.println("j="+j);
                    }
                    for (int i = index-j+1; i < index; i++) {
                        expresion+=conector(padre.get(i));
                    } 
                }
                if (flagElIf) {
                    int j=0;
                    while(!padre.get(index-j).getToken().equals("o_si")){
                        j++;
                        System.out.println("j="+j);
                    }
                    for (int i = index-j+1; i < index; i++) {
                        expresion+=conector(padre.get(i));
                    } 
                }
                flagIf=false;
                flagElIf=false;
                return expresion+"){ \n"+tabulacion();
            case "imprimir":
                flagPrint=true;
                return "\tfmt.Print(";
            case "imprimir_nl":   
                flagPrintln=true;
                return "\tfmt.Println(";
            case "cadena":
                return "string ";
            case "caracter":
                return "byte ";
            case "boolean":
                return "bool ";
            case "numero":
                nodito= new NodoAST();
                for (int i = index; i < padre.size(); i++) {
                    if (padre.get(i+1).getToken().equals(";")&&padre.get(i).getToken().contains(".")) {
                        return "float64 ";
                    }
                    if (padre.get(i).getToken().equals(";"))break;
                }
                return "int ";
            case "como":
                return expresion;
            case "con_valor":
                return "= "+expresion;
            //case "->":
            //    return "= "+expresion;
            /*case "verdadero":
                flagBool=true;
                expresion = "true";
                for (int i = 1; i < nombres; i++) {
                    expresion += ", true";
                }
                return expresion;
            case "falso":
                flagBool=true;
                expresion = "false";
                for (int i = 1; i < nombres; i++) {
                    expresion += ", false";
                }
                return expresion;
            */case ",":
                if (!flagIngresar) {
                    return "";
                }
                return ", ";
            case ";":
                System.out.println("nombres "+nombres);
                
                if (flagPrint) {
                     int j=0;
                    while(!padre.get(index-j).getToken().equals("imprimir")){
                        j++;
                        System.out.println("j="+j);
                    }
                    for (int i = index-j+1; i < index; i++) {
                        expresion+=conector(padre.get(i));
                    } 
                    flagPrint=false;
                    return expresion+")\n"+tabulacion();
                }
                
                if (flagPrintln) {
                     int j=0;
                    while(!padre.get(index-j).getToken().equals("imprimir_nl")){
                        j++;
                        System.out.println("j="+j);
                    }
                    for (int i = index-j+1; i < index; i++) {
                        expresion+=conector(padre.get(i));
                    } 
                    flagPrintln=false;
                    return expresion+")\n"+tabulacion();
                }
                
                if (flagIf) {
                    return ""+tabulacion();
                }
                if (flagElIf) {
                    return ""+tabulacion();
                }
                if (flagIngresar) {
                    int j=0;
                    String cadena="";
                    while(!padre.get(index-j).getToken().equals("con_valor")){
                        j++;
                    }
                    for (int i = index-j+1; i < index; i++) {
                        cadena+=conector(padre.get(i));
                    }
                    for (int i = 0; i < nombres; i++) {
                        if (nombres-1==i) {
                            expresion+= cadena;
                            break;
                        }
                        expresion += cadena+", ";

                    }
                    
                    flagIngresar=false;
                    flagBool=false;
                    nombres=0;
                    listaAsign=new ArrayList<String>();
                    return expresion+"\n"+tabulacion();
                }
                if (!listaAsign.isEmpty()) {
                    int j=0;
                    while(!padre.get(index-j).getToken().equals("->")){
                        j++;
                    }
                    for (int i = index-j+1; i < index; i++) {
                        expresion+=padre.get(i).getToken();
                    }
                    for (int i = 0; i < listaAsign.size(); i++) {
                        asignacion+= "\t"+listaAsign.get(i)+" = "+expresion+"\n";
                        
                    }
                    System.out.println(listaAsign.size());
                }
                
                flagIngresar=false;
                flagBool=false;
                nombres=0;
                listaAsign=new ArrayList<String>();
                return asignacion+"\n"+tabulacion();
            
            default:
                if (token.startsWith("_")&& token.endsWith("_")) {
                    if (nombres==0) {
                        for (int i = index; i < padre.size(); i++) {
                            if (padre.get(i).getToken().startsWith("_")&&padre.get(i).getToken().endsWith("_")) {
                                nombres++;
                            }else if(padre.get(i).getToken().equals("como")||padre.get(i).getToken().equals("->"))break;
                        }
                    }
                    
                    if (!flagIngresar&&!flagIf&&!flagElIf) {
                        listaAsign.add(token);
                    }else if (flagIf) {
                        return "";
                    }else if (flagElIf) {
                        return "";
                    } else{
                        return " "+token+" ";
                    }
                    
                    return "";
                }
                return "";//" "+token+" ";
        }
    }
    
    public String tabulacion(){
        String tabulaciones="";
        for (int i = 0; i < ntabulaciones; i++) {
                    tabulaciones+="\t";
                }
        return tabulaciones;
    }
    
    public String conector(NodoAST padre){
        String expresion="";
        switch (padre.getToken().toLowerCase()){
                            case "mod":
                                expresion+="%";
                                break;
                            case "mayor":
                                expresion+=">";
                                break;
                            case "menor":
                                expresion+="<";
                                break;
                            case "mayor_o_igual":
                                expresion+=">=";
                                break;  
                            case "menoro_igual":
                                expresion+="<=";
                                break;
                            case "es_igual":
                                expresion+="==";
                                break;
                            case "es_diferente":
                                expresion+="!=";
                                break;
                            case "or":
                                expresion+="||";
                                break;
                            case "and":
                                expresion+="&&";
                                break;
                            case "not":
                                expresion+="!";
                                break;
                            case "verdadero":
                                expresion+="true";
                                break;
                            case "falso":
                                expresion+="false";
                                break;
                            default:
                                expresion+=padre.getToken();
                                break;
                        }
        return expresion;
    }
    
    public String instrucciones(NodoAST nodo){
        switch (nodo.getToken()){
            
            case "T_inicio":
                return recorrerNodos(nodo, nodo, 0);
            case "<Declaracion>":
                return recorrerNodos(nodo, nodo, 0);
                
        }
        
        return "";
    }
    
    public String recorrerNodos(NodoAST nodo, NodoAST padre, int index){
        String cadena="";
        boolean metodo = false;
        int indice=0;
        if (nodo.Nodos==null) {
            //cadena =  enumGolang(nodo, padre, index, metodo);
        }else{
            while(nodo.Nodos.size()>indice){
                cadena += recorrerNodos(nodo.Nodos.get(indice), padre, indice);
                System.out.println(nodo.Nodos.size());
                indice++;
            }
        }
        
        return cadena;
    }
}
