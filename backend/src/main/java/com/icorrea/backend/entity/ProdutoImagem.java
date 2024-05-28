package com.icorrea.backend.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Table(name= "imagem")
@Data
@SequenceGenerator(name = "seq_imagem", sequenceName = "seq_imagem", allocationSize = 1, initialValue = 1)
public class ProdutoImagem {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_imagem")
    private Long id;

    private String nome;

    @ManyToOne
    @JoinColumn(name = "idProduto")
    private Produto produto;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAtualizacao;
}
