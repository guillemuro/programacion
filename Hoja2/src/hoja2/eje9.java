/*
Leer un carácter y deducir 
si está o no comprendido entre las 
letras I y M ambas inclusive.
 */
package hoja2;

import java.util.Scanner;

/**
 *
 * @author A8-PC59
 */
public class eje9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una letra: ");

        char l = sc.next().charAt(0);

        if ((l > 'I' && l < 'M') || (l >= 'i' && l <= 'm')) {
            System.out.println("La letra " + l + " esta comprendida entra la \"i\" y la \"m\" ");
        } else {
            System.out.println("La letra " + l + " esta no comprendida entra la \"i\" y la \"m\" ");
        }
    }
}
