/*
 * 
    Desafio 6 - Verificar se a lista contém algum número maior que 10:

Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.
 */
package edu.yan.streamapi.exercicios.ex6;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ListaNumerosInferioresADez {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
		
		boolean haNumeroMaioresQue10 = numeros.stream().anyMatch(numero -> numero > 10);
		
		System.out.println("Há números maiores que 10?"+haNumeroMaioresQue10);
		
	}
}
