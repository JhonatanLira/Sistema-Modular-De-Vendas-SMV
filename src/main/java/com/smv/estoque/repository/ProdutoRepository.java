package com.smv.estoque.repository;

import com.smv.estoque.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {



   // @Query("SELECT p.id, p.nome, p.preco,p.quantidade as p FROM Produto ")
   // List<Produto> findProdutos();
}
