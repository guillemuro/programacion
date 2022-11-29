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
public class Eje1 {

    public static void main(String[] args) {
        int [][] t = new int [3][6];
        t[0][0] = 0;
        t[1][0] = 75;
        t[0][1] = 30;
        t[0][2] = 2;
        t[0][5] = 5;
        int X = 0;
        t[0][4] = X;
        t[0][3] = X;
        
        
        t[1][1] = X;
        t[1][2] = X;
        t[1][3] = X;
        t[1][4] = 0;
        t[1][5] = X;
        
        
        t[2][0] = X;
        t[2][1] = X;
        t[2][2] = -2;
        t[2][3] = 9;
        t[2][4] = X;
        t[2][5] = 11;
        
        System.out.print("La tabla queda asi: " +t);
        
    }

}
