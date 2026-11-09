package com.bricortestec.spring.act1.controllers;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;

@RestController 
public class IdentidadController {

    @GetMapping("/api/identidad")
    public Map<String,Object> identidad(){
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("proyecto", "Act1 - Introducción a Spring Boot");
        respuesta.put("autor", "BriCortesTec");
        respuesta.put("lenguaje", "Java");
        respuesta.put("framework", "Spring Boot");
        respuesta.put("version", "4.1.2");

        return respuesta;
    }
    
}
