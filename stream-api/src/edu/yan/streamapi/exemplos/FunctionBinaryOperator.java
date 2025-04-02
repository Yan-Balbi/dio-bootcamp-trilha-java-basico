/*
 * Usado para realizar operações de redução de pares de elementos, como somar números ou combinar objetos
 */
package edu.yan.streamapi.exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class FunctionBinaryOperator {
	public static void main(String[] args) {
/*
		List<Integer> numeros = Arrays.asList(1,2,3,4);
		
		// Usar o binary operator como expressão lambda para somar dois números inteiros
		BinaryOperator<Integer> somar = (numero1, numero2) -> numero1 + numero2;
		
		// Usar o BinaryOperator para somar todos os números do Stream
		int resultado = numeros.stream().reduce(0, somar); // o 0 é a variavel temporária inicializada com valor 0, somar é a BinaryOperator pra fazer a soma em 0
		
		System.out.println("A soma dos numeros é: "+ resultado);
*/	
		
		//função anonima
/*		List<Integer> numeros = Arrays.asList(1,2,3,4);
		
		// Usar o binary operator como expressão lambda para somar dois números inteiros
		BinaryOperator<Integer> somar = (numero1, numero2) -> numero1 + numero2;
		
		// Usar o BinaryOperator para somar todos os números do Stream
		int resultado = numeros.stream().reduce(
				0, 
				new BinaryOperator<Integer>() {
					@Override
					public Integer apply(Integer numero1, Integer numero2) {
						// TODO Auto-generated method stub
						return numero1 + numero2;
					}
				}); // o 0 é a variavel temporária inicializada com valor 0, somar é a BinaryOperator pra fazer a soma em 0
		
		System.out.println("A soma dos numeros é: "+ resultado);
*/
		
		//Função lambda
		List<Integer> numeros = Arrays.asList(1,80,3,4);
		
		// Usar o binary operator como expressão lambda para somar dois números inteiros
		BinaryOperator<Integer> somar = (numero1, numero2) -> numero1 + numero2;
		
		// Usar o BinaryOperator para somar todos os números do Stream
		int resultado = numeros.stream().reduce(
				0, 
				(numero1, numero2) -> {
						return numero1 + numero2;
					}
				); 
		
		System.out.println("A soma de todos os numeros é: "+ resultado);
	}
}
