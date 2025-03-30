/*
 * 1. Lista de Tarefas

Crie uma classe chamada "ListaTarefas" que possui uma lista de tarefas como atributo. Cada tarefa é representada por uma classe chamada "Tarefa" que possui um atributo de descrição. Implemente os seguintes métodos:

    adicionarTarefa(String descricao): Adiciona uma nova tarefa à lista com a descrição fornecida.
    removerTarefa(String descricao): Remove uma tarefa da lista com base em sua descrição.
    obterNumeroTotalTarefas(): Retorna o número total de tarefas na lista.
    obterDescricoesTarefas(): Retorna uma lista contendo a descrição de todas as tarefas na lista.
 */
package yan.edu.collections.exercicios.list.operacoesbasicaslist.ex1;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
	private List<Tarefa> tarefas = new ArrayList<>();
	
	
	public void adicionarTarefas(Tarefa tarefa) {
		// TODO Auto-generated method stub
		tarefas.add(tarefa);
	}
	
	public void removerTarefas(String descricao) {
		for(Tarefa tarefa: tarefas) {
			if(descricao.equals(tarefa.getDescricao())) {
				tarefas.remove(tarefa);
				break;
			}
			
		}
	}
	
	public Integer obterNumeroTotalTarefas() {
		return this.tarefas.size();
	}
	
	public List<Tarefa> obterDescricoesTarefas() {
		return this.tarefas;
	}
	
}
