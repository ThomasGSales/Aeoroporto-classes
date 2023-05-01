package com.fag.trabalhos.aereo;

public class Bagagem {
	private int codigo;
	private String tipo;
	private String peso;
	private Bilhete bilhete;
	
	public Bagagem(int codigo, String tipo, String peso, Bilhete bilhete) {
		this.codigo = codigo;
		this.tipo = tipo;
		this.peso = peso;
		this.bilhete = bilhete;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}
	public Bilhete getBilhete() {
		return bilhete;
	}
	public void setBilhete(Bilhete bilhete) {
		this.bilhete = bilhete;
	}
	
}
