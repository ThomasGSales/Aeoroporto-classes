package com.fag.trabalhos.aereo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Pessoa {
	private int codigo;
	private String nome;
	private String email;
	private String telefone;
	private LocalDate nascimento;
	private String rg;
	private String cpf;
	private Endereco endereco;

	public Pessoa(int codigo, String nome, String email, String telefone, LocalDate nascimento, String rg, String cpf, Endereco endereco) {
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.nascimento = nascimento;
		this.rg = rg;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	
	public Pessoa() {
		
	}
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public LocalDate getNascimento() {
		return nascimento;
	}
	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
}
