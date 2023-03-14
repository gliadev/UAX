package ejerciciosPropuestos.POO.ejercicioPOO04.persona;

import java.util.Random;


/**
 * The type Persona. vamos a ver si funciona Txabaleria
 */
public class Persona {

    // Atributos
    /*
    Por defecto, todos los atributos menos el DNI serán valores por
    defecto según su tipo (0 números, cadena vacía para String, etc.).
    Sexo será hombre por defecto.
     */
    private String nombre;
    private int edad ;
    private  String DNI;
    private char sexo;
    private double altura;


    // Constructores

    /**
     * Instantiates a new Persona.
     */
// Un constructor por defecto.
    public Persona() {
        nombre = "";
        edad = 0;
        sexo = 'H';
        altura = 0;
        DNI = generarDNI();

    }

    /**
     * Instantiates a new Persona.
     *
     * @param nombre the nombre
     * @param edad   the edad
     * @param sexo   the sexo
     */
// Un constructor con el nombre, edad y sexo, el resto por defecto.
    public Persona(String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.DNI = generarDNI();


    }

    /**
     * Instantiates a new Persona.
     *
     * @param nombre the nombre
     * @param edad   the edad
     * @param DNI    the dni
     * @param sexo   the sexo
     * @param altura the altura
     */
// Un constructor con todos los atributos como parámetro.
    public Persona(String nombre, int edad, String DNI, char sexo, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.altura = altura;
    }


    // Metodos

    // esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano

    /**
     * Es mayorde edad boolean.
     *
     * @return the boolean
     */
    public boolean esMayordeEdad(){
        return edad >= 18 ? true : false;
    }

    /**
     * Comprobar sexo.
     *
     * @param sexo the sexo
     */
// comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no es correcto, será H
    public void comprobarSexo( char sexo ){
        if (sexo != 'H' && sexo != 'M'){
            this.sexo = 'H';
        }
        else {
            this.sexo = sexo;
        }
    }

    /**
     * To stirng string.
     *
     * @return the string
     */
// toString(): devuelve toda la información del objeto.
    public String toStirng(){
        return "Nombre: " + nombre + " edad: " + edad + " DNI: " + DNI + " sexo: " + sexo + " altura: " + altura;
    }

    /**
     * Generar dni string.
     *
     * @return the string
     */
/*
    generaDNI(): genera un número aleatorio de 8 cifras y a partir de este su número.
    Este método será invocado cuando se construya el objeto.
     */
    public String generarDNI(){
        Random random  = new Random();
        int dniAleatorio = random.nextInt(99999999);

        String letrasDNI[] = {"T","R","W", "A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};

        int calculoLetra = dniAleatorio % 23;
        String asignarletraDNI = letrasDNI[calculoLetra];
        String dniTexto = Integer.toString(dniAleatorio);

        return dniTexto + "-" +  asignarletraDNI;
    }

    /**
     * Gets nombre.
     *
     * @return the nombre
     */
// GET y SET
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets nombre.
     *
     * @param nombre the nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Gets edad.
     *
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Sets edad.
     *
     * @param edad the edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Gets dni.
     *
     * @return the dni
     */
    public String getDNI() {
        return DNI;
    }

    /**
     * Sets dni.
     *
     * @param DNI the dni
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    /**
     * Gets sexo.
     *
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * Sets sexo.
     *
     * @param sexo the sexo
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * Gets altura.
     *
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Sets altura.
     *
     * @param altura the altura
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
}
