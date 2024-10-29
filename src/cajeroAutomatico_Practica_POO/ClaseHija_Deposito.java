package cajeroAutomatico_Practica_POO;

public class ClaseHija_Deposito extends ClasePadre_Abstracta {
    @Override
    public void Retiro() {

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
    }
}
