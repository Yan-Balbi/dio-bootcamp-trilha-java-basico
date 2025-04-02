/*
 * Representa uma função que aceita um argumento do tipo T e retorna um booleano.
 * Filtra elementos da stream com base em condições.
 */
package edu.yan.streamapi.exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ExemploPredicate {
	public static void main(String[] args) {
/*		List<String> palavras = Arrays.asList("P", "Pal", "Palav", "Palavra", "Avra","Pralvrala");
		
		// Predicate pra verificar se uma palavra tem mais de cinco caracteres
		Predicate<String> maisDe5Caracteres = palavra -> palavra.length() > 5;
		// Usar o Stream para filtrar as palavras com mais de 5 caracteres, e imprimir cada um que passou no filtro
		palavras.stream().filter(maisDe5Caracteres).forEach(palavra -> System.out.println(palavra));
*/
	
		//Função anonima
/*		List<String> palavras = Arrays.asList("P", "Pal", "Palav", "Palavra", "Avra","Pralvrala");
		
		// Predicate pra verificar se uma palavra tem mais de cinco caracteres
		Predicate<String> maisDe5Caracteres = palavra -> palavra.length() > 5;
		// Usar o Stream para filtrar as palavras com mais de 5 caracteres, e imprimir cada um que passou no filtro
		palavras.stream().filter(
				new Predicate<String>() {
					@Override
					public boolean test(String palavra) {
						// TODO Auto-generated method stub
						return palavra.length() > 5;
					}
				}
				).forEach(palavra -> System.out.println(palavra));
*/	
	
		//Usando lambda
		List<String> palavras = Arrays.asList("P", "Pal", "Palav", "Palavra", "Avra","Pralvrala");
		
		// Predicate pra verificar se uma palavra tem mais de cinco caracteres
		Predicate<String> maisDe5Caracteres = palavra -> palavra.length() > 5;
		// Usar o Stream para filtrar as palavras com mais de 5 caracteres, e imprimir cada um que passou no filtro
		palavras.stream().filter( palavra -> palavra.length() > 5 ).forEach(palavra -> System.out.println(palavra));
		
	}
}
