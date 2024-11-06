package operacionesBancarias;

import operacionesBancarias.cuentas.Creditos;
import operacionesBancarias.cuentas.CuentaNomina;
import operacionesBancarias.cuentas.CuentasCorriente;
import operacionesBancarias.interfaces.Cuentas;
import operacionesBancarias.interfaces.Procesos;
import operacionesBancarias.operaciones.*;

import java.util.LinkedList;
import java.util.List;
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
        Cuentas cuentaConsignacion = new CuentaNomina("",0);
        Cuentas cuentaDestino = new CuentaNomina("",0);
        Cuentas cuenta = null;
        Procesos proceso = null;
        do{


            if(tipo==-1){
                mostarMenu();
                tipo = scanner.nextInt();
            }
            if (tipo == 1) {
                proceso=abonoCartera((CuentaNomina) cuentaConsignacion);
                /*AbonarCartera abonarCartera= (AbonarCartera)proceso;
                cuentaConsignacion= abonarCartera.getCuentaOrigen();
                cuentaDestino = abonarCartera.getCuenta();
                System.out.println("$$$$$$$$El saldo de su cuenta de nomina número "+cuentaConsignacion.getNumeroCuenta()+" es :"+cuentaConsignacion.consultarSaldo()+"$$$$$$$$$$$$$$$$$");*/
                tipo=-1;
            }
            if (tipo == 2) {
                System.out.println("Cual es en # de la cuenta?");
                String numeroCuenta = scanner.next();
                System.out.println("Cuando vas a cosignar?");
                double valor = scanner.nextInt();
                CuentaNomina cuentaNomina = new CuentaNomina(numeroCuenta,cuentaConsignacion.consultarSaldo()+valor);
                proceso = consignacion(cuentaNomina);
                cuentaConsignacion=proceso.getCuenta();
                tipo=-1;
            }

            if (tipo == 4) {
                proceso=pagarNomina();
                tipo=-1;
            }

            proceso.procesar();

        } while (tipo!=0);

    }


    private static void mostarMenu(){
        System.out.println("Elige una opción: ");
        System.out.println("1- Abono a Cartera");
        System.out.println("2 - Consignación");
        System.out.println("3 - Transferencia");
        System.out.println("4 - Pago de Nómina");
        System.out.println("5 - Débito Automático");
        System.out.println("6 - Depósito");
        System.out.println("7 - Retiro");
    }
//
    private static Procesos abonoCartera(CuentaNomina cuentaOrigen){
        AbonarCartera abonarCartera = new AbonarCartera();
        if(cuentaOrigen!=null){
            abonarCartera.setCuentaOrigen(cuentaOrigen);
            System.out.println("Cual es el credito?");
            Scanner scanner2 = new Scanner(System.in);
            Creditos creditos=new Creditos(scanner2.next());

            System.out.println("Cuanto quiere abonar?");
            double auxSaldo=scanner2.nextInt();
            creditos.setSaldo(auxSaldo);
            cuentaOrigen.setSaldo(cuentaOrigen.consultarSaldo()-auxSaldo);
            abonarCartera.setCuenta(creditos);
        }else{
            System.out.println("###################Debes primero hacer una consignación#######################");
        }
    return abonarCartera;
    }

    private static Procesos consignacion(CuentaNomina cuentaDestino){
        Consignacion consignacion = new Consignacion();
        consignacion.setCuenta(cuentaDestino);
        return consignacion;
    }

    private static Procesos pagarNomina(){
        PagoNomina pagoNomina = new PagoNomina();
        CuentasCorriente cuentasCorriente = new CuentasCorriente();
        CuentaNomina cuentaNomina = new CuentaNomina("999999",0);
        pagoNomina.setCuentaOrigen(cuentasCorriente);
        pagoNomina.setCuenta(cuentaNomina);
        return pagoNomina;
    }

}
