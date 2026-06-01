package franklinperez;

public class Entrenador extends SeleccionFutbol {
    private String idFederacion;

    public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public void dirigirPartido() {
        System.out.println(nombre + " está dando instrucciones tácticas en el partido.");
    }

    public void dirigirEntrenamiento() {
        System.out.println(nombre + " está coordinando las estrategias de juego.");
    }

    // Aplicando Polimorfismo por Herencia
    @Override
    public void realizarActividadPrincipal() {
        System.out.println("[POLIMORFISMO] El Entrenador " + nombre + " está dirigirguiendo la pizarra táctica.");
    }

    public String getIdFederacion() { return idFederacion; }
    public void setIdFederacion(String idFederacion) { this.idFederacion = idFederacion; }
}