package com.api.agendaGil.repository;

import com.api.agendaGil.models.Agendamento;
import org.springframework.data.repository.CrudRepository;

public interface AgendamentoRepository extends CrudRepository <Agendamento, String> {

}
