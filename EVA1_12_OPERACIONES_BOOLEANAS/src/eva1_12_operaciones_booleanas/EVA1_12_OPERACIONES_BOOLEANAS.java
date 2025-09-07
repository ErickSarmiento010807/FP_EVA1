/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_operaciones_booleanas;

/**
 *
 * @author Hogar
 */
public class EVA1_12_OPERACIONES_BOOLEANAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int radio = 5; //declaro e inicializo
        boolean resu; //true false
        //USO DE OPERADORES BOOLEANOS
        
        resu = radio < 0;//radio (5) < 0
        System.out.println("radio (5) < 0 es: ");
        System.out.println(resu);
        
        resu = radio > 0;//radio (5) > 0
        System.out.println("radio (5) > 0 es: ");
        System.out.println(resu);
        
        resu = radio == 0;//radio (5) == 0
        System.out.println("radio (5) == 0 es: ");
        System.out.println(resu);
        
        resu = radio != 0;//radio (5) != 0
        System.out.println("radio (5) != 0 es: ");
        System.out.println(resu);
                
       
        
    }
    
}
