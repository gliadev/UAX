package ejerciciosPropuestos.Bucles;

public class Ejercicio06 {
    public static void main(String[] args) {
        System.out.println("Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle do-while.");

        int numero = 320;
        do{
            System.out.println(numero);
            numero-=20;

        } while(numero <= 320 && numero >= 160);


    }
}
