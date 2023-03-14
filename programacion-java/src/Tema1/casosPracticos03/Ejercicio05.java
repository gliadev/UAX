package Tema1.casosPracticos03;

public class Ejercicio05 {
    public static void main(String[] args) {
      /*  Crea un programa que declare una variable del tipo Integer.
        Asígnale un valor y después transfiere ese valor a una variable String.
        A continuación, imprime por pantalla ambas variables. */

        Integer valor1 = 9;
        System.out.println(valor1);

        String valor1Texto = String.valueOf(valor1);
        System.out.println(valor1Texto);

        System.out.println("Aqui el " + valor1 + " es de tipo " + ((Object)valor1).getClass().getSimpleName());
        System.out.println("Aqui el " + valor1Texto + " es de tipo "+ ((Object)valor1Texto.getClass().getSimpleName()));
    }
}
