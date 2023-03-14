package Tema1.casosPracticos03;

import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
       // Escribe un programa que lea una nota académica de un alumno y escriba en pantalla el texto que le corresponda:
           // >9 “SB”
           // Entre 7 y 9 “NT”
           // 6 “BI”
           // 5 “SF”
           //  <5 “IN”


        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la nota que tienes");
        int nota = teclado.nextInt();

        if(nota >= 9){
            System.out.println("Felicidades tiene un Sobresaliente");
        } else if (nota >= 7) {
            System.out.println("Felicidades tienes un Notable");
        } else if (nota >= 6){
            System.out.println("Felicidades tienes un Bien");
        } else if (nota >= 5) {
            System.out.println("Felicidades tienes un Suficiente tenras que esforzarte mas");
        } else if (nota < 5) {
            System.out.println("Lo siento has suspendido");
        } else {
            System.out.println("nota no valida");
        }


    }
}
