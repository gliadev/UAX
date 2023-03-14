package Tema3.casoPractico01;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        System.out.println("Haz un programa que lea un String y una cadena y me diga si el string leído comienza con la cadena leída.\n" +
                "Debe repetirse este proceso hasta que el string a comprobar sea la palabra FIN.\n" +
                "Tras la ejecución del bucle debe mostrarse el número de palabras que han sido comprobadas.\n" +
                "Por ejemplo:\n" +
                "Texto a buscar: Al\n" +
                "Palabra: María\n" +
                "No comienza por Al\n" +
                "Palabra: Almería\n" +
                "Comienza por Al\n" +
                "Palabra: FIN\n" +
                "Se han comprobado 6 palabras.\n");

        String cadena = "", cars_inicio="";
        Scanner teclado = new Scanner(System.in);
        int numComprobaciones=0;
        System.out.print ("Caracteres de inicio: ");
        cars_inicio=teclado.nextLine();

        do { System.out.print ("\nCadena: ");
            cadena=teclado.nextLine(); if (cadena.toUpperCase().startsWith(cars_inicio.toUpperCase()))
            System.out.println ("Comienza por " + cars_inicio);
            else System.out.println ("NO comienza por " + cars_inicio); numComprobaciones++; }
            while (!cadena.toUpperCase().equals("FIN"));
        System.out.println ("\nSe han comprobado " + (numComprobaciones-1) + " palabras.");

    }
}
