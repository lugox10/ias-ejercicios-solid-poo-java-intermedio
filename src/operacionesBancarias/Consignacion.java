package operacionesBancarias;

public class Consignacion extends CuentasRepresentante implements Procesos {
    String origen;
    String destino;


    @Override
    public void consultas() {
        procesos();
    }

    @Override
    public void procesos() {
        if(origen == cliente){
            System.out.println("su consignacion fue exitosa");
        }

    }
}
