package com.Proyecto.miProyecto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PacienteController {

    @GetMapping
    public String holaApp() {
        return "<h1>Hola paciente</h1";
    }



}
