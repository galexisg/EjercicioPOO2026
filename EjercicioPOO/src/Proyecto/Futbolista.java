package Proyecto;

public class Futbolista extends SeleccionFutbol {
    private Integer dorsal;
    private String demarcacion;

    public Futbolista(Integer id, String nombre, String apellidos, Integer edad, Integer dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    @Override
    public void actividadPrincipal() {
        System.out.println(nombre + " está jugando un partido (Polimorfismo).");
    }

    public void entrenar() {
        System.out.println(nombre + " está realizando un entrenamiento físico.");
    }
}

