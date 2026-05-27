package pooDaniel.seleccion;

// Hereda de la clase padre
public class Masajista extends SeleccionFutbol {

    // Atributos específicos encapsulados
    private String titulacion;
    private int aniosExperiencia;

    // Constructor
    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    // Método propio de la clase
    public void darMasaje() {
        System.out.println(getNombre() + " está dando un masaje de recuperación a un jugador.");
    }

    // POLIMORFISMO: Sobrescritura del método del padre
    @Override
    public void realizarActividad() {
        System.out.println("[Masajista] " + getNombre() + " está preparando los vendajes y la sesión de fisioterapia.");
    }

    // Getters y Setters (Encapsulamiento)
    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
}