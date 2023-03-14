package clasesteoricas.clase06;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        /*
         En una empresa trabajan n empleados cuyos sueldos oscilan entre 100€ y 500€,
         realizar un programa que lea los sueldos que cobra cada empleado e informe cuántos empleados cobran entre 100 y 300
         y cuántos cobran más de 300. Además, el programa deberá informar el importe que gasta la empresa en sueldos al personal.
         */

        Scanner teclado = new Scanner(System.in);
        int contaddorEmpleadosMasDe100 = 0;
        int contadorEmpleadosMasDe300 = 0;
        double  contadorSueldosEmpresa = 0;
        double sueldoEmpleado = 0;

        System.out.println("Cuantos empleados trabajan en esta empresa??");
        int empleados = teclado.nextInt();


        for (int i = 0; i <= empleados; i++){
            do{
                System.out.println("Ingresa el sueldo del empleado");
                sueldoEmpleado = teclado.nextDouble();




            } while(sueldoEmpleado <= 100 || sueldoEmpleado >= 500);

            contadorSueldosEmpresa = sueldoEmpleado + contadorSueldosEmpresa;
            if(sueldoEmpleado >=100 && sueldoEmpleado <=299){
                contaddorEmpleadosMasDe100++;
            } else if (sueldoEmpleado >= 300  && sueldoEmpleado <= 500){
                contadorEmpleadosMasDe300++;
            }

        }


    }
}
