package polimorfismo.main;

import polimorfismo.operacinesClasePadre.ClasePadre;
import polimorfismo.opercionesClaseHija.ClaseHijaResta;
import polimorfismo.claseHijaSuma.ClaseHijaSuma;

public class ClasePrincipal {

    public static void main(String[] args) {


        ClasePadre operador = new ClaseHijaResta();
        operador.PedirDatos();
        operador.Operaciones();
        operador.Resultado();

        ClasePadre operador1 = new ClaseHijaSuma();
        operador1.PedirDatos();
        operador1.Operaciones();
        operador1.Resultado();



    }
}
