package br.com.eblack.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ProdutosVendedor")
public class ProdutoVendedor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String nomeProduto;
	
	@Column(nullable = false)
	private Double preco;

	
	
	public ProdutoVendedor() {
		
	}

	public ProdutoVendedor(String nomeProduto, Double preco) {
		
		this.nomeProduto = nomeProduto;
		this.preco = preco;
	}


	
	

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNomeProduto() {
		return nomeProduto;
	}



	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}



	public Double getPreco() {
		return preco;
	}



	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
		
}
