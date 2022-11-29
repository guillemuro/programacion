/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja3;
 import java.util.Scanner;
/**
 *
 * @author A8-PC59
 */
public class eje2 {
   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        int producto = 1;
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + producto + " = " + (n * producto));
            producto *= n;
            n += 2;
        }
        System.out.println(producto);
    }
}

    
