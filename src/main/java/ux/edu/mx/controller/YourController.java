package ux.edu.mx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // Indica que esta clase es un controlador Spring MVC
public class YourController {

    @GetMapping("/") // Mapea la URL raíz ("/")
    public String home(Model model) {
        // Puedes agregar atributos al modelo que Thymeleaf usará
        model.addAttribute("message", "¡Bienvenido a mi aplicación Spring Boot con Thymeleaf!");
        model.addAttribute("year", 2025);
        return "index"; // Retorna el nombre de la plantilla (index.html en este caso)
        // Spring Boot buscará 'src/main/resources/templates/index.html'
    }

    @GetMapping("/about")
    public String about() {
        return "about"; // Retorna la plantilla about.html
    }
}