package Tema1.casosPracticos03;

public class Ejercicio08 {
    public static void main(String[] args) {

        /*
        Haz un programa que declare 2 variables numéricas y escriba el resultado de las 4 operaciones básicas
        con el siguiente formato:

        <num1> + <num2> = <resultado_suma>
        <num1> - <num2> = <resultado_resta>
        <num1> x <num2> = <resultado_multiplicación>
        <num1> : <num2> = <resultado_división>
        */

        int numero1 = 43;
        double numero2 = 32;

        System.out.println("La suma de: " + numero1 +  " + " + numero2 +  " = " + (numero1 + numero2));
        System.out.println("La resta de: " + numero1 +  " - " + numero2 + " = " + (numero1 - numero2));
        System.out.println("La division de: " + numero1 +  " / " + numero2 + " = " + (numero1 / numero2));
        System.out.println("La multiplicacion de: " + numero1 +  " + " + numero2 + " = " + (numero1 * numero2));

    }
}
