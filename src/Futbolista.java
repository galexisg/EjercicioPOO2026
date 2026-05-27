// CLASE DERIVADA O CLASE HIJA
// Futbolista hereda de SeleccionFutbol porque pertenece a la selección.
public class Futbolista extends SeleccionFutbol {
    private int dorsal;
    private String demarcacion;

    // Constructor de Futbolista
    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public void jugarPartido() {
        System.out.println(nombre + " está jugando un partido.");
    }

    public void entrenar() {
        System.out.println(nombre + " está entrenando.");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Futbolista: " + nombre + " " + apellidos +
                ", Edad: " + edad +
                ", Dorsal: " + dorsal +
                ", Demarcación: " + demarcacion);
    }
}