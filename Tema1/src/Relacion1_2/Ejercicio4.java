package Relacion1_2;

import java.util.Scanner;

public class Ejercicio4 {
    static void main(String[] args) {
        System.out.println("Introduce un número positivo");
        Scanner sc = new Scanner(System.in);
        int cantidad = 0;

        do {
            System.out.println("Introduce un numero");
            cantidad = sc.nextInt();
            if (cantidad<=0){
                System.out.println("Debe ser positivo o mayor a 0");
            }

        } while (cantidad <= 0);

        int suma = 0;
        for (int n1=1; n1 <= cantidad; n1++) {

        }

    }
}





