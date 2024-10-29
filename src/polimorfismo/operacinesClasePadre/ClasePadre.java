package polimorfismo.operacinesClasePadre;

import java.util.Scanner;

public abstract class ClasePadre {

    protected  int valor1, valor2, resultado;

    Scanner operador = new Scanner(System.in);

    public void PedirDatos(){
        System.out.println("dame el primer Valor: ");
        valor1= operador.nextInt();

        System.out.println("dame el segundo Valor: ");
        valor2= operador.nextInt();
    }

    public abstract void Operaciones();

    public void Resultado()

    {
        System.out.println("El Resultado es: "+ resultado);
    }
}
