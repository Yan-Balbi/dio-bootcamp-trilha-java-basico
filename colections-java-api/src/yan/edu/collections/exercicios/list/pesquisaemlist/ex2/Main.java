package yan.edu.collections.exercicios.list.pesquisaemlist.ex2;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		SomaNumeros somaNumeros = new SomaNumeros();
		Random geradorNumero = new Random();
		
		System.out.println("Inserindo numeros aleatorios");
		for(int i=0; i<10; i++) {
			somaNumeros.adicionarNumeros(geradorNumero.nextInt(25));
		}
		
		somaNumeros.listarNumeros();
		
		System.out.println("O maior numero da lista é: "+somaNumeros.encontrarMaiorNumero());
		
		System.out.println("O menor numero da lista é: "+somaNumeros.encontrarMenorNumero());
		
		System.out.println("Somando todos os numeros: "+somaNumeros.calcularSoma());
	}
}
