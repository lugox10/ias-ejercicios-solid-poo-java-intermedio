package operacionesBancarias;

public class Creditos extends CuentasRepresentante implements Procesos{
    String origen;
    String destino;

    @Override
    public void consultas() {
        procesos();
    }

    @Override
    public void procesos() {
     if(origen == destino){
         System.out.println("el pago de su credito es exitiso");
     }

    }
}
