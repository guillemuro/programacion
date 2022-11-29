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

public class eje4 {
    public static void main(String[] args) throws Exception {
        Scanner eje4 = new Scanner(System.in);
        System.out.println("¿Cuántos segundos quieres calcular?");
        int segundos = eje4.nextInt();

        int h = segundos/3600;
        int min = segundos/60;
        while(min > 60){
            min -= 60;
        }
        while(segundos > 60){
            segundos -= 60;
        }
        System.out.println("Horas: " + h);
        System.out.println("Minutos: " + min);
        System.out.println("Segundos: " + segundos);
    
    
        }
}