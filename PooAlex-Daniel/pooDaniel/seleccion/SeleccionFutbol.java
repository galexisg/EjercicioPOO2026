package pooDaniel.seleccion;

// esta es la superclase Padre de la cual van a heredar enntrenador masajista y futbolista
public class SeleccionFutbol {


    protected int id;
    protected String nombre;
    protected String apellidos;
    protected int edad;

    // constructor padre al q van a llamar las clases hijas
    public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public void concentrarse() {
        System.out.println(nombre + " " + apellidos + " está concentrado con la delegación.");
    }

    public void viajar() {
        System.out.println(nombre + " " + apellidos + " está viajando con el equipo.");
    }

    public void realizarActividad() {
        System.out.println(nombre + " " + apellidos + " está realizando una actividad genérica en la selección.");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}