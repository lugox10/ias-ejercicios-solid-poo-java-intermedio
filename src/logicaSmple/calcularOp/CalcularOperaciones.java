package logicaSmple.calcularOp;

public class CalcularOperaciones {

    int base;
    int altura;
    int resultado;

    public CalcularOperaciones(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    public void calcularArea(){
        resultado = base * altura;
        System.out.println("El area es: " + resultado);
    }

    public void calcularPerimetro() {
        resultado = 2 * (base + altura);
        System.out.println("El perimetro es: " + resultado);
    }

    public void imprimir(){
        System.out.println("El resultado es: " + resultado);
    }
}
