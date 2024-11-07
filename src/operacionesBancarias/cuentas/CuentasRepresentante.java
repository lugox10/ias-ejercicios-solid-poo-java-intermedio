package operacionesBancarias.cuentas;

import operacionesBancarias.interfaces.Cuentas;

public class CuentasRepresentante implements Cuentas {

    String cliente;
    double saldo;
    int numeroCuenta;

    public CuentasRepresentante(String cliente, double saldo, int numeroCuenta) {
        this.cliente = cliente;
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
    }

    public CuentasRepresentante() {
    }
    public String consultarSaldo(){
        return "En saldo de tu cuenta Representaten es $5,000,000";
    }
    //public abstract void consultas();

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }



    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String getNumeroCuenta() {
        return "444444444444444444";
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
}
