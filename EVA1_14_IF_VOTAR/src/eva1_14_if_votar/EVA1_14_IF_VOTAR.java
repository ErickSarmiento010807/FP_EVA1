/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_if_votar;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class EVA1_14_IF_VOTAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double año;
        Scanner cap = new Scanner (System.in);
        
        
        System.out.println("introduce tu año de nacimiento: ");
        año = cap.nextDouble();
        
        
        if (año<=2007){
        System.out.println("Puedes votar!!");    
        }else{ //seccion (opcional)
            System.out.println("No puedes votar!");
        }
        
    }
        
    }
    

