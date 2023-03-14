package Tema3.casoPratico02;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        System.out.println("Haz un programa que lea un array de diez posiciones enteras,\n " +
                "y lo recorra para calcular la suma total de los valores y realizar la media aritmética, \n" +
                "valores ambos que deberán mostrarse por pantalla.");
        Scanner teclado = new Scanner(System.in);

        int []numeros = new int[10];
        int sumaNumeros = 0;


        for (int i = 0; i < numeros.length; i++){
            System.out.println("Introduce un numero entero: ");
            numeros[i] = teclado.nextInt();
        }

        // lo recorro para sumarlos

        for (int suma : numeros){
            sumaNumeros += suma;
        }
        double mediaNumeros = sumaNumeros / numeros.length;

        System.out.println("la suma de los numeros introducidos es: " + sumaNumeros);
        System.out.println("La media de los numeros introducidos es: " + mediaNumeros);





    }
}
