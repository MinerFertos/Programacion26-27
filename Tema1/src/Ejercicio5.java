import java.util.Scanner;

public class Ejercicio5 {
    static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
               System.out.println("Introduce un número");
        int num1 = teclado.nextInt(); //crear variable número

        System.out.println("Introduce otro número");
        int num2 = teclado.nextInt();

        System.out.println("Introduce un tercer número");
        int num3 = teclado.nextInt();

        System.out.println("Introduce un último número");
        int num4 = teclado.nextInt();

        int media = ((num1+num2+num3+num4)/4); //simplemente crear variable media y dividir todos los num/Nºnumero en este caso 4
        System.out.println("El número es " + media ); //sout "" + media





    }
}
