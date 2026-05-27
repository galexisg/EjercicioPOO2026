public class Masajista extends Persona {

    private String titulacion;
    private int aniosExperiencia;

    public Masajista(int id, String nombre, String apellidos, int edad,
                     String titulacion, int aniosExperiencia) {
        super(id, nombre, apellidos, edad); // le pasamos los datos básicos a Persona
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulacion() { return titulacion; }
    public void setTitulacion(String titulacion) { this.titulacion = titulacion; }

    public int getAniosExperiencia() { return aniosExperiencia; }
    public void setAniosExperiencia(int aniosExperiencia) { this.aniosExperiencia = aniosExperiencia; }

    public void darMasaje() {
        System.out.println(getNombre() + " está dando masaje de recuperación.");
    }

    @Override
    public void trabajar() {
        System.out.println(getNombre() + " trabaja como masajista titulado en " + titulacion + ".");
    }

    @Override
    public void concentrarse() {
        System.out.println(getNombre() + " se concentra preparando los materiales de fisioterapia.");
    }
}