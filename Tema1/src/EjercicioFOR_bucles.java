//Sumar los 10 primeros números usando el bucle for.

public class EjercicioFOR_bucles {
    static void main(String[] args) {
        int num1 = 0;

        System.out.println("Te voy a sumar la secuencia consecutiva desde el 0 hasta el 10");

        for (int i=0; i <= 10; i++) {
            num1 = num1+i;

        }

        System.out.println("El número final es " + num1);
    }
}


//0+0=0
//0+1=1
//1+2=3
//3+3=6
//6+4=10
//10+5=15
//15+6=21
//21+7=28
//28+8=36
//36+9=45
//45+10=55