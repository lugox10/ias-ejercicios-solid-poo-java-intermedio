package operacionesBancarias;

public class main {

    public static void main(String[] args) {


//operacion positiva
        OperacionesBancarias operacion = new Deposito();
        operacion.consultarSaldo();
        operacion.movimient();
//operacion negativa
        OperacionesBancarias operacion2 = new Retiro();
        operacion2.movimient();

//abono a caratera
        CuentasRepresentante cuentas = new AbonoCartera();
        cuentas.consultas();
//consignaciones
        CuentasRepresentante consignaciones = new Consignacion();
        consignaciones.consultas();
//creditos
        CuentasRepresentante creditos = new Creditos();
        creditos.consultas();

    }
}
