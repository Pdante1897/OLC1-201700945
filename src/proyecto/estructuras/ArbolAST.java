
package proyecto.estructuras;

import java.util.ArrayList;

public class ArbolAST {
    public NodoAST raiz;
    public int cont = 0;
    public ArbolAST() {
        raiz = new NodoAST();
    }
    
    public String imprimir_nodo(NodoAST padre){
        String cadena = "un nivel \n";
        boolean hijos=false;
        int cont=0;
        cadena += padre.getToken()+'\n';
        if (padre.Nodos == null) {return cadena;}
        while(padre.Nodos.size()>cont){            
            if (padre.Nodos != null) {
                if (padre.Nodos.get(cont)!=null) {
                    cadena += padre.Nodos.get(cont).getToken() + " ";
                    cadena += padre.Nodos.get(cont).getId() + " ";
                }
            }
            cont++;
            
        }
        cadena += '\n';
        cont=0;
        while(padre.Nodos.size()>cont){            
            if (padre.Nodos != null) {
                if (padre.Nodos.get(cont)!=null) {
                    cadena += imprimir_nodo(padre.Nodos.get(cont));

                }
            }
        cont++;
        }
        
        return cadena;
    }
    
    public void getNodos(NodoAST nodo, ArrayList<NodoAST> lista){
        int indice=0;
        NodoAST nodito = nodo;
        if (nodo.Nodos==null) {
            lista.add(nodito);
        }else{
            while(nodo.Nodos.size()>indice){
                getNodos(nodo.Nodos.get(indice), lista);
                indice++;
            }
        }
        
    }
    
    public void setIdNodos(NodoAST raiz){
        for (NodoAST hijo : raiz.Nodos) {
            if (hijo.Nodos!=null) {
                hijo.setId(cont);
                cont++;
                setIdNodos(hijo);

            }else{
                hijo.setId(cont);
                cont++;
            
            }
                
            
        }
    }
    
    public String recorrido(NodoAST raiz){
        String contenido="";
        for (NodoAST hijo : raiz.Nodos) {
            String cadena = hijo.getToken().replace("<", "").replace("\"", "").replace( ">", "").replace( "\'", "");
            
            if (hijo.Nodos!=null) {
                
                    contenido += "nodo"+hijo.getId()+"[label =\""+cadena+"\"]; nodo"+raiz.getId()+"->nodo"+hijo.getId()+";\n";
                    contenido += recorrido(hijo);         
            }else{
                    contenido += "nodo"+hijo.getId()+"[label =\""+cadena+"\"]; nodo"+raiz.getId()+"->nodo"+hijo.getId()+";\n";
                
            }

        }
        return contenido;
    }
    
    public void graficar(String cadena){
        
    }
    
}
