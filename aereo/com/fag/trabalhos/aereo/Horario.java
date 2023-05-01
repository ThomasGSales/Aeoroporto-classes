package com.fag.trabalhos.aereo;

import java.time.LocalDateTime;

public class Horario {
	private int codigo;
	private int rota;
	private LocalDateTime dataPartida;
	private LocalDateTime dataChegada;
	private String classeVoo;
	
	public Horario(int codigo, int rota, LocalDateTime dataPartida, LocalDateTime dataChegada, String classeVoo) {
		this.codigo = codigo;
		this.rota = rota;
		this.dataPartida = dataPartida;
		this.dataChegada = dataChegada;
		this.classeVoo = classeVoo;
	}
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public LocalDateTime getDataPartida() {
		return dataPartida;
	}
	public void setDataPartida(LocalDateTime dataPartida) {
		this.dataPartida = dataPartida;
	}
	public LocalDateTime getDataChegada() {
		return dataChegada;
	}
	public void setDataChegada(LocalDateTime dataChegada) {
		this.dataChegada = dataChegada;
	}
	public String getClasseVoo() {
		return classeVoo;
	}
	public void setClasseVoo(String classeVoo) {
		this.classeVoo = classeVoo;
	}
	
	public static Horario[] getHorarios() {
		Horario[] horarios = {
				new Horario(1, 1, LocalDateTime.of(2023, 02, 12, 13, 40), LocalDateTime.of(2023, 02, 12, 16, 40), null),
				new Horario(2, 2, LocalDateTime.of(2023, 02, 12, 23, 00), LocalDateTime.of(2023, 02, 12, 02, 00), null),
				new Horario(3, 3, LocalDateTime.of(2023, 02, 12, 18, 00), LocalDateTime.of(2023, 02, 12, 23, 55), null),
				new Horario(4, 4, LocalDateTime.of(2023, 02, 12, 20, 30), LocalDateTime.of(2023, 02, 12, 22, 00), null),
				new Horario(5, 5, LocalDateTime.of(2023, 02, 12, 9, 50), LocalDateTime.of(2023, 02, 12, 15, 50), null),
		};
		return horarios;
	}
	
}
