package Tema3.casoPratico02;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        System.out.println("Realiza un programa que lea un nombre de un alumno y tres notas. \n" +
                "Debe guardarse en un array el nombre de los alumnos leídos,\n" +
                " y en otro array la nota media de las 3 leídas.\n");

        String[] nombres = new String[3];  // en este caso, leemos 3 alumnos
        double[] notas_medias = new double[3];

        // Crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Itera sobre cada alumno
        for (int i = 0; i < 3; i++) {
            // Pide al usuario que ingrese el nombre del alumno y las tres notas
            System.out.print("Ingresa el nombre del alumno: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingresa la primera nota: ");
            double nota1 = scanner.nextDouble();
            System.out.print("Ingresa la segunda nota: ");
            double nota2 = scanner.nextDouble();
            System.out.print("Ingresa la tercera nota: ");
            double nota3 = scanner.nextDouble();
            scanner.nextLine();  // consumes the remaining newline character

            // Calcula la nota media del alumno
            double nota_media = (nota1 + nota2 + nota3) / 3;

            // Almacena el nombre del alumno y la nota media en los arrays correspondientes
            nombres[i] = nombre;
            notas_medias[i] = nota_media;
        }

        // Imprime los resultados
        for (int i = 0; i < 3; i++) {
            System.out.printf("El alumno %s tiene una nota media de %.2f\n", nombres[i], notas_medias[i]);
        }


    }
}
