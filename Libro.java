import java.util.Scanner;

public class Libro {
    //Atributos PRIVADOS - nadie los toca directamente desde afuera
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    
    // Constructor por defecto
    public Libro(){
        this.titulo = "El diario de ana frank";
        this.autor = "Ana Frank";
        this.numeroDePaginas = 215;
    }

    // Constructor parametrizado
    public Libro(String titulo, String autor, int numeroDePaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    //Getters - para LEER los atributos
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getNumeroDePaginas() { return numeroDePaginas; }

    //Setters - para MODIFICAR los atributos
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setAutor(String autor) { this.autor = autor; }
    public void setNumeroDePaginas(int numeroDePaginas) { this.numeroDePaginas = numeroDePaginas; }

    // Métodos
    public void mostrarInfo(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Numero de paginas: " + numeroDePaginas);
        System.out.println("______________________________");
    }

    // Método por consola
    public void ingresarInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("== INGRESE SUS DATOS DE LIBRO ==");
        System.out.print("Titulo: ");
        this.titulo = sc.nextLine();
        System.out.print("Autor: ");
        this.autor = sc.nextLine();
        System.out.print("Numero de paginas: ");
        this.numeroDePaginas = sc.nextInt();
        sc.nextLine();
    }

    @Override
    public String toString() {
        return "Libro{titulo='" + titulo + "', autor='" + autor + "', paginas=" + numeroDePaginas + "}";
    }
}