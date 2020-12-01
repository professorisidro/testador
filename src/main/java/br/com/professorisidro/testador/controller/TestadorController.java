package br.com.professorisidro.testador.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.professorisidro.testador.model.Produto;

@RestController
@CrossOrigin("*")
public class TestadorController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello";
	}

	@PostMapping("/novoproduto")
	public ResponseEntity<String> adicionarNovoProduto(@RequestBody Produto p){
		if (p.getNome() != null && p.getNome().length() > 0) {
			return ResponseEntity.ok("sucesso");
		}
		else {
			return ResponseEntity.badRequest().build();
		}
	}
}
