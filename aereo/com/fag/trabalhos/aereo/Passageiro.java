package com.fag.trabalhos.aereo;

import java.time.LocalDate;

public class Passageiro extends Pessoa {
	public Passageiro(int codigo, String nome, String email, String telefone, LocalDate nascimento, String rg,
			String cpf, Endereco endereco) {
		super(codigo, nome, email, telefone, nascimento, rg, cpf, endereco);
	}
	private int codigo;
	private String passaporte;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getPassaporte() {
		return passaporte;
	}
	public void setPassaporte(String passaporte) {
		this.passaporte = passaporte;
	}
	
}
