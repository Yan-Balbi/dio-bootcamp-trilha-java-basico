/*
Desafio 16 - Agrupe os números em pares e ímpares:

Utilize a Stream API para agrupar os números em duas listas separadas, uma contendo os números pares e outra contendo os números ímpares da lista original, e exiba os resultados no console.
 */
package edu.yan.streamapi.exercicios.ex16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio16 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		List<Integer> numerosPares = numeros.stream().filter(
				numero -> numero % 2 == 0
				)
				.collect(Collectors.toList());
		
		System.out.println("Numeros pares");
		numerosPares.stream().forEach(numero -> System.out.println(numero));
		
		List<Integer> numerosImpares = numeros.stream().filter(
				numero -> numero % 2 != 0
				)
				.collect(Collectors.toList());

		System.out.println("Numeros impares");
		numerosImpares.stream().forEach(numero -> System.out.println(numero));
		
	}
}
