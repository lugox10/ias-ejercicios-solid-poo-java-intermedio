package operacionesBancarias.operaciones;

import operacionesBancarias.interfaces.Cuentas;
import operacionesBancarias.interfaces.Procesos;

import java.util.LinkedList;

public class DebitoAutomatico implements Procesos {

    private LinkedList<Cuentas> movimientos = new LinkedList<>();

    public void realizarDebito(Cuentas cuenta, int monto) {
        System.out.println("Se está realizando un débito automático de " + monto + " en la cuenta: " + cuenta.getNumeroCuenta());
        movimientos.add(cuenta);
        // Aquí podrías restar el monto de la cuenta si tuvieras un método para hacerlo.
    }

    @Override
    public LinkedList<Cuentas> listarMovimientos() {
        return this.movimientos;
    }
}
