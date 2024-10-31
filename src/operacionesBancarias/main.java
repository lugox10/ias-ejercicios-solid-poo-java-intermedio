package operacionesBancarias;
import operacionesBancarias.cuentas.Creditos;
import operacionesBancarias.cuentas.CuentaExtranjero;
import operacionesBancarias.cuentas.CuentaNomina;
import operacionesBancarias.cuentas.CuentasRepresentante;
import operacionesBancarias.interfaces.Cuentas;
import operacionesBancarias.interfaces.Procesos;
import operacionesBancarias.operaciones.*;

public class main {

    public static void main(String[] args) {
int tipo=0;
    Cuentas cuenta = null;
    Procesos procesos =null;
    if(tipo==0){
            cuenta= new Creditos();
            procesos = new AbonarCartera();
            ((AbonarCartera) procesos).procesarCredito((Creditos) cuenta);
    }else if(tipo==1){
        cuenta= new CuentaNomina();
        procesos = new Consignacion();
        ((Consignacion) procesos).procesarConsginacion((CuentaNomina) cuenta);
    }else{
        cuenta= new CuentasRepresentante();
        CuentaExtranjero cuentaExtranjero= new CuentaExtranjero();
        procesos = new Transferencias();
        ((Transferencias) procesos).hacerTranferencia((CuentasRepresentante) cuenta,cuentaExtranjero);
    }
if(cuenta!=null){
    System.out.println(cuenta.consultarSaldo());
}


        for(int h=0;h<procesos.listarMovimientos().size();h++){
            procesos.listarMovimientos().get(h).getNumeroCuenta();
        }






//operacion positiva
        //OperacionesBancarias operacion = new Deposito();
        //operacion.consultarSaldo();
        //operacion.movimient();
//operacion negativa
        //OperacionesBancarias operacion2 = new Retiro();
        //operacion2.movimient();


//consignaciones
        //CuentasRepresentante consignaciones = new Consignacion();
        //consignaciones.consultas();
//creditos
        //CuentasRepresentante creditos = new Creditos();
        //creditos.consultas();

    }
}
