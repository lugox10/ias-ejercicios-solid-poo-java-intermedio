package operacionesBancarias.operaciones;

import operacionesBancarias.cuentas.CuentaExtranjero;
import operacionesBancarias.cuentas.CuentasRepresentante;
import operacionesBancarias.interfaces.Cuentas;
import operacionesBancarias.interfaces.Procesos;

import java.util.LinkedList;

public class Transferencias implements Procesos {


    public void hacerTranferencia(CuentasRepresentante cuentaOrigen, CuentaExtranjero cuentaDestino){
        System.out.println("Estoy haciendo una trasferencia al extranjero");
    }


    @Override
    public LinkedList<Cuentas> listarMovimientos() {
        return null;
    }
}
