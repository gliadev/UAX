package clasepresencial.POO;

public class CocheHistorico extends Coche {
    private double anios;
    private String paisOrigen;

    public CocheHistorico() {}

    public CocheHistorico(String marca, String modelo, double kilometros, String combustible, String color, double precio, double anios, String paisOrigen) {
        super(marca, modelo, kilometros, combustible, color, precio);
        this.anios = anios;
        this.paisOrigen = paisOrigen;
    }

    public double getAnios() {
        return anios;
    }

    public void setAnios(double anios) {
        this.anios = anios;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
}

