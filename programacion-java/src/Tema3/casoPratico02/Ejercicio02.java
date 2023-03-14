package Tema3.casoPratico02;

import java.util.Arrays;

public class Ejercicio02 {
    public static void main(String[] args) {
        System.out.println("Escribe un programa Java que cree un array de diez posiciones enteras, \n" +
                "lo ordene y después lo imprima por pantalla.");

        int []numeros = {34,45,353,2,532,1,6,365,647,43,10};

        Arrays.sort(numeros);

        for (int numerosOrdenador : numeros){
            System.out.println(numerosOrdenador);
        }
    }
}
