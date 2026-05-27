public class Masajista extends SeleccionFutbol {

    private String titulacion;
    private int aniosExperiencia;

    public Masajista(int id, String nombre, String apellidos, int edad,
                     String titulacion, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

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

    public void darMasaje() {
        System.out.println(getNombre() + " " + getApellidos() + " está dando un masaje.");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("\n=== MASAJISTA ===");
        super.mostrarInformacion();
        System.out.println("Titulación: " + titulacion);
        System.out.println("Años de experiencia: " + aniosExperiencia);
    }
}