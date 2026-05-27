package pooDaniel.seleccion;

public class Main {
    public static void main(String[] args) {

        Entrenador entrenador = new Entrenador(1, "Lionel", "Scaloni", 45, "AFA-12345");
        Masajista masajista = new Masajista(2, "Juan", "Pérez", 50, "Fisioterapeuta Deportivo", 20);


        System.out.println("--- ACCIONES HEREDADAS DEL PADRE ---");
        entrenador.concentrarse();
        masajista.viajar();


        System.out.println("\n--- ACCIONES ESPECÍFICAS DE CADA ROL ---");
        entrenador.dirigirPartido();
        masajista.darMasaje();


        System.out.println("\n--- DEMOSTRACIÓN DE POLIMORFISMO ---");
        entrenador.realizarActividad();
        masajista.realizarActividad();
    }
}