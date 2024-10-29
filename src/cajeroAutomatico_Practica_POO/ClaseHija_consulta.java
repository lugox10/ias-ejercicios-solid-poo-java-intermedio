package cajeroAutomatico_Practica_POO;

public class ClaseHija_consulta extends ClasePadre_Abstracta {

    @Override
    public void Retiro() {

    }

    @Override
    public void Transacciones() {
        System.out.println("----------------------------------");
        System.out.println("Tu saldo actual es: "+ getSaldo());
        System.out.println("----------------------------------");
    }
}
