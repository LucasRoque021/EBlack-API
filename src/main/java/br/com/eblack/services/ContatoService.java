package br.com.eblack.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.eblack.entities.Contato;
import br.com.eblack.repositories.ContatosRepository;


@RestController
@RequestMapping("/contatos")
@CrossOrigin(origins = "*") 
public class ContatoService {
	
	@Autowired
	private ContatosRepository contatosRepository;
	
	@GetMapping
	public List<Contato> findAll() {
		return contatosRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Contato> findById(@PathVariable Long id){
		return contatosRepository.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Contato save(@RequestBody Contato contato) {
		return contatosRepository.save(contato);
	}
}
