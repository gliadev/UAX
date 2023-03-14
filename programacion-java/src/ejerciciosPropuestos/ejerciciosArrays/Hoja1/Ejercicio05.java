package ejerciciosPropuestos.ejerciciosArrays.Hoja1;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        System.out.println("5. Hacer un programa que pida un numero por teclado y después diga si el numero introducido es capicúa o no.");

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero");
        String numero = teclado.next();

        boolean esCapicua = true;
        int j = numero.length()-1;

        for ( int i = 0; i < numero.length(); i++){
            if (numero.charAt(i) != numero.charAt(j)){
                esCapicua = false;
            }
            j--;
        }

        if (esCapicua){
            System.out.println("WIIII, es capicual");
        } else {
            System.out.printf("No es capicua");
        }





    }
}
