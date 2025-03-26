package edu.yan.exercicios.interfaces.ex2;

public class ProdutoAlimento implements IProduto{
	
	private double preco;
	
	public ProdutoAlimento(double preco) {
		this.preco = preco;
	}
	
	@Override
	public double CalcularImpostoSobPrecoDoProduto() {
		// TODO Auto-generated method stub
		return preco*0.001;
	}
	
	@Override
	public double calcularPrecoDoProdutoComImposto() {
		// TODO Auto-generated method stub
		return (preco + CalcularImpostoSobPrecoDoProduto());
	}
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}


	
}
