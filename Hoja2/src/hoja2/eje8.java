/*
Leídos dos números por teclado, llamémosles A y B, 
calcular y mostrar la resta del mayor
menos el menor. Por ejemplo, si A = 8 y B = 3,
el resultado debe ser A – B, es decir, 5. Pero si
A = 4 y B = 7, el resultado debe ser B – A, es decir, 3.
 */
package hoja2;

import java.util.Scanner;



/**
 *
 * @author A8-PC59
 */
public class eje8 {

    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        System.out.println("Introduce el primer número:");
        numero1 = reader.nextInt();

        System.out.println("Introduce el segundo número:");
        numero2 = reader.nextInt();
        int suma = numero1+numero2;
        if (numero1 > numero2) {
            System.out.println("La suma de los numeros es: "+ suma);
        }
        else{
            suma = numero2 + numero1;
            System.out.println("La suma de los numeros es: "+ suma);
        }
    }
    
}
