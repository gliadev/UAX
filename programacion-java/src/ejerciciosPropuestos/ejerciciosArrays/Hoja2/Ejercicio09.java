package ejerciciosPropuestos.ejerciciosArrays.Hoja2;

public class Ejercicio09 {
    public static void main(String[] args) {
        System.out.println("Define un array de números enteros de 3 filas por 6 columnas con nombre num y asigna como\n" +
                "valor la suma de la fila y la columna. Mostrar el contenido del array dispuestos en forma de\n" +
                "tabla.");

            //defino el array de filas y columanas

        int [][]num = new int[3][6];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                num[i][j] = i + j;
            }
        }


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }



    }
}
