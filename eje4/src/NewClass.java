
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Saber si piden mayu o minus
 */
/**
 *
 * @author A8-PC59
 */
public class NewClass {

    public static void main(String[] args) throws IOException {

        System.out.println("Dime una letra: ");

        char letra;
        Scanner sc = new Scanner(System.in);
        letra = (char) System.in.read();

        if (Character.isLowerCase(letra)) {
            System.out.println("Es minuscula");
        } else {
            System.out.println("Es mayuscula");
        }
    }
}
