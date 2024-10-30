package cajeroAutomatico_Practica_POO.operacionesCuentaPersonal;

import cajeroAutomatico_Practica_POO.menuOperacionesCajeroAutomatico.ClasePadre_Abstracta;

import java.util.Scanner;

public class ClaseHija_Deposito extends ClasePadre_Abstracta {

    Scanner entrada = new Scanner(System.in);
    public void Deposito() {
        deposito = entrada.nextInt();
      saldo= deposito + saldo;
        System.out.println("------------------------------");
        System.out.println("Deposito exitoso");
        System.out.println("------------------------------");
    }

    @Override
    public void Transacciones() {
        System.out.println("Cuanto deseas depositar?");
        Deposito();
        transacciones = getSaldo();

        System.out.println("----------------------------------");
        System.out.println("Depositaste: " + deposito);
        System.out.println("Tu saldo actual es: " + getSaldo());
        System.out.println("----------------------------------");
        System.out.println("si deseas salir presiona la opcion 7");
    }
}
