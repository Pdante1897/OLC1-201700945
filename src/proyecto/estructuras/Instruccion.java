/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.estructuras;

/**
 *
 * @author gerar
 */
public class Instruccion {
    public String tipo;
    public String figura;
    public NodoAST arbol;

    public Instruccion() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

    public String getFigura() {
        return figura;
    }
    public NodoAST getArbol() {
        return arbol;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setArbol(NodoAST arbol) {
        this.arbol = arbol;
    }
    
    
}


