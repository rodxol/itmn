package br.com.elibeniciocorp.eventdash.controller;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.elibeniciocorp.eventdash.dao.EventoDAO;
import br.com.elibeniciocorp.eventdash.model.Evento;

@RestController
@CrossOrigin("*")
public class EventoController {
	
	@Autowired
	private EventoDAO dao;
	
	@GetMapping("/eventos")
	public ArrayList<Evento> recuperarTodos(){
		ArrayList<Evento> lista;
		lista = (ArrayList<Evento>)dao.findAll();
		return lista;
	}
	
	@GetMapping("/eventosporperiodo")
	public ArrayList<Evento> recuperarPorPeriodo(@RequestParam(name="inicio")String inicio, @RequestParam(name="fim") String fim){
		LocalDate dataIni = LocalDate.parse(inicio);
		LocalDate dataFim = LocalDate.parse(fim);
		return dao.findAllByDataBetweenOrderByDataAsc(dataIni, dataFim);
	}
}