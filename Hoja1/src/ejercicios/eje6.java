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
public class eje6 {
    public static void main(String[] args) throws Exception {
        Scanner eje6 = new Scanner(System.in);
        System.out.println("El nº de homfigas que fueron capturadas fueron :");
        int hormigas = eje6.nextInt();
        System.out.println("El nº de arañas que fueron capturadas fueron:");
        int aranas = eje6.nextInt();
        System.out.println("El nº de cochinillas que fueron capturadas fueron:");
        int cochinillas = eje6.nextInt();

        System.out.println("Las patas totales capturadas fueron: " + ((hormigas *6 ) + (aranas * 8) + (cochinillas * 14)));
    
        }
}
    
