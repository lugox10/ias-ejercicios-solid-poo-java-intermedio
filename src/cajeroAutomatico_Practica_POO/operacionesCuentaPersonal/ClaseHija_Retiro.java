package cajeroAutomatico_Practica_POO.operacionesCuentaPersonal;

import cajeroAutomatico_Practica_POO.menuOperacionesCajeroAutomatico.ClasePadre_Abstracta;

import java.util.Scanner;

public class ClaseHija_Retiro extends ClasePadre_Abstracta {

    Scanner entrada = new Scanner(System.in);

    public void Retiro() {
        retiro = entrada.nextInt();
        if (retiro <= saldo) {
            saldo = saldo - retiro;
            System.out.println("------------------------------");
            System.out.println("Retiro exitoso");
            System.out.println("------------------------------");
        } else {
            System.out.println("------------------------------");
            System.out.println("Saldo insuficiente");
            System.out.println("------------------------------");
        }
    }

    @Override
    public void Transacciones() {
        System.out.println("Cuanto deseas retirar?");
        Retiro();
        if (retiro <= getSaldo()) {
            transacciones = getSaldo();
            //
            System.out.println("----------------------------------");
            System.out.println("Retiraste: " + retiro);
            System.out.println("Tu saldo actual es: " + getSaldo());
            System.out.println("----------------------------------");
            System.out.println("si deseas salir presiona la opcion 7");
        }


    }



}
