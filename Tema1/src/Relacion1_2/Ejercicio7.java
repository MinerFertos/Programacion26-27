package Relacion1_2;

import java.util.Scanner;

public class Ejercicio7 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeros;

        do {
            System.out.println("Introduce varios números");
            numeros = sc.nextInt();
            if (numeros <= 0) {
                System.out.println("Inserta un número positivo");
            }
        } while (numeros >= 0);         //pedir números y que sean positivos

        int suma = 0;

        for (int i = 0; i <numeros; i++) {      //la variable números tiene guardada cuantos números has pedido
            System.out.println("Introduce número" + i);

            suma = suma + sc.nextInt();
        }
        System.out.println("La media es " + (double) suma / numeros);
    }
}

// creas la variable
//haces un do para crear un bucle en el que pongas
// haces un if para que si el número es menor a cero no se aplique porque la media no puede tener negativos
//  la primera condición es hacer que pida numeros mayores a 0
//i es un contador

//suma=3 y numeros =2 entonces 3/2
//(double) (suma/numeros) crea un 1.0
//(double) suma/numeros crea un 1.5 orden de paréntesis porque entero entre entero es entero