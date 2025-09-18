/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_21_errores_comunes;

/**
 *
 * @author Hogar
 */
public class EVA1_21_ERRORES_COMUNES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = 1, num2 = 2;
        if(num1>num2)//ERROR TERMINAR EL IF
            System.out.println("ups, fuera del if");
        
        if (num1>num2)
            System.out.println("Num1 es mayor");
        else//PARECE QUE PERTENECE AL PRIMER IF, PERO EN REALIDAD ES EL SEGUNDO IF
            System.out.println("Num2 es mayor");
        
        if (num1>num2)
            System.out.println("Num1 es mayor");
        else//pertenece al primer if
            System.out.println("Num1 es mayor");

    }
    
}
