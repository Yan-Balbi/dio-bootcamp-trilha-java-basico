/*
 Crie uma classe chamada "OrdenacaoPessoas" que possui uma lista de objetos do tipo "Pessoa" como atributo. Cada pessoa possui atributos como nome, idade e altura. Implemente os seguintes métodos:

    adicionarPessoa(String nome, int idade, double altura): Adiciona uma pessoa à lista.
    ordenarPorIdade(): Ordena as pessoas da lista por idade usando a interface Comparable.
    ordenarPorAltura(): Ordena as pessoas da lista por altura usando um Comparator personalizado.

 */

package yan.edu.collections.exercicios.list.ordenacaoemlist.ex1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoas {
	
	private List<Pessoa> pessoas = new ArrayList<>();
	
	public void adicionarPessoa(Pessoa pessoa) {
		pessoas.add(pessoa);
	}
	
	//Ordenando por comparable
	public List<Pessoa> ordenarPorIdade() {
		List<Pessoa> pessoasOrdenadas = pessoas;
		Collections.sort(pessoasOrdenadas);
		return pessoasOrdenadas;
	}
	
	//Ordenando por comparator
	public List<Pessoa> ordenarPorAltura() {
		List<Pessoa> pessoasOrdenadas = pessoas;
		Collections.sort(pessoas, new CompararPorAltura());
		return pessoasOrdenadas;
	}
	
	public int obterTamanhoListaPessoas() {
		return pessoas.size();
	}
}

