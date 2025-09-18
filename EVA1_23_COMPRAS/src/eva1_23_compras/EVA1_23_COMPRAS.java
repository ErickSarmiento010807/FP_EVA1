/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_23_compras;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class EVA1_23_COMPRAS {
    
    final static String ACCESO_Efectivo = "S";
    final static String ACCESO_Credito = "S";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Efectivo, Credito;
        Scanner cap = new Scanner(System.in);
        
        System.out.println("****control de ventas****");
        System.out.println("****Bienvenido a la tienda virtual****");
        
        System.out.println("Tienes Efectivo?(S/N): ");
        Efectivo = cap.nextLine();
        
        System.out.println("Tienes Credito?(S/N) : ");
        Credito = cap.nextLine();
        
        if (Efectivo.equals(ACCESO_Efectivo) || Credito.equals(ACCESO_Credito)){
            System.out.println("Si, puedes comprar!!!");
        }else {
            System.out.println("No, no puedes comprar!!");
        }
            
    }
    
}
