/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_25_bisiesto;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class EVA1_25_Bisiesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        //Calcular el residuo
        //Residuo = MODULO = %
        int num1 = 1900, num2 = 4;
        int resi = num1 % num2;//Calculo del residuo
        System.out.println("Primer prueba de año biesto:");
        System.out.println("Residuo de 2024 % 4");
        System.out.println(resi);
        if (resi == 0){//Divicion exacta entre 4
            System.out.println("Puede que sea bisiesto");
           
        }
       
        Scanner cap = new Scanner (System.in);
        int year, resi4, resi100, resi400;
        System.out.println("Capture el año: ");
        year = cap.nextInt();
        resi4 = year % 4;
        resi100 = year & 100;
        resi400 = year % 400;
        //Condiciones para que sea bisiesto:
        //Dicisible entre 4
        if(resi4 == 0){
            if(resi100 == 0){
                if(resi400 == 0){
                    System.out.print(" El año " + year + " Es bisiesto ");
        }else{
            System.out.print(" El año " + year + " No es bisiesto ");
            
        }
            }else{
                System.out.print(" El año " + year + " Es bisiesto ");
            }        
        }else{
            System.out.print(" El año " + year + " no es bisiesto ");
        }        
          
        
    }
    
}
