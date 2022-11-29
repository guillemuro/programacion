/*
Visualizar la serie 3, 6, 9, 12, â€¦, 456. Al final visualizar la suma.
 */
package hoja3.pkg1;

/**
 *
 * @author A8-PC59
 */
public class eje5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Visualizamos desde el 1 hasta el 456 de 3 en 3");
        int num, suma;
        num = 3;
        suma = 0;
        do{            
            System.out.println(" "+num);
            suma = suma +num;
            num = num + 3;
        }
        while (num <= 456);
        System.out.println("+");
        System.out.println("____________");
        System.out.println(" la suma de tos los numeros es: "+suma);
        
    }
}
