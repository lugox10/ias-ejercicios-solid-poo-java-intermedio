package operacionesBancarias.cuentas;

import operacionesBancarias.interfaces.Cuentas;

public class Creditos implements Cuentas {
    double saldo;
    String numeroCredito;

    public Creditos(String numeroCredito){
        this.numeroCredito=numeroCredito;
    }

    @Override
    public double consultarSaldo() {
        return saldo;
    }

    @Override
    public String getNumeroCuenta() {
        return this.numeroCredito;
    }

    public void setSaldo(double saldo){
        this.saldo=saldo;
    }

}
