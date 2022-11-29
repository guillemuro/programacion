/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_repaso;

import java.util.Scanner;

/**
 *
 * @author A8-PC59
 */
public class Eje1 {

    /**
     * @param args the command line arguments
     */
    //*PEDIR DOS NUEMROS DECIR SI SON POSITIVOS
    public static void main(String[] args) {
        // TODO code application logic here

        int a, b;

        Scanner sc = new Scanner(System.in);

        System.out.print("Dime un numero: ");
        a = sc.nextInt();

        System.out.print("Dime un numero: ");
        b = sc.nextInt();

        if (a > 0 && b <= 0) {
            System.out.print("Los dos son positivos");
        } else if (a < 0 && b < 0) {
            System.out.print("Los dos son negativos");
        } else {
            System.out.print("Unos de los nuermos es positivo y el otro negativo");
        }

    }
}
