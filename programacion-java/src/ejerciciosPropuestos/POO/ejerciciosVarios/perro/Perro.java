package ejerciciosPropuestos.POO.ejerciciosVarios.perro;

public class Perro {
    /**
     * Crea una clase llamada "Perro" con atributos como "nombre", "raza" y "edad".
     * Agrega métodos para establecer y obtener el valor de cada atributo
     */

    // Atributos
    private String nombre;
    private String raza;
    private int edad;


    // Constructor por defecto
    public Perro() {
    }
    // Constructor con parametros
    public Perro(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    // Metodos
    public String esMayor(){
        if (edad <= 5) {
            return "Es perro adulto";
        }
        return "Es un cachcrro";
    }

    // Get y Set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
