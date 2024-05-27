package com.icorrea.backend.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Table(name= "estado")
@Data
@SequenceGenerator(name = "seq_estado", sequenceName = "seq_estado", allocationSize = 1, initialValue = 1)
public class Estado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_estado")
	private Long id;
	
    private String nome;
    private String sigla;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAtualizacao;
}
