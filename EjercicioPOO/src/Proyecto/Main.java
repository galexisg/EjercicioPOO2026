package Proyecto;

public class Main {
    public static void main(String[] args) {
        SeleccionFutbol messi = new Futbolista(1, "Lionel", "Messi", 36, 10, "Delantero");
        SeleccionFutbol scaloni = new Entrenador(2, "Lionel", "Scaloni", 45, "AFA-99");

        messi.actividadPrincipal();
        scaloni.actividadPrincipal();
    }
}

