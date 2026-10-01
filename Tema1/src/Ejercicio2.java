import java.util.Scanner;

public class Ejercicio2 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número");
        int num1 = teclado.nextInt();

        System.out.println("Introduce otro número");
        int num2 = teclado.nextInt();


        if (num1 == num2) {
            System.out.println("Los números son iguales");
        }

        else if (num1 > num2) {
            System.out.println("El primer número es mayor al segundo");

        }

        else if (num1 < num2) {
            System.out.println("El primer número es menor al segundo");

        }


    }
}
