package entidad;

public class CuentaBancaria {
    private double saldo;
    private String numeroCuenta;

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public void retirar(double cantidad){
        this.saldo -= cantidad;
        System.out.println("numeroCuenta = " + this.numeroCuenta);
        System.out.println("Saldo actual: " + this.saldo);
        System.out.println("Se ha retirado: " + cantidad);
        System.out.println("--------------------------------");

    }
}
