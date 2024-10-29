package operacionesBancarias;

public abstract class OperacionesBancarias {
    int saldo;
    int dinero;


    public abstract void movimient();

    public void consultarSaldo(){
        System.out.println("tu tines 5 pesos en la cuenta ");
        System.out.println("-------------------------------------");
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
}
