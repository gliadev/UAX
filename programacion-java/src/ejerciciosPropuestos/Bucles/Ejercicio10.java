package ejerciciosPropuestos.Bucles;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        System.out.println("Escribe un programa que calcule la media de un conjunto de números positivos introducidos por teclado. " +
                "A priori, el programa no sabe cuántos números se introducirán. " +
                "El usuario indicará que ha terminado de introducir los datos cuando meta un número negativo.");
        Scanner teclado = new Scanner(System.in);

        double numero = 0;
        double almancen = 0;
        int contador = 0;



        do{
            System.out.println("Introduce un numero positivo, el programa se cierra al introducir un numero negativo");
            numero = teclado.nextInt();
            if(numero<0){
                System.out.println(numero);
                System.out.println(almancen);
                almancen = numero + almancen;
                contador++;
            }

        }while(numero>0);
        System.out.println("Has introducido un numero negativo");
        System.out.println("La media de los numeros introducidos es: " + numero/contador);



    }
}
