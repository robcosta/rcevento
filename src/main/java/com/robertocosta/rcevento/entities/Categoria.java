package com.robertocosta.rcevento.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Categoria {
	
	private Integer id;
	private String descricao;
	
	private List<Atividade> atividades = new ArrayList<>();
	
	public Categoria() {
	}

	public Categoria(Integer id, String descricao, List<Atividade> atividades) {
		this.id = id;
		this.descricao = descricao;
		this.atividades = atividades;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public List<Atividade> getAtividades() {
		return atividades;
	}

	@Override
	public int hashCode() {
		return Objects.hash(descricao, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		return Objects.equals(descricao, other.descricao) && Objects.equals(id, other.id);
	}	
}
