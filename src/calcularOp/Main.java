package calcularOp;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Mostrar bienvenida
        JOptionPane.showMessageDialog(null, "¡Bienvenido a la aplicación!");

        // Solicitar nombre
        String nombre = JOptionPane.showInputDialog("¿Cuál es tu nombre?");
        System.out.println("Nombre: " + nombre);  // Imprimir nombre en consola

        // Solicitar la base y la altura al usuario
        String baseStr = JOptionPane.showInputDialog("Ingresa la base:");
        String alturaStr = JOptionPane.showInputDialog("Ingresa la altura:");

        // Convertir los valores ingresados a enteros
        int base = Integer.parseInt(baseStr);
        int altura = Integer.parseInt(alturaStr);

        // Imprimir base y altura en consola
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);

        // Crear una instancia de Calcular
        CalcularOperaciones calcular = new CalcularOperaciones(base, altura);

        // Opciones para el usuario
        String[] opciones = {"Calcular área", "Calcular perímetro", "Cancelar"};
        int seleccion = JOptionPane.showOptionDialog(null,
                "Elige una opción:",
                "Título del diálogo",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opciones,
                opciones[0]);

        // Verificar la opción seleccionada
        if (seleccion == 0) {
            calcular.calcularArea();
        } else if (seleccion == 1) {
            calcular.calcularPerimetro();
        } else {
            JOptionPane.showMessageDialog(null, "Operación cancelada.");
        }

        // Opcional: Imprimir opción seleccionada en consola
        System.out.println("Opción seleccionada: " + (seleccion >= 0 ? opciones[seleccion] : "Ninguna"));
    }
}