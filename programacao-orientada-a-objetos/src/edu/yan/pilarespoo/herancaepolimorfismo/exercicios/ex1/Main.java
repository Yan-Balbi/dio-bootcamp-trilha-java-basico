package edu.yan.pilarespoo.herancaepolimorfismo.exercicios.ex1;

public class Main {
	public static void main(String[] args) {
		MeiaEntrada meia = new MeiaEntrada(15, "Tron: Legacy", "Legendado");
		System.out.println("Preço meia: "+meia.calcularValorIngresso());
		
		IngressoFamilia ingressoFamilia = new IngressoFamilia(30, "Tron: Uma Odisseia Eletrônica", "Legendado", 4);
		System.out.println("Preço ingresso familia: "+ingressoFamilia.calcularValorIngresso());
		
	}
}
