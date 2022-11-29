/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author A8-PC59
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int t[][];
        t = new int [5][5];
        
        for (int i = 0; i < t.length; i++) {
            for (int c = 0; c < 5; c++) {
                t[i][c] = i + c;
            }
        }
        System.out.println("La tabla es: ");
        
        for (int i = 0; i < t.length; i++) {
            System.out.println();
            
            for (int c = 0; c < 5; c++) {
                System.out.println(t [i][c]+ " ");
            
            }
            
        }
    }
    
}
