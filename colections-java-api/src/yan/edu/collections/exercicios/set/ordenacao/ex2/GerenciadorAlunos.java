/*
 *  Crie uma classe chamada "GerenciadorAlunos" que irá lidar com uma lista de alunos. Cada aluno terá atributos como nome, matrícula e nota. 
	Implementaremos os seguintes métodos:

    adicionarAluno(String nome, Long matricula, double media): Adiciona um aluno ao conjunto.
    removerAluno(long matricula): Remove um aluno ao conjunto a partir da matricula, se estiver presente.
    exibirAlunosPorNome(): Exibe todos os alunos do conjunto em ordem alfabética pelo nome.
    exibirAlunosPorNota(): Exibe todos os alunos do conjunto em ordem crescente de nota.
    exibirAlunos(): Exibe todos os alunos do conjunto.

 */
package yan.edu.collections.exercicios.set.ordenacao.ex2;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
	Set<Aluno> conjuntoAlunos = new LinkedHashSet<>();
	
	public void adicionarAluno(Aluno aluno) {
		conjuntoAlunos.add(aluno);
	}
	
	public void removerAlunoPorMatricula(Long matricula) {
		for(Aluno aluno: conjuntoAlunos) {
			if(matricula.equals(aluno.getMatricula())) {
				conjuntoAlunos.remove(aluno);
				break;
			}
		}
	}
	
	public void exibirAlunosPorNome() {
		Set<Aluno> alunosExibidosPorNome = new TreeSet<>(conjuntoAlunos);
		for(Aluno aluno: alunosExibidosPorNome) {
			System.out.println("Nome:"+aluno.getNome()+" Matricula"+aluno.getMatricula()+" Media"+aluno.getMedia());
		}
	}
	
	public void exibirAlunosPorNota(){
		Set<Aluno> alunosExibidosPorNota = new TreeSet<>(new ComparatorAlunoPorNota());
		alunosExibidosPorNota.addAll(conjuntoAlunos);
		for(Aluno aluno: alunosExibidosPorNota) {
			System.out.println("Nota:"+aluno.getMedia()+" Matricula"+aluno.getMatricula()+" Nome"+aluno.getNome());
		}
	}
	
	
	
}
