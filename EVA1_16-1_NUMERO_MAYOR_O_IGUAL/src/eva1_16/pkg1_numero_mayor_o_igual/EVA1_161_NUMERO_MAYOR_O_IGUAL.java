/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_16.pkg1_numero_mayor_o_igual;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class EVA1_161_NUMERO_MAYOR_O_IGUAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double num1;
        double num2;
        Scanner cap = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        num1 = cap.nextDouble();
        System.out.println("Introduce el segundo numero: ");
        num2 = cap.nextDouble();
        
        if(num1>num2){
            System.out.println("El numero mayor es: "+ num1);
            System.out.println(num1);
        }else{
        }if (num2>num1){
            System.out.println("El numero mayor es: "+ num2);
            System.out.println(num2);
        }else{
            System.out.println("Los numeros son iguales");
        }
        
        
    }
    
}
