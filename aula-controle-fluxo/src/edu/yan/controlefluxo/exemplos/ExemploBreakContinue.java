package edu.yan.controlefluxo.exemplos;

import java.util.Iterator;

public class ExemploBreakContinue {
	public static void main(String[] args) {
		//evitando de imprimir o 9
		System.out.println("evitando de imprimir o 9");
		for (int i = 0; i <= 15; i++) {
			if(i == 9){
				continue;
			}
			System.out.println(i);
		}
		
		//evitando de imprimir todos os numero, exceto o 9
		System.out.println("evitando de imprimir todos os numeros, exceto o 9");
		for (int i = 0; i <= 15; i++) {
			if(i != 9){
				continue;
			}
			System.out.println(i);
		}
		
		//evitando de imprimir todos os numero, exceto o 9
		System.out.println("imprimindo todos os números até o 9");
		for (int i = 0; i <= 15; i++) {
			if(i == 10){
				break;
			}
			System.out.println(i);
		}
	}
}
