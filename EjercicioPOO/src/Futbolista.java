

public class Futbolista extends SeleccionFutbol {

    // ATRIBUTOS
    private int dorsal;
    private String demarcacion;

    // CONSTRUCTOR VACIO
    public Futbolista() {
    }

    // CONSTRUCTOR CON PARAMETROS
    public Futbolista(int id, String nombre, String apellidos, int edad,
                      int dorsal, String demarcacion) {

        super(id, nombre, apellidos, edad);

        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    // GETTERS Y SETTERS

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    // METODOS PROPIOS

    public void jugarPartido() {
        System.out.println("El futbolista juega el partido.");
    }

    public void entrenar() {
        System.out.println("El futbolista entrena.");
    }

    // POLIMORFISMO

    @Override
    public void concentrarse() {
        System.out.println("El futbolista se concentra antes del partido.");
    }
}