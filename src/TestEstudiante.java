public class TestEstudiante {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Juanito",20,10);
        Estudiante estudiante2 = new Estudiante("Ana",22,5.5);
        Estudiante estudiante3 = new Estudiante("Maria",18,6);

        estudiante1.mostrarInformacion();
        estudiante2.mostrarInformacion();
        estudiante3.mostrarInformacion();

        try{
            Estudiante estudiante4 = new Estudiante("Pepe",22,-1);
        }catch(IllegalArgumentException e){
            System.out.println("ERROR: "+e.getMessage());
        }

        try {
            Estudiante estudiante5 = new Estudiante("Carlos",25,10.5);
        }catch(IllegalArgumentException e){
            System.out.println("ERROR: "+e.getMessage());
        }

        System.out.println("Total de estudiantes: "+estudiante1.getTotalEstudiantes());
    }
}
