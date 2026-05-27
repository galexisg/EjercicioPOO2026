public class Main {

    public static void main(String[] args) {

        System.out.println("CREANDO OBJETOS (Herencia + Encapsulamiento)\n");

        Futbolista f = new Futbolista(1, "Carlos", "Martínez", 25, 10, "Delantero");
        Entrenador e = new Entrenador(2, "Luis", "González", 45, "FED-2024-001");
        Masajista  m = new Masajista (3, "Ana",   "Rivas",    35, "Fisioterapia", 8);

        System.out.println(f);
        System.out.println(e);
        System.out.println(m);

        System.out.println("\nPolimorfismo: método trabajar() sobrescrito\n");

        Persona[] equipo = { f, e, m };

        for (Persona p : equipo) {
            p.trabajar();
        }

        System.out.println("\nPolimorfismo: concentrarse() sobrescrito\n");

        for (Persona p : equipo) {
            p.concentrarse();
        }

        System.out.println("\nPolimorfismo: viajar() sobrescrito\n");

        for (Persona p : equipo) {
            p.viajar();
        }

        System.out.println("\nMétodos específicos de cada clase\n");

        f.jugarPartido();
        f.entrenar();

        e.dirigirPartido();
        e.dirigirEntrenamiento();

        m.darMasaje();

        System.out.println("\nEncapsulamiento: getters y setters\n");

        f.setDorsal(9);
        System.out.println("Nuevo dorsal de " + f.getNombre() + ": " + f.getDorsal());

        m.setAniosExperiencia(10);
        System.out.println("Años de experiencia de " + m.getNombre() + ": " + m.getAniosExperiencia());
    }
}