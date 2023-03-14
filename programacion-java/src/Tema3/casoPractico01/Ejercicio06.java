package Tema3.casoPractico01;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        System.out.println("Lee un String por teclado y escríbelo con todas sus letras en mayúsculas.\n");

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una frase que pasaremos a mayusuclas");
        String frase = teclado.nextLine();

        System.out.println("La frase que pusiste es: \n" + frase.toUpperCase());
    }
}
