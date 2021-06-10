package br.com.elibeniciocorp.eventdash.dao;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import br.com.elibeniciocorp.eventdash.model.Alarme;

public interface AlarmeDAO extends CrudRepository <Alarme,Integer> {
	
	public ArrayList<Alarme> findAll();

}
