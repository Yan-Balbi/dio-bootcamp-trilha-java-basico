package edu.yan.controlefluxo.exemplos;
import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
	public static void main(String[] args) {
		double giftCard = 75.0;
		while(giftCard > 0) {
			double valorProduto = valorAleatorio();
			if(valorProduto > giftCard) {
				valorProduto = giftCard;
			}
			System.out.println("Produto do valor: "+valorProduto+" Adicionado ao carrinho");
			giftCard = giftCard - valorProduto;
		}
		System.out.println("Giftcart: "+giftCard);
	}
	
	public static double valorAleatorio() {
		return ThreadLocalRandom.current().nextDouble(2,8);
	}
}
