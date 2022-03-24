package br.com.eblack.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Denuncias")
public class Denuncia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String Nome;
	
	@Column(nullable = false)
	private String Telefone;
	
	@Column(nullable = false)
	private String Email;
	
	@Column(nullable = false, length = 500)
	private String Ocorrido;

	
	
	
	public Denuncia() {
		
	}

	public Denuncia(String nome, String telefone, String email, String ocorrido) {
		
		Nome = nome;
		Telefone = telefone;
		Email = email;
		Ocorrido = ocorrido;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getOcorrido() {
		return Ocorrido;
	}

	public void setOcorrido(String ocorrido) {
		Ocorrido = ocorrido;
	}
	
	
}
