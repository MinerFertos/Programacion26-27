import java.util.Scanner;

public class EjercicioDictado {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos números enteros");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int suma = n1+n2; // <-- pa´apunte
        int resta = n1-n2;
        int multiplicacion = n1*n2;
        int division = n1/n2;

        System.out.println("Suma es " +suma);
        System.out.println("Resta es " +resta);
        System.out.println("Multiplicacion es " +multiplicacion);
        System.out.println("Division es " +division);

    }
}
