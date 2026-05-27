

public class Masajista extends SeleccionFutbol {

    // ATRIBUTOS
    private String titulacion;
    private int aniosExperiencia;

    // CONSTRUCTOR VACIO
    public Masajista() {
    }

    // CONSTRUCTOR CON PARAMETROS
    public Masajista(int id, String nombre, String apellidos,
                     int edad, String titulacion,
                     int aniosExperiencia) {

        super(id, nombre, apellidos, edad);

        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    // GETTERS Y SETTERS

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

    // METODO PROPIO

    public void darMasaje() {
        System.out.println("El masajista da un masaje.");
    }

    // POLIMORFISMO

    @Override
    public void concentrarse() {
        System.out.println("El masajista prepara a los jugadores.");
    }
}