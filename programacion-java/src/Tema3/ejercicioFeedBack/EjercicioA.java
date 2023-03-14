package Tema3.ejercicioFeedBack;

import java.util.Scanner;

public class EjercicioA {
    public static void main(String[] args) {
        System.out.println("Hacer una aplicación que pida por pantalla que se escriba una frase para almacenarla, \n" +
                "después sacar por pantalla la misma frase al revés.\n");

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una frase que le daremos la vuelta.");
        String frase = teclado.nextLine();


        String fraseAlReves = "";
        for (int i = frase.length() - 1; i >= 0; i--) {
            fraseAlReves += frase.charAt(i);
        }

        System.out.println("\nLa frase al revés es: " + frase + "\n" + "la frase al reves es: " + fraseAlReves );


    }
}
