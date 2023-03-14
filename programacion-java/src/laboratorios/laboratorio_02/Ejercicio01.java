package laboratorios.laboratorio_02;

import java.util.Scanner;

public class Ejercicio01 {
    //Realización de fórmulas u operaciones
    //Calcular el ÁREA de un triángulo
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Vamos a calcular el área de un triángulo");
        //1. ENTRADA DE DATOS
        //LAS VARIABLES
        //Declaración de variables

        System.out.println("Introduce la base del triángulo: ");
        //declaración + inicialización
        double base =teclado.nextDouble();

        System.out.println("El valor recogido es.. "+base);

        System.out.println("Introduce la altura del triángulo: ");
        double altura = teclado.nextDouble();
        System.out.println("El valor recogido es.. "+altura);

        //2. ALGORITMO
        //area = base por altura divido por 2
        Double area;
        area = (base * altura) / 2;


        //3. SALIDA DE DATOS
        System.out.println("El area es... "+area);
        System.out.println("---------------------------------------------------------------");
        System.out.println("Para el lado "+base+" y la altura "+altura+". El área es: "+area);
        //String salida = area.toString();
        //System.out.println(salida);
        //System.out.pr
    }
}
