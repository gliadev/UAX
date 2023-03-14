package Tema1.ejerciciosFeedBack;

public class Divisibles {
    public static void main(String[] args) {
        /*
        Escribir un programa que lea los valores inicial y final de un bucle for,
        que recorrerá los números entre esos dos, indicando para cada uno de ellos si es divisible por 5 o no.
         */


        System.out.println("Este programa muestra si un numero es divisible por 5 con los limites de un bule for");
        System.out.println();
        for( int i = 0; i <= 20; i++ ){
            if( i % 5 == 0){
                System.out.println(i + " es divisible por 5 ");
            } else {
                System.out.println(i + " no es divisible por 5");
            }
        }

    }
}
