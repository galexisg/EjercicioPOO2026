public class Entrenador extends SeleccionFutbol {

    private String idFederacion;

    public Entrenador(int id, String nombre, String apellidos, int edad,
                      String idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    public void dirigirPartido() {
        System.out.println(getNombre() + " " + getApellidos() + " está dirigiendo el partido.");
    }

    public void dirigirEntrenamiento() {
        System.out.println(getNombre() + " " + getApellidos() + " está dirigiendo el entrenamiento.");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("\n=== ENTRENADOR ===");
        super.mostrarInformacion();
        System.out.println("ID Federación: " + idFederacion);
    }
}