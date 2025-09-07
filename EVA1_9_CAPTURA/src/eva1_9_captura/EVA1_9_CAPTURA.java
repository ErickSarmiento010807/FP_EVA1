/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_captura;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class EVA1_9_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String nombre;
        int edad;
        double promedio;
        Scanner Input = new Scanner(System.in); // Creamos el scanner
        
        //Como capturar en JAVA
        System.out.println("Introduce tu nombre completo: ");
        nombre = Input.nextLine(); //Captura el texto = nextline().
       
        System.out.println("Introdusca su edad: ");
        edad = Input.nextInt();
        
        System.out.println("introdusca su promedio: ");
       promedio = Input.nextDouble();
       
        
        System.out.println("El nombre capturado es: ");
        System.out.println(nombre);
        
        System.out.println("La edad capturada es: ");
        System.out.println(edad);
        
        System.out.println("El promedio capturado es: ");
        System.out.println(promedio);
    }
    
}
