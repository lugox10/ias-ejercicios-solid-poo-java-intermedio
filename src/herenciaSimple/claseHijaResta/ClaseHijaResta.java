package herenciaSimple.claseHijaResta;

import herenciaSimple.clasePadre.ClasePadre;

public class ClaseHijaResta extends ClasePadre {

    public void Resta(){
        resultado = valor1 - valor2 - valor3;
        System.out.println("el resultado de la resta es: ");
    }
}
