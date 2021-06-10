package br.com.elibeniciocorp.eventdash.dao;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import br.com.elibeniciocorp.eventdash.model.Evento;

public interface EventoDAO extends CrudRepository<Evento, Integer> {

	public ArrayList<Evento> findAllByDataBetweenOrderByDataAsc(LocalDate inicio, LocalDate fim);

}
