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

import br.com.eblack.entities.Denuncia;
import br.com.eblack.repositories.DenunciasRepository;

@RestController
@RequestMapping("/denuncias")
@CrossOrigin(origins = "*") 
public class DenunciaService {
	
	@Autowired
	private DenunciasRepository denunciasRepository;
	
	@GetMapping
	public List<Denuncia> findAll() {
		return denunciasRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Denuncia> findById(@PathVariable Long id) {
		return denunciasRepository.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Denuncia save(@RequestBody Denuncia denuncia) {
		return denunciasRepository.save(denuncia);
	}
	
}
