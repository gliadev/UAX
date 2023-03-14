package ejerciciosPropuestos.Bucles;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        System.out.println("Realiza un programa que vaya pidiendo números hasta que se introduzca un número negativo y\n" +
                "nos diga cuantos números se han introducido, la media de los impares y el mayor de los pares.\n" +
                "El número negativo sólo se utiliza para indicar el final de la introducción de datos pero no se\n" +
                "incluye en el cómputo.\n");

        Scanner teclado = new Scanner(System.in);
        int numeroIntroducido = 0;
        int contadorNumerosTotales = 0;
        int contadorSumaImpares= 0;
        int contadorNumerosPares = 0;
        int contadorNumeroImpares = 0;


        do {
            System.out.println("Introduce un numero positivo, negativo cierra el programa.");
            numeroIntroducido = teclado.nextInt();
            contadorNumerosTotales++;

            if (numeroIntroducido %2 != 0 ){
                contadorSumaImpares = contadorSumaImpares + numeroIntroducido;
                contadorNumeroImpares++;
            }




        } while(numeroIntroducido>0);
        System.out.println("Fin del programa");
        System.out.println("Total numeros introducidos " + contadorNumerosTotales);
        System.out.println("Total numeros impares " + contadorNumeroImpares);
        System.out.println("numeros introducidos " + contadorSumaImpares);






    }
}
