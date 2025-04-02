/*
 * 
    Desafio 7 - Encontrar o segundo número maior da lista:
Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
 */
package edu.yan.streamapi.exercicios.ex7;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ListaNumerica {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		Optional<Integer> segundoMaiorNumero = numeros.stream().sorted((numero1,numero2) -> numero2 - numero1).skip(1).findFirst();
		System.out.println(segundoMaiorNumero);
	}
}
