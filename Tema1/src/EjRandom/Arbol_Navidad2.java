package EjRandom;

import java.util.Scanner;

public class Arbol_Navidad2 {
    static void main(String[] args) {
        System.out.println("Introduce un número para saber la altura");
        Scanner sc = new Scanner(System.in);

        int altura = sc.nextInt();
        for (int i = 0; i < altura; i++) {

            for (int j = 0; j < altura - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}






