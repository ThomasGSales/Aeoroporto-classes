package com.fag.trabalhos.aereo;

public class SituacaoBilhete {
	private int codigo;
	private String descricao;
	
	public SituacaoBilhete(int codigo, String descricao) {
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
	
	public static SituacaoBilhete[] getSituacoes() {
		SituacaoBilhete[] situacoes = {
				new SituacaoBilhete(1, "Disponivel"),
				new SituacaoBilhete(2, "Reservado"),
				new SituacaoBilhete(3, "Vendido")
		};
		return situacoes;
	}
	
}
