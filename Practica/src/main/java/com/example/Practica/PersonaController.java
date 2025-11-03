package com.example.Practica;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {

    @GetMapping("/saludar")
    public String saludar(@RequestParam String nombre, @RequestParam String apellido) {
        return "Hola " + nombre + " " + apellido + " desde Spring Boot!";
    }
}
