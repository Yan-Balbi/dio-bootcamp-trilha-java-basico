/*
 * Usado para realizar ações que são engatilhadas através de métodos comparativos, sem modificar ou retornar um valor
 */
package edu.yan.streamapi.exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
	
public class ExemploConsumer {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1,2,3,4);
		
		/*Consumer<Integer> imprimirNumeroPar = numero -> {
			if(numero % 2 == 0)
				System.out.println(numero);
		};
		numeros.forEach(imprimirNumeroPar);*/
		
		//Implementação por funções anonimas
/*		numeros.stream().forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer numero) {
				// TODO Auto-generated method stub
				if(numero % 2 == 0)
					System.out.println(numero);
			}
		});
*/
		//Implementação por lambda
		numeros.stream().forEach( numero -> {
			if(numero % 2 == 0)
				System.out.println(numero);
		});

	}
}
