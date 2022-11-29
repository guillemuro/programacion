/*
 Calcular la raíz cuadrada de un número introducido
por teclado. Hay que tener la precaución de
comprobar que el número sea positivo.
 */
package hoja2;

import java.util.Scanner;

/**
 *
 * @author A8-PC59
 */
public class eje7 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int num = (int) sc.nextDouble();
        int resultado;
        resultado = (int) Math.sqrt(num);
        System.out.println("El resultado es: "+resultado);
    }
}
