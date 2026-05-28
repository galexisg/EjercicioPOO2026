package Proyecto;

    public abstract class SeleccionFutbol {
        protected Integer id;
        protected String nombre;
        protected String apellidos;
        protected Integer edad;

        public SeleccionFutbol(Integer id, String nombre, String apellidos, Integer edad) {
            this.id = id;
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.edad = edad;
        }

        public void concentrarse() {
            System.out.println(nombre + " está en concentración.");
        }

        public void viajar() {
            System.out.println(nombre + " está viajando con el equipo.");
        }


        public abstract void actividadPrincipal();


        public Integer getId() { return id; }
        public void setId(Integer id) { this.id = id; }
        public String getNombre() { return nombre; }
        public void setNombre(String nombre) { this.nombre = nombre; }
    }



