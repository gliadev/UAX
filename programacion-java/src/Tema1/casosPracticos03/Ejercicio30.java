package Tema1.casosPracticos03;

import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        // Escribe un programa que cuente el número de caracteres que tiene una palabra que haya introducido el usuario.
        // Consulta la referencia Java para poder localizar algún método que realice esta función.


        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una palabra");
        String palabra = teclado.next();
        int contadorPalabras = palabra.length() ;



        System.out.println(palabra);
        System.out.println(palabra + " Tiene " + contadorPalabras + " caracteres");
    }

}
