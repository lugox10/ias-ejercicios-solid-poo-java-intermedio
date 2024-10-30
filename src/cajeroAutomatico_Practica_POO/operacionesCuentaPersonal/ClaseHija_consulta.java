package cajeroAutomatico_Practica_POO.operacionesCuentaPersonal;

import cajeroAutomatico_Practica_POO.menuOperacionesCajeroAutomatico.ClasePadre_Abstracta;

public class ClaseHija_consulta extends ClasePadre_Abstracta {


    @Override
    public void Transacciones() {
        System.out.println("----------------------------------");
        System.out.println("Tu saldo actual es: "+ getSaldo());
        System.out.println("----------------------------------");
        System.out.println("si deseas salir presiona la opcion 7");
    }
}
