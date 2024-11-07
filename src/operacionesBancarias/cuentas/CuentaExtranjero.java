package operacionesBancarias.cuentas;

import operacionesBancarias.interfaces.Cuentas;

public class CuentaExtranjero implements Cuentas {
    @Override
    public String consultarSaldo() {
        return null;
    }

    @Override
    public String getNumeroCuenta() {
        return "77777777777777777777";
    }
}
