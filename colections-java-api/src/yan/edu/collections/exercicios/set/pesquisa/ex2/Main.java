package yan.edu.collections.exercicios.set.pesquisa.ex2;

import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class Main {
	public static void main(String[] args) {
		ListaTarefas listaTarefas = new ListaTarefas();
		
		System.out.println("Inserindo tarefas");
		List<Tarefa> insercaoTarefas = List.of(new Tarefa("Tarefa 1"), new Tarefa("Tarefa 2"), new Tarefa("Tarefa 3"), new Tarefa("Tarefa 4"));
		insercaoTarefas.forEach(new Consumer<Tarefa>() {
			@Override
			public void accept(Tarefa tarefa) {
				listaTarefas.adicionarTarefa(tarefa);
			}			
		});
		
		System.out.println("Removendo uma tarefa");
		listaTarefas.removerTarefa("Tarefa 1");
		
		listaTarefas.exibirTarefas();
		listaTarefas.contarTarefas();

		listaTarefas.marcarTarefaConcluida("Tarefa 2");
		
		Set<Tarefa> tarefasConcluidas = listaTarefas.obterTarefasConcluidas();
		System.out.println("Exibindo tarefas concluidas: ");
		for(Tarefa tarefa: tarefasConcluidas) {
			System.out.println(tarefa.getDescricao());
		}
		
		listaTarefas.marcarTarefaPendente("Tarefa 2");
		
		Set<Tarefa> tarefasPendentes = listaTarefas.obterTarefasPendentes();
		System.out.println("Exibindo tarefas pendentes: ");
		for(Tarefa tarefa: tarefasPendentes) {
			System.out.println(tarefa.getDescricao());
		}
		
		listaTarefas.limparListaTarefas();
		System.out.println("Contagem total de tarefas cadastradas: "+listaTarefas.contarTarefas());
		
	}
}
