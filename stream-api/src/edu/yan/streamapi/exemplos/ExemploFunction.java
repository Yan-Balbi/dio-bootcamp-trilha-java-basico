/*
 * Usado para transformar ou mapear os elementos do Stream em outros valores ou tipos.
 * 
 */
package edu.yan.streamapi.exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExemploFunction {
	public static void main(String[] args) {
/*		
		List<Integer> numeros = Arrays.asList(1,2,3,4,5);
		
		//Função com expressão lambda que dobra os numeros
		Function<Integer, Integer> dobrarNumeros = numero -> numero * 2;
		
		//'collect' converte o stream em um tipo de estrutura de dados
		//Colector.nomeDaEstrutura() define qual é essa estrutura de dados que a stream será convertida
		List<Integer> numerosDobrados = numeros.stream().map(dobrarNumeros).collect(Collectors.toList());
		
		numerosDobrados.forEach(numeroDobrado -> System.out.println(numeroDobrado));
*/
		
		//Implementação por funções anonimas
/*		List<Integer> numeros = Arrays.asList(1,2,3,4,5);
		//'collect' converte o stream em um tipo de estrutura de dados
		//Colector.nomeDaEstrutura() define qual é essa estrutura de dados que a stream será convertida
		List<Integer> numerosDobrados = numeros.stream().map(
				new Function<Integer, Integer>() {

					@Override
					public Integer apply(Integer numero) {
						// TODO Auto-generated method stub
						return numero * 2;
					}
				
				}
		).collect(Collectors.toList());
		
		numerosDobrados.forEach(numeroDobrado -> System.out.println(numeroDobrado));
*/
		
		//Usando a espressão lambda
		List<Integer> numeros = Arrays.asList(1,2,3,4,5);
		
		List<Integer> numerosDobrados = numeros.stream().map(
				numero -> numero *4
		).collect(Collectors.toList());

		numerosDobrados.forEach(numeroDobrado -> System.out.println(numeroDobrado));
	}
}
