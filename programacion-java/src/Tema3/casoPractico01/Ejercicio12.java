package Tema3.casoPractico01;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        System.out.println("Haz un programa que lea un String y lo escriba al revés.\n" +
                "Por ejemplo:\n" +
                "\"Caperucita\"\n" +
                "aticurepa\n");


        Scanner teclado = new Scanner(System.in);
        System.out.println("Intrduce una palabra para volverla del reves");
        String palabra = teclado.nextLine();

        String palabraReves = "";

        for (int i = palabra.length()-1; i >= 0; i--){
            palabraReves = palabraReves.concat(String.valueOf(palabra.charAt(i)));
        }

        System.out.println(palabraReves);

    }
}
