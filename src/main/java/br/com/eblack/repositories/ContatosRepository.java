package br.com.eblack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.eblack.entities.Contato;

@Repository
public interface ContatosRepository extends JpaRepository<Contato, Long> {

}
