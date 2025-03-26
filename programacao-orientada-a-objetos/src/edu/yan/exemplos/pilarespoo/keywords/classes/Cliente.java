package edu.yan.exemplos.pilarespoo.keywords.classes;

//Na keyword default, os métodos de uma classe só podem ser usados em outra classe caso ambas estejam no mesmo pacote.
//Na keyword protected, os métodos de uma classe A (Cliente) só podem ser usados em uma classe B (Gerente) caso classe B herde (extends) da Classe A.

public class Cliente {
	private String nome;
	private String staticNome;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	protected int getIdade() {
		return idade;
	}
	protected void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getStaticNome() {
		return staticNome;
	}
	public void setStaticNome(String staticNome) {
		this.staticNome = staticNome;
	}

	/**
	 *exemplo de classe aninhada em Java 
	 */
	public class Nested{
		public void test() {
			
		}
	}
	
}
