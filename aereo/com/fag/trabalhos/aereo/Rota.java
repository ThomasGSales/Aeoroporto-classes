package com.fag.trabalhos.aereo;

public class Rota {
	private int codigo;
	private String descricao;
	
	
	public Rota(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
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
	
	public static Rota[] getRotas() {
		Rota[] rotas = {
				new Rota(1, "rota para norte"),
				new Rota(2, "rota para sul"),
				new Rota(3, "rota para nordeste"),
				new Rota(4, "rota para centro-oeste"),
				new Rota(5, "rota para sudeste"),
		};
		return rotas;
	}
}
