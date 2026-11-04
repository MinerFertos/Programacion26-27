package Arrays;

public class Ej0AW_anotherway {
    static void main(String[] args) {
        int[] miArrayDeEnteros = {5, 1, 2, 6, 4, 9};
        int resultados = sumaPosicionesPares(miArrayDeEnteros);
        System.out.println("La suma es: " + resultados);
    }

    static int sumaPosicionesPares(int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                suma = suma + array[i];
            }
        }
        return suma;
    }
}

//5+2+4=11 porque si coges las posiciones pares se cogen esos números. posicion 0 es 5 y el cero se considera par, posición 2 es un 2 y la posición 4 es 4 y la suma es 11.