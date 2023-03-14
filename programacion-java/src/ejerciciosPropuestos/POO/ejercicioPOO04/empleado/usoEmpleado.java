package ejerciciosPropuestos.POO.ejercicioPOO04.empleado;

public class usoEmpleado {
    public static void main(String[] args) {
        /*
        Finalmente, crear una clase Principal que instancie 4 empleados y pruebe
        la funcionalidad de los métodos programados.
         */

        Empleado empleado1 = new Empleado("19999494M", 1500.50, 13.25, 15,
                19, false, 2);

        Empleado empleado2 = new Empleado("19943494M", 2100.50, 21.25, 6,
                12, true, 0);

        Empleado empleado3 = new Empleado("199494M", 1800.50, 56.20, 1,
                32, true, 9);

        Empleado empleado4 = new Empleado("199443494M", 1500.50, 13.25, 15,
                19, false, 6);


        empleado1.printAll();
        System.out.println();
        empleado2.printAll();
        System.out.println();
        empleado3.printAll();
        System.out.println();
        empleado4.printAll();

    }
}
