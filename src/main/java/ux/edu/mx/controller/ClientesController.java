package ux.edu.mx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ux.edu.mx.model.Clientes;

/**
 * Clients: Registered individuals on the business platform who are granted a credit line.
 */
public class ClientesController {

    @GetMapping("/clientes")
    public String getClientes() {
        // Logic to retrieve clients
        return "List of clients";
    }

    //save cliente
    @PostMapping("/clientes/guardarCliente")
    public String saveCliente(@RequestBody Clientes cliente) {
        // Logic to save client
        return "Client saved successfully";
    }



}
