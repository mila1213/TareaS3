public class Persona {
    private String nombre;
    private int edad;
    private String profesion;

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Nombre no válido");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("Edad no válida");
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getProfesion() {
        return profesion;
    }

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("");
        persona.setEdad(-5);
        persona.setProfesion("Ingeniero");

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Profesión: " + persona.getProfesion());

        persona.setNombre("Camila Bueno");
        persona.setEdad(20);
        persona.setProfesion("Estudiante");

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Profesión: " + persona.getProfesion());
    }
}
