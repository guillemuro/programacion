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
public class eje5 {
    public static void main(String[] args) throws Exception {
        Scanner eje5 = new Scanner(System.in);
        System.out.println("pon 3 distancias:");
        System.out.println("la distancia en milimetros es:");
        float milimetros = eje5.nextFloat();
        System.out.println("la distancia en centrimetros es:");
        float centimetros = eje5.nextFloat();
        System.out.println("la distancia en metros es:");
        float metros = eje5.nextFloat();

        float distanciatotal = (milimetros/10) + centimetros + (metros*100);
        System.out.println("La distancia total en centímetros es " + distanciatotal);
    }
}
    

