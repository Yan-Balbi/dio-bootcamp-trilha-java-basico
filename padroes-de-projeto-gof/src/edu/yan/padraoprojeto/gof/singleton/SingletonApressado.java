package edu.yan.padraoprojeto.gof.singleton;

/**
 * Nesse Singleton já começa com uma instância estática preenchida
 * 
 * vantagem: é thread-safe
 * desvantagem: cria uma instância mesmo que nunca seja usado
 */
public class SingletonApressado {//também chamado de apressado
	private static final SingletonApressado instanciaSingleton = new SingletonApressado();
	
	private SingletonApressado() {
		
	}
	
	public static SingletonApressado getInstance() {
		return instanciaSingleton;
	}
	
}
