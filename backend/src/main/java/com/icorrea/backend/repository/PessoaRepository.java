package com.icorrea.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.icorrea.backend.entity.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
