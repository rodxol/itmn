package br.com.elibeniciocorp.eventdash.dao;

import java.util.ArrayList;
import br.com.elibeniciocorp.eventdash.model.Equipamento;

import org.springframework.data.repository.CrudRepository;

public interface EquipamentoDAO extends CrudRepository<Equipamento, Integer> {
	
	public ArrayList<Equipamento> findAll();

}
