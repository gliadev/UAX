package Tema3.casoPractico01;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        System.out.println("Modifica el código Java del anterior ejercicio para almacenar en una variable String\n " +
                "todo el texto que se muestra en pantalla.\n");

        String nombre = "", edad = "", cadenaAMostrar="";
        Scanner teclado = new Scanner(System.in); System.out.print ("Nombre: ");
        nombre=teclado.next(); System.out.print ("Edad: "); edad=teclado.next();
        cadenaAMostrar = nombre + " tiene " + edad + " años.";
        System.out.println (cadenaAMostrar);


    }
}
