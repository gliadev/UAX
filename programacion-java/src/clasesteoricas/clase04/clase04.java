package clasesteoricas.clase04;

import java.util.Scanner;

public class clase04 {
    public static void main(String[] args) {
        //CONDICION solo puede ser VERDADERO O FALSO
        //< > <= >= != == OPERADORES DE COMPARACIÓN
        //&& || ! OPERADORES LÓGICOS
        if (6 == 6) {
            System.out.println("Entrando en 6==6");
        }
        System.out.println("Saliendo");

        System.out.println("------------");

        if (6 < 6) {
            System.out.println("6 < 3");
        } else {// >=
            System.out.println("Entrando 6 >= 6");
        }

        if (6 > 3) {
            System.out.println("Sí es correcto");
        } else {// <=
            System.out.println("Entrando");
        }

        //METEMOS LOS DATOS
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número, vamos a decir si es mayor que 5");
        //int num = teclado.nextInt();
        int num = 5;

        if (num > 5) {
            System.out.println("El número es mayor que 5"); // 1 VEZ
        } else if (num == 5) {
            System.out.println("El número es igual que 5"); // 2 VECEDS
        } else {//num < 5
            System.out.println("El número es menor que 5"); //3 veces
        }

        if (num > 5) {
            System.out.println("El número es mayor que 5");
        }
        if (num == 5) {
            System.out.println("El número es igual que 5");
        }
        if (num < 5) {
            System.out.println("El número es menor que 5");
        }
        //3 Veces

        //SWITCH caso concreto del if
        // IF condicion == 2
        // MENÚ
        System.out.println("1. asdfasdfa");
        System.out.println("2. askldhfalsdfhlas");

        int opcion = teclado.nextInt();

        switch (opcion) {
            case 3: //opcion == 3
                System.out.println("El 3");
                System.out.println("Algoritomo de cálculo del área de un triángulo");
                break;
            case 5: // opcion == 5
                System.out.println("El 5");
                break;
            case 6: //opcion ==6
                System.out.println("El 6");
                break;
            default: //opcion != 3  opcion != 5 opcion != 6
                System.out.println("No está implementado");
        }

        if (opcion == 3) {
            System.out.println("El 3");
        } else if (opcion == 5) {
            System.out.println("El 5");
        } else if (opcion == 6) {
            System.out.println("El 6");
        } else {
            System.out.println("No está implementado");
        }

        /*

        programa que dependiendo de la nota que introduzca el docente
        nos diga si ha sido un notable, bien, suficiente, sobresaliente, suspenso, matrícula de honor
        0-4.99 no llegando al 5 suspenso
        5 - 6 no llegando al 6 es suficiente
        6 - 7 bien
        7-9 notable
        9-9.999 es sobresaliente
        10 MH
        en la condición números enteros
        */
    }
}
