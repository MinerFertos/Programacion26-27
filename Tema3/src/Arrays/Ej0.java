//Crea manualmente un arrays de 5 posiciones y muestra los elementos en pantalla.

package Arrays;

import java.util.Scanner;

public class Ej0 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arrayNumero = new int[4];

        for (int i = 0; i < arrayNumero.length; i++) {
            System.out.println("Introduce los números");

            arrayNumero[i] = sc.nextInt();

            //asdf


        }
        //lo que pedia este ejercicio es esto de aqui nada mas
        for (int i = 0; i < arrayNumero.length; i++) {
            System.out.println(arrayNumero[i]);
        }
    }
}

