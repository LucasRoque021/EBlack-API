package br.com.eblack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.eblack.entities.ProdutoVendedor;

@Repository
public interface ProdutosVendedorRepository extends JpaRepository<ProdutoVendedor, Long> {

}
