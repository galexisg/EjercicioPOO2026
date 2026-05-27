public class Entrenador extends SeleccionDeFutbol {
    private String idFederacion;

    public Entrenador(Integer id, String nombre, String apellidos, Integer edad, String idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() { return idFederacion; }
    public void setIdFederacion(String idFederacion) { this.idFederacion = idFederacion; }

    public void dirigirPartido() {
        System.out.println(getNombre() + " está dirigiendo un partido.");
    }

    public void dirigirEntrenamiento() {
        System.out.println(getNombre() + " está dirigiendo el entrenamiento.");
    }

    @Override
    public void mostrarRol() {
        System.out.println(getNombre() + " " + getApellidos() + " es ENTRENADOR (ID Federación: " + idFederacion + ")");
    }
}