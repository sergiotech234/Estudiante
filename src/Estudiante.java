public class Estudiante {
    private String nombre;
    private int edad;
    private double nota;

    private static int totalEstudiantes=0;

    public Estudiante(String nombre, int edad, double nota) {
        if (edad < 0) {
            throw new IllegalArgumentException("Edad negativo");
        }
        if (nota < 0|| nota > 10) {
            throw new IllegalArgumentException("La nota debe estar entre 0 e 10");
        }
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;

        totalEstudiantes++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0 ) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
        this.edad = edad;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if ((nota < 0) && (nota > 10)) {
            throw new IllegalArgumentException("La nota tiene que estar entre 0 e 10");
        }
        this.nota = nota;
    }

    public void mostrarInformacion(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                ", Edad: " + edad +
                ", Nota: " + nota;
    }
    public static int getTotalEstudiantes(){
        return totalEstudiantes;
    }
}