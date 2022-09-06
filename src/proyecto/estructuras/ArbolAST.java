
package proyecto.estructuras;

import java.util.ArrayList;

public class ArbolAST {
    public NodoAST raiz;

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
        if (nodo.Nodos==null) {
            lista.add(nodo);
        }else{
            while(nodo.Nodos.size()>indice){
                getNodos(nodo.Nodos.get(indice), lista);
                indice++;
            }
        }
        
    }
    
}
