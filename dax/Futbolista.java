public class Futbolista extends Persona {

    private int dorsal;
    private String demarcacion;

    public Futbolista(int id, String nombre, String apellidos, int edad,
                      int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() { return dorsal; }
    public void setDorsal(int dorsal) { this.dorsal = dorsal; }

    public String getDemarcacion() { return demarcacion; }
    public void setDemarcacion(String demarcacion) { this.demarcacion = demarcacion; }

    public void jugarPartido() {
        System.out.println(getNombre() + " está jugando un partido como " + demarcacion + ".");
    }

    public void entrenar() {
        System.out.println(getNombre() + " está entrenando en el campo.");
    }

    @Override
    public void viajar() {
        System.out.println(getNombre() + " viaja con el equipo al estadio.");
    }

    @Override
    public void trabajar() {
        System.out.println(getNombre() + " trabaja jugando al fútbol (dorsal #" + dorsal + ").");
    }

    @Override
    public void concentrarse() {
        System.out.println(getNombre() + " se concentra antes del partido.");
    }
}