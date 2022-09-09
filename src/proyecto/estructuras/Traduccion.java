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
    public static String tipoFunc = "";
    public static boolean flagIngresar=false;
    public static boolean flagAsignacion=false;
    public static boolean flagBool=false;
    public static boolean flagIf=false;
    public static boolean flagElIf=false;
    public static boolean flagPrint = false;
    public static boolean flagPrintln = false;
    public static boolean flagPotencia = false;
    public static boolean flagSwitch = false;
    public static boolean flagHacer = false;
    public static boolean flagFor = false;
    public static boolean flagWhile = false;
    public static boolean flagDoWhile = false;
    public static boolean flagFuncion = false;
    public static boolean flagMetodo =false;
    public static boolean flagConValor = false;
    public static boolean flagMain= false;
    public static boolean flagConParametros = false;
    public static boolean flagNomFunc = false;
    public static boolean flagEjecutar = false;
    public static int ejecuciones =0;
    public static ArrayList<String> listaAsign= new ArrayList<String>();
    public static ArrayList<String> importaciones=new ArrayList<String>();
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
        String encabezado=agregarImportaciones();

        return encabezado+cadena;
    }
    
    public String enumGolang(NodoAST nodo, ArrayList<NodoAST> padre, int index, boolean metodo){
        String tabulaciones="";
        String token = nodo.getToken();
        NodoAST nodito;
        String expresion="";
        String expresionAux="";
        String asignacion="";
        int[] indicepot=new int[3];
        boolean estaEnPot=false;
        ArrayList<int[]> indices = new ArrayList<int[]>();
        switch(token.toLowerCase()){
            case "inicio":
                flagMain=true;
                
                return "func main (){\n";
            case "fin":
                if (!flagMain) {
                    return "";
                }
                flagMain=false;
                return "\n}";
            case "ejecutar":
                if (flagEjecutar) {
                }else{
                    flagEjecutar = true;
                    ejecuciones = index;
                }
                                

                return"";
            case "ingresar":
                flagEjecutar = false;
                flagIngresar=true;
                return "\tvar ";
            case "funcion":
                nombres=0;
                flagFuncion=true;
                if (flagMain) {
                    flagMain=false;
                    return "\n}\nfunc ";    
                }
                return "func ";    
            case "metodo":
                nombres=0;
                flagMetodo=true;
                if (flagMain) {
                    flagMain=false;
                    return "\n}\nfunc ";    
                }
                return "func ";
            case "fin_funcion":
                flagFuncion=false;
                flagNomFunc=false;
                return "\n}\n";    
            case "fin_metodo":
                flagMetodo=false;
                flagNomFunc=false;
                return "\n}\n";
            case "con_parametros":
                flagConParametros = true;
                flagEjecutar=false;
                return "";
            case ")":
                if (flagConParametros) {
                    nombres = 0;
                    flagConParametros = false;
                    return ") "+tipoFunc+"{\n";
                }
                return "";    
            case "si":    
                flagIf = true;
                flagEjecutar=false;
                ntabulaciones++;
                return "\tif (";
            case "o_si":    
                flagElIf = true;
                flagEjecutar=false;
                return "\n"+tabulacion()+"}else if (";
            case "de_lo_contrario":    
                if (flagHacer) {
                    return "\n"+tabulacion()+"default: \n\t";
                }
                return "\n"+tabulacion()+"}else {\n\t";
            case "fin_si":
                ntabulaciones--;
                return "\n\t"+tabulacion()+"}\n";
            case "entonces":    
                if (flagIf) {
                     int j=0;
                    while(!padre.get(index-j).getToken().equals("si")){
                        if (padre.get(index-j).getToken().equals("potencia")) {
                            indicepot=indicePotencia(padre,index-j);
                            indices.add(indicepot);
                            flagPotencia=true;
                        }
                        j++;
                        System.out.println("j="+j);
                    }
                    for (int i = index-j+1; i < index; i++) {
                        if (!indices.isEmpty()) {
                            for (int k = 0; k < indices.size(); k++) {
                                if (indices.get(k)[0]==i) {
                                    indicepot=indices.get(k);
                                    flagPotencia=true;
                                    estaEnPot=true;
                                }
                            }
                        }
                        
                        if (flagPotencia&&estaEnPot) {
                            if (i>=indicepot[0]&&i<indicepot[2]) {
                                expresionAux+=conector(padre.get(i));
                            }else if (i==indicepot[2]) {
                                expresion+=conector(padre.get(i))+expresionAux+"),float64(";
                                expresionAux="";
                            }else if (i>indicepot[2]&&i<=indicepot[1]) {
                                expresionAux+=conector(padre.get(i));
                            }
                            if (!flagPotencia) {
                                expresion+=expresionAux;
                                estaEnPot=false;
                                expresionAux="";
                            }
 
                        }else{
                            expresion+=conector(padre.get(i));
                        }
                    } 
                }
                if (flagElIf) {
                    int j=0;
                    while(!padre.get(index-j).getToken().equals("o_si")){
                        if (padre.get(index-j).getToken().equals("potencia")) {
                            indicepot=indicePotencia(padre,index-j);
                            indices.add(indicepot);
                            flagPotencia=true;
                        }
                        j++;
                        System.out.println("j="+j);
                    }
                    for (int i = index-j+1; i < index; i++) {
                        if (!indices.isEmpty()) {
                            for (int k = 0; k < indices.size(); k++) {
                                if (indices.get(k)[0]==i) {
                                    indicepot=indices.get(k);
                                    flagPotencia=true;
                                    estaEnPot=true;
                                }
                            }
                        }
                        
                        if (flagPotencia&&estaEnPot) {
                            if (i>=indicepot[0]&&i<indicepot[2]) {
                                expresionAux+=conector(padre.get(i));
                            }else if (i==indicepot[2]) {
                                expresion+=conector(padre.get(i))+expresionAux+"),float64(";
                                expresionAux="";
                            }else if (i>indicepot[2]&&i<=indicepot[1]) {
                                expresionAux+=conector(padre.get(i));
                            }
                            if (!flagPotencia) {
                                expresion+=expresionAux;
                                estaEnPot=false;
                                expresionAux="";
                            }
 
                        }else{
                            expresion+=conector(padre.get(i));
                        }
                    } 
                }
                String retorno = expresion+"){ \n"+tabulacion();
                
                if (flagSwitch||flagHacer) {
                    int j=0;
                    while(!padre.get(index-j).getToken().equals("¿")){
                        if (padre.get(index-j).getToken().equals("potencia")) {
                            indicepot=indicePotencia(padre,index-j);
                            indices.add(indicepot);
                            flagPotencia=true;
                        }
                        j++;
                        System.out.println("j="+j);
                    }
                    for (int i = index-j+1; i < index; i++) {
                        if (!indices.isEmpty()) {
                            for (int k = 0; k < indices.size(); k++) {
                                if (indices.get(k)[0]==i) {
                                    indicepot=indices.get(k);
                                    flagPotencia=true;
                                    estaEnPot=true;
                                }
                            }
                        }
                        
                        if (flagPotencia&&estaEnPot) {
                            if (i>=indicepot[0]&&i<indicepot[2]) {
                                expresionAux+=conector(padre.get(i));
                            }else if (i==indicepot[2]) {
                                expresion+=conector(padre.get(i))+expresionAux+"),float64(";
                                expresionAux="";
                            }else if (i>indicepot[2]&&i<=indicepot[1]) {
                                expresionAux+=conector(padre.get(i));
                            }
                            if (!flagPotencia) {
                                expresion+=expresionAux;
                                estaEnPot=false;
                                expresionAux="";
                            }
 
                        }else{
                            if (!padre.get(index-1).getToken().equals("de_lo_contrario")) {
                                expresion+=conector(padre.get(i));
                            }else{
                                expresion= "";
                                flagHacer=false;
                            }
                        }
                    } 
                    retorno = expresion+"\n"+tabulacion();
                }
                flagIf=false;
                flagElIf=false;
                flagSwitch=false;
                nombres=0;
                return retorno;
            case "segun":
                flagEjecutar=false;
                ntabulaciones++;
                flagSwitch=true;
                return "\tswitch ";    
                
            case "hacer":
                flagHacer=true;
                return "{ \n";
            
            case "fin_segun":
                ntabulaciones--;
                ntabulaciones--;
                return "\n\t"+tabulacion()+"}\n";
            case "¿":
                
                if (padre.get(index-1).getToken().equals("hacer")) {
                    ntabulaciones++;
                    return tabulacion()+"case ";
                    
                }
                return "\n"+tabulacion()+"case ";
            case "?":
                return "";
            case "para":
                flagEjecutar=false;
                return "for";
            case "fin_para":
                flagHacer=false;
                return"}";
            case "fin_mientras":
                flagHacer=false;
                return"}";
            case "imprimir":
                flagEjecutar=false;
                flagPrint=true;
                if (!importaciones.contains("\"fmt\"")) {
                   importaciones.add("\"fmt\"");
                }
                return "\tfmt.Print(";
            case "imprimir_nl":  
                flagEjecutar=false;
                flagPrintln=true;
                if (!importaciones.contains("\"fmt\"")) {
                   importaciones.add("\"fmt\"");
                }
                return "\tfmt.Println(";
            case "cadena":
                if (padre.get(index-2).getToken().equals("funcion")) {
                    tipoFunc="string";
                    return "";
                }
                return "string ";
            case "caracter":
                if (padre.get(index-2).getToken().equals("funcion")) {
                    tipoFunc="byte";
                    return "";
                }
                return "byte ";
            case "boolean":
                if (padre.get(index-2).getToken().equals("funcion")) {
                    tipoFunc="boolean";
                    return "";
                }
                return "bool ";
            case "numero":
                if (padre.get(index-2).getToken().equals("funcion")) {
                    tipoFunc="int";
                    return "";
                }
                for (int i = index; i < padre.size(); i++) {
                    if (flagMetodo||flagFuncion) {
                        break;
                    }
                    if ((padre.get(i+1).getToken().equals(";")&&padre.get(i).getToken().contains("."))||(padre.get(i).getToken().equals("potencia"))) {
                        return "float64 ";
                    }
                    if (padre.get(i).getToken().equals(";"))break;
                }
                return "int ";
            case "como":
                return expresion;
            case "con_valor":
                flagConValor=true;
                return "= "+expresion;
            
            
                
            case ",":
                if (flagConParametros) {
                    return ", ";
                }
                if (!flagIngresar) {
                    return "";
                }
                return ", ";
            case ";":
                System.out.println("nombres "+nombres);
                
                if (flagPrint) {
                     int j=0;
                    while(!padre.get(index-j).getToken().equals("imprimir")){
                        if (padre.get(index-j).getToken().equals("potencia")) {
                            indicepot=indicePotencia(padre,index-j);
                            indices.add(indicepot);
                            flagPotencia=true;
                        }
                        j++;
                        System.out.println("j="+j);
                    }
                    for (int i = index-j+1; i < index; i++) {
                        if (!indices.isEmpty()) {
                            for (int k = 0; k < indices.size(); k++) {
                                if (indices.get(k)[0]==i) {
                                    indicepot=indices.get(k);
                                    flagPotencia=true;
                                    estaEnPot=true;
                                }
                            }
                        }
                        
                        if (flagPotencia&&estaEnPot) {
                            if (i>=indicepot[0]&&i<indicepot[2]) {
                                expresionAux+=conector(padre.get(i));
                            }else if (i==indicepot[2]) {
                                expresion+=conector(padre.get(i))+expresionAux+"),float64(";
                                expresionAux="";
                            }else if (i>indicepot[2]&&i<=indicepot[1]) {
                                expresionAux+=conector(padre.get(i));
                            }
                            if (!flagPotencia) {
                                expresion+=expresionAux;
                                estaEnPot=false;
                                expresionAux="";
                            }
 
                        }else{
                            expresion+=conector(padre.get(i));
                        }
                    } 
                    flagPrint=false;
                    return expresion+")\n"+tabulacion();
                }
                
                if (flagPrintln) {
                    int j=0;
                    
                    while(!padre.get(index-j).getToken().equals("imprimir_nl")){
                        if (padre.get(index-j).getToken().equals("potencia")) {
                            indicepot=indicePotencia(padre,index-j);
                            indices.add(indicepot);
                            flagPotencia=true;
                        }
                        
                        j++;
                        System.out.println("j="+j);
                    }
                    for (int i = index-j+1; i < index; i++) {
                        if (!indices.isEmpty()) {
                            for (int k = 0; k < indices.size(); k++) {
                                if (indices.get(k)[0]==i) {
                                    indicepot=indices.get(k);
                                    flagPotencia=true;
                                    estaEnPot=true;
                                }
                            }
                        }
                        
                        if (flagPotencia&&estaEnPot) {
                            if (i>=indicepot[0]&&i<indicepot[2]) {
                                expresionAux+=conector(padre.get(i));
                            }else if (i==indicepot[2]) {
                                expresion+=conector(padre.get(i))+expresionAux+"),float64(";
                                expresionAux="";
                            }else if (i>indicepot[2]&&i<=indicepot[1]) {
                                expresionAux+=conector(padre.get(i));
                            }
                            if (!flagPotencia) {
                                expresion+=expresionAux;
                                estaEnPot=false;
                                expresionAux="";
                            }
 
                        }else{
                            expresion+=conector(padre.get(i));
                        }
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
                if (flagEjecutar) {
                    int num=0;
                    
                    
                    int j=0;
                    String cadena="";
                    while(index-j!=ejecuciones){
                        
                        if (padre.get(index-j).getToken().equals("potencia")) {
                            indicepot=indicePotencia(padre,index-j);
                            indices.add(indicepot);
                            flagPotencia=true;
                        }
                        System.out.println(j);
                        System.out.println(index);
                        j++;
                    }
                    for (int i = index-j+1; i < index; i++) {
                        if (!indices.isEmpty()) {
                            for (int k = 0; k < indices.size(); k++) {
                                if (indices.get(k)[0]==i) {
                                    indicepot=indices.get(k);
                                    flagPotencia=true;
                                    estaEnPot=true;
                                }
                            }
                        }
                        
                        if (flagPotencia&&estaEnPot) {
                            if (i>=indicepot[0]&&i<indicepot[2]) {
                                expresionAux+=conector(padre.get(i));
                            }else if (i==indicepot[2]) {
                                cadena+=conector(padre.get(i))+expresionAux+"),float64(";
                                expresionAux="";
                            }else if (i>indicepot[2]&&i<=indicepot[1]) {
                                expresionAux+=conector(padre.get(i));
                            }
                            if (!flagPotencia) {
                                cadena+=expresionAux;
                                estaEnPot=false;
                                expresionAux="";
                            }
 
                        }else{
                            cadena+=conector(padre.get(i));
                        }
                    } 
                    
                    
                        expresion += "\t"+cadena;

                    
                    flagEjecutar =false;
                    flagBool=false;
                    nombres=0;
                    listaAsign=new ArrayList<String>();
                    return expresion+"\n"+tabulacion();
                }
                
                if (flagIngresar) {
                    int num=0;
                    
                    
                    int j=0;
                    String cadena="";
                    while(!padre.get(index-j).getToken().equals("con_valor")){
                        if (padre.get(index-j).getToken().equals("potencia")) {
                            indicepot=indicePotencia(padre,index-j);
                            indices.add(indicepot);
                            flagPotencia=true;
                        }
                        j++;
                    }
                    for (int i = index-j+1; i < index; i++) {
                        if (!indices.isEmpty()) {
                            for (int k = 0; k < indices.size(); k++) {
                                if (indices.get(k)[0]==i) {
                                    indicepot=indices.get(k);
                                    flagPotencia=true;
                                    estaEnPot=true;
                                }
                            }
                        }
                        
                        if (flagPotencia&&estaEnPot) {
                            if (i>=indicepot[0]&&i<indicepot[2]) {
                                expresionAux+=conector(padre.get(i));
                            }else if (i==indicepot[2]) {
                                cadena+=conector(padre.get(i))+expresionAux+"),float64(";
                                expresionAux="";
                            }else if (i>indicepot[2]&&i<=indicepot[1]) {
                                expresionAux+=conector(padre.get(i));
                            }
                            if (!flagPotencia) {
                                cadena+=expresionAux;
                                estaEnPot=false;
                                expresionAux="";
                            }
 
                        }else{
                            cadena+=conector(padre.get(i));
                        }
                    } 
                    
                    for (int i = 0; i < nombres-num; i++) {
                        if (nombres-num==i+1) {
                            expresion+= cadena;
                            break;
                        }
                        expresion += cadena+", ";

                    }
                    flagConValor=false;
                    flagIngresar=false;
                    flagBool=false;
                    nombres=0;
                    listaAsign=new ArrayList<String>();
                    return expresion+"\n"+tabulacion();
                }
                if (!listaAsign.isEmpty()) {
                    int j=0;
                    while(!padre.get(index-j).getToken().equals("->")){
                        if (padre.get(index-j).getToken().equals("potencia")) {
                            indicepot=indicePotencia(padre,index-j);
                            indices.add(indicepot);
                            flagPotencia=true;
                        }
                        j++;
                    }
                    for (int i = index-j+1; i < index; i++) {
                        if (!indices.isEmpty()) {
                            for (int k = 0; k < indices.size(); k++) {
                                if (indices.get(k)[0]==i) {
                                    indicepot=indices.get(k);
                                    flagPotencia=true;
                                    estaEnPot=true;
                                }
                            }
                        }
                        
                        if (flagPotencia&&estaEnPot) {
                            if (i>=indicepot[0]&&i<indicepot[2]) {
                                expresionAux+=conector(padre.get(i));
                            }else if (i==indicepot[2]) {
                                expresion+=conector(padre.get(i))+expresionAux+"),float64(";
                                expresionAux="";
                            }else if (i>indicepot[2]&&i<=indicepot[1]) {
                                expresionAux+=conector(padre.get(i));
                            }
                            if (!flagPotencia) {
                                expresion+=expresionAux;
                                estaEnPot=false;
                                expresionAux="";
                            }
 
                        }else{
                            expresion+=conector(padre.get(i));
                        }
                    }
                    for (int i = 0; i < listaAsign.size(); i++) {
                        asignacion+= "\t"+listaAsign.get(i)+" = "+expresion+"\n";
                        
                    }
                    System.out.println(listaAsign.size());
                }
                flagEjecutar=false;
                flagIngresar=false;
                flagAsignacion=false;
                flagBool=false;
                nombres=0;
                listaAsign=new ArrayList<String>();
                return asignacion+"\n"+tabulacion();
            
            default:
                if (token.startsWith("_")&& token.endsWith("_")) {
                    if(padre.get(index-1).getToken().equals(";")||
                            padre.get(index-1).getToken().equals("entonces")||
                            padre.get(index-1).getToken().equals("de_lo_contrario")){//ir agregando el resto de palabras reservadas
                        flagAsignacion=true;
                    }else{
                        
                        if (flagIngresar) {
                            flagAsignacion=false;
                            //return"";
                        }else if(padre.get(index-1).getToken().equals(",")){
                            flagAsignacion=true;
                        }else{
                            flagAsignacion=false;
                            //return"";
                        }
                    }
                    if (nombres==0) {
                        for (int i = index; i < padre.size(); i++) {
                            if (padre.get(i).getToken().startsWith("_")&&padre.get(i).getToken().endsWith("_")) {
                                nombres++;
                            }else if(padre.get(i).getToken().equals("como"))break;
                            else if(padre.get(i).getToken().equals("->"))break;
                        }
                    }
                    
                    if (flagFuncion&&!flagNomFunc||flagMetodo&&!flagNomFunc) {
                        flagNomFunc=true;
                        if (padre.get(index+1).getToken().equals("con_parametros")||padre.get(index+2).getToken().equals("con_parametros")) {
                            return " "+token+"(";
                        }
                        if (flagMetodo) {
                            return " "+token+"(){\n";

                        }
                        return " "+token+"()";
                    }
                    
                    if (flagConParametros) {
                            flagAsignacion=false;
                        return " "+token+" ";
                        }
                    
                    if (flagAsignacion) {
                        if (flagIngresar) {
                            flagAsignacion=false;
                            return"";
                        }
                        
                        listaAsign.add(token);
                    }else if (flagIf) {
                        return "";
                    }else if (flagElIf) {
                        return "";
                    } else if(flagIngresar){
                        if (flagConValor) {
                            
                            return "";
                        }
                        return " "+token+" ";
                    }else if(flagSwitch){
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
                            case "potencia":
                                expresion+="math.Pow(float64(";
                                if (!importaciones.contains("\"math\"")) {
                                    importaciones.add("\"math\"");
                                }
                                break;
                            case "[":
                                break;
                            case"]":
                                expresion+="))";
                                flagPotencia = false;
                                break;
                            case "?":
                                 expresion+=":";
                                 break;
                            case ",":
                                if (flagEjecutar) {
                                    expresion+=", ";
                                }
                                break;
                            case "ejecutar":
                                break;
                            default:
                                expresion+=padre.getToken()+" ";
                                break;
                        }
        return expresion;
    }
    
    public int[] indicePotencia(ArrayList<NodoAST> padre, int indice){
        int[] posiciones = new int[3];
        int i=indice-1;
        boolean ciclo=true;
        if (padre.get(i).getToken().equals(")")) {
            while(ciclo){
                if (padre.get(i).getToken().equals("(")) {
                    posiciones[0]=i;
                    break;
                }
                i--;
            }
        }else{
            posiciones[0]=i;
        }
        i=indice+1;
        while(!padre.get(i).getToken().equals("]")){
            i++;
        }
        posiciones[1]=i;
        posiciones[2]=indice;
        return posiciones;
    }
    
    public String agregarImportaciones(){
        String cadena = "package main\n\nimport {\n";
        for (int i = 0; i < importaciones.size(); i++) {
            cadena+="\t"+importaciones.get(i)+"\n";
        }
        cadena+="}\n\n";
        return cadena;
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
