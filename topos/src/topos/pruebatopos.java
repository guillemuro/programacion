/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topos;

/**
 *
 * @author S1-PC53
 */
public class pruebatopos {

    public static void main(String[] args) {
        // TODO code application logic here
        int matriz[][] = new int[5][5];
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                matriz[x][y] = (int) (Math.random() * 9 + 1);
            }
        
    System.out.println("");
    
        }
        
    }
}
