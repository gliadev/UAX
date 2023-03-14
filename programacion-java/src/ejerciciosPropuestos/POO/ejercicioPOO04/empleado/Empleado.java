package ejerciciosPropuestos.POO.ejercicioPOO04.empleado;

public class Empleado {

    // Atributos
    private String NIF;
    private double sueldoBase;
    private double pagoHoraExtra;
    private double horasExtrasMes;
    private int IRPF;
    private boolean casado;
    private int numeroHijos;


    // constructor con todos los parametros
    public Empleado(String NIF, double sueldoBase, double pagoHoraExtra, double horasExtrasMes, int IRPF, boolean casado, int numeroHijos) {
        this.NIF = NIF;
        this.sueldoBase = sueldoBase;
        this.pagoHoraExtra = pagoHoraExtra;
        this.horasExtrasMes = horasExtrasMes;
        this.IRPF = IRPF;
        this.casado = casado;
        this.numeroHijos = numeroHijos;
    }

    // Metodos

    // Metodo que calcula y devuelva el complemento correspondiente a la horas extra realizadas
    public double complementoHoras(){
        return horasExtrasMes * pagoHoraExtra;
    }

    // Metodo que calcule y devuelva el sueldo bruto.
    public double calculoSueldoBruto(){
        return complementoHoras() + sueldoBase;
    }

    //Uno que calcule y devuelva la retención (IRPF) a partir del tipo,
    //teniendo en cuenta que el porcentaje de retención que hay que
    //aplicar es el tipo menos 2 puntos si el empleado está casado y
    //menos 1 punto por cada hijo que tenga; el porcentaje se aplica
    //sobre todo el sueldo bruto.
    public double calculoIRPF(){
        double retencionIRPF = IRPF;
        if (casado){
            retencionIRPF -= 2;
            retencionIRPF -= numeroHijos;
        } else {
            retencionIRPF -= numeroHijos;
        }
        return calculoSueldoBruto() * (retencionIRPF / 100);
    }

    // Metodo println(): visualización de la información básica del empleado.
    public String println(){
        return "NIF del empleado " + NIF + ". Salario base empleado: " + sueldoBase;
    }

    // Metodo printAll(): visualización de toda la información del empleado. La
    // básica más el sueldo base, el complemento por horas extra, el sueldo bruto,
    // la retención de IRPF y el sueldo neto.
    public void printAll(){
        System.out.println("Informacion del Empleado.");
        System.out.println("Salario Base: " + sueldoBase);
        System.out.println("Complemento horas extras: " + complementoHoras());
        System.out.println("Sueldo bruto: " + calculoSueldoBruto());
        System.out.println("Retencion IFPF: " + IRPF);
        System.out.println("Sueldo neto" + (calculoSueldoBruto() - calculoIRPF()));
    }

}
