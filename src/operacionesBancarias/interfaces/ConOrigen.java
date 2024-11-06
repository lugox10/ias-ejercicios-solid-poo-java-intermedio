package operacionesBancarias.interfaces;

public interface ConOrigen {
    Cuentas cuentaOrigen = null;
    Cuentas cuentaDestino = null;

    Cuentas getCuentaOrigen();
    void setCuentaOrigen(Cuentas cuentaOrigen);
}
