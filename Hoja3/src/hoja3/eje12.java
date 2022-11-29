/*
Diseñar un programa que muestre, para cada número introducido por teclado,
si es par, si es positivo y su cuadrado. El proceso se repetirá
hasta que el número introducido por teclado sea 0.
 */
package hoja3;
import java.util.Scanner;
/**
 *
 * @author A8-PC59
 */
public class eje12 {
    public static void main(String[] args) {
        int cuadrado = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        int num = sc.nextInt();
        
        while (num % 2 == 0 && num > 0){
           cuadrado= num * num;
           
           
           
        }
        if (num < 0){
               System.out.println("Pon un numero positivo");
           }
        System.out.println("El cuadrado del numero es: " + cuadrado);
        
        
            
        

        
    }
}
