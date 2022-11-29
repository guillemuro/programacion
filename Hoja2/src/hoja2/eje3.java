/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja2;

import java.util.Scanner;

/**
 *
 * @author A8-PC59
 */
public class eje3 {
public static void main(String[] args) {
 Scanner reader = new Scanner(System.in);                
int num1,  num2 = 0;
                
System.out.println("Dame el primer número");
num1 = reader.nextInt();
num2 = reader.nextInt();
if (num1<=num2)
    System.out.println(num2 + " es mayor que " + num1);
else
    System.out.println(num1 + " es mayor que " + num2);
}
}