package Tema3.ejercicioFeedBack;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioB {
    public static void main(String[] args) {
        System.out.println("Hacer una aplicación que pida al usuario introducir 10 palabras y almacenarlas \n" +
                "en un array por palabra. Después se pide que sacar por pantalla las 10 palabras ordenadas \n" +
                " alfabéticamente y por longitud en orden ascendente.\n");

        Scanner teclado = new Scanner(System.in);

        String []palabras = new String[10];

        for (int i = 0; i < palabras.length; i++){
            System.out.println("Dime una palabra.");
            palabras[i] = teclado.nextLine();
        }

        Arrays.sort(palabras);

        for(String palabrasOrdenadas:palabras){
            System.out.printf(palabrasOrdenadas + " ");
        }

    }
}
