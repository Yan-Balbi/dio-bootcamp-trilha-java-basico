/*
 * 
    Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):

Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console.
 */
package edu.yan.streamapi.exercicios.ex9;

import java.util.Arrays;
import java.util.List;

public class Exercicio9 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		boolean todosOsNumerosSaoDistintos = numeros.stream().allMatch(numero -> numeros.stream().count() == numeros.stream().distinct().count());
		System.out.println("Todos os numeros sao distindos? "+todosOsNumerosSaoDistintos);
	}
}
