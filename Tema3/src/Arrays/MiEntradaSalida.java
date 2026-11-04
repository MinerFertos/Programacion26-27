package Arrays;

import java.util.Scanner;

public class MiEntradaSalida {
    public static String leercadena(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje + ": ");
        String cadenaIntroducida = sc.nextLine();
        return cadenaIntroducida;
    }

    public static int leerEntero(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.println(mensaje + ": ");
        int numeroLeido = Integer.parseInt(sc.nextLine());
        return numeroLeido;
    }

    public static double leerDouble(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.println(mensaje + ": ");
        double numeroLeido = Double.parseDouble(sc.nextLine());
        return numeroLeido;
    }

    public static int leerEnteroPositivo(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.println(mensaje + ": ");
        int numeroLeidoEntPosit;
        do {
            numeroLeidoEntPosit = Integer.parseInt(sc.nextLine());
            if (numeroLeidoEntPosit <= 0) {
                System.out.println("Introduce un número positivo");
            }
        } while (numeroLeidoEntPosit <= 0);
        return numeroLeidoEntPosit;
    }

    public static int leerEnteroEnRango(String mensaje, int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.println(mensaje + ": ");
        int numeroLeidoEnRango;

        do {
            numeroLeidoEnRango = Integer.parseInt(sc.nextLine());
            if (numeroLeidoEnRango < min || numeroLeidoEnRango > max) {
                System.out.println("Introduce un número dentro del rango");

            }
        } while (numeroLeidoEnRango < min || numeroLeidoEnRango > max);
        return numeroLeidoEnRango;
    }

    public static char leerletra(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%s: ", mensaje);
        char character = sc.nextLine().charAt(0);
        return character;
    }

    public static char leerSiNo(String mensaje) {
        char caracterLeido;
        System.out.printf("%s: ", mensaje);
        Scanner sc = new Scanner(System.in);
        do {
            caracterLeido = sc.nextLine().toUpperCase().charAt(0);
            if (caracterLeido != 'S' && caracterLeido != 'N') {
                System.out.printf("%s (S o N): ", mensaje);
            }

        } while (caracterLeido != 'S' && caracterLeido != 'N');
        return caracterLeido;


    }


//--------------------------------------------------------------------------------------------------//

    static void main(String[] args) {
        String nombre = leercadena("¿cómo te llamas ");
        System.out.println("Hola " + nombre);

        int numero = leerEntero("Dime el número");
        System.out.println("Tu número es " + numero);

        double numerodecimales = leerDouble("Dime el número con decimales");
        System.out.println("Tu número es " + numerodecimales);

        int numeroEntPos = leerEnteroPositivo("Dime el número");
        System.out.println("Tu número es " + numeroEntPos);

        char character = leerletra("Dime el caracter");
        System.out.printf("Tu letra es " + character);


        int numeroEnRango = leerEnteroEnRango("Dime el número", 1, 3);

    }


}

