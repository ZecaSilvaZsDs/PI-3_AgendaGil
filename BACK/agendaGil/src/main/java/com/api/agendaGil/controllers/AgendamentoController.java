package com.api.agendaGil.controllers;

import com.api.agendaGil.models.Agendamento;
import com.api.agendaGil.repository.AgendamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/agendamento")
public class AgendamentoController {
    @Autowired
    private AgendamentoRepository ar;
    @RequestMapping(method = RequestMethod.GET)
    public String form(final Model model){
        model.addAttribute("agendamento", new Agendamento());
        return "frontAgendaGil/formAgendamento";
    }
    @RequestMapping(method = RequestMethod.POST)
    public String form(@ModelAttribute Agendamento agendamento){
        ar.save(agendamento);
        return "redirect:/agendamento";
    }
}
