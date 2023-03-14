package Tema1.casosPracticos03;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        //   Codifica un programa que lea dos números y una operación aritmética,
        //  a continuación, realiza la operación mostrando así el resultado:
        //  <num1> <operación> <num2> = <resultado>

        int numero1;
        int numero2;
        String operacion;

        Scanner tecaldo = new Scanner(System.in);

        System.out.println("Introduce el primer valor");
        numero1 = tecaldo.nextInt();

        System.out.println("Introduce el segundo valor");
        numero2 = tecaldo.nextInt();

        System.out.println("¿ Que operacion quieres realizar: ?");
        operacion = tecaldo.next();


        switch (operacion){
            case "+":
                System.out.println("La operacion es: " + numero1 + " " + operacion + " " + numero2 + " = " + (numero1+numero2));
                break;
            case "-":
                System.out.println("La operacion es: " + numero1 + " " + operacion + " " + numero2 + " = " + (numero1-numero2));
                break;
            case "/":
                System.out.println("La operacion es: " + numero1 + " " + operacion + " " + numero2 + " = " + (numero1/numero2));
                break;
            case "*":
                System.out.println("La operacion es: " + numero1 + " " + operacion + " " + numero2 + " = " + (numero1*numero2));
                break;
        }

    }
}
