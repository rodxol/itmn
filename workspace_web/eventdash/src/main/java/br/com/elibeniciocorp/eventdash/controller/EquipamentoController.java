package br.com.elibeniciocorp.eventdash.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.elibeniciocorp.eventdash.model.Equipamento;
import br.com.elibeniciocorp.eventdash.dao.EquipamentoDAO;

@RestController
@CrossOrigin("*")
public class EquipamentoController {
	
	@Autowired
	private EquipamentoDAO dao;
	
	@GetMapping("/equipamentos")
	public ArrayList<Equipamento> recuperarTodos(){
		ArrayList<Equipamento> lista;
		lista = (ArrayList<Equipamento>)dao.findAll();
		return lista;
	}

}
