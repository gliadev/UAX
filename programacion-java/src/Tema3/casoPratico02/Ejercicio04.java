package Tema3.casoPratico02;

public class Ejercicio04 {
    public static void main(String[] args) {
        System.out.println("Crea un programa que declare dos arrays, uno de nombres de personas\n " +
                "y otro de edades, de tres posiciones cada uno.\n" +
                "Después, recórrelos imprimiendo cada par persona-edad en una sola línea.\n");

        String []nombres = {"Paco", "Pepe", "Patata"};
        int []edadNombres = {15,54,67};

        for (int i = 0; i < 3; i++){
            System.out.println(nombres[i] + " " + edadNombres[i]);
        }
        System.out.println();


        // puedo hacerlo con un for-each tambien tengo que hacer un contador

        int i = 0;

        for (String nombresImprimidos : nombres){
            System.out.println(nombresImprimidos + " " + edadNombres[i] );

        }




    }
}
