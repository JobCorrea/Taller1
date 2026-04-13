
import java.util.Scanner;

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

    //Metodo por consola
    void ingresarInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("##INGRESE DATOS DEL ESTUDIANTE##");
        System.out.println("Nombre: ");
        this.nombre = sc.nextLine();
        System.out.println("Edad: ");
        this.edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Curso: ");
        this.curso = sc.nextLine();
        System.out.println("___________________");
    }

    //Metodos
    void mostrarInfo(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+ edad);
        System.out.println("Curso "+ curso);
        System.out.println("______________________");
    }

    //ToString
    @Override
    public String toString(){
        return "Estudiante{nombre='"+nombre+"',edad="+edad+",curso='"+curso+"'}";
    }
}
