package herenciaSimple.clasePadre;

import java.util.Scanner;

public class ClasePadre {

    protected int valor1;
    protected int valor2;
    protected int valor3;
    protected int resultado;

    public void PedirDatos(){
        Scanner operacion = new Scanner(System.in);
        System.out.println("ingrese el valor 1: ");
        valor1 = operacion.nextInt();
        System.out.println("ingrese el valor 2: ");
        valor2 = operacion.nextInt();
        System.out.println("ingrese el valor 3: ");
        valor3 = operacion.nextInt();
    }

    public void MostrarResultado(){
        System.out.println(resultado);
    }
}
