/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;


import java.util.Scanner;

/**
 *
 * @author A8-PC59
 */
public class Ejercicios {

     public static void main(String[] args){
        int manzanas;
        int peras;
        Scanner leer= new Scanner(System.in);
        System.out.print("dime cuantos kilos de manzanas has vendido: ");
        manzanas= leer.nextInt();
        System.out.print("dime cuantos kilos de peras has vendido: ");
        peras= leer.nextInt();
        double total = (manzanas * 2.35) + (peras * 1.95);
        System.out.println("el importe total es de " + total);
        

    }
}
    
    
