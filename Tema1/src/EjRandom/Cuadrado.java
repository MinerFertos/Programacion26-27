package EjRandom;

import java.util.Scanner;

public class Cuadrado {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ejey;
        System.out.println("Dime el tamaño del cuadrado");
        ejey = sc.nextInt();

        for (int i = 0; i < ejey; i++) {
            for (int j = 0; j < ejey; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }

    }
}
