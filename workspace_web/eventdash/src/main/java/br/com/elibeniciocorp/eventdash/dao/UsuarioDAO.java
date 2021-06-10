package br.com.elibeniciocorp.eventdash.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.elibeniciocorp.eventdash.model.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario, Integer> {
	//consultas customizadas
	public Usuario findByEmailOrRacf(String email, String racf);

}
