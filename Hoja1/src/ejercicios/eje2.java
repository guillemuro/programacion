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

public class eje2 {
     public static void main(String[] args) throws Exception {
        Scanner eje2 = new Scanner(System.in);
        System.out.println("¿Cuanto cuesta el kilo de manzanas?");
        float preciomanzanas = eje2.nextFloat();
        System.out.println("¿Cuanto cuesta el kilo de peras?");
        float precioperas = eje2.nextFloat();
        System.out.println("¿Cuantos kg se han vendodo de manzanas este trimestre?");
        int manzanas = eje2.nextInt();
        System.out.println("¿Cuantos kg se han vendodo de peras este trimestre?");
        int peras = eje2.nextInt();

        System.out.println("El precio total en manzanas son " + manzanas*preciomanzanas + "euros y en peras " + peras*precioperas + "euros.");
        }
     
}
