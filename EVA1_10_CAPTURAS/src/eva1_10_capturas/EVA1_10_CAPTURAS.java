/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_capturas;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class EVA1_10_CAPTURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //sOLICITAR LA TEMPERATURA EN FARENHEIT
    Scanner input = new Scanner(System.in);
    double F,C;
    //Captura
    System.out.println("Temperatura en grados Farenheit: ");
    F = input.nextDouble();
    
    //DARLE LA TEMPERATURA EN GRADOS CENTIGRADOS
    C = 5*(F-32)/9;
    System.out.println("La temperatura es :");
    System.out.println(C);
    
    
    }
    
}
