/*package cajeroAutomatico_Practica_POO;

import java.util.Scanner;

import static cajeroAutomatico_Practica_POO.ClasePadre_Abstracta.saldo;

public class TransaccionesVirtuales extends ClasePadre_Abstracta implements Transferencia{
Scanner entrada = new Scanner(System.in);
int retiro;
    @Override
    public void Transfer() {
        System.out.println("cuato dinero deseas transferir");
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

    }
}*/

