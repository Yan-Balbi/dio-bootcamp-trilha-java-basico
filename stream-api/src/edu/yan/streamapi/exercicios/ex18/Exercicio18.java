/*
Desafio 18 - Verifique se todos os números da lista são iguais:

Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.
 */
package edu.yan.streamapi.exercicios.ex18;

import java.util.Arrays;
import java.util.List;

public class Exercicio18 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 1,1,1,1);
		
		boolean todosOsNumerosIguais = numeros.stream().allMatch(numero -> numero.equals(numeros.get(0)));
		
		System.out.println("Todos os numeros são iguais? "+todosOsNumerosIguais);
	}
}
