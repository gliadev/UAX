package Tema1.casosPracticos03;

public class Ejercicio21 {
    public static void main(String[] args) {
       // Haz un programa que escriba en pantalla los primeros 10 números de la serie de Fibonacci.

        int maximo = 10;
        int num1 = 0;
        int num2 = 1;
        int suma = 1;

        System.out.println(num1);

        for(int i = 1; i< maximo; i++ ){
            System.out.println(suma);
            suma = num1 + num2;
            num1 = num2;
            num2 = suma;
        }
    }
}
