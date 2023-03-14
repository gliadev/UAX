package Tema3.casoPratico02;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        System.out.println("Escribe un programa que cree un array con cinco nombres de personas y los imprima por pantalla.");

        Scanner teclado = new Scanner(System.in);

        String []nombres = new String[5];

        for (int i = 0; i < 5; i++){
            System.out.println("Introduce el nombre numero " + (i+1) + " : ");
            nombres[i] = teclado.nextLine();
        }

        System.out.println("Los nombres que dijiste son:");

        for (String nombresIntroducidos : nombres){
            System.out.println(nombresIntroducidos);
        }

    }
}
