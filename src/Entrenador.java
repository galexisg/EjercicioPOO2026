public class Entrenador extends Persona {

    private String idFederacion;

    public Entrenador(int id, String nombre, String apellidos,
                      int edad, String idFederacion) {

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
        System.out.println(getNombre() + " dirige el partido.");
    }

    public void dirigirEntrenamiento() {
        System.out.println(getNombre() + " dirige el entrenamiento.");
    }

    @Override
    public void actividad() {
        System.out.println(getNombre() + " entrena al equipo.");
    }
}