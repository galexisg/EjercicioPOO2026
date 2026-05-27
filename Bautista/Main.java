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

    public void concentrarse() {
        System.out.println(nombre + " se está concentrando.");
    }

    public void viajar() {
        System.out.println(nombre + " está viajando.");
    }

    public abstract void trabajar();

    public void mostrarInformacion() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Edad: " + edad);
    }
}

class Futbolista extends Persona {
    private int dorsal;
    private String demarcacion;

    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public void jugarPartido() {
        System.out.println("El futbolista está jugando un partido.");
    }

    public void entrenar() {
        System.out.println("El futbolista está entrenando.");
    }

    @Override
    public void trabajar() {
        System.out.println("El futbolista trabaja jugando partidos.");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Dorsal: " + dorsal);
        System.out.println("Demarcación: " + demarcacion);
    }
}

class Entrenador extends Persona {
    private String idFederacion;

    public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public void dirigirPartido() {
        System.out.println("El entrenador está dirigiendo un partido.");
    }

    public void dirigirEntrenamiento() {
        System.out.println("El entrenador está dirigiendo el entrenamiento.");
    }

    @Override
    public void trabajar() {
        System.out.println("El entrenador trabaja dirigiendo al equipo.");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("ID Federación: " + idFederacion);
    }
}

class Masajista extends Persona {
    private String titulacion;
    private int aniosExperiencia;

    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public void darMasaje() {
        System.out.println("El masajista está dando un masaje.");
    }

    @Override
    public void trabajar() {
        System.out.println("El masajista trabaja dando masajes.");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Titulación: " + titulacion);
        System.out.println("Años de experiencia: " + aniosExperiencia);
    }
}

public class Main {
    public static void main(String[] args) {

        Persona futbolista = new Futbolista(1, "Carlos", "Moran", 18, 10, "Delantero");
        Persona entrenador = new Entrenador(2, "Luis", "Martinez", 45, "FED123");
        Persona masajista = new Masajista(3, "Ana", "Lopez", 35, "Fisioterapia", 8);

        System.out.println("===== FUTBOLISTA =====");
        futbolista.mostrarInformacion();
        futbolista.concentrarse();
        futbolista.viajar();
        futbolista.trabajar();

        System.out.println();

        System.out.println("===== ENTRENADOR =====");
        entrenador.mostrarInformacion();
        entrenador.concentrarse();
        entrenador.viajar();
        entrenador.trabajar();

        System.out.println();

        System.out.println("===== MASAJISTA =====");
        masajista.mostrarInformacion();
        masajista.concentrarse();
        masajista.viajar();
        masajista.trabajar();
    }
}