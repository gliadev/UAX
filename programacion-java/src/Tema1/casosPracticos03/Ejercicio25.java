package Tema1.casosPracticos03;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        //Haz un programa que lea dos números y escriba los dos en pantalla
        // rodeando entre paréntesis el mayor (si lo hay).
        //Intenta leer los dos números en una sola línea de entrada.


        int numero1 = 0;
        int numero2 = 0;

        Scanner telcado = new Scanner(System.in);

        System.out.print("Dime dos numeros:  ");
        numero1 = telcado.nextInt();
        numero2 =  telcado.nextInt();

        System.out.println(numero1);
        System.out.println(numero2);

        if(numero1 < numero2 ){
            System.out.println(numero1 + "Es mas pequeño");
        } else if (numero1 > numero2){
            System.out.println( "("+ numero1 +")" + " Es el mayor de los dos ");
        }



    }
}
