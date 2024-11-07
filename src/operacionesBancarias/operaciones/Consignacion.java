package operacionesBancarias.operaciones;

import operacionesBancarias.cuentas.CuentaNomina;
import operacionesBancarias.cuentas.CuentasCorriente;
import operacionesBancarias.interfaces.Cuentas;
import operacionesBancarias.interfaces.Procesos;

import java.util.LinkedList;
import java.util.Scanner;

public class Consignacion implements Procesos {

    private Cuentas cuentaDestino;

    @Override
    public LinkedList<Cuentas> listarMovimientos() {
        LinkedList<Cuentas> creditos = new LinkedList<>();
        creditos.add(new CuentasCorriente());
        return creditos;
    }

    @Override
    public void setCuenta(Cuentas cuenta) {
        this.cuentaDestino = cuenta;
    }

    @Override
    public void procesar() {
        System.out.println("Se está realizando una consignación de $" + cuentaDestino.consultarSaldo() + " a la cuenta " + cuentaDestino.getNumeroCuenta());
    }

    public Cuentas getCuenta() {
        return this.cuentaDestino;
    }

    // Método estático refactorizado
    public static Procesos consignacion(Scanner scanner, Cuentas cuentaOrigen) {

        System.out.println("¿Cuál es el # de la cuenta destino?");
        String numeroCuenta = scanner.next();

        System.out.println("¿Cuánto desea consignar?");
        while (!scanner.hasNextDouble()) {
            System.out.println("Por favor, ingresa una cantidad válida.");
            scanner.next(); // Limpiar el buffer
        }
        double monto = scanner.nextDouble();

        // Crear la cuenta de destino con el monto ingresado
        CuentaNomina cuentaDestino = new CuentaNomina(numeroCuenta, monto);

        // Crear y configurar la operación de consignación
        Consignacion consignacion = new Consignacion();
        consignacion.setCuenta(cuentaDestino);

        // Devolver el objeto de operación para su procesamiento posterior
        return consignacion;
    }
}
