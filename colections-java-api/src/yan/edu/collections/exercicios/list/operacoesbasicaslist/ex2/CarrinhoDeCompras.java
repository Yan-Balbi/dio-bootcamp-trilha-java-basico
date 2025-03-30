/*
 Crie uma classe chamada "CarrinhoDeCompras" que representa um carrinho de compras online. O carrinho deve ser implementado como uma 
 lista de itens. Cada item é representado por uma classe chamada "Item" que possui atributos como nome, preço e quantidade. 
 Implemente os seguintes métodos:  
    1 - adicionarItem(String nome, double preco, int quantidade): Adiciona um item ao carrinho com o nome, preço e quantidade especificados.
    2 - removerItem(String nome): Remove um item do carrinho com base no seu nome.
    3 - calcularValorTotal(): Calcula e retorna o valor total do carrinho, levando em consideração o preço e a quantidade de cada item.
    4 - exibirItens(): Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e quantidades.
 */
package yan.edu.collections.exercicios.list.operacoesbasicaslist.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class CarrinhoDeCompras {
	private List<Item> listaDeItems = new ArrayList<>();
	
	public void adicionarItem(Item item) {
		listaDeItems.add(item);
	}
	
	public void removeritem(String itemNome) {
		for(Item item: listaDeItems) {
			if(item.getNome().equals(itemNome)) {
				listaDeItems.remove(item);
				break;
			}
		}
	}
	
	public double calcularValorTotal() {
		double valorTotal = 0.0;
		for(Item item: listaDeItems) {
			valorTotal += item.getPreco() * item.getQuantidade();
		}
		return valorTotal;
	}
	
	public void exibirItems() {
		for(Item item: listaDeItems) {
			System.out.println("Nome - "+item.getNome()+"\nPreço - "+item.getPreco()+"\nQuantidade - "+item.getQuantidade());
		}
	}
}
