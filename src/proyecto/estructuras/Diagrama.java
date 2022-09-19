/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.estructuras;

import java.util.ArrayList;

/**
 *
 * @author gerar
 */
public class Diagrama {

    public Diagrama() {
    }
    
    public String cadena(ArrayList<Instruccion> instrucciones){
        int tam=instrucciones.size();
        String cadena="";
        cadena += "digraph G{";
        cadena += "node[shape=\"box\" shape=\"record\"]\n";
        cadena += "nodo0[label =\"INICIO\" shape=ellipse];\n";
        for (int i = 1; i < tam; i++) {
            cadena += "nodo"+i+"[label =\""+instrucciones.get(i-1).tipo+"\" shape="+instrucciones.get(i-1).getFigura()+"]; nodo"+(i-1)+"->nodo"+i+";\n";
            
        }
        cadena += "nodo"+tam+"[label =\"FIN\" shape=ellipse]; nodo"+(tam-1)+"->nodo"+tam+";\n}";
        return cadena;
    }
}
