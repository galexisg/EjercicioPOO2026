public class Evaluacion {

    public static void main(String[] args) {

        Futbolista futbolista = new Futbolista(
                1,
                "Wendy",
                "Joselyn",
                22,
                10,
                "Delantero"
        );

        futbolista.concentrarse();
        futbolista.jugarPartido();
        futbolista.realizarActividad();
    }
}
abstract class Persona {

    private int id;
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void concentrarse() {
        System.out.println(nombre + " se concentra.");
    }

    public void viajar() {
        System.out.println(nombre + " viaja.");
    }

    public abstract void realizarActividad();
}


class Futbolista extends Persona {

    private int dorsal;
    private String demarcacion;

    public Futbolista(int id, String nombre, String apellidos,
                      int edad, int dorsal, String demarcacion) {

        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public void jugarPartido() {
        System.out.println(getNombre() + " juega un partido.");
    }

    @Override
    public void realizarActividad() {
        System.out.println(getNombre() + " entrena fútbol.");
    }
}


class Entrenador extends Persona {

    private String idFederacion;

    public Entrenador(int id, String nombre, String apellidos,
                      int edad, String idFederacion) {

        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    @Override
    public void realizarActividad() {
        System.out.println(getNombre() + " dirige entrenamiento.");
    }
}


class Masajista extends Persona {

    private String titulacion;
    private int aniosExperiencia;

    public Masajista(int id, String nombre, String apellidos,
                     int edad, String titulacion, int aniosExperiencia) {

        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public void realizarActividad() {
        System.out.println(getNombre() + " da masajes.");
    }
}