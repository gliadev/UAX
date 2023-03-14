package laboratorios.laboratorio_12;

public class Principal {
    public static void main(String[] args) {

        Coche coche1 = new Coche("Porche", "Cayenne");

        //coche1.setMarca("Porche");
        //coche1.setModelo("Cayenne");

        System.out.println(coche1.getMarca() +" " + coche1.getModelo());

        Coche coche2 = new Coche("911");


    }
}
