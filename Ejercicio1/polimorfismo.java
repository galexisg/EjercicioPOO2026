public class polimorfismo {
    public static void main(String[] args) {

        SeleccionFutbol persona;

        persona = new Futbolista(1, "Carlos", "Martinez", 22, 10, "Delantero");
        persona.mostrarInformacion();
        persona.concentrarse();
        persona.viajar();
        persona.realizarFuncion();

        System.out.println("");

        persona = new Entrenador(2, "Jose", "Ramirez", 45, "FED123");
        persona.mostrarInformacion();
        persona.concentrarse();
        persona.viajar();
        persona.realizarFuncion();

        System.out.println("");

        persona = new Masajista(3, "Ana", "Lopez", 30, "Fisioterapia", 5);
        persona.mostrarInformacion();
        persona.concentrarse();
        persona.viajar();
        persona.realizarFuncion();
    }
}

class SeleccionFutbol {
    private int id;
    private String nombre;
    private String apellidos;
    private int edad;

    public SeleccionFutbol() {
    }

    public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public void mostrarInformacion() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Edad: " + edad);
    }

    public void concentrarse() {
        System.out.println(nombre + " se esta concentrando");
    }

    public void viajar() {
        System.out.println(nombre + " esta viajando");
    }

    public void realizarFuncion() {
        System.out.println("La persona realiza una funcion dentro de la seleccion");
    }

    public String getNombre() {
        return nombre;
    }
}

class Futbolista extends SeleccionFutbol {
    private int dorsal;
    private String demarcacion;

    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("*******DATOS DEL FUTBOLISTA*******");
        super.mostrarInformacion();
        System.out.println("Dorsal: " + dorsal);
        System.out.println("Demarcacion: " + demarcacion);
    }

    @Override
    public void realizarFuncion() {
        System.out.println(getNombre() + " juega partidos y entrena con el equipo");
    }
}

class Entrenador extends SeleccionFutbol {
    private String idFederacion;

    public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("*******DATOS DEL ENTRENADOR*******");
        super.mostrarInformacion();
        System.out.println("ID Federacion: " + idFederacion);
    }

    @Override
    public void realizarFuncion() {
        System.out.println(getNombre() + " dirige partidos y entrenamientos");
    }
}

class Masajista extends SeleccionFutbol {
    private String titulacion;
    private int aniosExperiencia;

    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("*******DATOS DEL MASAJISTA*******");
        super.mostrarInformacion();
        System.out.println("Titulacion: " + titulacion);
        System.out.println("Anios de experiencia: " + aniosExperiencia);
    }

    @Override
    public void realizarFuncion() {
        System.out.println(getNombre() + " da masajes y atiende fisicamente al equipo");
    }
}