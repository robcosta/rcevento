package com.robertocosta.rcevento.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Participante {

	private Integer id;
	private String nome;
	private String email;
	
	private List<Atividade> atividades = new ArrayList<>();
	
	public Participante() {
	}

	public Participante(Integer id, String nome, String email, List<Atividade> atividades) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.atividades = atividades;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public List<Atividade> getAtividades() {
		return atividades;
	}
		
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Participante other = (Participante) obj;
		return Objects.equals(id, other.id);
	}
}
