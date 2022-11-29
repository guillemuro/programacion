/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja3;

import java.util.Scanner;

/**
 *
 * @author A8-PC59
 */
public class eje9 {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        int num = sc.nextInt();
        
        for(i = 4; i <= num  ;i = i +4){
        System.out.println("Los multiplos de 4 hasta "+ num +" son: " + i);
        
    }
    
}
}
