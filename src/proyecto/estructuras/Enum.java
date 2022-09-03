/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.estructuras;

/**
 *
 * @author gerar
 */
public class Enum {
    public String enumerar(int num){
        switch (num){
            case 0:
                return "Token";
            case 2:
                return "Global";
            case 3:
                return "Instruccion";
            case 4:
                return "Declaracion";
            default:
                break;
        }
        
        return "error";
    }
}
