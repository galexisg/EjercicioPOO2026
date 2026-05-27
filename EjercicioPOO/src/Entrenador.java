package PACKAGE_NAME;

public class Entrenador extends SeleccionFutbol {

    // ATRIBUTOS
    private String idFederacion;

    // CONSTRUCTOR VACIO
    public Entrenador() {
    }

    // CONSTRUCTOR CON PARAMETROS
    public Entrenador(int id, String nombre, String apellidos,
                      int edad, String idFederacion) {

        super(id, nombre, apellidos, edad);

        this.idFederacion = idFederacion;
    }

    // GETTERS Y SETTERS

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    // METODOS PROPIOS

    public void dirigirPartido() {
        System.out.println("El entrenador dirige el partido.");
    }

    public void dirigirEntrenamiento() {
        System.out.println("El entrenador dirige el entrenamiento.");
    }

    // POLIMORFISMO

    @Override
    public void concentrarse() {
        System.out.println("El entrenador prepara estrategias.");
    }
}