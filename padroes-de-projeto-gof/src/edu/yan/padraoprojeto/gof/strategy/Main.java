package edu.yan.padraoprojeto.gof.strategy;

public class Main {
	public static void main(String[] args) {
		SingletonContexto contextoPreguicoso1 = new SingletonContexto(new SingletonPreguicosoStrategy());
		System.out.println(contextoPreguicoso1.getInstanciaStrategy());
		SingletonContexto contextoPreguicoso2 = new SingletonContexto(new SingletonPreguicosoStrategy());
		System.out.println(contextoPreguicoso2.getInstanciaStrategy());
		
		SingletonContexto contextoApressado1 = new SingletonContexto(new SingletonApressadoStrategy());
		System.out.println(contextoApressado1.getInstanciaStrategy());
		SingletonContexto contextoApressado2 = new SingletonContexto(new SingletonApressadoStrategy());
		System.out.println(contextoApressado2.getInstanciaStrategy());
		
		SingletonContexto contextoPreguicosoHolder1 = new SingletonContexto(new SingletonPreguicosoHolderStrategy());
		System.out.println(contextoPreguicosoHolder1.getInstanciaStrategy());
		SingletonContexto contextoPreguicosoHolder2 = new SingletonContexto(new SingletonPreguicosoHolderStrategy());
		System.out.println(contextoPreguicosoHolder2.getInstanciaStrategy());
	}
}
