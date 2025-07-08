package ux.edu.mx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValesController {

    @GetMapping("/vales")
    public String getVales() {
        return "Aquí se mostrarán los vales disponibles. " +
                "Puedes personalizar este mensaje según tus necesidades. " +
                "Esta es una aplicación de ejemplo que muestra cómo manejar vales en Spring Boot. " +
                "¡Gracias por usar nuestra aplicación!";
    }
}
