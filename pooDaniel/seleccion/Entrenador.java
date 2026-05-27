package seleccion;

// Hereda de la clase padre que defina tu compañero
public class Entrenador extends SeleccionFutbol {

    // Atributo específico encapsulado
    private String idFederacion;

    // Constructor: Pide los datos al padre y setea el propio
    public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
        super(id, nombre, apellidos, edad); // Llama al constructor del padre
        this.idFederacion = idFederacion;
    }

    // Método propio de la clase
    public void dirigirPartido() {
        System.out.println(getNombre() + " " + getApellidos() + " está dirigiendo el partido desde el banquillo.");
    }

    public void dirigirEntrenamiento() {
        System.out.println(getNombre() + " " + getApellidos() + " está diseñando la estrategia en el entrenamiento.");
    }

    // POLIMORFISMO: Sobrescritura del método del padre
    @Override
    public void realizarActividad() {
        System.out.println("[Entrenador] " + getNombre() + " está liderando la sesión de entrenamiento táctico.");
    }

    // Getter y Setter (Encapsulamiento)
    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
}