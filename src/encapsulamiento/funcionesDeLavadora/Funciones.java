package encapsulamiento.funcionesDeLavadora;

import javax.swing.*;

public class Funciones {

    private int cantidadDeRopa = 0;
    private int llenadoCompleto = 0;
    private int tipoRopa = 0;
    private int lavadoCompleto = 0;
    private int secadoCompleto = 0;
    private TipoDeLavado tipoDeLavado;

    public Funciones(int cantidadDeRopa, int tipoRopa) {
        this.cantidadDeRopa = cantidadDeRopa;
        this.tipoRopa = tipoRopa;
        this.tipoDeLavado = tipoDeLavado;
    }

    public Funciones() {
    }

    private void Llenado() {
        if (cantidadDeRopa <= 18) {
            System.out.println("Llenando...");
            System.out.println("Llenado completo");
            llenadoCompleto = 1;

        } else {
            JOptionPane.showMessageDialog(null, "La carga de ropa es muy pesada, reduce la carga de ropa");
            System.out.println("La carga de ropa es muy pesada, reduce la carga de ropa");

        }
    }

    private void Lavado() {
        Llenado();
        if (llenadoCompleto == 1) {
            if (tipoRopa == 1) {
                System.out.println("Ropa de color" );
                System.out.println("Lavando...");
                lavadoCompleto = 1;
            } else if (tipoRopa == 2) {
                System.out.println("Ropa blanca" );
                System.out.println("Lavando...");
                lavadoCompleto = 1;
            } else if (tipoRopa == 3) {
                System.out.println("Ropa de color" );
                System.out.println("Lavando...");
                lavadoCompleto = 1;
            } else {
                System.out.println("El tipo de ropa no está disponible");
                System.out.println("Se lavará como ropa de color");
                lavadoCompleto = 1;
            }
        }
    }

    private void secadoCompleto() {
        Lavado();
        if (lavadoCompleto == 1) {
            System.out.println("Secando...");
            secadoCompleto = 1;
        }
    }

    public void CicloFinalizado() {
        secadoCompleto();
        if (secadoCompleto == 1) {
            System.out.println("Tu ropa está lista");
            System.out.println("Ciclo finalizado");
            System.out.println("Gracias por utilizar nuestros servicios");
            System.out.println("Vuelva pronto");
            System.out.println("-----------------------------------------------");
        }
    }

}
