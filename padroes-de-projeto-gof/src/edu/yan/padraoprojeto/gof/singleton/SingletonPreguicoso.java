package edu.yan.padraoprojeto.gof.singleton;

/**
 * Nesse Singleton a instancia começa vazia
 * 
 * vantagem: Cria instância apenas quando for solicitado
 * desvantagem: não é thread-safe
 */
public class SingletonPreguicoso {
	private static SingletonPreguicoso instanciaSingleton;
	
	private SingletonPreguicoso() {
		
	}
	
	public static SingletonPreguicoso getInstance() {
		if(instanciaSingleton == null) {
			instanciaSingleton = new SingletonPreguicoso();
		}
		return instanciaSingleton;
	}
}
