package hoja3;

import java.util.Scanner;

public class eje3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++){
            System.out.println(i);
        }
    }
}


