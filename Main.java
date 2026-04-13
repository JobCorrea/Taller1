
public class Main{

    public static void main(String[] args) {
        //Objetos Directos
        Libro libro1 =new Libro("Metamorfosis", "Kafka", 150);
        libro1.mostrarInfo();
        //#2
        Estudiante est1 = new Estudiante("Daniel", 25, "Programacion");
        est1.mostrarInfo();
        //#3
        CuentaBancaria cuenta = new CuentaBancaria(5484991, 788494911, "Ahorro");
        cuenta.mostrarInfo();

        //Objetos por consola
        Libro libro2 = new Libro();
        libro2.ingresarInfo();
                    ////
        Estudiante estudiante2 = new Estudiante();
        estudiante2.ingresarInfo();
                    ////
        CuentaBancaria cuenta2 = new CuentaBancaria();
        cuenta2.ingresarInfo();

        // Mostrar con toString()
        System.out.println(libro2);
        System.out.println(estudiante2);
        System.out.println(cuenta2);
        
        

    }
}  