/*
Visualizar todos los números menores a uno 
leído por teclado que no sean divisibles entre otro
también leído por teclado entre 2 y 9 ambos incluidos.
 */
package hoja3;
import java.util.Scanner;


/**
 *
 * @author A8-PC59
 */
public class eje10 {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime 2 numeros entre 2 y 9: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        while ((n1 < 2 || n1 > 9) || (n2 < 2 || n2 > 9)) {
            System.out.println("Ambos numeros deben estar comprendidos entre 2 y 9: ");
            n1 = sc.nextInt();
            n2 = sc.nextInt();
        }

        for (int i = n1; i >= 1; i--) {
            if (i % n2 != 0){
                System.out.println(i);
            }
        }
    }
}
    

