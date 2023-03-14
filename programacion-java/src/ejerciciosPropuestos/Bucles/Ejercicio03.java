package ejerciciosPropuestos.Bucles;

public class Ejercicio03 {
    public static void main(String[] args) {
        System.out.println("Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.");

        int numero = 0;

        do{
            if(numero %5 == 0){
                System.out.println(numero + " es multiplo de 5");
            }
            numero++;

        }while (numero <= 0 || numero <=100);
    }
}
