/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_6_fp_operaciones;

/**
 *
 * @author Hogar
 */
public class Eva_1_6_FP_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double area;
        double radio;
        double pi;
        //INICIALIZACION:
        pi = 3.1416;
        radio = 5;
        area = pi * radio * radio;
        //IMPRIMIR
        System.out.println("EL VALOR DE UN CIRCULO DE RADIO 5 ES:");
        System.out.println(area);
        //Nuevo circulo radio 100
        radio = 100;
        area = pi * radio* radio;
        
        System.out.println("EL VALOR DE UN CIRCULO DE RADIO 100 ES:");
        System.out.println(area);
                                        
    }
    
}
