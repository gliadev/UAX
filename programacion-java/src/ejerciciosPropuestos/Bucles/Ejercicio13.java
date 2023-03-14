package ejerciciosPropuestos.Bucles;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        System.out.println("Escribe un programa que lea una lista de diez números y " +
                "determine cuántos son positivos, y cuántos son negativos.");
        Scanner teclado = new Scanner(System.in);

            int contadorNumeros = 0;
            int contadorNumeroPositivos = 0;
            int contadorNumerosNegativos = 0;

            do{
                System.out.println("Dime un numero entero negativo o positivo");
                int numeroEntrada = teclado.nextInt();
                if(numeroEntrada < 0){
                    contadorNumeroPositivos++;
                    contadorNumeros++;
                } else {
                    contadorNumerosNegativos++;
                    contadorNumeros++;
                }
            } while(contadorNumeros <=10);
        System.out.println("Has introducido un total de " + contadorNumeros + " numeros, positivos: " + contadorNumeroPositivos
         + " y negativos: " + contadorNumerosNegativos);
    }
}
