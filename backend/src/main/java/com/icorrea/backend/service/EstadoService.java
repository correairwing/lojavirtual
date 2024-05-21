package com.icorrea.backend.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icorrea.backend.entity.Estado;
import com.icorrea.backend.repository.EstadosRepository;

@Service
public class EstadoService {

    @Autowired
    private EstadosRepository estadosRepository;

    public List<Estado> buscarTodos() {
        return estadosRepository.findAll();
    }

    public Estado inserir(Estado estado) {
        estado.setDataCriacao(new Date());
        Estado estadoNovo = estadosRepository.saveAndFlush(estado);
        return estadoNovo;
    }

    public Estado alterar(Estado estado) {
        estado.setDataAtualizacao(new Date());
        return estadosRepository.saveAndFlush(estado);
    }

    public void excluir(Long id) {
        Estado estado = estadosRepository.findById(id).get();
        estadosRepository.delete(estado);
    }
}
