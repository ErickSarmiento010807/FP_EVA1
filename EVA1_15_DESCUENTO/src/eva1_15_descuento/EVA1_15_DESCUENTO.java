/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_15_descuento;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class EVA1_15_DESCUENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner (System.in);
        double Venta;
        double montoPagar;
    
    //Solicitar el monto que se paga
    System.out.println("Igrese la cantidad de la venta: $");
    Venta = captu.nextDouble();
    
    if(Venta > 1000){
        montoPagar = Venta * 0.85;
        System.out.println("El monto a pagar es: ");
        System.out.println(montoPagar);
    }        
    }
    
}
