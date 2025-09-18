/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_22_acceso_tablas;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class EVA1_22_ACCESO_TABLAS {
    
    final static String ACCESO_USU = "ERICK";
    final static String ACCESO_CONTRA = "12345";


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Usuario, Contraseña;
        Scanner cap = new Scanner(System.in);
        
        System.out.println("*******CONTROL DE ACCESO*******");
        System.out.println("Restaurante La cucaracha Crocante");
        System.out.print("Usuario: ");
        Usuario = cap.nextLine();
        System.out.print("Contraseña: ");
        Contraseña = cap.nextLine();
        if(Usuario.equals(ACCESO_USU)&& Contraseña.equals(ACCESO_CONTRA)){
            System.out.println("ACCESO CONCEDIDO");
        }else{
            System.out.println("ACCESO DENEGADO");
        }    
    }
    
}
