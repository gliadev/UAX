package ejerciciosPropuestos.Bucles;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        System.out.println("\nEscribe un programa que obtenga los números enteros comprendidos entre dos números\n" +
                "introducidos por teclado y validados como distintos, el programa debe empezar por el menor de los\n" +
                "enteros introducidos e ir incrementando de 7 en 7.");

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el pimer numero");
        int numeroIntroducidoUno = teclado.nextInt();


        System.out.println("Introduce el segundo numero");
        int numeroIntroducidoDos = teclado.nextInt();



        if(numeroIntroducidoUno<numeroIntroducidoDos){
            for(int i = numeroIntroducidoUno; i <= numeroIntroducidoDos; i = (i + 7)){
                System.out.println("El numero introducido es: " + i);
            }
        } else if (numeroIntroducidoUno>numeroIntroducidoDos) {
            System.out.println("El segundo valor tiene que ser superior que el segundo");
        } else if (numeroIntroducidoUno==numeroIntroducidoDos) {
            System.out.println("Los numeros tienen que ser distintos");
        }


    }
}
