/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Pedir dos números enteros y decir si son iguales o no.
 */
package hoja2;

import java.util.Scanner;

/**
 *
 * @author A8-PC59
 */
public class eje2 {
    public static void main(String[] args) 
	{
		Scanner a = new Scanner(System.in);
		int n1,n2;
		System.out.print("Introduce el primer número: ");
		n1=a.nextInt();
		System.out.print("Introduce el segundo número: ");
		n2=a.nextInt();
		if(n1==n2)
			System.out.println("Son iguales");
		else
			System.out.println("No son iguales");
        }

}
