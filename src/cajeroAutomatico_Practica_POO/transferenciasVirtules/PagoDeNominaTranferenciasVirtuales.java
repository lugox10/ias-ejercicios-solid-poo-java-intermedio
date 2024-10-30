package cajeroAutomatico_Practica_POO.transferenciasVirtules;

import cajeroAutomatico_Practica_POO.menuOperacionesCajeroAutomatico.ClasePadre_Abstracta;
import cajeroAutomatico_Practica_POO.movimientosVirtuales.PagoDeNomina;

import java.util.Scanner;

public class PagoDeNominaTranferenciasVirtuales extends ClasePadre_Abstracta implements PagoDeNomina {
    Scanner entrada = new Scanner(System.in);


    @Override
    public void pagoDeNomina() {
        System.out.println("nomina a pagar: 500mil");
        retiro = entrada.nextInt();
        if (retiro <= saldo) {
            saldo = saldo - retiro;
            System.out.println("------------------------------");
            System.out.println("transferencia Pago de nomina exitoso!");
            System.out.println("------------------------------");
        } else {
            System.out.println("------------------------------");
            System.out.println("Saldo insuficiente");
            System.out.println("------------------------------");
        }

    }

    @Override
    public void Transacciones() {

        pagoDeNomina();
        if (retiro <= getSaldo()) {
            transacciones = getSaldo();
            //
            System.out.println("----------------------------------");
            System.out.println("transferencia: " + retiro);
            System.out.println("Tu saldo actual es: " + getSaldo());
            System.out.println("----------------------------------");
            System.out.println("si deseas salir presiona la opcion 7");
        }
    }
}
