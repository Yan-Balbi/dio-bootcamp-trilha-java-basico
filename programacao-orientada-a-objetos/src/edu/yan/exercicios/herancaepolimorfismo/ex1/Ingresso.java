package edu.yan.exercicios.herancaepolimorfismo.ex1;

public abstract class Ingresso {
	private double valor;
	private String nomeDoFilme;
	private String dublagem;
	
	public Ingresso(double valor, String nomeDoFilme, String dublagem) {
		this.valor = valor;
		this.nomeDoFilme = nomeDoFilme;
		this.dublagem = dublagem;
	}
	
	public double getValor() {
		return this.valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String getNomeDoFilme() {
		return nomeDoFilme;
	}
	public void setNomeDoFilme(String nomeDoFilme) {
		this.nomeDoFilme = nomeDoFilme;
	}
	
	public String getDublagem() {
		return dublagem;
	}
	public void setDublagem(String dublagem) {
		this.dublagem = dublagem;
	}
	
	public abstract double calcularValorIngresso();
	
}
