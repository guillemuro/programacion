/*
Crear y cargar dos matrices de tamaño 3x3, sumarlas y mostrar su
suma.
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author A8-PC59
 */
public class matriz {

    public static void main(String[] args) {
        int a[][], b[][], suma[][];
        int i, j;
        Scanner sc = new Scanner(System.in);

        a = new int[3][3];
        b = new int[3][3];

        System.out.println("Matriz a: ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(" A[" + i + "][" + j + "]: ");
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matriz B:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                b[i][j] = sc.nextInt();

            }

        }

        suma = new int[3][3];
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                suma[i][j] = a[i][j] + b[i][j];

            }

        }

        System.out.println("Matriz Suma:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(suma[i][j] + " ");

            }

            System.out.println();

        }

    }
}
