/*
Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5:

Com a Stream API, encontre a soma dos números da lista que são divisíveis tanto por 3 quanto por 5 e exiba o resultado no console.
 */
package edu.yan.streamapi.exercicios.ex19;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio19 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 15, 45, 30, 3);
		
		Integer somaDosNumeros = numeros.stream().filter(
					numero -> (numero % 3 == 0) && (numero % 5 == 0)
				).reduce(
					0,
					(numero1, numero2) -> {
						return numero1 + numero2;
					}
				);
		System.out.println("A soma dos números é: "+somaDosNumeros);
	}
}
