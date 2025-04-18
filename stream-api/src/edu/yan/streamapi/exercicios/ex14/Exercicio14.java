/*
 * 
    Desafio 14 - Encontre o maior número primo da lista:

Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
 */
package edu.yan.streamapi.exercicios.ex14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Exercicio14 {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		 Optional<Integer> maiorPrimo = numeros.stream()
	                .filter(
	                	numero -> {
                		if ( numero < 2) return false;
                		for (int i =2; i<= Math.sqrt(numero); i++) {
                			if (numero % i == 0) {
                				return false;
                			}
                		}
                		return true;
	                }) 
	                .max(Comparator.naturalOrder());
		 
		 System.out.println("O maior número primo da lista é: " + maiorPrimo);
	}
}
