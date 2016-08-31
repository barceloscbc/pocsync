package br.com.poc.sync.spring.boot.service.model.entity;

import java.util.Date;

import br.com.poc.sync.spring.boot.crud.entity.Entity;

public class Cliente implements Entity<Integer> {
	private Integer id;
	private String nome;
	private String cpf;
	private Date dataNascimento;

	@Override
	public Integer getId() {
		return this.id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
