package laboratorios.laboratorio_12;

public class Coche {
    // atributos
    private String marca;
    private String modelo;

    // constructor


    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // sobrecarga de metodos
    public Coche (String modelo){
        marca = "Porche";
        this.modelo = marca;
    }

    //Metodos -- getters y setters - propios
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }




}
