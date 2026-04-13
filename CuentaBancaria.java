
import java.util.Scanner;

public class CuentaBancaria {
    int numeroCuenta;
    int saldo;
    String tipoDeCuenta;

    //Constructor por Defecto
    public CuentaBancaria(){
        this.numeroCuenta = 4574875;
        this.saldo = 987452;
        this.tipoDeCuenta = "Ahorro";
    }

    //Constructor  parametrizado con dos parámetros
    public CuentaBancaria(int numeroCuenta, String tipoDeCuenta){
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0;
        this.tipoDeCuenta = tipoDeCuenta;
    }

    //constructor sobrecargado con tres parámetros
    public CuentaBancaria(int numeroCuenta, int saldo, String tipoDeCuenta){
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoDeCuenta = tipoDeCuenta;
    }

    //metodo por consola
    void ingresarInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero de Cuenta: ");
        this.numeroCuenta = sc.nextInt();
        System.out.println("Saldo: ");
        this.saldo = sc.nextInt();
        sc.nextLine();
        System.out.println("Tipo de Cuenta: ");
        this.tipoDeCuenta = sc.nextLine();
        System.out.println("________________________");
    }

     //Metodos
    void mostrarInfo(){
        System.out.println("$$ CUENTA BANCARIA $$");
        System.out.println("Numero de cuenta: "+ numeroCuenta);
        System.out.println("Saldo: "+ saldo);
        System.out.println("Tipo de cuenta "+ tipoDeCuenta);
        System.out.println("______________________");
    }

    @Override 
    public String toString(){
        return "CuentaBancaria {Numero de Cuenta= '"+numeroCuenta+"',Saldo='"+saldo+"',Tipo de Cuenta='"+tipoDeCuenta+"'}";
    }
}
