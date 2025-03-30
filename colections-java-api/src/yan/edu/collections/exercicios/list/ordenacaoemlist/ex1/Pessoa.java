package yan.edu.collections.exercicios.list.ordenacaoemlist.ex1;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{
	private String nome;
	private int idade;
	private double altura;
	
	public Pessoa() {
		// TODO Auto-generated constructor stub
		
	}
	
	public Pessoa(String nome, int idade, double altura) {
		// TODO Auto-generated constructor stub
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	@Override
	public int compareTo(Pessoa pessoa) {
		// TODO Auto-generated method stub
		return Integer.compare(idade, pessoa.getIdade());
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
}

class CompararPorAltura implements Comparator<Pessoa>{

	@Override
	public int compare(Pessoa pessoa1, Pessoa pessoa2) {
		// TODO Auto-generated method stub
		return Double.compare(pessoa1.getAltura(), pessoa2.getAltura());
	}
	
}
