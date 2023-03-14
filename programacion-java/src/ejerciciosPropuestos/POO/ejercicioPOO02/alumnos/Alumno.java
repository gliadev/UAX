package ejerciciosPropuestos.POO.ejercicioPOO02.alumnos;
import java.util.ArrayList;
public class Alumno {

    // Atributos

    // Un programa que cree la clase alumno cuyos atributos serán:
    //matricula, nombre y tres notas parciales
    private String matricula;
    private String nombre;
    private ArrayList<Double> notasParciales;


    // Constructores

   // constructor por defecto;
   public Alumno(){
       this.matricula = "";
       this.nombre = "";
       this.notasParciales = new ArrayList<>();
   }

   // Constructor con parametros
    public Alumno(String matricula, String nombre, ArrayList<Double> notasParciales) {
       this.matricula = matricula;
       this.nombre = nombre;
       this.notasParciales = notasParciales;
    }


    // Metodos

    // Metodo para calcular la nota media
    // uso la variable sumaParciales como almacen, foreach porque me recorre mejor el arraylist
    // cada poscion del araylist la sumo a notasuma de ahi a sumaNotasParciales y retorno un double
    // con el calculo de la nota media, son size() tomo el largo o la ultima posicion del arrayList
   public double calcularNotaMeda(){
       double sumaNotasParciales = 0;
       for ( double notasSuma : notasParciales ) {
           sumaNotasParciales += notasSuma;
       }
       return sumaNotasParciales / notasParciales.size();
    }

    // método que imprima la matrícula,nombre, nota final
    // Indique con un mensaje si el alumno aprobó (nota final >= 5) o no la asignatura.

    public String infoAlumno(){

        return "El Alumno " + nombre + " matricula numero: " + matricula + " tiene una nota final de: " +
                String.valueOf(calcularNotaMeda()) + " el resultado es: " +
                ((calcularNotaMeda() >= 5)
                        ? " Felicidades, APROBADO"
                        : "no superaste la nota media, pero sigue itentandolo ANIMO");
    }





    // GET y SET
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Double> getNotasParciales() {
        return notasParciales;
    }

    public void setNotasParciales(ArrayList<Double> notasParciales) {
        this.notasParciales = notasParciales;
    }


}
