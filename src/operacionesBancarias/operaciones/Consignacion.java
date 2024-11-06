package operacionesBancarias.operaciones;

import operacionesBancarias.cuentas.CuentaNomina;
import operacionesBancarias.cuentas.CuentasCorriente;
import operacionesBancarias.interfaces.Cuentas;
import operacionesBancarias.interfaces.Procesos;

import java.util.LinkedList;

public class Consignacion implements Procesos {

    Cuentas cuentaDestino;

    @Override
    public LinkedList<Cuentas> listarMovimientos() {
        LinkedList<Cuentas> creditos = new LinkedList<Cuentas>();
        creditos.add(new CuentasCorriente());
        return creditos;
    }

    @Override
    public void setCuenta(Cuentas cuenta) {

        this.cuentaDestino = cuenta;
    }

    @Override
    public void procesar() {
        System.out.println("Se esta realizando una consignación de $"+cuentaDestino.consultarSaldo()+" a la cuenta "+cuentaDestino.getNumeroCuenta());
    }

    public Cuentas getCuenta(){
        return this.cuentaDestino;
    }


}
