/*
Pedir una nota de 0 a 10 y mostrarla de la forma:
Insuficiente (de 0 a 4), Suficiente (5), Bien (6),
Notable (7 y 8) y Sobresaliente (9 y 10). 
Emplea una tabla para los textos de las notas.
 */
package arraysh1;

import java.util.Scanner;

/**
 *
 * @author A8-PC59
 */
public class eje2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        System.out.print("¿Que nota has sacado?: ");
        
        String[] notas;
        notas = new String[10];
        notas[0]="Insuficiente";
        notas[1]="Insuficiente";
        notas[2]="Insuficiente";
        notas[3]="Insuficiente";
        notas[4]="Insuficiente";
        notas[5]="Suficiente";
        notas[6]="Bien";
        notas[7]="Notable";
        notas[8]="Notable";
        notas[9]="Sobresaliente";
        notas[10]="Sobresaliente";
        
        System.out.print("La nota que has sacado es: "+notas);
        
    }
}