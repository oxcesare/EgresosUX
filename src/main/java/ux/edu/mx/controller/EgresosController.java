package ux.edu.mx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/egresos")
public class EgresosController {

    @GetMapping("/cheques")
    public String getCheques() {
        return "Aquí se mostrarán los cheques disponibles. " +
                "Puedes personalizar este mensaje según tus necesidades. " +
                "Esta es una aplicación de ejemplo que muestra cómo manejar egresos en Spring Boot. " +
                "¡Gracias por usar nuestra aplicación!";
    }

    @GetMapping("/vales")
    public String getVales() {
        return "Aquí se mostrarán los vales disponibles. " +
                "Puedes personalizar este mensaje según tus necesidades. ";
    }

    @GetMapping("/otros-egresos")
    public String getOtrosEgresos() {
        return "Aquí se mostrarán otros tipos de egresos. " +
                "Puedes personalizar este mensaje según tus necesidades. ";
    }
}
