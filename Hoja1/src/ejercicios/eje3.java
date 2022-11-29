/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author A8-PC59
 */
import java.util.Scanner;
public class eje3 {
    

    public static void main(String[] args) throws Exception {
        Scanner eje3 = new Scanner(System.in);
        System.out.println("¿cual es el precio base?");
        float base = eje3.nextFloat();
        System.out.println("¿Cual es la tasa de IVA aplicable?");
        float iva = eje3.nextFloat();

        System.out.println("El precio + IVA es de: " + base*iva);
    
        }
    
}
