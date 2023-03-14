package clasepresencial.POO;

public class UsoCoche {
        public static void main(String[] args) {
            Coche coche1 = new Coche("Toyota", "Corolla", 120000, "Gasolina", "Negro", 12000);
            Coche coche2 = new Coche("Nissan", "Leaf", 80000, 8000);
            Coche coche3 = new Coche("Tesla", "Model 3", 50000, "Eléctrico", "Blanco", 35000);
            Coche coche4 = new Coche("Ford", "Mustang", 150000, "Gasolina", "Rojo", 20000);
            Coche coche5 = new Coche("Chevrolet", "Camaro", 100000, "Gasolina", "Amarillo", 18000);

            System.out.println("Coche 1: " + coche1.getMarca() + " " + coche1.getModelo());
            System.out.println("Precio original: " + coche1.getPrecio());
            coche1.pasarITV();
            System.out.println("Precio después de pasar ITV: " + coche1.getPrecio());
            coche1.pagarAveria(500);
            System.out.println("Precio después de pagar una avería: " + coche1.getPrecio());
            System.out.println("Valor en Bitcoin: " + coche1.eurosABitcoin(coche1.getPrecio()));



            CocheHistorico cocheHistorico1 = new CocheHistorico("Aston Martin", "DB5", 80000, "Gasolina", "Plateado", 200000, 1965, "Reino Unido");
            CocheHistorico cocheHistorico2 = new CocheHistorico("Porsche", "911", 100000, "Gasolina", "Rojo", 150000, 1970, "Alemania");

            System.out.println("Coche Histórico 1: " + cocheHistorico1.getMarca() + " " + cocheHistorico1.getModelo());
            System.out.println("Años: " + cocheHistorico1.getAnios());
            System.out.println("País de origen: " + cocheHistorico1.getPaisOrigen());
            System.out.println("Precio: " + cocheHistorico1.getPrecio());
            System.out.println("\nCoche Histórico 2: " + cocheHistorico2.getMarca() + " " + cocheHistorico2.getModelo());
            System.out.println("Años: " + cocheHistorico2.getAnios());
            System.out.println("País de origen: " + cocheHistorico2.getPaisOrigen());
            System.out.println("Precio: " + cocheHistorico2.getPrecio());
        }
    }

