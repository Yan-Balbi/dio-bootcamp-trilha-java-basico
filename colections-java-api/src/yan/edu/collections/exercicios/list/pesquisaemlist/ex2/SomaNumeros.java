/*
 Crie uma classe chamada "SomaNumeros" que possui uma lista de números inteiros como atributo. Implemente os seguintes métodos:

    adicionarNumero(int numero): Adiciona um número à lista de números.
    calcularSoma(): Calcula a soma de todos os números na lista e retorna o resultado.
    encontrarMaiorNumero(): Encontra o maior número na lista e retorna o valor.
    encontrarMenorNumero(): Encontra o menor número na lista e retorna o valor.
    exibirNumeros(): Retorna uma lista contendo todos os números presentes na lista.

*/
package yan.edu.collections.exercicios.list.pesquisaemlist.ex2;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
	private List<Integer> listaNumeros = new ArrayList<Integer>();
	
	public SomaNumeros(){
		
	}
	
	public void adicionarNumeros(int numero) {
		listaNumeros.add(numero);
	}
	
	public Integer calcularSoma() {
		Integer soma = 0;
		
		for(Integer numero: listaNumeros ) {
			soma += numero;
		}
		
		return soma;
	}
	
	public int encontrarMaiorNumero() {
		int maiorNumero = listaNumeros.get(0);
		for(Integer numero: listaNumeros) {
			if(numero > maiorNumero) {
				maiorNumero = numero;
			}
		}
		return maiorNumero;
	}
	
	public int encontrarMenorNumero() {
		int menorNumero = listaNumeros.get(0);
		for(Integer numero: listaNumeros) {
			if(numero < menorNumero) {
				menorNumero = numero;
			}
		}
		return menorNumero;
	}
	
	public void listarNumeros() {
		for(Integer numero: listaNumeros) {
			System.out.println(numero);
		}
	}
	
}
