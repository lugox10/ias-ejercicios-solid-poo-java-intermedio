package operacionesBancarias;

public class Retiro extends OperacionesBancarias {
    @Override
    public void movimient() {
        if(dinero <= saldo){
            System.out.println("Retiraste 5 pesos de la cuenta");
            System.out.println("-------------------------------------");
        }
    }


}
