package operacionesBancarias;

public class Deposito extends OperacionesBancarias {

    @Override
    public void movimient() {
        if(saldo == dinero){
            System.out.println("depositaste 5 pesos en la cuenta ");
            System.out.println("-------------------------------------");
        }

    }


}
