package EjRandom;

import java.util.Scanner;

public class Arbol_Navidad {
    static void main(String[] args) {

        System.out.println("Introduce un número para saber la altura");
        Scanner sc = new Scanner(System.in);

        int numAltura = sc.nextInt();
        String arbol = "*";

        if (numAltura > 0) {
            System.out.println("Introduzca número positivo");
        }
        for (int i = 0; i < numAltura; i++) {

            System.out.println(arbol);
            arbol += "*";
        }
    }
}
