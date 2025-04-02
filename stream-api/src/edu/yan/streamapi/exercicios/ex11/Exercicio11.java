/*
 * 
    Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:

Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.
 */
package edu.yan.streamapi.exercicios.ex11;

import java.util.Arrays;
import java.util.List;

public class Exercicio11 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4);
		
		Integer somaDoQuadrado = numeros.stream().map(numero -> numero * numero).reduce(
				0,
				(numero1, numero2) -> {
					return numero1 + numero2;
				});
		
		System.out.println("A soma dos quadrados de todos os números da lista é: "+somaDoQuadrado);
	}
}
