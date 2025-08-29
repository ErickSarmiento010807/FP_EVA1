/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_fp_triangulo;

/**
 *
 * @author Hogar
 */
public class EVA1_7_FP_TRIANGULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //AREA TRIANGULO
        //AREA = (BASE * ALTURA) ENTRE 2;
        double area;
        double base;
        double altura;
       //tres variables de tipo double = double area, base, altura;
       
       //INICIALIZACION
       base = 11;
       altura = 3;
       //SE APLICA PRECEDENCIA DE OPERACIONES
       area = (base * altura) / 2.0; //CUIADODO CON DIVIDIR ENTRE ENTEROS
       System.out.println("El area del triangulo base 11 y altura 3 es:");
       System.out.println(area);
       
                      
    }
    
}
