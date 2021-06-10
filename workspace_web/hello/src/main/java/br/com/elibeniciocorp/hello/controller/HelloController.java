package br.com.elibeniciocorp.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import br.com.elibeniciocorp.hello.model.Produto;



/*informo ao springboob que esta classe tem métodos executados a partir de invocação de uma url*/
@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Oi tudo bem? Acho que deu certo...";
	}

	@GetMapping("/hellohtml")
	public String sayHelloHtml() {
		return "<html>"
				+ "<body>"
				+ "<h1>Bem vindo ao Spring Boot</h1>"
				+ "<hr>"
				+ "</body>"
				+ "</html>";
				
	}
	
	@GetMapping("/produto")
	public Produto exibirProduto() {
		Produto p = new Produto();
		p.setId(25147);
		p.setDescricao("Comuputador top de linha");
		p.setPreco(2500);
		return p;
		
	}
	
	@PostMapping("/novoproduto")
	public String cadastrarProduto(@RequestBody Produto novo) {
		System.out.println("Recebido: " + novo.getId()+"/"+novo.getDescricao()+"/"+novo.getPreco());
		return "ok";
	}
}
