package com.icorrea.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.icorrea.backend.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
