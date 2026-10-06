import java.util.Scanner;

public class Ejercicio4 {
    static void main(String[] args) {
        System.out.println("Introduce tu edad siendo menor de 100 años");
        Scanner teclado = new Scanner(System.in);
        int num1 = teclado.nextInt();

        if (num1 <= 12) {
            System.out.println("Eres un niño");
        } else if (num1 <= 17) { //Si es mayor a 12 y no a 17 significa que está entre ambas opciones por ello se pone solo <=17
            System.out.println("Eres un gymbro(adolescente)");
        } else if (num1 <= 29) {
            System.out.println("Eres un gymbro pero más viejo");
        }

        else if (num1 <= 100) {
                System.out.println("Eres un adulto, una pena");
            }
        }
    }


