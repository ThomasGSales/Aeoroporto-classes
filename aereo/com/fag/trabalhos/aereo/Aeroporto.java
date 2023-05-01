package com.fag.trabalhos.aereo;

public class Aeroporto {
	private int codigo;
	private String descricao;
	private String sigla;
	
	
	
	public Aeroporto(int codigo, String descricao, String sigla) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.sigla = sigla;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	public static Aeroporto[] getAeroportos() {
		Aeroporto[] aeroportos = {
				new Aeroporto(1, "Aeroporto nacional da região norte", "ASLA"),
				new Aeroporto(2, "Aeroporto nacional da região sul", "USLU"),
				new Aeroporto(3, "Aeroporto nacional da região nordeste", "ASKA"),
				new Aeroporto(4, "Aeroporto nacional da região centro-oeste", "ASPU"),
				new Aeroporto(5, "Aeroporto nacional da região sudeste", "USKU")
		};
		return aeroportos;
	}
	
	
	
	
}
