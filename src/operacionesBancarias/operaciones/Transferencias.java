package operacionesBancarias.operaciones;

import operacionesBancarias.cuentas.Creditos;
import operacionesBancarias.cuentas.CuentaExtranjero;
import operacionesBancarias.cuentas.CuentaNomina;
import operacionesBancarias.interfaces.Cuentas;
import operacionesBancarias.interfaces.Procesos;

import java.util.LinkedList;
import java.util.Scanner;

public class Transferencias implements Procesos {
CuentaExtranjero cuentaExtranjero= new CuentaExtranjero();
    public LinkedList<Cuentas> listarMovimientos() {
        return null;
    }


    public void setCuenta(Cuentas cuenta) {

    }

    @Override
    public Cuentas getCuenta() {
        return this.cuentaExtranjero;
    }


    public void procesar() {
        System.out.println("Estoy haciendo una trasferencia al extranjero");
    }

    public static Procesos tranferencias(CuentaNomina  numeroCuenta){
        Transferencias transferencias = new Transferencias();
        if( numeroCuenta!=null){
            transferencias.setCuentaOrigen( numeroCuenta);
            System.out.println("cual el el n. de cuenta");
            Scanner scanner2 = new Scanner(System.in);
            Creditos creditos=new Creditos(scanner2.next());

            System.out.println("Cuanto quiere transferir?");
            double auxSaldo=scanner2.nextInt();
            creditos.setSaldo(auxSaldo);
            numeroCuenta.setSaldo( numeroCuenta.consultarSaldo()-auxSaldo);
            transferencias.setCuenta(creditos);
        }
        return transferencias;
    }

    private void setCuentaOrigen(CuentaNomina cuentaOrigen) {
    }
}
