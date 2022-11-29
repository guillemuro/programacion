package hoja3;

//Escribir todos los múltiplos de 7 menores que 100

public class eje4 {
    public static void main(String[] args) {
        int multiplo = 7;
        System.out.print("Los multiplos de " + multiplo + " son");
        for (int x = 1; x < multiplo; x++) {
            //if (esmultiplo(multiplo, x)) {
                System.out.print(" " + x);
            }
        }
    }
