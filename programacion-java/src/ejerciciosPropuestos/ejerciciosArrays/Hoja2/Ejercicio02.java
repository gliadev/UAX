package ejerciciosPropuestos.ejerciciosArrays.Hoja2;

public class Ejercicio02 {
    public static void main(String[] args) {
        System.out.println("Define tres arrays de 20 números enteros cada una, con nombres número, cuadrado y cubo.\n" +
                "Carga el array numero con valores aleatorios entre 0 y 100. En el array cuadrado se deben\n" +
                "almacenar los cuadrados de los valores que hay en el array número. En el array cubo se\n" +
                "deben almacenar los cubos de los valores que hay en número. A continuación, muestra el\n" +
                "contenido de los tres arrays dispuesto en tres columnas.\n\n");


            int numero[] = new int[100];
            int cuadrado[] = new int [100];
            int cubo[] = new int [100];

            // relleno el array de numeros aleatorios
            for ( int i = 0; i < numero.length; i++){
                numero[i] = (int) (Math.random()*100);
            }

            // relleno cuadrado[] con los cuadrados de numero[]
            for ( int i = 0; i < cuadrado.length; i++){
                cuadrado[i] = numero[i] * numero[i];
            }

            // relleno cubo[] con los cubos de numero[]
            for ( int i = 0; i < cubo.length; i++){
                cubo[i] = numero[i] * numero[i] * numero[i];
            }

        System.out.println("Los valores de los Arrays con sus cudrados y sus cubos son");
            // imprimo los resutaldo en tres columnas
            for (int i = 0; i < cuadrado.length; i++){
                System.out.println("El valor " + i + " del Array es: " + numero[i] + " y su cuadrado es: " + cuadrado[i] + " y su cubo es: " + cubo[i]);
            }




    }
}
