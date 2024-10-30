package cajeroAutomatico_Practica_POO.transferenciasVirtules;

import cajeroAutomatico_Practica_POO.menuOperacionesCajeroAutomatico.ClasePadre_Abstracta;
import cajeroAutomatico_Practica_POO.movimientosVirtuales.PagoDeTarjetaCredito;

import java.util.Scanner;

public class PagoDeTarjetaCreditoTranferenciasVirtuales extends ClasePadre_Abstracta implements PagoDeTarjetaCredito {

    Scanner entrada = new Scanner(System.in);

    @Override
    public void PagoDeTarjetaCredito() {
        System.out.println("cuato dinero deseas pagar?");
        retiro = entrada.nextInt();
        if (retiro <= saldo) {
            saldo = saldo - retiro;
            System.out.println("------------------------------");
            System.out.println("pago de tarjeta exitoso exitoso");
            System.out.println("------------------------------");
        } else {
            System.out.println("------------------------------");
            System.out.println("Saldo insuficiente");
            System.out.println("------------------------------");
        }

    }

    @Override
    public void Transacciones() {

        PagoDeTarjetaCredito();
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
