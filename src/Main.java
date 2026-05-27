public class Main {
    public static void main(String[] args) {

        SeleccionFutbol futbolista = new Futbolista(
                1, "Lionel", "Messi", 36, 10, "Delantero"
        );

        SeleccionFutbol entrenador = new Entrenador(
                2, "Carlo", "Ancelotti", 64, "FED-2026"
        );

        SeleccionFutbol masajista = new Masajista(
                3, "Carlos", "Martínez", 40, "Fisioterapia Deportiva", 12
        );

        futbolista.mostrarInformacion();
        futbolista.concentrarse();
        futbolista.viajar();

        System.out.println();

        entrenador.mostrarInformacion();
        entrenador.concentrarse();
        entrenador.viajar();

        System.out.println();

        masajista.mostrarInformacion();
        masajista.concentrarse();
        masajista.viajar();
    }
}