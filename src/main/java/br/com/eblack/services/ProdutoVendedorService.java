package br.com.eblack.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.eblack.entities.ProdutoVendedor;
import br.com.eblack.repositories.ProdutosVendedorRepository;

@RestController
@RequestMapping("/produtosvendedor")
@CrossOrigin(origins = "*") 
public class ProdutoVendedorService {

	@Autowired
	private ProdutosVendedorRepository produtosVendedorRepository;
	
	@GetMapping
	public List<ProdutoVendedor> findAll(){
		return produtosVendedorRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<ProdutoVendedor> findById(@PathVariable Long id){
		return produtosVendedorRepository.findById(id);
	}
	
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ProdutoVendedor save(@RequestBody ProdutoVendedor produtoVendedor) {
		return produtosVendedorRepository.save(produtoVendedor);
	}
	
	@PutMapping
	public void update(@RequestBody ProdutoVendedor produtoVendedor) {
		produtosVendedorRepository.save(produtoVendedor);
	}
	
	@DeleteMapping(path = "/{id}")
	public void delete(@PathVariable Long id) {
		produtosVendedorRepository.deleteById(id);
	}
}
