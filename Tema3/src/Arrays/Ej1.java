package Arrays;

import java.util.Scanner;

public class Ej1 {

    //Metodo
    public static int SumaPosicionesPares(int[] num) {      //mi arrays se llama num
        int suma = 0;
        for (int i = 0; i < num.length; i++) {
            if (i % 2 == 0) {
                suma = suma + num[i];
            }
        }
        return suma;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayNumero = new int[6];

        for (int i = 0; i < arrayNumero.length; i++) {
            System.out.println("Introduce los números");
            arrayNumero[i] = sc.nextInt();
        }

        System.out.println(SumaPosicionesPares(arrayNumero));

    }
}
