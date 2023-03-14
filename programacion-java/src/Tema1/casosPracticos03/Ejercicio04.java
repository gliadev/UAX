package Tema1.casosPracticos03;

public class Ejercicio04 {
    public static void main(String[] args) {
       /* Crea un programa que ejecute la siguiente expresión matemática y la escriba por pantalla:
        3+4/5
        Modifícala ahora así:
        (3+4)/5
       ¿Sale el mismo resultado? ¿Por qué?
               Por el orden de preferencia.
       */

        double operacion1 = 3+4/5;
        System.out.println(operacion1);

        double operacion2 =  (3+4)/5;
        System.out.println(operacion2);
    }
}
