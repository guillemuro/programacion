/*
Calcular y visualizar la suma y el producto de los
nÃºmeros pares comprendidos entre 20 y 400
ambos inclusive.
 */
package hoja3;

/**
 *
 * @author A8-PC59
 */
public class eje7 {
    public static void main(String[] args) {
        int suma = 0;
        long producto = 1;
        
        for (int i = 20; i <= 70; i +=2){
            suma+=i;
            producto*=i;
             
        }
                
                
        System.out.println("La suma es :"+suma);
        System.out.println("El producto es :" +producto);
    } 
}