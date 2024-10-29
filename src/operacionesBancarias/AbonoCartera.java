package operacionesBancarias;


public class AbonoCartera extends CuentasRepresentante implements Procesos {

    String origen;
    String destino;

    @Override
    public void procesos() {
        if (origen == cliente) {

            System.out.println("el Abono De Cartera es exitoso");
            System.out.println("-------------------------------------");
        }
    }

    public void consultas() {
        procesos();

    }

}
