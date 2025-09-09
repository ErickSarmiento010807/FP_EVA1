/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_16_numero_mayor;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class EVA1_16_NUMERO_MAYOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner cap = new Scanner(System.in);
    
    //Solicitar los dos numeros
    double num1;
    double num2;
    
    System.out.println("Introdusca un numero: ");
    num1 = cap.nextDouble();
    System.out.println("Introdusca otro numero: ");
    num2 = cap.nextDouble();
    
    // Comparar y enseñar el mayor
    
    if(num1>num2){
        System.out.println("El numero mayor es: " + num1);
    } else {
        System.out.println("El numero mayor es: " + num2);
    }
    
    }
    
}
