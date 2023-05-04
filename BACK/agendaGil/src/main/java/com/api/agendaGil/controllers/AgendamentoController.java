package com.api.agendaGil.controllers;

import com.api.agendaGil.models.Agendamento;
import com.api.agendaGil.repository.AgendamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AgendamentoController {
    @Autowired
    private AgendamentoRepository ar;
    @RequestMapping(value = "/agendamento", method = RequestMethod.GET)
    public String form(){
        return "frontAgendaGil/formAgendamento";
    }
    @RequestMapping(value = "/agendamento", method = RequestMethod.POST)
    public String form(Agendamento agendamento){
        ar.save(agendamento);
        return "redirect:/agendamento";
    }
}
