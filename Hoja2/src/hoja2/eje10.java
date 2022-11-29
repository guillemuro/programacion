/*
 Pedir dos números y mostrarlos ordenados
de forma decreciente.
 */
package hoja2;

import java.util.Scanner;

/**
 *
 * @author A8-PC59
 */
public class eje10 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int n1, n2;
        System.out.print("Introduce el primer número: ");
        n1 = a.nextInt();
        System.out.print("Introduce el segundo número: ");
        n2 = a.nextInt();
        if (n2 < n1) {
            System.out.print("el orden correcto es : " + n1 + "->" + n2);
        } else {
            System.out.print("el orden de mayor a menor es : " + n2 + " -> " + n1);
        }
    }
}

