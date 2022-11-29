/*
 Leer N números y nos muestre el mayor y el menor
 */
package hoja3;
import java.util.Scanner;
/**
 *
 * @author A8-PC59
 */
public class eje11 {
        
        public static void main(String[] args) {
        
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;

        // variables para guardar el numero mayor y numero menor
        int mayor = 0;
        int menor = 0;

        // instancia de un objeto de clase Scanner
        Scanner entrada = new Scanner(System.in);

       
        System.out.printf("Ingrese el valor para a: ");
        a = entrada.nextInt();
     
        System.out.printf("Ingrese el valor para b: ");
        b = entrada.nextInt();
       
        System.out.printf("Ingrese el valor para c: ");
        c = entrada.nextInt();
        
        System.out.printf("Ingrese el valor para d: ");
        d = entrada.nextInt();
        
        System.out.printf("Ingrese el valor para e: ");
        e = entrada.nextInt();

      
        if (a > b && a > c && a > d && a > e)
            System.out.printf("El numero mayor es 'a' = %d\n", a);

        if (b > a && b > c && b > d && b > e)
            System.out.printf("El numero mayor es 'b' = %d\n", b);

        if (c > a && c > b && c > d && c > e)
            System.out.printf("El numero mayor es 'c' = %d\n", c);

        if (d > a && d > b && d > c && d > e)
            System.out.printf("El numero mayor es 'd' = %d\n", e);

        if (e > a && e > b && e > c && e > d)
            System.out.printf("El numero mayor es 'e' = %d\n", e);

  
        if (a < b && a < c && a < d && a < e)
            System.out.printf("El numero menor es 'a' = %d\n", a);

        if (b < a && b < c && b < d && b < e)
            System.out.printf("El numero menor es 'b' = %d\n", b);

        if (c < a && c < b && c < d && c < e)
            System.out.printf("El numero menor es 'c' = %d\n", c);

        if (d < a && d < b && d < c && d < e)
            System.out.printf("El numero menor es 'd' = %d\n", e);

        if (e < a && e < b && e < c && e < d)
            System.out.printf("El numero menor es 'e' = %d\n", e);

    } 
        
        
}


