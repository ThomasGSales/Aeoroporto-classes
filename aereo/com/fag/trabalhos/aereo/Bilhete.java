package com.fag.trabalhos.aereo;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Bilhete {
	private int numero;
	private int assento;
	private String rota;
	private String aeroporto;
	private String passageiro;
	private LocalDateTime horario;
	private String situacao;	
	private Bagagem bagagem;
	
	public Bilhete(int numero, int assento, String rota, String aeroporto, String passageiro, LocalDateTime horario, String situacao, Bagagem bagagem) {
		this.numero = numero;
		this.assento = assento;
		this.rota = rota;
		this.aeroporto = aeroporto;
		this.passageiro = passageiro;
		this.horario = horario;
		this.situacao = situacao;
		this.bagagem = bagagem;
	}
	
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getAssento() {
		return assento;
	}
	public void setAssento(int assento) {
		this.assento = assento;
	}
	public String getRota() {
		return rota;
	}
	public void setRota(String rota) {
		this.rota = rota;
	}
	public String getAeroporto() {
		return aeroporto;
	}
	public void setAeroporto(String aeroporto) {
		this.aeroporto = aeroporto;
	}
	public String getPassageiro() {
		return passageiro;
	}
	public void setPassageiro(String passageiro) {
		this.passageiro = passageiro;
	}
	public LocalDateTime getHorario() {
		return horario;
	}
	public void setHorario(LocalDateTime horario) {
		this.horario = horario;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
	public Bagagem getBagagem() {
		return bagagem;
	}



	public void setBagagem(Bagagem bagagem) {
		this.bagagem = bagagem;
	}



	public Bilhete() {
		
	}
	
	static Rota[] rotas = Rota.getRotas();
	static Aeroporto[] siglas = Aeroporto.getAeroportos();
	static Horario[] horarios = Horario.getHorarios();
	static SituacaoBilhete[] situacoes = SituacaoBilhete.getSituacoes();
	
	public static Bilhete[] getBilhetes() {
		Bilhete[] bilhetes = {
				new Bilhete(1, 11, rotas[0].getDescricao(), siglas[0].getSigla(), null, horarios[0].getDataPartida(), situacoes[0].getDescricao(), null),
				new Bilhete(2, 12, rotas[0].getDescricao(), siglas[0].getSigla(), null, horarios[0].getDataPartida(), situacoes[0].getDescricao(), null),
				new Bilhete(3, 15, rotas[0].getDescricao(), siglas[0].getSigla(), null, horarios[0].getDataPartida(), situacoes[0].getDescricao(), null),
				new Bilhete(4, 21, rotas[1].getDescricao(), siglas[1].getSigla(), null, horarios[1].getDataPartida(), situacoes[0].getDescricao(), null),
				new Bilhete(5, 24, rotas[1].getDescricao(), siglas[1].getSigla(), null, horarios[1].getDataPartida(), situacoes[0].getDescricao(), null),
				new Bilhete(6, 20, rotas[1].getDescricao(), siglas[1].getSigla(), null, horarios[1].getDataPartida(), situacoes[0].getDescricao(), null),
				new Bilhete(7, 16, rotas[2].getDescricao(), siglas[2].getSigla(), null, horarios[2].getDataPartida(), situacoes[0].getDescricao(), null),
				new Bilhete(8, 17, rotas[2].getDescricao(), siglas[2].getSigla(), null, horarios[2].getDataPartida(), situacoes[0].getDescricao(), null),
				new Bilhete(9, 9, rotas[3].getDescricao(), siglas[3].getSigla(), null, horarios[3].getDataPartida(), situacoes[0].getDescricao(), null),
				new Bilhete(10, 11, rotas[3].getDescricao(), siglas[3].getSigla(), null, horarios[3].getDataPartida(), situacoes[0].getDescricao(), null),
				new Bilhete(11, 11, rotas[4].getDescricao(), siglas[4].getSigla(), null, horarios[4].getDataPartida(), situacoes[0].getDescricao(), null)
				
		};
		return bilhetes;
	}
	
	
	
	public void reservar(String passageiro, int numero) {
		this.passageiro = passageiro;
		this.numero = numero;
		
		for(Bilhete bilhetes : getBilhetes()) {
			if(bilhetes.getSituacao().equals(situacoes[0].getDescricao())) {
				if(bilhetes.getNumero() == numero) {
					bilhetes.setSituacao(situacoes[1].getDescricao());
					System.out.println("Bilhete "+ bilhetes.getNumero()+ " reservado para "+ bilhetes.getPassageiro());
					System.out.println(bilhetes.getNumero()+ " - "+bilhetes.getAssento()+ " - "+bilhetes.getRota()+ " - "+bilhetes.getAeroporto()+ " - "+bilhetes.getHorario()+ " - "+bilhetes.getSituacao());
					break;
				} 
			} else if (bilhetes.getSituacao().equals(situacoes[1].getDescricao())) {
				System.out.println("o bilhete já está reservado!");
			}
		}
		
	}
	
	
	public void comprar(int numero) {
		this.numero = numero;
		for(Bilhete bilhetes : getBilhetes()) {
			if(bilhetes.getSituacao().equals(situacoes[1].getDescricao())) {
				if(bilhetes.getNumero() == numero) {
					bilhetes.setSituacao(situacoes[2].getDescricao());
					break;
				} else {
					System.out.println("O bilhete precisa está reservado para comprar");
				}
			}
		}
	}
	
	public void cancelarReserva(String passageiro){
		this.passageiro = passageiro;
		for(Bilhete bilhetes : getBilhetes()) {
				if(bilhetes.getPassageiro() == passageiro) {
					bilhetes.setPassageiro(null);
					bilhetes.setSituacao(situacoes[0].getDescricao());					
					break;
				}
			}
	}
	
	
	public void checkin(Bagagem bagagem, int numero) {
		this.bagagem = bagagem;
		this.numero = numero;
		for(Bilhete bilhetes : getBilhetes()) {
			if(bilhetes.getNumero() == numero) {
				bilhetes.setBagagem(bagagem);
				System.out.println("Checkin completo");
				break;
			}
		}
		
	}
	
}
