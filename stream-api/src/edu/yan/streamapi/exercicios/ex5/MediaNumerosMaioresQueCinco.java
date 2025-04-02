/*
 * 
    Desafio 5 - Calcule a média dos números maiores que 5:

Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
 */
package edu.yan.streamapi.exercicios.ex5;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class MediaNumerosMaioresQueCinco {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,12, 5, 4, 3);
		
/*		int mediaNumerosImpares = numeros.stream().filter(
				numero -> {
					return numero > 5;
				})
				.reduce(
				0,
				(numero1, numero2) -> {
					return (numero1+numero2)/2;
				});
*/
		
		OptionalDouble mediaNumerosImpares = numeros.stream().filter(
				numero -> {
					return numero > 5;
				}).mapToInt(numero -> numero).average();
		System.out.println(mediaNumerosImpares);
	}
}
