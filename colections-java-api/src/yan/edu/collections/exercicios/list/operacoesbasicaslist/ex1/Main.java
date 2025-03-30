package yan.edu.collections.exercicios.list.operacoesbasicaslist.ex1;

import java.util.List;
import java.util.function.Consumer;

public class Main {
	public static void main(String[] args) {
		ListaTarefas listaDeTarefas = new ListaTarefas();
		
		List<Tarefa> tarefas = List.of(new Tarefa("Tarefa 1"), new Tarefa("Tarefa 2"), new Tarefa("Tarefa 3"), new Tarefa("Tarefa 4"), new Tarefa("Tarefa 5"));
		tarefas.forEach(new Consumer<Tarefa>() {

			@Override
			public void accept(Tarefa tarefa) {
				// testando inserção de tarefas
				listaDeTarefas.adicionarTarefas(tarefa);
			}
			
		});
		
		System.out.println("obtendo o numero de tarefas: "+listaDeTarefas.obterNumeroTotalTarefas());
		
		
		System.out.println("Obtendo todas as tarefas:");
		List<Tarefa> descricoesTarefas = listaDeTarefas.obterDescricoesTarefas();
		for(Tarefa tarefa: descricoesTarefas) {
			System.out.println(tarefa.getDescricao());
		}
		
		System.out.println("Removendo algumas tarefas: "+listaDeTarefas.obterNumeroTotalTarefas());
		listaDeTarefas.removerTarefas("Tarefa 1");
		listaDeTarefas.removerTarefas("Tarefa 3");
		listaDeTarefas.removerTarefas("Tarefa 5");
		
		System.out.println("obtendo o numero de tarefas: "+listaDeTarefas.obterNumeroTotalTarefas());
		
		System.out.println("Obtendo todas as tarefas após a remoção:");
		descricoesTarefas = listaDeTarefas.obterDescricoesTarefas();
		for(Tarefa tarefa: descricoesTarefas) {
			System.out.println(tarefa.getDescricao());
		}
		
	}
}
