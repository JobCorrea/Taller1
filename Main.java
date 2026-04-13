
public class Main{

    public static void main(String[] args) {
        Libro libro1 =new Libro("Metamorfosis", "Kafka", 150);
        libro1.mostrarInfo();
        

        Estudiante est1 = new Estudiante("Daniel", 25, "Programacion");
        est1.mostrarInfo();

        CuentaBancaria cuenta = new CuentaBancaria(5484991, 788494911, "Ahorro");
        cuenta.mostrarInfo();
        
    }
}  