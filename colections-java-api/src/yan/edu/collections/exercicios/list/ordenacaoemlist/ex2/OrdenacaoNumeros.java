/*
 * Crie uma classe chamada "OrdenacaoNumeros" que possui uma lista de números inteiros como atributo. Implemente os seguintes métodos:

    adicionarNumero(int numero): Adiciona um número à lista.
    ordenarAscendente(): Ordena os números da lista em ordem ascendente usando a interface Comparable e a class Collections.
    ordenarDescendente(): Ordena os números da lista em ordem descendente usando um Comparable e a class Collections.

 */
package yan.edu.collections.exercicios.list.ordenacaoemlist.ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros{
	private List<Integer> listaNumeros = new ArrayList<Integer>();
	
	public void adicionarNumeros(int numero) {
		listaNumeros.add(numero);
	}
	
	public List<Integer> ordenarAscendentemente() {
		Collections.sort(listaNumeros);
		return listaNumeros;
	}
	
	public List<Integer> ordenarDescendentemente() {
		listaNumeros.sort(Collections.reverseOrder());
		return listaNumeros;
	}
	
	public void listarNumeros() {
		for(Integer numero: listaNumeros) {
			System.out.println(numero);
		}
	}

}
