package Relacion1_2;

import java.util.Scanner;

public class Ejercicio2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        do {
            System.out.println("Introduzca un número del 1 al 10");
            num = sc.nextInt();
        } while(num<0 || num>10);

        for (int i = 0; i < 11; i++) {
            System.out.println(num + "x" + i + "=" + num*i); // numero (ej:1) "x" + i + "=" + numero*i
        }
    }
}




