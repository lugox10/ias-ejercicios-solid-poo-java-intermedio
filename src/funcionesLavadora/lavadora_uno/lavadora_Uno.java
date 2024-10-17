package funcionesLavadora.lavadora_uno;

import funcionesLavadora.funcionesDeLavadora.Funciones;
import funcionesLavadora.funcionesDeLavadora.TipoDeLavado;


import javax.swing.*;

public class lavadora_Uno {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "¡Bienvenido a la aplicación de la lavadora!");//JOptionPane.showMessageDialog(null, SIRVE PARA MOSTRAR UN MENSAJE AL USUARIO

        String nombre = JOptionPane.showInputDialog("¿Cuál es tu nombre?");
        System.out.println("Nombre: " + nombre);

        String tipoDeRopa = JOptionPane.showInputDialog("Ingresa el tipo de ropa:" +
                "(1. Ropa de color, 2. Ropa blanca, 3. Ropa JEANS  fuerte):");
        int tiposdeRopa = Integer.parseInt(tipoDeRopa);
        System.out.println("Tipo de ropa: " + tiposdeRopa);

        String cantidadRopa = JOptionPane.showInputDialog("Ingresa la cantidad de prendas para lavar:");
        int cantidaDeRopa = Integer.parseInt(cantidadRopa);
        System.out.println("Cantidad de ropa: " + cantidaDeRopa);
        Funciones funciones = new Funciones(cantidaDeRopa, tiposdeRopa);

        // Opciones para el usuario
        String[] opciones = {"Iniciar lavado", "Cancelar"};
        int seleccion = JOptionPane.showOptionDialog(null,//JOptionPane.showOptionDialog(null, SIRVE PARA DAR OPCIONES AL USUARIO
                "Elige una opción:",
                "Título del diálogo",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opciones,
                opciones[0]);

        // Verificar la opción seleccionada
        if (seleccion == 0) {
            funciones.CicloFinalizado();
        } else if (seleccion == 1) {
            funciones.CicloFinalizado();
        } else {
            JOptionPane.showMessageDialog(null, "Operación cancelada.");
        }
        // Opcional: Imprimir opción seleccionada en consola
        System.out.println("Opción seleccionada: " + (seleccion >= 0 ? opciones[seleccion] : "Ninguna"));


        //SOLO SE PUEDE VER EL METODO CICLOFINALIZADO EN EL ARCHIVO FUNCIONES.JAVA ES EL UNICO PUBLICO Y SE PUEDE VER EN OTRA CLASE
        funciones.CicloFinalizado();
    }

}

