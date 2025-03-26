package edu.yan.exercicios.herancaepolimorfismo.ex1;

public class IngressoFamilia extends Ingresso{

	private int quantidadePessoas;
	
	public IngressoFamilia(double valor, String nomeDoFilme, String dublagem, int quantidadePessoas) {
		super(valor, nomeDoFilme, dublagem);
		// TODO Auto-generated constructor stub
		this.quantidadePessoas = quantidadePessoas;
	}

	@Override
	public double calcularValorIngresso() {
		// TODO Auto-generated method stub
		if(quantidadePessoas > 3) 
			return super.getValor()*quantidadePessoas - 0.005*super.getValor()*quantidadePessoas;
		//o desconto de 5% é referente ao valor dos n ingressos? ou é referente ao valor unitário ingresso?
		
		return super.getValor()*quantidadePessoas;
	}

}
