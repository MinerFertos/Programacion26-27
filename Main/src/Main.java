import javax.swing.*;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu nombre de piloto");
        String nombre_piloto = sc.nextLine();


        int num_vueltas;
        int otro_num;

        do {
            System.out.printf("Introduce el número de vueltas que quieres dar");
            num_vueltas = sc.nextInt();
        } while (num_vueltas > 3 || num_vueltas <= 10);

        if (num_vueltas> 3 || num_vueltas <= 10) {
            System.out.println("Bien");
        } 

    }
}






