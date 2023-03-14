package Tema1.casosPracticos03;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        //Haz un programa que lea un número y me diga si es mayor que 50, menor que 50 o igual a 50.

        int nunmeroAdivinar = 0;

        Scanner telado = new Scanner(System.in);
        System.out.println("Inroduce un numero");
        nunmeroAdivinar = telado.nextInt();

        if( nunmeroAdivinar <= 49 ){
            System.out.println("Es menor que 50");
            
        } else if (nunmeroAdivinar == 50) {
            System.out.println("El numero es igual a 50 ");
        } else {
            System.out.println("numero es mayor a 50");
        }

    }
}
