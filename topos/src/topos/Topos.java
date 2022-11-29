/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topos;

import java.util.*;

/**
 *
 * @author S1-PC53
 */
public class Topos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

            int[][] matrizNumeros = new int[5][5];
            inicializar(matrizNumeros);
            visualizar(matrizNumeros);
        }

        static void inicializar(int[][] matriz) {
            Random r = new Random();
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = r.nextInt(9) + 1;
                }
            }
        }

        static void visualizar(int[][] matriz) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
