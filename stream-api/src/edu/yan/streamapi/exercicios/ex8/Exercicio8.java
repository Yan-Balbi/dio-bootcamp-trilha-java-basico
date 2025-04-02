/*
 * 
    Desafio 8 - Somar os dígitos de todos os números da lista:

Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.
 */
package edu.yan.streamapi.exercicios.ex8;

import java.util.Arrays;
import java.util.List;

public class Exercicio8 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		Integer somaDosDigitosDeTodosOsNumeros = numeros.stream()
		.map(numero -> String.valueOf(numero).chars().map(caractere -> Character.getNumericValue(caractere)).sum())
		.mapToInt(numero -> numero)
		.sum();
		
		System.out.println(somaDosDigitosDeTodosOsNumeros);
	}
}
