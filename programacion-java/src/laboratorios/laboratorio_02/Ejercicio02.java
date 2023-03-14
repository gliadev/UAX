package laboratorios.laboratorio_02;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {


        // calcular el area de un Circulo.
        Scanner teclado = new Scanner(System.in);

        //1. ENTRADA DE DATOS
        System.out.println("Cálculo del area de un círculo: ");
        System.out.println("Introduce el radio");
        double radio = teclado.nextDouble();

        //2. ALGORITMO
        //area = PI por radio al cuadrado
        //Math es una clase API de Java
        double area = 3.14159265 * radio * radio;
        area = Math.PI * Math.pow(radio, 2);


        //3. SALIDA DE DATOS
        System.out.println("El área es.. "+area);
    }
}
