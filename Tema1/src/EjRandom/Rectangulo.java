package EjRandom;

import java.util.Scanner;

public class Rectangulo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime la altura y la anchura del cuadrado");

        int altura = sc.nextInt();
        int anchura = sc.nextInt();


        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                System.out.print("*  ");

            }
            System.out.println();
        }
    }
}
