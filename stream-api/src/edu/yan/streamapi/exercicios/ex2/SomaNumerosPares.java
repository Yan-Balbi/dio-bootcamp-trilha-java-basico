/*
 * 
    Desafio 2 - Imprima a soma dos números pares da lista:
Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
 */
package edu.yan.streamapi.exercicios.ex2;

import java.util.Arrays;
import java.util.List;

public class SomaNumerosPares {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
/*		numeros.stream()
		.filter(
			numero -> {
					return numero % 2 == 0;
				})
		.reduce(
			0,
			(numero1, numero2) -> {return numero1+numero2;}
		);
*/
		int resultadoSomaNumerosPares = numeros.stream()
		.filter(
			numero -> {
				return numero % 2 == 0;
			})
		.reduce(
			0,
			(numero1, numero2) -> numero1+numero2
		);
		
		System.out.println(resultadoSomaNumerosPares);
	}
}
