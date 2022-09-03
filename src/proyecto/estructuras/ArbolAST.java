
package proyecto.estructuras;

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
    
}
