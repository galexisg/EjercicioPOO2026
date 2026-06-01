package franklinperez;

public class Futbolista extends SeleccionFutbol {
    private int dorsal;
    private String demarcacion;

    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad); // Invoca al padre
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public void jugarPartido() {
        System.out.println(nombre + " está jugando el partido en la posición de " + demarcacion + ".");
    }

    public void entrenar() {
        System.out.println(nombre + " está haciendo entrenamiento físico en la cancha.");
    }

    // Aplicando Polimorfismo por Herencia
    @Override
    public void realizarActividadPrincipal() {
        System.out.println("[POLIMORFISMO] El Futbolista " + nombre + " está entrenando duro con el balón.");
    }

    public int getDorsal() { return dorsal; }
    public void setDorsal(int dorsal) { this.dorsal = dorsal; }
    public String getDemarcacion() { return demarcacion; }
    public void setDemarcacion(String demarcacion) { this.demarcacion = demarcacion; }
}