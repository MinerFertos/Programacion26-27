import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Ejercicio6 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un carácter");

        char letra = sc.next().toUpperCase(Locale.ROOT).charAt(0); //toUpperCase pone la primera letra en mayúscula.
        switch (letra){
            case 'A':
                System.out.println("La vocal es A");
                break;
            case 'E':
                System.out.println("La vocal es E");
                break;
            case 'I':
                System.out.println("La vocal es I");
                break;
            case 'O':
                System.out.println("La vocal es O");
                break;
            case 'U':
                System.out.println("La vocal es U");
                break;
            default:
                System.out.println("No es una vocal");
            break;

        }
        }

    }
