package yan.edu.collections.exercicios.list.ordenacaoemlist.ex2;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

public class Main {
	public static void main(String[] args) {
		OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
		Random geradorNumero = new Random();
		
		System.out.println("Inserindo numeros aleatorios");
		for(int i=0; i<10; i++) {
			ordenacaoNumeros.adicionarNumeros(geradorNumero.nextInt(25));
		}
		
		ordenacaoNumeros.listarNumeros();
		
		System.out.println("Ordenacao crescente");		
		List<Integer> numerosOrdenadosCrescente = ordenacaoNumeros.ordenarAscendentemente();
		numerosOrdenadosCrescente.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer numero) {
				// TODO Auto-generated method stub
				System.out.println(numero);
			}
		});
		
		System.out.println("Ordenacao decrescente");		
		List<Integer> numerosOrdenadosDecrescente = ordenacaoNumeros.ordenarDescendentemente();
		numerosOrdenadosDecrescente.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer numero) {
				// TODO Auto-generated method stub
				System.out.println(numero);
			}
		});
	}
}
