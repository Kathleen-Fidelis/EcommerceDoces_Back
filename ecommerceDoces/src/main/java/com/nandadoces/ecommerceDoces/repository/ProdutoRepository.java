package com.nandadoces.ecommerceDoces.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nandadoces.ecommerceDoces.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
