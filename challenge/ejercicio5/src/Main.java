import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[10][10];
        int y = (int) (Math.random() * (array.length - 1));
        int x = (int) (Math.random() * (array[y].length - 1));
        int intentos = 15;
        int numx;
        int numy;
        for (int i = 0; i < array.length; i++) {
            for (int n = 0; n < array[i].length; n++) {
                if (x == i && y == n) {
                    array[i][n] = 9;
                } else {
                    array[i][n] = 0;
                }
            }
        }
        /*muestro el array con el 9 para hacer las comprobaciones, para estar el ejercicio bien se comentaria este for
        y se descomentaria el siguiente*/
        for (int i = 0; i < array.length; i++) {
            for (int n = 0; n < array[i].length; n++) {
                System.out.print("  " + array[i][n]);
            }
            System.out.println("");
        }
//        for (int i = 0; i < array.length; i++) {
//            for (int n = 0; n < array[i].length; n++) {
//                System.out.print("  " + 0);
//            }
//            System.out.println("");
//        }
        System.out.println("introduce coordenadas X e Y");
        while (intentos > 0) {
            numy = sc.nextInt();
            numx = sc.nextInt();
            if (numx == x && numy == y) {
                System.out.println("Enhorabuena, has cazado a la mosca");
                break;
            } else {
                intentos--;
                System.out.println("Te quedan " + intentos + " intentos");
            }
        }

    }
}