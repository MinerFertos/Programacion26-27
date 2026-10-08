import java.util.Scanner;

public class EjercicioWHILE_bucles {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número");

        int num1 = sc.nextInt();
        int divisor = 2;

        if (num1 < 2) {
            System.out.println("El número no puede ser menor a 2");

        } else {


            while (num1 % divisor != 0) {     //Usamos el while para dividir el número entre incógnita que siempre será 2 y sino es 0 (!= 0) se le sumará uno a la incognita
                divisor++;


            }
            System.out.println("El divisor es " + divisor);
        }
    }

}