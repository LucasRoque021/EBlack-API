package br.com.eblack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.eblack.entities.Denuncia;

@Repository
public interface DenunciasRepository extends JpaRepository<Denuncia, Long> {

}
