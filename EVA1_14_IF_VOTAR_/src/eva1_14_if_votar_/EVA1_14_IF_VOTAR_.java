/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_if_votar_;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class EVA1_14_IF_VOTAR_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int annio_nac;
    int edad;
    Scanner captu = new Scanner (System.in);
    
    System.out.println("Captura tu año de nacimiento: ");
    annio_nac =captu.nextInt();
    edad = 2025 - annio_nac;
    
    if(edad >= 18){
        System.out.println("Puedes votar");
    }
          
    }
    
}
