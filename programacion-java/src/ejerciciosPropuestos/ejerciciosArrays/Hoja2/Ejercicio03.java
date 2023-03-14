package ejerciciosPropuestos.ejerciciosArrays.Hoja2;

public class Ejercicio03 {
    public static void main(String[] args) {
        System.out.println("Escribe un programa que genere aleatoriamente un array de 15 componentes y muestre\n" +
                "los valores máximo y mínimo junto con las palabras “máximo” y “mínimo” al lado\n" +
                "respectivamente.");

            int []numeros = new int[15];



            for ( int i = 0; i < numeros.length; i++){
                numeros[i] = (int) (Math.random()*100);
            }
            int maximo = numeros[0];
            int minimo = numeros[0];

                for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] > maximo) {
                    maximo = numeros[i];
                }
                if (numeros[i] < minimo) {
                    minimo = numeros[i];
                }
            }



            // Muestra el valor máximo y mínimo
            System.out.println("Máximo: " + maximo);
            System.out.println("Mínimo: " + minimo);





    }
}
