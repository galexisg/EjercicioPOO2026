package Proyecto;

public class Entrenador extends SeleccionFutbol {
    private String idFederacion;

    public Entrenador(Integer id, String nombre, String apellidos, Integer edad, String idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    @Override
    public void actividadPrincipal() {
        System.out.println(nombre + " está dirigiendo un partido (Polimorfismo).");
    }

    public void dirigirEntrenamiento() {
        System.out.println(nombre + " está dirigiendo la táctica del entrenamiento.");
    }
}

