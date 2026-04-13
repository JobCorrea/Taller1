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
    }
}