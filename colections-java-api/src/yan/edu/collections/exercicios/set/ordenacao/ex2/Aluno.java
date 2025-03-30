package yan.edu.collections.exercicios.set.ordenacao.ex2;

import java.util.Comparator;

public class Aluno implements Comparable<Aluno>{
	private String nome;
	private Long matricula;
	private double media;
	
	public Aluno(String nome, long matricula, double media) {
		this.nome = nome;
		this.matricula = matricula;
		this.media = media;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Long getMatricula() {
		return matricula;
	}
	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}
	
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}

	@Override
	public int compareTo(Aluno aluno) {
		// TODO Auto-generated method stub
		return nome.compareTo(aluno.getNome());
	}
	
}

class ComparatorAlunoPorNota implements Comparator<Aluno> {
	@Override
	public int compare(Aluno aluno1, Aluno aluno2) {
		// TODO Auto-generated method stub
		return Double.compare(aluno1.getMedia(), aluno2.getMedia());
	}
}
