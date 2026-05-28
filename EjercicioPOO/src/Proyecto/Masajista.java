package Proyecto;

public class Masajista extends SeleccionFutbol {
    private String titulacion;
    private Integer aniosExperiencia;

    public Masajista(Integer id, String nombre, String apellidos, Integer edad, String titulacion, Integer anios) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = anios;
    }

    @Override
    public void actividadPrincipal() {
        System.out.println(nombre + " está dando masajes de recuperación (Polimorfismo).");
    }
}
