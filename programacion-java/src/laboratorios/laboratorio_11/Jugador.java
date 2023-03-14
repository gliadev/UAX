package laboratorios.laboratorio_11;

public class Jugador {


    // todas las clases neceitan uno atributos
    private Integer numero;
    private String nombre;
    private String posicion;


    // constructor por defecto
    public Jugador() {

    }

    // constructor con parametros
    public Jugador(Integer numero, String nombre, String posicion){
        this.numero = numero;
        this.nombre = nombre;
        this.posicion = posicion;
    }

    // metodos comportamiento que pueden hacer los jugadores de Rugby
    public void placar(){
        System.out.println(nombre + "EStoy placando");
    }
    public void patear(){
        System.out.println(nombre + "PATAPUMMM");
    }
    public void insultar(){
        System.out.println("A que te meto");
    }


}
