package Arrays;

public class Ej3 {
    static void main(String[] args) {

        int size = MiEntradaSalida.leerEntero("Cuántos números tendrá el arrays");
        int[] array = new int[size];   //estas creando un arrays de enteros = reserva de size. Es decir si size es 3 el
        ejercicio3(array);            // arrays guarda espacio para 3 numeros.
    }

    public static void ejercicio3(int[] arrayEnteros) {
        for (int i = 0; i < arrayEnteros.length; i++) {
            arrayEnteros[i] = MiEntradaSalida.leerEntero("Introduce el número " + (i + 1));
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arrayEnteros.length; i++) {

        }
    }

}
