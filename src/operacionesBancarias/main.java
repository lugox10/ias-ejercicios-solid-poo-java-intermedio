package operacionesBancarias;

import operacionesBancarias.cuentas.CuentaNomina;
import operacionesBancarias.interfaces.Cuentas;
import operacionesBancarias.interfaces.Procesos;
import operacionesBancarias.operaciones.Transferencias;

import java.util.Scanner;

import static operacionesBancarias.interfaces.ConOrigen.cuentaOrigen;
import static operacionesBancarias.interfaces.Procesos.cuentaDestino;
import static operacionesBancarias.operaciones.AbonarCartera.abonoCartera;
import static operacionesBancarias.operaciones.Consignacion.consignacion;
import static operacionesBancarias.operaciones.PagoNomina.pagarNomina;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CuentaNomina cuentaConsignacion = new CuentaNomina("", 0);
        Procesos proceso = null;

        int tipo = -1;  // Iniciamos tipo en -1 para mostrar el menú de opciones

        do {
            mostrarMenu();
            tipo = scanner.nextInt();  // Leemos la opción seleccionada por el usuario

            switch (tipo) {
                case 1:

                    proceso = abonoCartera(cuentaConsignacion);
                    break;

                case 2:
                   //consignar
                    proceso = consignacion(scanner, cuentaConsignacion);
                    break;

                case 3:
                    proceso =Transferencias.tranferencias((CuentaNomina)cuentaDestino);

                    break;

                case 4:

                    proceso = pagarNomina();
                    break;

                case 5:

                    System.out.println("Débito Automático: Función aún no implementada.");
                    break;

                case 6:

                    System.out.println("Depósito: Función aún no implementada.");
                    break;

                case 7:

                    System.out.println("Retiro: Función aún no implementada.");
                    break;

                case 0:

                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    // Opción no válida
                    System.out.println("Opción no válida, por favor elija una opción del 1 al 7.");
                    break;
            }

            // Si se ha seleccionado una opción válida, procesamos la operación
            if (proceso != null && tipo != 0) {
                proceso.procesar();
            }

        } while (tipo != 0); // El bucle continúa hasta que se seleccione la opción de salir (0)
    }

    // Método para mostrar el menú de opciones
    private static void mostrarMenu() {
        System.out.println("Elige una opción: ");
        System.out.println("1- Abono a Cartera");
        System.out.println("2 - Consignación");
        System.out.println("3 - Transferencia");
        System.out.println("4 - Pago de Nómina");
        System.out.println("5 - Débito Automático");
        System.out.println("6 - Depósito");
        System.out.println("7 - Retiro");
        System.out.println("0 - Salir");
    }
}
