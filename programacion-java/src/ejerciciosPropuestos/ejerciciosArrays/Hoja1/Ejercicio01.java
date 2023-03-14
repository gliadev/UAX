package ejerciciosPropuestos.ejerciciosArrays.Hoja1;
import java.util.Arrays;

public class Ejercicio01 {
    public static void main(String[] args) {
        System.out.println("1. Hacer un programa que rellene un array con los 100 primeros números enteros \n" +
                "y los muestre en pantalla en orden inverso a como se han introducido (orden inverso).\n");

        int [] numeros = new int[100];


        for (int i = 0; i < numeros.length; i++ ) {
            numeros[i] = i + 1;
        }
        for (int i = numeros.length-1; i >= 0; i--){
            System.out.print(numeros[i] + " ");
        }


    }
}
