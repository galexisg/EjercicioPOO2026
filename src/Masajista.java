// CLASE DERIVADA O CLASE HIJA
// Masajista hereda de SeleccionFutbol porque pertenece a la selección.
public class Masajista extends SeleccionFutbol {
    private String titulacion;
    private int aniosExperiencia;

    // Constructor de Masajista
    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public void darMasaje() {
        System.out.println(nombre + " está dando un masaje.");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Masajista: " + nombre + " " + apellidos +
                ", Edad: " + edad +
                ", Titulación: " + titulacion +
                ", Años de experiencia: " + aniosExperiencia);
    }
}