/*
 Leer un número por teclado mediante un método
, y decir si es positivo o negativo con otro
método. La salida por consola puede ser algo así como: 
&quot;el número X es positivo&quot;
 */
package hoja2;
import java.util.Scanner;
/**
 *
 * @author A8-PC59
 */
public class eje6 {
public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);

		System.out.println("Escribe un número:");
		
		double numero = escaner.nextDouble();

		if (numero == 0) {
			System.out.println("El número es cero");
		} else if (numero < 0) {
			System.out.println("El número es negativo");
		} else {
			System.out.println("El número es positivo");
		}
	}    
}
