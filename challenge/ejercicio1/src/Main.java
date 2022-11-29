import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[15];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 99);
            if (array[i] < 10) {
                array[i] += 10;
            }
            for (int n = 0; n<i; n++){
                if (array[i] == array[n]){
                    i--;
                }
            }
        }


        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
