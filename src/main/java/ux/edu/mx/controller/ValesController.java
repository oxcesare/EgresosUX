package ux.edu.mx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValesController {

    @GetMapping("/vales")
    public String getVales() {
        return "Aquí se mostrarán los vales disponibles. " +
                "Puedes personalizar este mensaje según tus necesidades. " +
                "¡Gracias por usar nuestra aplicación!";
    }
}
