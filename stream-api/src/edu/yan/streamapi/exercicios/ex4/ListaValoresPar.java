/*
 * 
    Desafio 4 - Remova todos os valores ímpares:

Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.
 */
package edu.yan.streamapi.exercicios.ex4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListaValoresPar {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		
		numeros = numeros.stream().filter(
			numero -> {
				return !(numero % 2 == 0);
			}).collect(Collectors.toList());
		
		numeros.forEach(numero -> System.out.println(numero));
	}
}
