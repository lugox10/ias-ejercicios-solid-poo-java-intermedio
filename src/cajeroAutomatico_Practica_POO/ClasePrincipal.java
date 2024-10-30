package cajeroAutomatico_Practica_POO;

import cajeroAutomatico_Practica_POO.menuOperacionesCajeroAutomatico.ClasePadre_Abstracta;
import cajeroAutomatico_Practica_POO.operacionesCuentaPersonal.ClaseHija_consulta;
import cajeroAutomatico_Practica_POO.transferenciasVirtules.TranferenciasVirtuales;

import javax.swing.*;

public class ClasePrincipal {

    public static void main(String[] args) {

        JPasswordField passwordField = new JPasswordField();

        JOptionPane.showMessageDialog(null, "¡Bienvenido IASBank");//JOptionPane.showMessageDialog(null, SIRVE PARA MOSTRAR UN MENSAJE AL USUARIO

        String texto = JOptionPane.showInputDialog("Ingresa tu nombre");

        int option = JOptionPane.showConfirmDialog(null, passwordField, "Ingresa tu contraseña", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (option == JOptionPane.OK_OPTION) {
            // Obtener la contraseña ingresada
            char[] password = passwordField.getPassword();
            // Convertir a String
            String passwordString = new String(password);
            // Mostrar la contraseña (en un caso real, no deberías mostrarla)
            //    JOptionPane.showMessageDialog(null, "Tu contraseña es: " + passwordString);
        }
        // Mostrar los valores ingresados
        JOptionPane.showMessageDialog(null, "nombre Usuario:  " + texto + "\nClave Principal: " +  "  ****");
        JOptionPane.showMessageDialog(null, "tu nombre y contraseña son exitosos"+"\n Bienvenido!   "+ texto + "\ncontinue desde la consola ");

        ClasePadre_Abstracta consultas = new ClaseHija_consulta();
        consultas.getSaldo();
        consultas.MenuOperaciones();

    }
}
