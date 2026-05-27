public class Entrenador extends Persona {

    private String idFederacion;

    public Entrenador(int id, String nombre, String apellidos, int edad,
                      String idFederacion) {
        super(id, nombre, apellidos, edad); // le pasamos los datos básicos a Persona
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() { return idFederacion; }
    public void setIdFederacion(String idFederacion) { this.idFederacion = idFederacion; }

    public void dirigirPartido() {
        System.out.println(getNombre() + " está dirigiendo el partido desde la banda.");
    }

    public void dirigirEntrenamiento() {
        System.out.println(getNombre() + " dirige el entrenamiento del equipo.");
    }

    @Override
    public void trabajar() {
        System.out.println(getNombre() + " trabaja como entrenador (Fed: " + idFederacion + ").");
    }

    @Override
    public void concentrarse() {
        System.out.println(getNombre() + " se concentra analizando la táctica del rival.");
    }
}