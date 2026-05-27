import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" INGRESAR DATOS DEL FUTBOLISTA ");

        System.out.print("ID: ");
        int idF = sc.nextInt();
        sc.nextLine();

        System.out.print("Nombre: ");
        String nombreF = sc.nextLine();

        System.out.print("Apellidos: ");
        String apellidoF = sc.nextLine();

        System.out.print("Edad: ");
        int edadF = sc.nextInt();

        System.out.print("Dorsal: ");
        int dorsal = sc.nextInt();
        sc.nextLine();

        System.out.print("Posición: ");
        String demarcacion = sc.nextLine();

        Futbolista ft = new Futbolista(
                idF,
                nombreF,
                apellidoF,
                edadF,
                dorsal,
                demarcacion
        );

        System.out.println("\n INGRESAR DATOS DEL ENTRENADOR ");

        System.out.print("ID: ");
        int idE = sc.nextInt();
        sc.nextLine();

        System.out.print("Nombre: ");
        String nombreE = sc.nextLine();

        System.out.print("Apellidos: ");
        String apellidoE = sc.nextLine();

        System.out.print("Edad: ");
        int edadE = sc.nextInt();
        sc.nextLine();

        System.out.print("ID Federación: ");
        String idFederacion = sc.nextLine();

        Entrenador en = new Entrenador(
                idE,
                nombreE,
                apellidoE,
                edadE,
                idFederacion
        );

        System.out.println("\n INGRESAR DATOS DEL MASAJISTA ");

        System.out.print("ID: ");
        int idM = sc.nextInt();
        sc.nextLine();

        System.out.print("Nombre: ");
        String nombreM = sc.nextLine();

        System.out.print("Apellidos: ");
        String apellidoM = sc.nextLine();

        System.out.print("Edad: ");
        int edadM = sc.nextInt();
        sc.nextLine();

        System.out.print("Titulación: ");
        String titulacion = sc.nextLine();

        System.out.print("Años de experiencia: ");
        int experiencia = sc.nextInt();

        Masajista ms = new Masajista(
                idM,
                nombreM,
                apellidoM,
                edadM,
                titulacion,
                experiencia
        );


        System.out.println("DATOS DEL FUTBOLISTA");


        System.out.println("ID: " + ft.getId());
        System.out.println("Nombre: " + ft.getNombre());
        System.out.println("Apellidos: " + ft.getApellidos());
        System.out.println("Edad: " + ft.getEdad());
        System.out.println("Dorsal: " + ft.getDorsal());
        System.out.println("Demarcación: " + ft.getDemarcacion());

        System.out.println("\n--- MÉTODOS ---");
        ft.concentrarse();
        ft.viajar();
        ft.jugarPartido();
        ft.entrenar();

        ft.actividad();


        System.out.println("DATOS DEL ENTRENADOR");


        System.out.println("ID: " + en.getId());
        System.out.println("Nombre: " + en.getNombre());
        System.out.println("Apellidos: " + en.getApellidos());
        System.out.println("Edad: " + en.getEdad());
        System.out.println("ID Federación: " + en.getIdFederacion());

        en.concentrarse();
        en.viajar();
        en.dirigirPartido();
        en.dirigirEntrenamiento();
        en.actividad();

        System.out.println("DATOS DEL MASAJISTA");

        System.out.println("ID: " + ms.getId());
        System.out.println("Nombre: " + ms.getNombre());
        System.out.println("Apellidos: " + ms.getApellidos());
        System.out.println("Edad: " + ms.getEdad());
        System.out.println("Titulación: " + ms.getTitulacion());
        System.out.println("Años de experiencia: " + ms.getAniosExperiencia());

        ms.concentrarse();
        ms.viajar();
        ms.darMasaje();

        ms.actividad();

        sc.close();
    }
}