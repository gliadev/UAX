package Tema3.casoPratico02;

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        System.out.println("Haz un programa que calcule la letra que se corresponde con un número de DNI introducido por el usuario.\n" +
                "El cálculo se realiza utilizando el resto de dividir el número de DNI entre 23 (lo que dará un resultado entre 0 y 22) " +
                "para saber la letra correspondiente al valor obtenido, según la siguiente tabla:");

        char letras[]= {'T','R','W','A','G','M','Y','F', 'P','D','X','B','N','J','Z','S','Q','V','H', 'L','C','K','E'};
        int numDNI;
        Scanner teclado = new Scanner(System.in);
        System.out.print ("DNI: ");
        String aux=teclado.nextLine();
        numDNI=Integer.valueOf(aux);
        System.out.println ("NIF:"+numDNI+letras[(numDNI%23)]);
        teclado.close();
    }
}
