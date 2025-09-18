/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_20_antro;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class EVA1_20_ANTRO {
    final static String ACCESO_EDAD = "S";
    final static String ACCESO_INE = "S";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Edad, INE;
        Scanner cap = new Scanner(System.in);
        
        System.out.println("****Acceso al antro****");
        System.out.println("Antro Night club");
        
        System.out.println("Eres mayor de edad? (S/N)");
        Edad = cap.nextLine();
        
        System.out.println("Enseñame tu Ine. (S/N)" );
        INE = cap.nextLine();
        
        if(Edad.equals(ACCESO_EDAD)){
            if(INE.equals(ACCESO_INE)){
                System.out.println("Puedes entrar");
            }else {
                System.out.println("No puedes entrar");
            }
        }else{
            System.out.println("No puedes entrar!!");
        }
    }
    
}
