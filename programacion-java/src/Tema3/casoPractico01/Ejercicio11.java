package Tema3.casoPractico01;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa una frase:");
        // Leemos la frase ingresada por el usuario
        String frase = scanner.nextLine();

        int contador = 0;
        // Iteramos sobre cada carácter de la frase
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            // Si encontramos un espacio en blanco seguido de una letra o dígito,
            // incrementamos el contador de palabras
            if (c == ' ' && (i + 1 < frase.length()) &&
                    Character.isLetterOrDigit(frase.charAt(i + 1))) {
                contador++;
            }
        }

        // Si la frase no comienza con un espacio en blanco, consideramos que tiene
        // al menos una palabra
        if (!frase.startsWith(" ")) {
            contador++;
        }

        // Imprimimos el número de palabras encontradas
        System.out.println("La frase tiene " + contador + " palabras.");

    }
}
