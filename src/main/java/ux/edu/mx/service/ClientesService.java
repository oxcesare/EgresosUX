package ux.edu.mx.service;

/**
 * Credit Line: The amount of money assigned to a client for product purchases.
 */
public class ClientesService {

    //Credit Line: The amount of money assigned to a client for product purchases.
    public void asignarLineaCredito(String clienteId, double monto) {
        // Lógica para asignar una línea de crédito al cliente
        System.out.println("Asignando una línea de crédito de " + monto + " al cliente con ID: " + clienteId);
    }
}
