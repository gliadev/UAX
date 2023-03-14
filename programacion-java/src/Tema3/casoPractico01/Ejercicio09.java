package Tema3.casoPractico01;

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        System.out.println("Haz un programa Java que lea una cadena de caracteres y me diga si comienza con las letras “AL”.\n");
        String cadena = "";
        Scanner teclado = new Scanner(System.in);
        System.out.print ("Cadena: "); cadena=teclado.nextLine();
        if (cadena.toUpperCase().startsWith("AL")) System.out.println ("Comienza por AL");
        else System.out.println ("NO comienza por AL");



    }
}
