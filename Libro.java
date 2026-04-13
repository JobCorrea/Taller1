import java.util.Scanner;

public class Libro {
    String titulo;
    String autor;
    int numeroDePaginas;
    
    //Constructor con defecto
    public Libro(){
        this.titulo = "El diario de ana frank";
        this.autor = "Ana Frank";
        this.numeroDePaginas = 215;
    }

    //Construtcor parametizado
    public Libro(String titulo,String autor, int numeroDePaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    //Metodos
    void mostrarInfo(){
        System.out.println("Titulo: "+ titulo);
        System.out.println("Autor: "+ autor);
        System.out.println("Numero de paginas "+ numeroDePaginas);
        System.out.println("______________________________");
    }

    //Metodo por consola
    void ingresarInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("==INGRESE SUS DATOS DE LIBROS==");
        System.out.println("Titulo: ");
        this.titulo = sc.nextLine();
        System.out.println("Autor: ");
        this.autor = sc.nextLine();
        System.out.println("Numero de paginas: ");
        this.numeroDePaginas = sc.nextInt();
        sc.nextLine();

    }
    
    @Override
    public String toString() {
        return "Libro{titulo='" + titulo + "', autor='" + autor + "', paginas=" + numeroDePaginas + "}";
    }

}