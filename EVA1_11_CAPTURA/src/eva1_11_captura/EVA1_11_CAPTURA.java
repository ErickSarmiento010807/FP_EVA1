/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_captura;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class EVA1_11_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double V,D,T,Kmh;       
               
        //SOLICITAR DISTANCIA (M) Y TIEMPO EN (S)
        System.out.println("Introduce la Distancia en metros: ");
        D = input.nextDouble();
        
        System.out.println("Introduce la Distancia en Segundos: ");
        T = input.nextDouble();
        
        
        //CALCULAR LA VELOCIDAD (M/S)       
        V = D/T;
        System.out.println("La velocidad seria: ");
        System.out.println(V);
                
        //Convertir Metros a Kilometros por hora
        Kmh = V*3.6;
        System.out.println("Y la conversion de Velocidad a Kilometros por hora es: ");
        System.out.println(Kmh);
        
    }
    
}
