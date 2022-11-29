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
public class eje7 {
    
    public static void main(String[] args) throws Exception {
        Scanner eje7 = new Scanner(System.in);
        System.out.println("Pon el presupuesto que tienes:");
        
        
        float prep = eje7.nextFloat(); 
        
        System.out.println("gatos en el baño: " + (prep * 10) / 100);
        System.out.println("gatos en la cocina: " + (prep * 25) / 100);
        System.out.println("gatos en el salon: " + (prep * 30) / 100);
        System.out.println("gatos en el dormitorio: " + (prep * 20) / 100);
        System.out.println("gatos en el hall: " + (prep * 5) / 100);
        System.out.println("gatos en la sala: " + (prep * 10) / 100);
    }
}
