/*
 * 
    Desafio 12 - Encontre o produto de todos os números da lista:

Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console
 */
package edu.yan.streamapi.exercicios.ex12;

import java.util.Arrays;
import java.util.List;

public class Exercicio12 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4);
		
		Integer produtoDeTodosOsNumerosDaLista =  numeros.stream().reduce(
				1,
				(numero1, numero2) -> {
					return numero1 * numero2;
				});
		
		System.out.println("O resultado do produto de todos os numeros da lista é: "+produtoDeTodosOsNumerosDaLista);
	}
}
