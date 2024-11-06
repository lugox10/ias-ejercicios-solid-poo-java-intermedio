package operacionesBancarias.cuentas;

import operacionesBancarias.interfaces.Cuentas;

public class CuentaNomina implements Cuentas {


    private String numeroCuenta = "";
    private double saldo =0;

    CuentaNomina(){}
    public CuentaNomina(String numeroCuenta, double saldo){
        this.numeroCuenta=numeroCuenta;
        this.saldo=saldo;
    }
    @Override
    public double consultarSaldo() {
        return this.saldo;
    }

    @Override
    public String getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public void setSaldo(double saldo){
        this.saldo=saldo;
    }

}
