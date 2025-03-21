package src.edu.yan.aulasintaxe.exemplo.sistemaprocessoseletivo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	
	 private List<String> candidatosSelecionadosParaContratacao = new ArrayList<>();
	 
	
	public void selecaoCandidatos() {
		List<String> candidatos = new ArrayList<>();
		candidatos.add("FELIPE");
		candidatos.add("MARCIA");
		candidatos.add("JULIA");
		candidatos.add("PAULO");
		candidatos.add("AUGUSTO");
		candidatos.add("MONICA");
		candidatos.add("FABRICIO");
		candidatos.add("MIRELA");
		candidatos.add("DANIELA");
		candidatos.add("JOAO");
		
		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;
		
		while(candidatosSelecionados < 5 && candidatoAtual < candidatos.size()) {
			String candidato  = candidatos.get(candidatoAtual);
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato "+candidato+" solicitou R$"+salarioPretendido+" de salario");
			if(salarioPretendido <= salarioBase) {
				System.out.println("Candidato "+candidato+" selecionado para a vaga de emprego");
				candidatosSelecionadosParaContratacao.add(candidato);
				candidatosSelecionados++;
			} 
			candidatoAtual++;
			
		}
		
	}
	
	private  double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000;
		
		if(salarioPretendido < salarioBase) {
			System.out.println("Ligar para o candidato");
		} else if(salarioPretendido == salarioBase) {
			System.out.println("Ligar para o candidato com contra proprosta");
		} else {
			System.out.println("Aguardando o resultado dos demais candidatos");
		}	
	}
	
	public void imprimirSelecionados() {
		System.out.println("=====CANDIDATOS SELECIONADOS=====");
		for(String candidato: candidatosSelecionadosParaContratacao) {
			System.out.println(candidato);
		}
		System.out.println("\n");
	}
	
	public void ligarParaCandidatosSelecionados() {
		for(String candidato: candidatosSelecionadosParaContratacao) {
			System.out.println("Ligando para"+candidato);
			entrarEmContato(candidato);
		}
		System.out.println("\n");
	}
	
	private boolean atenderLigacao() {
		return new Random().nextInt(3)==1;
	}
	
	private void entrarEmContato(String candidato) {
		int tentativasDeContatoRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		do {
			atendeu = atenderLigacao();
			
			if(atendeu) {
				continuarTentando = false;
			}
			
			if(continuarTentando) {
				tentativasDeContatoRealizadas++;
			}
		} while(continuarTentando && (tentativasDeContatoRealizadas < 3));
		
		if(atendeu) {
			System.out.println("Conseguimos contato com "+candidato+" na "+tentativasDeContatoRealizadas+" tentativa.");
		} else {
			System.out.println("Não onseguimos contato com "+candidato);
		}
	}
}
