package ejerciciosPropuestos.Bucles;

public class Ejercicio04 {
    public static void main(String[] args) {
        System.out.println("Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle for.");

        for(int i = 320; i >= 160; i = (i-20)){
            System.out.println("Cuenta atras " + i );
        }

        for (int i= 320; i>=160; i--){
            System.out.println("La otra cuenta atras " + i );
            i-=19;
        }
    }
}
