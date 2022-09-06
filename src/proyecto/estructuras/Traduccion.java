/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.estructuras;

import java.util.ArrayList;

public class Traduccion {
    
    public boolean lenguaje; //verdadero golang, falso python 
    public String cadena;
    public static int nombres = 0;
    public static boolean flagIngresar=false;
    public static boolean flagBool=false;
    public static ArrayList<String> listaAsign= new ArrayList<String>();

    public Traduccion() {
    }

    public Traduccion(boolean lenguaje, String cadena) {
        this.lenguaje = lenguaje;
        this.cadena = cadena;
    }
    
    public String Golang(ArrayList<NodoAST> nodo){
        String cadena="";
        boolean metodo = false;
        int indice=0;
        for (int i = 0; i < nodo.size(); i++) {
            cadena+=enumGolang(nodo.get(i), nodo, i, metodo);
        }
        
        return cadena;
    }
    
    public String enumGolang(NodoAST nodo, ArrayList<NodoAST> padre, int index, boolean metodo){
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
            case "verdadero":
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
            case ",":
                if (!flagIngresar) {
                    return "";
                }
                return ", ";
            case ";":
                System.out.println("nombres "+nombres);
                if (flagIngresar && !flagBool) {
                    int j=0;
                    while(!padre.get(index-j).getToken().equals("con_valor")){
                        j++;
                    }
                    for (int i = index-j+1; i < index; i++) {
                        expresion+=padre.get(i).getToken();
                    }
                    for (int i = 1; i < nombres; i++) {
                    expresion += ", "+expresion;
                    }                   
                    asignacion=expresion;
                    
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
                return asignacion+"\n";
            
            default:
                if (token.startsWith("_")&& token.endsWith("_")) {
                    if (nombres==0) {
                        for (int i = index; i < padre.size(); i++) {
                            if (padre.get(i).getToken().startsWith("_")&&padre.get(i).getToken().endsWith("_")) {
                                nombres++;
                            }else if(padre.get(i).getToken().equals("como")||padre.get(i).getToken().equals("->"))break;
                        }
                    }
                    
                    if (!flagIngresar) {
                        listaAsign.add(token);
                    }else{
                        return " "+token+" ";
                    }
                    
                    return "";
                }/*
                if (token.startsWith("\"")&& token.endsWith("\"")) {
                    expresion = padre.get(index).getToken();
                    for (int i = 1; i < nombres; i++) {
                    expresion += ", "+padre.get(index).getToken();
                    }                   
                    nombres= 0;
                    return expresion;
                }
                if (token.startsWith("\'")&& token.endsWith("\'")) {
                    expresion = padre.get(index).getToken();
                    for (int i = 1; i < nombres; i++) {
                    expresion += ", "+padre.get(index).getToken();
                    }
                    nombres= 0;

                    return expresion;
                }
                if (token.matches("[0-9]+")||token.matches("[0-9]+.[0-9]+")) {
                    expresion = padre.get(index).getToken();
                    for (int i = 1; i < nombres; i++) {
                    expresion += ", "+padre.get(index).getToken();
                    }
                    nombres= 0;
                    return expresion;                
                }*/
                return "";//" "+token+" ";
        }
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
