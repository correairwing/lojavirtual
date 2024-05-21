package com.icorrea.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.icorrea.backend.entity.Estado;

public interface EstadosRepository extends JpaRepository<Estado, Long> {
    
}
