import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[9];
        String[] resultado = new String[array.length];
        int num;
        int contador = array.length;
        int intentos = 15;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 99);
            resultado[i] = "XX";
            if (array[i] < 10) {
                array[i] += 10;
            }
            for (int n = 0; n < i; n++) {
                if (array[i] == array[n]) {
                    i--;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i] + "  ");
            } else {
                System.out.print(array[i] + "  ");
            }
        }
        System.out.println("Introduce numeros hasta hacertar el numero (puedes poner el 0 para salir)");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(resultado[i] + "  ");
            } else {
                System.out.print(resultado[i] + "  ");
            }
        }
        num = sc.nextInt();
        intentos--;
        while (num != 0 && contador - 1 > 0 && intentos > 0) {
            for (int i = 0; i < array.length; i++) {
                if (num == array[i]) {
                    resultado[i] = String.valueOf(num);
                    contador--;
                    intentos++;
                    for (int n = 0; n < array.length; n++) {
                        if (n == array.length - 1) {
                            System.out.println(resultado[n] + "  ");
                        } else {
                            System.out.print(resultado[n] + "  ");
                        }
                    }
                }
            }
            num = sc.nextInt();
            intentos--;
        }
        if (intentos>0){
            System.out.println("Te ha tocado la primitiva. Eres millonario.");
        }
    }
}