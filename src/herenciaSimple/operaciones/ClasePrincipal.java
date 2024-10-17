package herenciaSimple.operaciones;


import herenciaSimple.claseHijaSuma.ClaseHijaSuma;

public class ClasePrincipal {

    public static void main(String[] args) {


        ClaseHijaSuma operaciones = new ClaseHijaSuma();
        operaciones.PedirDatos();
        operaciones.Suma();
        operaciones.MostrarResultado();

    }
}
