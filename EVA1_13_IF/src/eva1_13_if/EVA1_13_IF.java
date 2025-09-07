/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_if;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class EVA1_13_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double cali;
        Scanner cap = new Scanner(System.in);
        
        //captura
        System.out.println("introduce la calificacion: ");
        cali = cap.nextDouble();
        
        //estructura de control de if-then-else
        if (cali>=70){
        System.out.println("Felicidades, acreditaste la materia!!");    
        }else{ //seccion (opcional)
            System.out.println("AZOTES!!!");
        }
        
    }
    
}
