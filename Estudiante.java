public class Estudiante {
    String nombre;
    int edad;
    String curso;

    // Constructor por defecto con valores GENÉRICOS
    public Estudiante() {
    this.nombre = "Sin nombre";
    this.edad = 0;
    this.curso = "Sin curso";
    }

    // Constructor con 2 parametros nombre y edad
    public Estudiante(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    // Constructor con todos los parametros y this()
    public Estudiante(String nombre, int edad, String curso){
        this(nombre, edad);
        this.curso = curso;
    }

    //Metodos
    void mostrarInfo(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+ edad);
        System.out.println("Curso "+ curso);
        System.out.println("______________________");
    }
}
