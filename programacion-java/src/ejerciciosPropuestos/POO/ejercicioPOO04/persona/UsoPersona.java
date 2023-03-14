package ejerciciosPropuestos.POO.ejercicioPOO04.persona;

import java.util.Scanner;

/**
 * The type Uso persona.
 */
public class UsoPersona {
    /**
     * The entry point of application.
     * segundo
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);




        // Pide por teclado el nombre, la edad, sexo y altura.
        System.out.println("Introduce tu nombre: ");
        String nombreTeclado = teclado.nextLine();

        System.out.println("Introduce tu edad:");
        int edadTeclado = teclado.nextInt();

        System.out.println("Introduce tu Sexo: H / M");
        char sexoTeclado = teclado.next().charAt(0);

        System.out.println("Introduce tu altura");
        double alturaTeclado = teclado.nextDouble();

        /*
        Crea 3 objetos de la clase anterior, el primer objeto obtendrá las anteriores variables pedidas por teclado,
        el segundo objeto obtendrá todos los anteriores menos la altura y el último por defecto.
         */

        // 1. El primer objeto obtendrá las anteriores variables pedidas por teclado
        Persona persona1 = new Persona();

        persona1.setNombre(nombreTeclado);
        persona1.setEdad(edadTeclado);
        persona1.setSexo(sexoTeclado);
        persona1.setAltura(alturaTeclado);
        System.out.println(persona1.toStirng());

        // 2. El segundo objeto obtendrá todos los anteriores menos la altura
        Persona persona2 = new Persona();
        persona2.setNombre("Patata");
        persona2.setEdad(25);
        persona2.setSexo('m');
        persona2.getDNI();
        System.out.println(persona2.toStirng());

        // Indicar para cada objeto si es mayor de edad.
        System.out.println(persona1.esMayordeEdad());
        System.out.println(persona2.esMayordeEdad());


    }
}
