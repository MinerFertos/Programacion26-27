import java.util.Scanner;

public class EjercicioDictadoConDouble {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos números enteros");
        double n1 = Double.parseDouble(sc.nextLine()); //Double sirve para poner decimales, siempre con ; al final
        double n2 = Double.parseDouble(sc.nextLine()); //sc. y rellenas con next y autocompletas

        double suma = n1+n2;
        double resta = n1-n2;
        double multiplicacion = n1*n2;
        double division = n1/n2;

        System.out.println("Suma es " +suma);
        System.out.println("Resta es " +resta);
        System.out.println("Multiplicacion es " +multiplicacion);
        System.out.println("Division es " +division);

    }
}
