package ejerciciosPropuestos.Bucles;

public class Ejercicio01 {
    public static void main(String[] args) {


        System.out.println(" Este programa muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.");
        for(int i = 0; i <= 100; i++){
            if(i % 5 == 0){
                System.out.println(i + " Es multiplo de 5");
            }
        }
    }
}




