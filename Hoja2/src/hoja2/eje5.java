/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
Introducir cuatro números y, a continuación, 
mostrar el mayor de los cuatro.
 */
package hoja2;
import java.util.Scanner;
/**
 *
 * @author A8-PC59
 */
public class eje5 {
    public static void main(String[]args){
    Scanner in = new Scanner(System.in);
        int i;
        double mayor,un_numero;
        mayor = 0;
        for (i=1; i<=4; i++) {
            System.out.print("PROCESO " + i);
            System.out.print("Ingresa el valor de un numero: ");
            un_numero = in.nextDouble();
            in.nextLine();
            if(i==1||mayor<un_numero)
                mayor=un_numero;
        }
        System.out.println("Valor de mayor: " + mayor);
    }

    
}
    
