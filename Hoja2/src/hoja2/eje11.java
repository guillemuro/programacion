/*
Pedir tres números y mostrarlos
ordenados de mayor a menor.
 */
package hoja2;

import java.util.Scanner;

/**
 *
 * @author A8-PC59
 */
public class eje11 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int n1, n2, n3;
        System.out.print("Introduce el primer número: ");
        n1 = a.nextInt();
        System.out.print("Introduce el segundo número: ");
        n2 = a.nextInt();
        System.out.print("Introduce el segundo número: ");
        n3 = a.nextInt();
        if (n1 > n2 && n2 > n3) {
            System.out.println(n1 + "-" + n2 + "-" + n3);
        }
        if (n2 > n3 && n3 > n1) {
            System.out.println(n2 + "-" + n3 + "-" + n1);
        }
        if (n3 > n1 && n1 > n2) {
            System.out.println(n3 + "-" + n1 + "-" + n2);
        }
        if (n1 > n3 && n3 > n2) {
            System.out.println(n1 + "-" + n3 + "-" + n2);
        }
        if (n2 > n1 && n1 > n3) {
            System.out.println(n2 + "-" + n1 + "-" + n3);
        }
        if (n3 > n2 && n2 > n1) {
            System.out.println(n3 + "-" + n2 + "-" + n1);
        }

    }
}

