package ux.edu.mx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {

    @GetMapping("/version")
    public String getVersion() {
        return "Versión 1.0.0 - Desarrollado por César Ricardo Hernández Hernández, 2025. " +
               "Este es un ejemplo de una aplicación Spring Boot que muestra la versión actual. " +
               "Puedes personalizar este mensaje según tus necesidades. " +
               "¡Gracias por usar nuestra aplicación!";
    }
}
