package operacionesBancarias.ClaseAbtracta;

import operacionesBancarias.ClaseAbtracta.OperacionesBancarias;

public class Deposito extends OperacionesBancarias {

    public void realizarDeposito(int cantidad) {
        saldo += cantidad;
        System.out.println("Has depositado " + cantidad + " en la cuenta.");
    }

    @Override
    public void movimient() {
        if(saldo == dinero){
            System.out.println("depositaste 5 pesos en la cuenta ");
            System.out.println("-------------------------------------");
        }

    }


}
