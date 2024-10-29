package cajeroAutomatico_Practica_POO;

import java.util.Scanner;

public abstract class ClasePadre_Abstracta {

    protected int transacciones, retiro, deposito;
    private static int saldo;

    Scanner entrada = new Scanner(System.in);

    public void MenuOperaciones() {

        int bandera = 0;
        int seleccion = 0;

        do {
            do {

                System.out.println("1. Consulta de Saldo");
                System.out.println("2. Retiro de efectivo");
                System.out.println("3. Deposito de efectivo");
                System.out.println("4. Salir");
                System.out.print("Por favor seleccione una opción: ");
                seleccion = entrada.nextInt();

                if (seleccion >= 1 && seleccion <= 4) {
                    bandera = 1;
                } else {
                    System.out.println("----------------------------");
                    System.out.println("Opción no disponible");
                    System.out.println("----------------------------");

                }

            } while (bandera == 0);

            if (seleccion == 1) {


            } else if (seleccion == 2) {


            } else if (seleccion == 3) {


            } else if (seleccion == 4) {
                System.out.println("------------------------------");
                System.out.println("Gracias por preferirnos... ");
                System.out.println("------------------------------");

                bandera = 2;
            }

        } while (seleccion != 2);

    }

    public abstract void Retiro() ;

    public void Deposito() {
        deposito = entrada.nextInt();
        saldo = deposito + saldo;
        System.out.println("------------------------------");
        System.out.println("Deposito exitoso");
        System.out.println("------------------------------");
    }

    public abstract void Transacciones();

    public int getSaldo() {
        return saldo;

    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

}
