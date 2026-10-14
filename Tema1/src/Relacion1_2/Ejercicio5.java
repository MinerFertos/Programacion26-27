package Relacion1_2;

import java.util.Scanner;

public class Ejercicio5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = -1; //Primero necesitamos crear una variable contador para sumarle siempre +1
        int numero;

        do { // Haz que se introduzca un número y se sume uno todo el rato.
            System.out.println("Introduce un número");
            numero= sc.nextInt();
            contador++;

        }while(numero>=0); //Mientras el numero sea mayor o igual a cero
        System.out.println("Has introducido " + contador + " Numeros positivos");

      }

    }


