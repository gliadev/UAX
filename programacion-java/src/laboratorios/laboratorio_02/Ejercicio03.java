package laboratorios.laboratorio_02;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        //Calcular los euros que valen los bitcoins introducidos por teclado
        //la equivalencia entre bitcoins y euros hay que introducirla previamente
        //1 bitcoin cuantos euros son...

        Scanner teclado = new Scanner(System.in);
        //1. ENTRADA DE DATOS
        System.out.println("Introduce la equivalencia de 1 Bitcoin en euros ");
        double equivalencia = teclado.nextDouble();

        System.out.println("Introduce los bitcoins que tienes ");
        double bitcoins = teclado.nextDouble();

        //2. ALGORITMO
        //conversion = equivalencia * bitcoins
        double conversion = equivalencia * bitcoins;

        //3. SALIDA DE DATOS
        System.out.println("El resultado es... "+conversion);

    }
}
