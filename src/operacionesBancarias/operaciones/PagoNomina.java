package operacionesBancarias.operaciones;

import operacionesBancarias.interfaces.ConOrigen;
import operacionesBancarias.interfaces.Cuentas;
import operacionesBancarias.interfaces.Procesos;

import java.util.LinkedList;

public class PagoNomina implements Procesos, ConOrigen {


    Cuentas cuentaOrigen=null;
    Cuentas cuentaDestino=null;
    private LinkedList<Cuentas> movimientos = new LinkedList<>();


    public LinkedList<Cuentas> listarMovimientos() {
        return this.movimientos;
    }


    public void setCuenta(Cuentas cuenta) {
        this.cuentaDestino=cuenta;
    }

    @Override
    public Cuentas getCuenta() {
        return this.cuentaDestino;
    }


    public void procesar() {
        System.out.println("Se debita de la cuenta "+cuentaOrigen.getNumeroCuenta());
        System.out.println("Se consigna en la cuenta "+cuentaDestino.getNumeroCuenta());
    }

    @Override
    public Cuentas getCuentaOrigen() {
        return this.cuentaOrigen;
    }

    @Override
    public void setCuentaOrigen(Cuentas cuentaOrigen) {
        this.cuentaOrigen=cuentaOrigen;
    }
}
