package clasesteoricas.clase06;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        /*
        Escribir un programa que solicite ingresar 10 notas de alumnos y
        nos informe cuántos tienen notas mayores o iguales a 7 y cuántos menores.

         */

        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        int contMayor = 0, contMenor = 0;

        // bucle que se repite 10 veces
        for(int i = 1; i <= 10; i++){
            // iteracion
            do{
                System.out.println("Introduce la nota " + i);
                nota = teclado.nextDouble();
            } while(nota < 0 || nota > 10); // si esta en los valores qeu quiero.. rompe el bucle
            // rangos validos --> entre 0 y 10 --> poner el while lo contrario

            // que pasa si el docente introduce notas no validas en cuanto a rangos??
            // dato valido
            if(nota>=7){
                contMayor++;
            } else{
                contMenor++;
            }
        }

        System.out.println("Mayores o iguales a 7 " + contMayor);
        System.out.println("Menores a 7 " + contMenor);




    }
}
