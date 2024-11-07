package operacionesBancarias.interfaces;

import java.util.LinkedList;

public interface Procesos {

    Cuentas cuentaDestino = null;
    void procesar();
    LinkedList<Cuentas> listarMovimientos();
    void setCuenta(Cuentas cuenta);
    Cuentas getCuenta();



}
