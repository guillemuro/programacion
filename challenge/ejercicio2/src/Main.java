import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[5][5];

        for (int i = 0; i < array.length; i++) {
            for (int y = 0; y < array[i].length; y++) {
                array[i][y] = (int) (Math.random() * 89 + 10);

                for (int m = 0; m <= i; m++) { // i=4 y=1 \\ m=4 n = 0
                    if (m == i) {
                        for (int n = 0; n < y; n++) {
                            if (array[i][y] == array[m][n] && !(i == m && y == n)) {
                                if (y == 0) {
                                    i--;
                                    y = 4;
                                } else {
                                    y--;
                                }
                            }
                        }
                    } else {
                        for (int n = 0; n < array[m].length; n++) {
                            if (array[i][y] == array[m][n] && !(i == m && y == n)) {
                                if (y == 0) {
                                    i--;
                                    y = 4;
                                } else {
                                    y--;
                                }
                            }
                        }
                    }
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int n = 0; n < array[i].length; n++) {
                System.out.print("   " + array[i][n]);
            }
            System.out.println("");
        }
    }
}
