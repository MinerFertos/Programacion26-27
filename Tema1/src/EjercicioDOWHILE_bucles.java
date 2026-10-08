//Escribe un programa que solicite una contraseña válida usando un bucle do-while.

import java.util.Scanner;

public class EjercicioDOWHILE_bucles {
    static void main(String[] args) {
        final String PASSWORD = "contraseñah"; //Esta es la  contraseña válida y al escribir final significa que la contraseña no puede variar
        Scanner sc = new Scanner(System.in);

        String passwordUsuario = "";

        do {
            System.out.println("Introduce la contraseña");
            passwordUsuario = sc.nextLine();

        } while(!PASSWORD.equals(passwordUsuario));




    }
}
