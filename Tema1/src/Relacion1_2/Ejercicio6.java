package Relacion1_2; //6. Realizar un programa que lea dos números enteros cualesquiera numeroA y numeroB,
// y calcule el producto los números mediante sumas, es decir,sin usar el operador *.


import java.util.Scanner;

public class Ejercicio6 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int num1 = sc.nextInt(); //sc.nextInt() sirve para pedirle al usuario un numero
        int num2 = sc.nextInt();
        int numMayor;
        int numMenor;
        int resultado = 0;

        if (num1 > num2) {
            numMayor = num1;
            numMenor = num2;
        } else if (num1 < num2) {
            numMayor = num2;
            numMenor = num1;
        } else {
            numMayor = num1;
            numMenor = num2;
        }

        for (int i = 0; i < numMayor; i++) { //le damos un valor a i, después le decimos cuando debe parar el bucle, que es cuando i es menor a la variable numeroMayor, y el i++ es lo que pasa cuando se termina una ronda del bucle
            resultado = resultado + numMenor; //en la primera ronda resultado vale 0 y se le suma 0 mas numeroMenor (imaginate que es 4) entonces seria resultado = 0 + 4, en la segunda ronda seria resultado = 4 + numMenor y con eso sumamos todos los numeros.

        }
        System.out.println(resultado);

    }
}
