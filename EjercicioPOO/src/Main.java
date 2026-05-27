public class Main {

    public static void main(String[] args) {

        // OBJETO FUTBOLISTA
        Futbolista futbolista1 = new Futbolista(
                1,
                "Leandro",
                "Paredes",
                13,
                5,
                "Delantero"
        );

        // OBJETO ENTRENADOR
        Entrenador entrenador1 = new Entrenador(
                2,
                "Carlo",
                "Ancelotti",
                64,
                "FED123"
        );

        // OBJETO MASAJISTA
        Masajista masajista1 = new Masajista(
                3,
                "Juan",
                "Perez",
                40,
                "Fisioterapia",
                15
        );

        // PROBAR METODOS

        System.out.println("===== FUTBOLISTA =====");
        futbolista1.concentrarse();
        futbolista1.viajar();
        futbolista1.entrenar();
        futbolista1.jugarPartido();

        System.out.println();

        System.out.println("===== ENTRENADOR =====");
        entrenador1.concentrarse();
        entrenador1.viajar();
        entrenador1.dirigirPartido();
        entrenador1.dirigirEntrenamiento();

        System.out.println();

        System.out.println("===== MASAJISTA =====");
        masajista1.concentrarse();
        masajista1.viajar();
        masajista1.darMasaje();
    }
}