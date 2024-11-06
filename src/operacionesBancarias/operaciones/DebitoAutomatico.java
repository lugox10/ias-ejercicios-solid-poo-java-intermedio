package operacionesBancarias.operaciones;

import operacionesBancarias.interfaces.Cuentas;
import operacionesBancarias.interfaces.Procesos;

import java.util.LinkedList;

public class DebitoAutomatico {

    private LinkedList<Cuentas> movimientos = new LinkedList<>();


    public LinkedList<Cuentas> listarMovimientos() {
        return this.movimientos;
    }


    public void setCuenta(Cuentas cuenta) {

    }


    public void procesar() {
        //System.out.println("Se está realizando un débito automático de " + 2 + " en la cuenta: " + cuenta.getNumeroCuenta());
        //movimientos.add(cuenta);
        // Aquí podrías restar el monto de la cuenta si tuvieras un método para hacerlo.
    }
}
