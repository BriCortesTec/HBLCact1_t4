package com.bricortestec.spring.act1.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller 
public class EjemploController {

    @GetMapping("/detalles_info")

    public String info(Map<String, Object> model){
        model.put("Título", "Servidor en línea");
        model.put("Servidor", "Act1_t4");
        model.put("IP", "192.168.2.1");
        return "detalles_info";
    }
}
