package com.icorrea.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.icorrea.backend.entity.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Long> {

}
