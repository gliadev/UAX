package ejerciciosPropuestos.Bucles;

public class Ejercicio02 {
    public static void main(String[] args) {

        System.out.println("Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.");

        int num1 = 0;


        while (num1 <= 0 || num1 <= 100){
            if (num1 % 5 == 0){
                System.out.println(num1 + " Es multiplo de 5 ");
            }
            num1++;

        }
    }
}
