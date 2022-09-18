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
public class ArchivoError {
    public String cadenaInicial;
    public String cadenaResultante;

    public ArchivoError() {
    }

    public ArchivoError(String cadenaInicial) {
        this.cadenaInicial = cadenaInicial;
    }

    public void generarCadena(ArrayList<int[]> errores){
        if (errores.isEmpty()) {
            return;
        }
        ArrayList<String> lista = new ArrayList<String>();
        String cadenita = this.cadenaInicial;
        String[] arreglo, arregloF;
        arreglo = cadenita.split("\n");
        for (int i = 0; i < arreglo.length; i++) {
            lista.add(arreglo[i]);
            for (int[] err: errores) {
                if (err[0]==i+1) {
                    String error= "";
                    for (int j = 0; j < err[1]; j++) {
                        error+="  "; 
                    }
                    error+="^\n";
                    for (int j = 0; j < err[1]; j++) {
                        error+="--";
                    }
                    error+="|";
                    lista.add(error);
                }
            }
        }
        String result="";
        for (String linea: lista) {
            result+=linea+"\n";
        }
        this.cadenaResultante=result;
    }
    
    
    public String getCadenaInicial() {
        return cadenaInicial;
    }

    public String getCadenaResultante() {
        return cadenaResultante;
    }

    public void setCadenaInicial(String cadenaInicial) {
        this.cadenaInicial = cadenaInicial;
    }

    public void setCadenaResultante(String cadenaResultante) {
        this.cadenaResultante = cadenaResultante;
    }
    
    
}
