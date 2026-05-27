public abstract class Persona {

    // Encapsulamiento
    private int id;
    private String nombre;
    private String apellidos;
    private int edad;

    // Constructor
    public Persona(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    // Getters y Setters
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

    // Métodos comunes
    public void concentrarse() {
        System.out.println(nombre + " se está concentrando.");
    }

    public void viajar() {
        System.out.println(nombre + " está viajando.");
    }

    //Método abstracto (Polimorfismo)
    public abstract void actividad();
}