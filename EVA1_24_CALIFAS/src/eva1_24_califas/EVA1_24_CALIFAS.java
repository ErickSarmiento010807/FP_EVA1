/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_24_califas;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class EVA1_24_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner cap = new Scanner(System.in);
        int califas;
        System.out.println("Introduce tu calificacion final:");
        califas = cap.nextInt();
        
        if((califas  >= 90) && (califas  <= 100)){
            System.out.println("Te sacaste una: A");
        }else if ((califas >=80) && califas <= 89){
            System.out.println("Te sacaste una: B");
        }else if ((califas >=70) && califas <= 79){
            System.out.println("Te sacaste una: C");
        }else if ((califas >=60) && califas <= 69){
            System.out.println("Te sacaste una: D");
        }else if ((califas >=50) && califas <= 59){
            System.out.println("Te sacaste una: F");
        }
        
    }
    
}
