package polimorfismo.opercionesClaseHija;

import polimorfismo.operacinesClasePadre.ClasePadre;

public class ClaseHijaResta extends ClasePadre {


    @Override
    public void Operaciones() {
        System.out.println("vamos a restar!");
        resultado = valor1 - valor2;
    }
}
