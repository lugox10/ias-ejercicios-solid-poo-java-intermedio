package operacionesBancarias.ClaseAbtracta;

import operacionesBancarias.ClaseAbtracta.OperacionesBancarias;

public class Retiro extends OperacionesBancarias {
    public void realizarRetiro(int cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Has retirado " + cantidad + " de la cuenta.");
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }


    @Override
    public void movimient() {
        if(dinero <= saldo){
            System.out.println("Retiraste 5 pesos de la cuenta");
            System.out.println("-------------------------------------");
        }
    }


}
