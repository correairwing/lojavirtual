package com.icorrea.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.icorrea.backend.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
