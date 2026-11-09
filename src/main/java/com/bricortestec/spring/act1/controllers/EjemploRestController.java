package com.bricortestec.spring.act1.controllers;

import java.util.HashMap;
import java.util.Map;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController 
public class EjemploRestController {

    @GetMapping("/detalles_info2")

    public Map<String,Object> detalles_info2(){
        Map<String, Object> respuesta = new HashMap<>();        
        respuesta.put("Título", "Servidor en línea");
        respuesta.put("Servidor", "Act1_t4");
        respuesta.put("IP", "192.168.2.1");
        return respuesta;
    }
}
