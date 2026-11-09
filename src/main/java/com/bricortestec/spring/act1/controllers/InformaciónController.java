package com.bricortestec.spring.act1.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InformaciónController {

    @GetMapping("/api/estudiante")
    public Map<String, Object> estudiante() {

        Map<String, Object> respuesta = new HashMap<>();

        respuesta.put("carrera", "Ingeniería en Sistemas Computacionales");
        respuesta.put("materia", "Programación Web");
        respuesta.put("unidad", "4");
        respuesta.put("actividad", "Introducción a Spring Boot");

        return respuesta;
    }

    @GetMapping("/api/mensaje")
    public Map<String, Object> mensaje() {

        Map<String, Object> respuesta = new HashMap<>();

        respuesta.put("mensaje", "¡Mi aplicación Spring Boot está funcionando!");
        respuesta.put("estado", "Oaxaca");

        return respuesta;
    }
}