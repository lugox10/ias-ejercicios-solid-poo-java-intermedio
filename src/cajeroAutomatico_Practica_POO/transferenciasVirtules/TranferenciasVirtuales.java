package cajeroAutomatico_Practica_POO.transferenciasVirtules;

import cajeroAutomatico_Practica_POO.menuOperacionesCajeroAutomatico.ClasePadre_Abstracta;
import cajeroAutomatico_Practica_POO.movimientosVirtuales.Transferencias;

import java.util.Scanner;


public class TranferenciasVirtuales extends ClasePadre_Abstracta implements Transferencias {


    Scanner entrada = new Scanner(System.in);

    @Override
    public void Transferencia() {
        System.out.println("cuato dinero deseas transferir");
        retiro = entrada.nextInt();
        if (retiro <= saldo) {
            saldo = saldo - retiro;
            System.out.println("------------------------------");
            System.out.println("transferencia exitosa");
            System.out.println("------------------------------");
        } else {
            System.out.println("------------------------------");
            System.out.println("Saldo insuficiente");
            System.out.println("------------------------------");
        }

    }

    @Override
    public void Transacciones() {

        Transferencia();
        if (retiro <= getSaldo()) {
            transacciones = getSaldo();
            //
            System.out.println("----------------------------------");
            System.out.println("Ultima transferencia: " + retiro);
            System.out.println("Tu saldo actual es: " + getSaldo());
            System.out.println("----------------------------------");
            System.out.println("si deseas salir presiona la opcion 7");
        }
    }
}
