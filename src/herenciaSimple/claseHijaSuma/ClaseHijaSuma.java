package herenciaSimple.claseHijaSuma;

import herenciaSimple.clasePadre.ClasePadre;

public class ClaseHijaSuma extends ClasePadre {

    public void Suma(){
        System.out.println("vamos a sumar!");
        resultado = valor1 + valor2 + valor3;
        System.out.println("el resultado de la suma es: "+ resultado);
    }
}
