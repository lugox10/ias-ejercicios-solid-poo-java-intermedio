package operacionesBancarias.operaciones;

import operacionesBancarias.interfaces.Cuentas;
import operacionesBancarias.interfaces.Procesos;

import java.util.LinkedList;

public class PagoNomina implements Procesos {

    private LinkedList<Cuentas> movimientos = new LinkedList<>();

    public void realizarPago(Cuentas cuentaNomina) {
        System.out.println("Se está realizando un pago de nómina.");
        movimientos.add(cuentaNomina);
    }

    @Override
    public LinkedList<Cuentas> listarMovimientos() {
        return this.movimientos;
    }
}
