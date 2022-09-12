
package proyecto.estructuras;

import java.util.ArrayList;

public class NodoAST {

    public String token;
    public String tipo;
    public ArrayList<NodoAST> Nodos;
    public int id;

    public NodoAST() {
    }
    
    public NodoAST(String token, String tipo) {
        this.token = token;
        this.tipo = tipo;
        System.out.println(token);

    }

    public NodoAST(String token) {
        this.token = token;
        this.Nodos = new ArrayList(Nodos);
        
    }

    public String getToken() {
        return token;
    }

    public String getTipo() {
        return tipo;
    }

    public ArrayList getNodos() {
        return Nodos;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNodos(ArrayList Nodos) {
        this.Nodos = Nodos;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
}
