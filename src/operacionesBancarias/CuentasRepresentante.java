package operacionesBancarias;

public abstract class CuentasRepresentante {

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

    public abstract void consultas();

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

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
}
