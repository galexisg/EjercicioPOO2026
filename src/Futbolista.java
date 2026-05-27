public class Futbolista extends Persona {

    private int dorsal;
    private String demarcacion;

    public Futbolista(int id, String nombre, String apellidos, int edad,
                      int dorsal, String demarcacion) {

        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public void jugarPartido() {
        System.out.println(getNombre() + " está jugando el partido.");
    }

    public void entrenar() {
        System.out.println(getNombre() + " está entrenando.");
    }

    // Sobrescritura
    @Override
    public void actividad() {
        System.out.println(getNombre() + " juega fútbol.");
    }
}