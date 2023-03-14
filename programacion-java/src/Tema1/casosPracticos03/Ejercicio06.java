package Tema1.casosPracticos03;

public class Ejercicio06 {
    public static void main(String[] args) {
        /* Haz un programa que declare 3 variables String llamadas Nombre, Apellido1 y Apellido2.
            Asígnales valores e imprímelas por pantalla con el siguiente formato:
            <Apellido1> <Apellido2>, <Nombre>
             [Hay un espacio en blanco entre los dos apellidos, y una coma tras el segundo apellido.
             Lo indicado entre los signos menor y mayor hacer referencia al valor que tengan las variables.
             No hay que imprimir los signos mayor ni menor.]*/


        String Nombre = "Adolfo";
        String Apellido1 = "Patata";
        String Apellido2 = "Patatin";

        String saludo1 = Apellido1 + " " + Apellido2 + ", " + Nombre;
        System.out.println(saludo1);


    }
}
