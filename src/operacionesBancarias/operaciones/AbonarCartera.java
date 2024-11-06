package operacionesBancarias.operaciones;
import operacionesBancarias.cuentas.Creditos;
import operacionesBancarias.interfaces.ConOrigen;
import operacionesBancarias.interfaces.Cuentas;
import operacionesBancarias.interfaces.Procesos;

import java.util.LinkedList;

public class AbonarCartera implements Procesos,ConOrigen {

    Cuentas cuentaOrigenAbono = new Creditos("");
    Cuentas cuentaDestinoAbono = new Creditos("");
    static LinkedList<Cuentas> movimientos = new LinkedList<Cuentas>();
    @Override
    public LinkedList<Cuentas> listarMovimientos() {
        return this.movimientos;
    }

    @Override
    public void setCuenta(Cuentas cuenta) {
        this.cuentaDestinoAbono=cuenta;
    }

    @Override
    public Cuentas getCuenta() {
        return this.cuentaDestinoAbono;
    }

    @Override
    public void procesar() {
        System.out.println("Se esta debitando la de la cuenta "+cuentaOrigenAbono.getNumeroCuenta());
        System.out.println("Se esta consignando en la cuenta "+cuentaDestinoAbono.getNumeroCuenta());
        System.out.println("El Saldo credito es $"+cuentaDestinoAbono.consultarSaldo());
    }

    @Override
    public Cuentas getCuentaOrigen() {
        return cuentaOrigenAbono;
    }

    @Override
    public void setCuentaOrigen(Cuentas cuentaOrigen) {
        this.cuentaOrigenAbono = cuentaOrigen;
    }
}
