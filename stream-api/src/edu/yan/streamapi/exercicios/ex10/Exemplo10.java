/*
 * 
    Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:

Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.
 */
package edu.yan.streamapi.exercicios.ex10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo10 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 15, 30, 45, 3);
		
		List<Integer> multiplosDe3E5 = numeros.stream().filter(
				numero -> (((numero % 3 == 0) || (numero % 5 == 0)) && (numero % 2 != 0))
				).collect(Collectors.toList());
		
		multiplosDe3E5.forEach(numero -> System.out.println(numero));
	}
}
