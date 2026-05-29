// CLASE HIJA DE PERSONA
// Esta clase hereda de Persona porque todos los integrantes
// de la selección también son personas.
public class SeleccionFutbol extends Persona {

    // Constructor de SeleccionFutbol
    // Recibe los datos y los envía a la superclase Persona usando super()
    public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
    }

    // Metodo común para todos los integrantes de la selección
    public void concentrarse() {
        System.out.println(nombre + " se está concentrando.");
    }

    // Metodo común para todos los integrantes de la selección
    public void viajar() {
        System.out.println(nombre + " está viajando.");
    }

    // Este metodo se sobrescribe para aplicar polimorfismo
    @Override
    public void mostrarInformacion() {
        System.out.println("Información general de la selección de fútbol.");
    }
}