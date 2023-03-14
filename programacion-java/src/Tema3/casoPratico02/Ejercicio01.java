package Tema3.casoPratico02;

public class Ejercicio01 {
    public static void main(String[] args) {
        System.out.println("Escribe un programa Java que cree un array de diez posiciones enteras.\n" +
                "Inicialízalo a continuación y después recórrelo con un bucle for para imprimir sus valores por pantalla.\n");

        int []arrayNumeros = {12,32,3,54,45,2,6,34,56,34};

        for (int numero : arrayNumeros){
            System.out.println(numero);
        }

    }
}
