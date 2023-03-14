package Tema3.casoPractico01;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        System.out.println("Codifica un programa Java que lea cadenas de caracteres hasta que una de ellas tenga 7 caracteres.\n");


        Scanner teclado = new Scanner(System.in);

        String cadena = "";

        do {
            System.out.println("Introduce una cadena hasta que tenga 7 caracteres");
            cadena = teclado.nextLine();
            System.out.println("la cadena tiene " + cadena.length() + " caracteres");

        }while (cadena.length() != 7);

        System.out.println("Pusiste una cadena de 7 caracteres");
    }
}
