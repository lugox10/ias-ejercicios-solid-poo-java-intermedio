package operacionesBancarias.operaciones;

import operacionesBancarias.cuentas.Creditos;
import operacionesBancarias.cuentas.CuentaNomina;
import operacionesBancarias.cuentas.CuentasRepresentante;
import operacionesBancarias.interfaces.Cuentas;
import operacionesBancarias.interfaces.Procesos;

import java.util.LinkedList;

public class Consignacion implements Procesos {

    @Override
    public LinkedList<Cuentas> listarMovimientos() {
        LinkedList<Cuentas> creditos = new LinkedList<Cuentas>();
        creditos.add(new CuentasRepresentante());
        return creditos;
    }

    public void procesarConsginacion(CuentaNomina cuentaNomina){
        System.out.println("Se esta realizando una consignación");
    }
}
