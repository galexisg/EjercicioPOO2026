public class Main {

    public static void main(String[] args) {

        Futbolista futbolista = new Futbolista(1,
                "Lionel",
                "Messi",
                36,
                10,
                "Delantero"
        );

        Entrenador entrenador = new Entrenador(
                2,
                "Pep",
                "Guardiola",
                50,
                "FED123"
        );

        Masajista masajista = new Masajista(
                3,
                "Carlos",
                "Lopez",
                40,
                "Fisioterapia",
                15
        );

        // Métodos heredados
        futbolista.concentrarse();
        entrenador.viajar();
        masajista.concentrarse();

        System.out.println();

        // Métodos propios
        futbolista.jugarPartido();
        entrenador.dirigirPartido();
        masajista.darMasaje();

        System.out.println();

        // Polimorfismo
        futbolista.actividad();
        entrenador.actividad();
        masajista.actividad();
    }
}