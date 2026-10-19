//un número es perfecto si la suma de sus divisores da el número Ej: 34/1 da de resto 0; 34/2 da de resto 0 y asi todo el rato.

package Relacion1_2;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroPositivo;
        int sumaDivisores;
        int divisor;

        do {
            System.out.println("Escribe un número positivo");
            numeroPositivo = sc.nextInt();

        } while (numeroPositivo < 1);

        sumaDivisores = 0;
        divisor = 1;

        while (divisor <= numeroPositivo / 2) {         //se divide entre 2 porque la mitad de un número ya no tiene divisor porque no hay un número entre el 1 y el dos que lo puedo dividir
            if (numeroPositivo % divisor == 0) {
                sumaDivisores = sumaDivisores + divisor;
            }
            divisor++;
        }
        if (sumaDivisores == numeroPositivo) {
            System.out.println("Es un número perfecto");
        } else System.out.println("El número no es perfecto");

    }
}