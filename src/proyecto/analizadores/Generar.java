/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.analizadores;

/**
 *
 * @author gerar
 */
public class Generar {
    
    public static void main(String[] args) {
         try {
            String ruta = System.getProperty("user.dir") + "\\src\\proyecto\\analizadores\\";
            String ruta2 = ruta.replace('\\', '/');
            System.out.println(ruta2);
            String opcFlex[] = {ruta2 + "Lexico.jflex", "-d", ruta2};
            jflex.Main.generate(opcFlex);
            System.out.println(ruta);

            
            String opcCUP[] = {"-destdir", ruta, "-parser", "parser", ruta + "Sintactico.cup"};
            java_cup.Main.main(opcCUP);
            
        } catch (Exception e) {
            e.printStackTrace();
            
        }
    }
    
}
