package edu.yan.controlefluxo.exemplos;

import java.util.Random;

public class ExemploDoWhile {
	public static void main(String[] args) {
		System.out.println("Discando");
		do {
			System.out.println("Telefone tocando");
		} while(tocando());
	}
	
	private static boolean tocando() {
		Random random = new Random();
		boolean atendeu = (random.nextInt(9)==1);
		System.out.println("Atendeu? "+atendeu);
		
		if(atendeu) {
			System.out.println("atendendo...");
			return false;
		} else {
			return true;
		}
	}
}
