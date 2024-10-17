package polimorfismo.claseHijaSuma;

import polimorfismo.operacinesClasePadre.ClasePadre;

public class ClaseHijaSuma extends ClasePadre {

    @Override
    public void Operaciones() {
        System.out.println("vamos a sumar!");
        resultado = valor1 + valor2 ;

    }

}
