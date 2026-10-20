package Relacion1_4;

import java.util.Scanner;

public class Ej1_4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número entero");
        int numero = sc.nextInt();
        int original = numero;
        int invertido = 0;

        while (numero > 0) {
            int ultimodigito = numero % 10;
            invertido = (invertido * 10) + ultimodigito;
            numero = numero / 10;
        }
        System.out.println("El numero " + original + " invertido es " + invertido);


    }

}

// ej: 912 %10 = 2
// 91 % 10 = 1
// 2 *10 +1
//91/10 = 1
//9% 10 = 9