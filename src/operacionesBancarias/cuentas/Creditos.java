package operacionesBancarias.cuentas;

import operacionesBancarias.cuentas.CuentasRepresentante;
import operacionesBancarias.interfaces.Cuentas;

public class Creditos implements Cuentas {
    String origen;
    String destino;

    @Override
    public String consultarSaldo() {
        return "El Saldo de su Credito es $000000";
    }

    @Override
    public String getNumeroCuenta() {
        return "111111111111111111111";
    }
}
