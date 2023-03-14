package Tema3.casoPratico02;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        System.out.println("Escribe un programa que lea la altura de N personas y calcule su altura media. \n" +
                "Calcula después cuántas personas tienen una altura igual, superior o menor a la media e imprime esos valores.\n");

        Scanner teclado = new Scanner(System.in);


        System.out.println("Cuantas alturas de personas vas a introducir??");
        int cantidadEdades = teclado.nextInt();

        int []edades = new int[cantidadEdades];

        for (int i = 0; i < cantidadEdades; i++){
            System.out.println("Introduce la altura: " + (i + 1) );
            edades[i] = teclado.nextInt();
        }

        int sumaEdadesArray = 0;
        for (int sumaEdades : edades){
           sumaEdadesArray += sumaEdades ;
        }

        double calculoMediaAltura = sumaEdadesArray / cantidadEdades;

        System.out.println("La media de alturas es: ");


        int contadorAlturasSuperiorMedia = 0;
        int contadorAlturasInferiorMedia = 0;
        int contadorAlturasIgualMedia = 0;

        if (calculoMediaAltura < contadorAlturasSuperiorMedia){
            contadorAlturasSuperiorMedia++;
        } else if (calculoMediaAltura > contadorAlturasInferiorMedia) {
            contadorAlturasInferiorMedia++;
        } else {
            contadorAlturasIgualMedia++;
        }

        System.out.print("La media de alturas introducida es " + cantidadEdades);


        System.out.println("La alturas superiores a la media de " + calculoMediaAltura + " son " + contadorAlturasSuperiorMedia);
        System.out.println("La alturas inferiores a la media de " + calculoMediaAltura + " son " + contadorAlturasInferiorMedia);
        System.out.println("La alturas iguales a la media de " + calculoMediaAltura + " son " + contadorAlturasIgualMedia);

    }
}
