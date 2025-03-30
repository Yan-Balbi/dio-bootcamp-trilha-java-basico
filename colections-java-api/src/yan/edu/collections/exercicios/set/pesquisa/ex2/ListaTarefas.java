/*
 *  Crie uma classe chamada "ListaTarefas" que possui um conjunto de objetos do tipo "Tarefa" como atributo. Cada tarefa possui um atributo de descrição e um atributo booleano para indicar se a tarefa foi concluída ou não. Implemente os seguintes métodos:

    adicionarTarefa(String descricao): Adiciona uma nova tarefa ao Set.
    removerTarefa(String descricao): Remove uma tarefa do Set de acordo com a descrição, se estiver presente.
    exibirTarefas(): Exibe todas as tarefas da lista de tarefas.
    contarTarefas(): Conta o número total de tarefas na lista de tarefas.
    obterTarefasConcluidas(): Retorna um Set com as tarefas concluídas.
    obterTarefasPendentes(): Retorna um Set com as tarefas pendentes.
    marcarTarefaConcluida(String descricao): Marca uma tarefa como concluída de acordo com a descrição.
    marcarTarefaPendente(String descricao): Marca uma tarefa como pendente de acordo com a descrição.
    limparListaTarefas(): Remove todas as tarefas da lista de tarefas.

 */
package yan.edu.collections.exercicios.set.pesquisa.ex2;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ListaTarefas {
	
	private Set<Tarefa> listaTarefas = new LinkedHashSet<>();
	
	public void adicionarTarefa(Tarefa tarefa) {
		listaTarefas.add(tarefa);
	}
	
	public void removerTarefa(String descricao) {
		for(Tarefa tarefa: listaTarefas) {
			if(descricao.equals(tarefa.getDescricao())) {
				listaTarefas.remove(tarefa);
				break;
			}
		}
	}
	
	public void exibirTarefas() {
		for(Tarefa tarefa: listaTarefas) {
			System.out.println(tarefa.getDescricao()+" Concluída? "+tarefa.isConcluido());
		}
	}
	
	public int contarTarefas() {
		return listaTarefas.size();
	}
	
	public Set<Tarefa> obterTarefasConcluidas() {
		Set<Tarefa> listaTarefasConcluidas = new LinkedHashSet<>();
		for(Tarefa tarefa: listaTarefas) {
			if(tarefa.isConcluido())
				listaTarefasConcluidas.add(tarefa);
		}
		return listaTarefasConcluidas;
	}
	
	public Set<Tarefa> obterTarefasPendentes() {
		Set<Tarefa> listaTarefasPendentes = new LinkedHashSet<>();
		for(Tarefa tarefa: listaTarefas) {
			if(!tarefa.isConcluido())
				listaTarefasPendentes.add(tarefa);
		}
		return listaTarefasPendentes;
	}
	
	public void marcarTarefaConcluida(String descricao) {
		for(Tarefa tarefa: listaTarefas) {
			if(descricao.equals(tarefa.getDescricao()))
				tarefa.setConcluido(true);
		}
	}
	
	public void marcarTarefaPendente(String descricao) {
		for(Tarefa tarefa: listaTarefas) {
			if(descricao.equals(tarefa.getDescricao()))
				tarefa.setConcluido(false);
		}
	}
	
	public void limparListaTarefas() {
		listaTarefas.clear();
	}
	
}
