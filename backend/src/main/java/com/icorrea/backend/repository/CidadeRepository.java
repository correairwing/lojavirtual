package com.icorrea.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.icorrea.backend.entity.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {

}
