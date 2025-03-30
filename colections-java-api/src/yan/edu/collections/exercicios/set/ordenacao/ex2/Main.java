package yan.edu.collections.exercicios.set.ordenacao.ex2;

import java.util.List;
import java.util.function.Consumer;

public class Main {
	public static void main(String[] args) {
		GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
		
		List<Aluno> alunosInsercao = List.of(new Aluno("Pedro",212312312,7), new Aluno("Ana",563225675,10),new Aluno("Luiz",143529345,9));
		alunosInsercao.forEach(new Consumer<Aluno>() {
			@Override
			public void accept(Aluno aluno) {
				gerenciadorAlunos.adicionarAluno(aluno);
			}
		});
		System.out.println("Exibindo por nome");
		gerenciadorAlunos.exibirAlunosPorNome();
		
		System.out.println("Exibindo por nota");
		gerenciadorAlunos.exibirAlunosPorNota();
	}
}
