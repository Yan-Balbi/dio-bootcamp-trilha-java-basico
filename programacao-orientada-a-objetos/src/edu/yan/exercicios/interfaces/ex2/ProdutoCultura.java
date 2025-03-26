package edu.yan.exercicios.interfaces.ex2;

public class ProdutoCultura implements IProduto{

	private double preco;
	
	public ProdutoCultura(double preco) {
		this.preco = preco;
	}
	
	@Override
	public double CalcularImpostoSobPrecoDoProduto() {
		// TODO Auto-generated method stub
		return preco*0.004;
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
