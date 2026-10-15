//Pide un conjunto de números  // variable int;
//Pregunta si quiere introducir otro número con un S/N  // bucle do-while
//Si equivale a introducir otro número
//No equivale a decir cuál es el menor

package Relacion1_2;

import java.lang.classfile.attribute.SourceDebugExtensionAttribute;
import java.util.Scanner;

public class Ejercicio8 {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int numeros;
        boolean afirmacion = true;
        String pregunta;
        int numeroMenor = 0;
        int contador = 0;

        do {
            System.out.println("Introduce un número");
            numeros = sc.nextInt();

            if (contador == 0){
                numeroMenor = numeros;
            }
            if (numeros<numeroMenor){
                numeroMenor = numeros;
            }

            System.out.println("Desea introducir otro número S/N");
            pregunta = sc.nextLine();
            pregunta = sc.nextLine();

            if (pregunta .equals("S")){

                afirmacion = true;

            }
            else if (pregunta .equals("N")){
                afirmacion = false;

            }

                       contador++;

        } while (afirmacion);
        System.out.println("El número menor es " + numeroMenor);
        System.out.println("Adios");
    }
}

