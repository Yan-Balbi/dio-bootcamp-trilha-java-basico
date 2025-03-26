package edu.yan.exercicios.interfaces.ex2;

import java.util.List;
import java.util.function.Consumer;

public class Main {
	public static void main(String[] args) {
		List<IProduto> produtos = List.of(new ProdutoAlimento(50), new ProdutoSaudeEBemEstar(135), new ProdutoVestuario(1), new ProdutoCultura(259.00) );
		
		produtos.forEach(new Consumer<IProduto>(){

			@Override
			public void accept(IProduto produto) {
				// TODO Auto-generated method stub
				System.out.println("===========");
				System.out.println("Preço do imposto produto: "+produto.CalcularImpostoSobPrecoDoProduto()+"\nPreco do produto: com imposto: "+produto.calcularPrecoDoProdutoComImposto());
				System.out.println("===========");
			}
			
		});
	}
}
