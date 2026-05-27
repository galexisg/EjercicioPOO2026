public abstract class Persona {

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

    // getters y setters de los atributos comunes
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    // concentrarse tiene una versión base, pero cada clase puede sobreescribirla
    public void concentrarse() {
        System.out.println(nombre + " se está concentrando.");
    }

    public void viajar() {
        System.out.println(nombre + " está viajando.");
    }

    // cada subclase está obligada a definir cómo trabaja
    public abstract void trabajar();

    @Override
    public String toString() {
        return "ID: " + id + " | Nombre: " + nombre + " " + apellidos + " | Edad: " + edad;
    }
}