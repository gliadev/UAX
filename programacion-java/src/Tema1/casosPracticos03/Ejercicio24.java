package Tema1.casosPracticos03;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
       // Escribe un programa que lea caracteres hasta que se introduzca un asterisco.
        //Después imprime en pantalla el número de caracteres introducido.

        int contadorCaracteres = 0;
        String caracter = "";


        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Introduce un Caracter con * terminas el programa");
            contadorCaracteres++;
            caracter = teclado.next();

        } while (caracter.charAt(0)!='*');{
            teclado.close();
            System.out.println("Has introducido un total de: " + contadorCaracteres + " caracteres");
        }

    }
}
