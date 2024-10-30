package cajeroAutomatico_Practica_POO.menuOperacionesCajeroAutomatico;

import cajeroAutomatico_Practica_POO.operacionesCuentaPersonal.ClaseHija_Deposito;
import cajeroAutomatico_Practica_POO.operacionesCuentaPersonal.ClaseHija_Retiro;
import cajeroAutomatico_Practica_POO.operacionesCuentaPersonal.ClaseHija_consulta;
import cajeroAutomatico_Practica_POO.transferenciasVirtules.PagoDeNominaTranferenciasVirtuales;
import cajeroAutomatico_Practica_POO.transferenciasVirtules.PagoDeTarjetaCreditoTranferenciasVirtuales;
import cajeroAutomatico_Practica_POO.transferenciasVirtules.TranferenciasVirtuales;

import java.util.Scanner;

public abstract class ClasePadre_Abstracta {

    protected int transacciones, retiro, deposito;
    protected static int saldo;

    Scanner entrada = new Scanner(System.in);

    public void MenuOperaciones() {

        int bandera = 0;
        int seleccion = 0;

        do {
            do {
                System.out.println("-----------------------");
                System.out.println("bienvenidos a ias bank");
                System.out.println("-----------------------");
                System.out.println("1. Consulta de Saldo");
                System.out.println("2. Retiro de efectivo");
                System.out.println("3. Deposito de efectivo");
                System.out.println("4. transferencia");
                System.out.println("5. PagoDeNomina");
                System.out.println("6. PagoDeTarjetaCredito");
                System.out.println("7. Salir");
                System.out.print("Por favor seleccione una opción: => ");
                seleccion = entrada.nextInt();

                if (seleccion >= 1 && seleccion <= 5) {
                    bandera = 1;
                } else {
                    System.out.println("----------------------------");
                    System.out.println("Opción no disponible");
                    System.out.println("----------------------------");

                }

            } while (bandera == 0);

            if (seleccion == 1) {
                ClasePadre_Abstracta consulta = new ClaseHija_consulta();
                consulta.Transacciones();

            } else if (seleccion == 2) {
                ClasePadre_Abstracta retiro = new ClaseHija_Retiro();
                retiro.Transacciones();

            } else if (seleccion == 3) {
                ClasePadre_Abstracta deposito = new ClaseHija_Deposito();
                deposito.Transacciones();

            } else if (seleccion == 4) {
                ClasePadre_Abstracta transferencia = new TranferenciasVirtuales();
                transferencia.Transacciones();

            } else if (seleccion == 5) {
                ClasePadre_Abstracta pagoNomina = new PagoDeNominaTranferenciasVirtuales();
                pagoNomina.Transacciones();

            } else if (seleccion == 6) {
                ClasePadre_Abstracta pagoTarjeta = new PagoDeTarjetaCreditoTranferenciasVirtuales();
                pagoTarjeta.Transacciones();


            } else if (seleccion == 7) {
                System.out.println("------------------------------");
                System.out.println("Gracias por preferirnos... ");
                System.out.println("------------------------------");

                bandera = 2;
            }

        } while (seleccion != 2);

    }

    public abstract void Transacciones();

    public int getSaldo() {
        return saldo;

    }

    public void setSaldo(int saldo) {
        this.saldo = 2000;
    }

}
