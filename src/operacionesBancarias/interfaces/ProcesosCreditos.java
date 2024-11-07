package operacionesBancarias.interfaces;

import operacionesBancarias.cuentas.Creditos;

public interface ProcesosCreditos extends Procesos{

    void procesarCredito(Creditos cuentaOrigen);

}
