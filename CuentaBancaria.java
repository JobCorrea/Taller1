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
}
