/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author A8-PC59
 */
import java.util.Scanner;
public class eje8 {
    public static void main(String[] args) throws Exception {
        Scanner eje8 = new Scanner(System.in);
        System.out.println("¿Cuántos ferrari vendiste?");
        int ferrari = eje8.nextInt();
        System.out.println("¿Cuántos lamborghini has vendido?");
        int lamborghini = eje8.nextInt();
        System.out.println("¿Cuántos Mercedes has vendido?");
        int mercedes = eje8.nextInt();

        int sf = 1500 + (1000 * ferrari) + (1500 * lamborghini) + (2700 * mercedes);

        System.out.println("El suelo que tienes es de: " + sf);
    }
    
}
