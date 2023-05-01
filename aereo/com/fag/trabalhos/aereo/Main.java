package com.fag.trabalhos.aereo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

	
		public static void main(String args[]) {
			
			
			Passageiro passageiro = new Passageiro(765, "Thomas Gabriel", "thomas@email.com", "(45) 99801-5995", LocalDate.of(1990, 4, 29), "1415768", "131-911-189-00", null);
			
			Endereco endereco = new Endereco(passageiro.getCodigo(), "travessa artilharia, 06", "Região do Lago", "Cascavel", "Paraná", "Brasil");
			
			Bagagem bagagem = new Bagagem(10, "mala", "pesada", null);
			
			passageiro.setEndereco(endereco);
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Bem vindo a plataforma aerea senhor "+ passageiro.getNome());
			System.out.println("\n\n");
			System.out.println("Nu - as - rota de viagem - sigla - data e hora saída - situacao\n");
			
			Bilhete bilheto = new Bilhete();
			Bilhete[] bilhetes = Bilhete.getBilhetes();
			
			for(Bilhete bilhete : bilhetes) {
				System.out.println(bilhete.getNumero()+ " - "+bilhete.getAssento()+ " - "+bilhete.getRota()+ " - "+bilhete.getAeroporto()+ " - "+bilhete.getHorario()+ " - "+bilhete.getSituacao());
			}
			
			int scanNU = -1;
			
			while(scanNU == -1 || scanNU > 11 || scanNU < 0) {
				System.out.println("\nEsses são os bilhetes, insira o NU do bilhete que deseja reservar:");
				scanNU = scan.nextInt();
			
				if(scanNU <= 11 || scanNU >= 0) {
					for(Bilhete bilhete: bilhetes) {
						if(bilhete.getNumero() == scanNU) {
							bilhete.setPassageiro(passageiro.getNome());
						}
						
					}
					
					bilheto.reservar(passageiro.getNome(), scanNU);
				}
			}
				
			
			int scanOpcoes = 0;
			
			
			
			
			while(scanOpcoes == 0 || scanOpcoes > 2 || scanOpcoes < 1) {
				System.out.println("\no que deseja?\n1 -cancelar a reserva\n2-Comprar a reserva");
				scanOpcoes = scan.nextInt();
			}
			
			
			
			
			if(scanOpcoes == 1) {
				bilheto.cancelarReserva(passageiro.getNome());
				System.out.println("reserva cancelada");
				
				for(Bilhete bilhete : bilhetes) {
					if(bilhete.getNumero()==scanNU) {
						System.out.println("Bilhete "+ bilhete.getNumero()+ " teve sua reserva cancelada ");
						System.out.println(bilhete.getNumero()+ " - "+bilhete.getAssento()+ " - "+bilhete.getRota()+ " - "+bilhete.getAeroporto()+ " - "+bilhete.getHorario()+ " - "+bilhete.getSituacao());
					}
					
				}
			} else if(scanOpcoes == 2) {
				bilheto.comprar(scanNU);
				for(Bilhete bilhete : bilhetes) {
					if(bilhete.getNumero() == scanNU) {
					System.out.println("Bilhete "+ bilhete.getNumero()+ " comprado por "+ bilhete.getPassageiro());
					System.out.println(bilhete.getNumero()+ " - "+bilhete.getAssento()+ " - "+bilhete.getRota()+ " - "+bilhete.getAeroporto()+ " - "+bilhete.getHorario()+ " - "+bilhete.getSituacao());
					}
				}
					
				bilheto.checkin(bagagem, scanNU);
			}
			
			
			
			
			
		  }
		
			
		}

