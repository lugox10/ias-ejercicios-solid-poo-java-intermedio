package operacionesBancarias.cuentas;

import operacionesBancarias.interfaces.Cuentas;

public class CuentaExtranjero implements Cuentas {
    @Override
    public double consultarSaldo() {
        return 0;
    }

    @Override
    public String getNumeroCuenta() {
        return "77777777777777777777";
    }
}
