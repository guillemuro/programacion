/*
Calcular la suma de los cuadrados de los 25 primeros nÃºmeros naturales.
 */
package hoja3;

/**
 *
 * @author A8-PC59
 */
public class eje8 {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int suma = 0;
        
        for(int i =1; i <=25; i+=1){
        suma = suma + (i*i);
        }
        System.out.println("La suma es :"+suma);       
        
    }
        
}