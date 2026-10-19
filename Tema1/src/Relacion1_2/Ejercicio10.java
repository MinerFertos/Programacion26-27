package Relacion1_2;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un número positivo y te digo el factorial de este");

        int num = sc.nextInt();
        long factorial = 1;

        for (int i = num; i > 0; i--) {

            System.out.println("Factorial = " + factorial + " * " + i + "=" + (factorial * i));
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + num + "=" + factorial);
    }
}
