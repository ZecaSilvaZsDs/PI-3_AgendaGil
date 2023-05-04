package com.api.agendaGil.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TesteFormController {
    @RequestMapping("/sorteador")
    public String form(){
        return "Sorteador";
    }
}
