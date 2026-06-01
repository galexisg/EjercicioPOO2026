package franklinperez;

public class PruebaMain {
    public static void main(String[] args) {
        // Instanciamos tus objetos de prueba con tu nombre correcto
        Futbolista jugador = new Futbolista(1, "Franklin", "Pérez", 22, 10, "Delantero");
        Entrenador tecnico = new Entrenador(2, "Carlo", "Ancelotti", 65, "FED-456");
        Masajista terapeuta = new Masajista(3, "Roberto", "Martínez", 38, "Fisioterapeuta", 10);

        System.out.println("====== PRUEBA DE HERENCIA (MÉTODOS COMUNES) ======");
        jugador.viajar();
        tecnico.concentrarse();
        terapeuta.viajar();

        System.out.println("\n====== PRUEBA DE POLIMORFISMO POR HERENCIA ======");
        // Invocamos el mismo método modificado en los tres objetos
        jugador.realizarActividadPrincipal();
        tecnico.realizarActividadPrincipal();
        terapeuta.realizarActividadPrincipal();
    }
}