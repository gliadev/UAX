package Tema1.casosPracticos03;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        //  Modifica el programa anterior para que no realice una división cuando el divisor sea cero.
        //  En dicho caso, mostrará un aviso por pantalla: “División por cero.”


        int numero1;
        int numero2;
        String operacion;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el primer valor");
        numero1 = teclado.nextInt();

        System.out.println("Introduce el segundo valor");
        numero2 = teclado.nextInt();

        System.out.println("¿ Que operacion quieres realizar: ?");
        operacion = teclado.nextLine();


        switch (operacion){
            case "+":
                System.out.println("La operacion es: " + numero1 + " " + operacion + " " + numero2 + " = " + (numero1+numero2));
                break;
            case "-":
                System.out.println("La operacion es: " + numero1 + " " + operacion + " " + numero2 + " = " + (numero1-numero2));
                break;
            case "/":
                if(numero2 != 0) System.out.println("La operacion es: " + numero1 + " " + operacion + " " + numero2 + " = " + (numero1/numero2));
                else System.out.println("No puedes dividir por 0!!");
                break;
            case "*":
                System.out.println("La operacion es: " + numero1 + " " + operacion + " " + numero2 + " = " + (numero1*numero2));
                break;
        }

        teclado.close();
    }

}
