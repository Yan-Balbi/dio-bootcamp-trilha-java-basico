package edu.yan.exercicios.interfaces.ex2;

public class ProdutoVestuario implements IProduto{

	private double preco;
	
	public ProdutoVestuario(double preco) {
		this.preco = preco;
	}
	
	@Override
	public double CalcularImpostoSobPrecoDoProduto() {
		// TODO Auto-generated method stub
		return preco*0.0025;
	}
	
	@Override
	public double calcularPrecoDoProdutoComImposto() {
		// TODO Auto-generated method stub
		return this.preco + CalcularImpostoSobPrecoDoProduto();
	}
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
