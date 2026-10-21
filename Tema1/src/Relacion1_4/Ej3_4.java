package Relacion1_4;

import java.util.Locale;
import java.util.Scanner;

public class Ej3_4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribeme un número y te lo convierto a romano");

        int numero = sc.nextInt();
        char letra = 'I';
        char letra2 = 'V';
        char letra3 = 'X';
        char letra4 = 'L';
        char letra5 = 'C';
        char letra6 = 'D';
        char letra7 = 'M';

        if (numero == 1000){
            System.out.println("El número es " + letra7);
        }
        if (numero == 500){
            System.out.println("El número es " + letra6);
        }

    }
    }

