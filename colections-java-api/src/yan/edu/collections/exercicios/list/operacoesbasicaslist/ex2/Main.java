package yan.edu.collections.exercicios.list.operacoesbasicaslist.ex2;

import java.util.List;
import java.util.function.Consumer;

public class Main {
	public static void main(String[] args) {
		List<Item> itemsParaInsercao = List.of(new Item("Esp 32", 64.00, 2), new Item("MPU 6050",15.50,2), new Item("WS2812B", 67.00, 1), new Item("Max 98357", 12.30, 1), new Item("DHT22", 24.25, 1));
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		System.out.println("===Inserindo itens===");
		itemsParaInsercao.forEach(new Consumer<Item>() {
			@Override
			public void accept(Item item) {
				// TODO Auto-generated method stub
				System.out.println(item.getNome()+" inserido no carrinho");
				carrinho.adicionarItem(item);
			}
		});	
		
		System.out.println("Removendo item");
		carrinho.removeritem("DHT22");
		
		System.out.println("Total a pagar: "+carrinho.calcularValorTotal());
	}
}
