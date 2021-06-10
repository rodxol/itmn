package br.com.elibeniciocorp.eventdash.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.elibeniciocorp.eventdash.dao.UsuarioDAO;
import br.com.elibeniciocorp.eventdash.model.Usuario;

@CrossOrigin("*")
@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioDAO dao;
	
	@GetMapping("/usuarios")
	public ArrayList<Usuario> recuperarTodos(){
		ArrayList<Usuario> lista;
		lista = (ArrayList<Usuario>)dao.findAll();
		return lista;
	}
	
	@PostMapping("/login")
	//public Usuario login(@RequestBody Usuario dadosLogin) {
	
	public ResponseEntity<Usuario> login(@RequestBody Usuario dadosLogin) {
		Usuario res = dao.findByEmailOrRacf(dadosLogin.getEmail(), dadosLogin.getRacf());
		if (res != null) {
			if (res.getSenha().equals(dadosLogin.getSenha())) { // a senha confere
				return ResponseEntity.ok(res);
			}
			else {
				return ResponseEntity.status(403).build();
			}
		}else {
			return ResponseEntity.notFound().build(); //retorna o erro 404 - não encontrado
		}
	}

}
