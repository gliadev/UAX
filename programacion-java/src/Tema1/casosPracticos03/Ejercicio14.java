package Tema1.casosPracticos03;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        // Escribe un programa que lea un número del 0 al 9 y escribe su valor en texto.
        int numero = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un numero");
        numero = teclado.nextInt();
        String numeroTexto = "";


        // vamos hacer un switch y le metemos un break asi para la ejecucion y no esta mirando todosç

        if( numero >= 0 && numero <= 10 ){
            switch (numero){
                case 1: numeroTexto = "Uno";
                break;
                case 2: numeroTexto = "Dos";
                    break;
                case 3: numeroTexto = "Tres";
                    break;
                case 4: numeroTexto = "Cuatro";
                    break;
                case 5: numeroTexto = "Cinco";
                    break;
                case 6: numeroTexto = "Seis";
                    break;
                case 7: numeroTexto = "Siete";
                    break;

                case 8: numeroTexto = "Ocho";
                    break;
                case 9: numeroTexto = "Nueve";
                    break;

            }
            System.out.println("El numero que has introducido como " + numero + " es un: " + numeroTexto);
        }



    }
}
