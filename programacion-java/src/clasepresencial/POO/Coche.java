package clasepresencial.POO;

public class Coche {
    private String marca;
    private String modelo;
    private double kilometros;
    private String combustible;
    private String color;
    private double precio;

    public Coche() {}

    public Coche(String marca, String modelo, double kilometros, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.kilometros = kilometros;
        this.precio = precio;
    }

    public Coche(String marca, String modelo, double kilometros, String combustible, String color, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.kilometros = kilometros;
        this.combustible = combustible;
        this.color = color;
        this.precio = precio;
    }

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

    public double getKilometros() {
        return kilometros;
    }

    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void pasarITV() {
        this.precio += 60;
    }

    public void pagarAveria(double costoAveria) {
        this.precio += costoAveria;
    }

    public double eurosABitcoin(double precioEuros) {
        return precioEuros / 43491.59;
    }
}