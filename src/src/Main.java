public class Main {
    public static void main(String[] args) {
        System.out.println("=".repeat(50));
        System.out.println("   SELECCIÓN DE FÚTBOL - DEMOSTRACIÓN POO");
        System.out.println("=".repeat(50));

        Futbolista futbolista = new Futbolista(1, "Lionel", "Messi", 36, 10, "Delantero");
        Entrenador entrenador = new Entrenador(2, "Lionel", "Scaloni", 45, "FIFA-12345");
        Masajista masajista = new Masajista(3, "Carlos", "Perez", 50, "Fisioterapia", 15);

        System.out.println("\n🔹 POLIMORFISMO: Mismo método, diferentes comportamientos\n");

        SeleccionFutbol[] equipo = {futbolista, entrenador, masajista};

        for (SeleccionFutbol integrante : equipo) {
            integrante.mostrarInformacion();
        }

        System.out.println("\n🔹 MÉTODOS COMUNES (HEREDADOS)\n");

        futbolista.Concentrarse();
        futbolista.Viajar();

        System.out.println();

        entrenador.Concentrarse();
        entrenador.Viajar();

        System.out.println();

        masajista.Concentrarse();
        masajista.Viajar();

        System.out.println("\n🔹 MÉTODOS ESPECÍFICOS\n");

        futbolista.jugarPartido();
        futbolista.entrenar();

        System.out.println();

        entrenador.dirigirPartido();
        entrenador.dirigirEntrenamiento();

        System.out.println();

        masajista.darMasaje();

        System.out.println("\n🔹 ENCAPSULAMIENTO: Modificando datos con SETTERS\n");

        System.out.println("Dorsal original: " + futbolista.getDorsal());
        futbolista.setDorsal(30);
        System.out.println("Nuevo dorsal: " + futbolista.getDorsal());

        System.out.println("\n" + "=".repeat(50));
        System.out.println("   DEMOSTRACIÓN COMPLETADA CON ÉXITO");
        System.out.println("=".repeat(50));
    }
}