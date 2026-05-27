// CLASE DERIVADA O CLASE HIJA
// Entrenador hereda de SeleccionFutbol porque pertenece a la selección.
public class Entrenador extends SeleccionFutbol {
    private String idFederacion;

    // Constructor de Entrenador
    public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public void dirigirPartido() {
        System.out.println(nombre + " está dirigiendo un partido.");
    }

    public void dirigirEntrenamiento() {
        System.out.println(nombre + " está dirigiendo el entrenamiento.");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Entrenador: " + nombre + " " + apellidos +
                ", Edad: " + edad +
                ", ID Federación: " + idFederacion);
    }
}