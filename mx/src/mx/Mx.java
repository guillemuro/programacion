/*
Diseñar una funcion  que calcule el maximo de una tabla de n
 */
package mx;

import java.util.*;

/**
 *
 * @author A8-PC73
 */
public class Mx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        int resultado = maximo(a, b);
        System.out.println("El resultado es " + resultado);

    }

    public static int maximo(int x, int y) {
        int max;
        if (x > y) {
            max = x;
        } else (x < y) {
            max = b;
        }
        return max;
    }

}
