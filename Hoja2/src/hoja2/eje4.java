/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Dados dos números, indicar si son iguales y en caso de no serlo,
determinar cuál es el mayor.
 */
package hoja2;

import java.util.Scanner;

/**
 *
 * @author A8-PC59
 */
public class eje4 {
    public static void main(String[]args){
    Scanner teclado=new Scanner(System.in);
    int a;
    int b;
    System.out.print("ingrese el primer numero : ");
    a=teclado.nextInt();
    System.out.print("ingrese el segundo numero : ");
    b=teclado.nextInt();
    if(a==b)
      System.out.print("son numeros iguales");
    if(a>b)
        System.out.print("el numero mayor es : "+a);
    if(b>a)   
        System.out.print("el numero mayor es : "+b);
         
    }
}
