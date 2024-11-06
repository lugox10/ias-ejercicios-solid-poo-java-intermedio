package operacionesBancarias.operaciones;
import operacionesBancarias.cuentas.Creditos;
import operacionesBancarias.interfaces.Cuentas;
import operacionesBancarias.interfaces.ProcesosCreditos;

import java.util.LinkedList;

public class AbonarCartera implements ProcesosCreditos {

    static LinkedList<Cuentas> movimientos = new LinkedList<Cuentas>();
    @Override
    public void procesarCredito(Creditos cuentaOrigen) {
        System.out.println("Se esta realizando un abono a Cartera");
        this.movimientos.add(cuentaOrigen);
    }

    @Override
    public LinkedList<Cuentas> listarMovimientos() {
        return this.movimientos;
    }
}
