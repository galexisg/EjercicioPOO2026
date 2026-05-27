public class Main {
    public static void main(String[] args) {

        Futbolista f1 = new Futbolista(1, "Lionel", "Messi", 36, 10, "Delantero");
        Entrenador e1 = new Entrenador(2, "Luis", "Suárez", 55, "FED-123");
        Masajista m1 = new Masajista(3, "María", "Gómez", 40, "Fisioterapia", 8);


        System.out.println("=== MÉTODOS COMUNES ===");
        f1.concentrarse();
        e1.viajar();
        m1.concentrarse();


        System.out.println("\n=== MÉTODOS ESPECÍFICOS ===");
        f1.jugarPartido();
        e1.dirigirEntrenamiento();
        m1.darMasaje();


        System.out.println("\n=== POLIMORFISMO ===");
        SeleccionDeFutbol[] equipo = { f1, e1, m1 };
        for (SeleccionDeFutbol miembro : equipo) {
            miembro.mostrarRol();
        }
    }
}