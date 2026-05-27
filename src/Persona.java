// SUPERCLASE
// Esta clase representa a una persona en general.
// Aquí van los datos comunes como id, nombre, apellidos y edad.
public class Persona {
    protected int id;
    protected String nombre;
    protected String apellidos;
    protected int edad;

    // Constructor de la superclase Persona
    public Persona(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    // Metodo general que después se puede sobrescribir
    public void mostrarInformacion() {
        System.out.println("Información general de una persona.");
    }
}