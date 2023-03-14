package Tema2.ejercicioFeedBack;

/**
 * The type Poblacion.
 * Hola Damian aqui te denjo mi ejercicio, lo que hecho a sido crear las dos clase juntas aunque luego el IDE las separa lo hago como una relacion
 * creado los atributos, luego el consturctor por defecto, y el constructor con parametros, los set y los get por separado.
 */
public class Poblacion {
    // Atributos
    private String comunidadAutonoma;
    private String provincia;
    private String poblacion;
    private Padron padron;


    /**
     * Instantiates a new Poblacion.
     */
// Constructores
    // Constructor por defecto
    public Poblacion() {
    }

    /**
     * Instantiates a new Poblacion.
     *
     * @param comunidadAutonoma the comunidad autonoma
     * @param provincia         the provincia
     * @param poblacion         the poblacion
     * @param padron            the padron
     */
// Constructor con parametros
    public Poblacion(String comunidadAutonoma, String provincia, String poblacion, Padron padron) {
        this.comunidadAutonoma = comunidadAutonoma;
        this.provincia = provincia;
        this.poblacion = poblacion;
        this.padron = padron;
    }

    // Metodos

    /**
     * Gets comunidad autonoma.
     *
     * @return the comunidad autonoma
     */
// Get y Set
    public String getComunidadAutonoma() {
        return comunidadAutonoma;
    }

    /**
     * Gets provincia.
     *
     * @return the provincia
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * Gets poblacion.
     *
     * @return the poblacion
     */
    public String getPoblacion() {
        return poblacion;
    }

    /**
     * Gets padron.
     *
     * @return the padron
     */
    public Padron getPadron() {
        return padron;
    }

    /**
     * Sets comunidad autonoma.
     *
     * @param comunidadAutonoma the comunidad autonoma
     */
    public void setComunidadAutonoma(String comunidadAutonoma) {
        this.comunidadAutonoma = comunidadAutonoma;
    }

    /**
     * Sets provincia.
     *
     * @param provincia the provincia
     */
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    /**
     * Sets poblacion.
     *
     * @param poblacion the poblacion
     */
    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    /**
     * Sets padron.
     *
     * @param padron the padron
     */
    public void setPadron(Padron padron) {
        this.padron = padron;
    }
}


/**
 * The type Padron.
 */
class Padron {
    // Atributos de la clase
    private int anyoPadron;
    private int numeroHabitantes;
    private double porcentajeVariacionHabitantes;


    /**
     * Instantiates a new Padron.
     */
// Constructores
    // Constructor por defecto
    public Padron() {
    }

    /**
     * Instantiates a new Padron.
     *
     * @param anyoPadron                    the anyo padron
     * @param numeroHabitantes              the numero habitantes
     * @param porcentajeVariacionHabitantes the porcentaje variacion habitantes
     */
// Constructor con parametros
    public Padron(int anyoPadron, int numeroHabitantes, double porcentajeVariacionHabitantes) {
        this.anyoPadron = anyoPadron;
        this.numeroHabitantes = numeroHabitantes;
        this.porcentajeVariacionHabitantes = porcentajeVariacionHabitantes;
    }

    // Metodos



    // Get y Set


    /**
     * Gets anyo padron.
     *
     * @return the anyo padron
     */
    public int getAnyoPadron() {
        return anyoPadron;
    }

    /**
     * Gets numero habitantes.
     *
     * @return the numero habitantes
     */
    public int getNumeroHabitantes() {
        return numeroHabitantes;
    }

    /**
     * Gets porcentaje variacion habitantes.
     *
     * @return the porcentaje variacion habitantes
     */
    public double getPorcentajeVariacionHabitantes() {
        return porcentajeVariacionHabitantes;
    }

    /**
     * Sets anyo padron.
     *
     * @param anyoPadron the anyo padron
     */
    public void setAnyoPadron(int anyoPadron) {
        this.anyoPadron = anyoPadron;
    }

    /**
     * Sets numero habitantes.
     *
     * @param numeroHabitantes the numero habitantes
     */
    public void setNumeroHabitantes(int numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }

    /**
     * Sets porcentaje variacion habitantes.
     *
     * @param porcentajeVariacionHabitantes the porcentaje variacion habitantes
     */
    public void setPorcentajeVariacionHabitantes(double porcentajeVariacionHabitantes) {
        this.porcentajeVariacionHabitantes = porcentajeVariacionHabitantes;
    }
}
