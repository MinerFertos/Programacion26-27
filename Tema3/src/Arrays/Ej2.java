package Arrays;

public class Ej2 {


    public static int numerosNegativos(int[] num) {      //mi arrays se llama num
        int cuenta = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < 0) {
                cuenta += 1;
            }
        }
        return cuenta;
    }

    public static void main(String[] args) {
        int[] arrayNumero = {-2, -5, -3, 8};

        int cuenta = numerosNegativos(arrayNumero);
        System.out.printf("La cantidad es %d", cuenta);


    }
}
