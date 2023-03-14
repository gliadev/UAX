package Tema3.casoPractico01;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        System.out.println("Lee un String por teclado y escribe su tamaño.");

        Scanner teclado = new Scanner(System.in);

        System.out.println("Pon una frase y te dire su longitud en caracteres");
        String texto = teclado.nextLine();

        System.out.println("La frase tiene una longitud de " + texto.length() + " caracteres.");

    }
}
