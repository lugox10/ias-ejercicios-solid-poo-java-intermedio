package operacionesBancarias;

import operacionesBancarias.cuentas.Creditos;
import operacionesBancarias.cuentas.CuentaExtranjero;
import operacionesBancarias.cuentas.CuentaNomina;
import operacionesBancarias.cuentas.CuentasRepresentante;
import operacionesBancarias.interfaces.Cuentas;
import operacionesBancarias.interfaces.Procesos;
import operacionesBancarias.operaciones.*;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige una opción: ");
        System.out.println("1- Abono a Cartera");
        System.out.println("2 - Consignación");
        System.out.println("3 - Transferencia");
        System.out.println("4 - Pago de Nómina");
        System.out.println("5 - Débito Automático");
        System.out.println("6 - Depósito");
        System.out.println("7 - Retiro");

        int tipo = scanner.nextInt();
        Cuentas cuenta = null;
        Procesos procesos = null;

        if (tipo == 1) {
            cuenta = new Creditos();
            procesos = new AbonarCartera();
            ((AbonarCartera) procesos).procesarCredito((Creditos) cuenta);
        } else if (tipo == 2) {
            cuenta = new CuentaNomina();
            procesos = new Consignacion();
            ((Consignacion) procesos).procesarConsginacion((CuentaNomina) cuenta);
        } else if (tipo == 3) {
            cuenta = new CuentasRepresentante();
            CuentaExtranjero cuentaExtranjero = new CuentaExtranjero();
            procesos = new Transferencias();
            ((Transferencias) procesos).hacerTranferencia((CuentasRepresentante) cuenta, cuentaExtranjero);
        } else if (tipo == 4) {
            cuenta = new CuentaNomina();
            procesos = new PagoNomina();
            ((PagoNomina) procesos).realizarPago(cuenta);
        } else if (tipo == 5) {
            cuenta = new CuentaNomina();
            procesos = new DebitoAutomatico();
            ((DebitoAutomatico) procesos).realizarDebito(cuenta, 20);
        } else if (tipo == 6) {
            Deposito deposito = new Deposito();
            deposito.setSaldo(100);
            deposito.realizarDeposito(50);
            cuenta = new CuentaNomina();
        } else if (tipo == 7) {
            Retiro retiro = new Retiro();
            retiro.setSaldo(100);
            retiro.getSaldo();
            retiro.realizarRetiro(30);
            cuenta = new CuentaNomina();
        }

        if (cuenta != null) {
            System.out.println(cuenta.consultarSaldo());
        }

        for (int h = 0; h < procesos.listarMovimientos().size(); h++) {
                System.out.println("Número de cuenta: " + procesos.listarMovimientos().get(h).getNumeroCuenta());

        }


    }
}
