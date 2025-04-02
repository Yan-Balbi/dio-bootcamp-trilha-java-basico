/*
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T
 */
package edu.yan.streamapi.exemplos;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemploSupplier {
	public static void main(String[] args) {
/*		Supplier<String> saudacao = () -> "Olá, seja bem vindo";
		
		List<String> listaSaudacao = Stream.generate(saudacao).limit(5).collect(Collectors.toList());
		
		listaSaudacao.forEach(saudacaoPrint -> System.out.println(saudacaoPrint));
*/
		
		
		//Implementação por funções anonimas
/*		List<String> listaSaudacao = Stream.generate(
				new Supplier<String> () {
					@Override
					public String get() {
						// TODO Auto-generated method stub
						return "Ola, seja bem vindo";
					}
				}
				).limit(5).collect(Collectors.toList());
		
		listaSaudacao.forEach(saudacaoPrint -> System.out.println(saudacaoPrint));
*/		
		//Implementação com lambdas
		List<String> listaSaudacao = Stream.generate(
			() -> {
				return "Ola, seja bem vindo";
			}
		).limit(5).collect(Collectors.toList());
		
		listaSaudacao.forEach(saudacaoPrint -> System.out.println(saudacaoPrint));
	}
}
