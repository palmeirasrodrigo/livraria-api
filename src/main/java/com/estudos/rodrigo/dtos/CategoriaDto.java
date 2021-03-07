package com.estudos.rodrigo.dtos;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.estudos.rodrigo.domain.Categoria;

public class CategoriaDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;

	@NotEmpty(message = "Campo nome é requerido")
	@Length(min = 3, max = 100, message = "O campo nome deve ter entre 3 e 100 caracteres")
	private String nome;
	
	@NotEmpty(message = "Campo descrição é requerido")
	@Length(min = 3, max = 200, message = "O campo nome deve ter entre 3 e 200 caracteres")
	private String descricao;
	
	public CategoriaDto() {
		super();
	}

	public CategoriaDto(Categoria obj) {
		super();
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.descricao = obj.getDescricao();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}	
}
