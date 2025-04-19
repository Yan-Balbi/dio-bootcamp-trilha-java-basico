package edu.yan.padraoprojeto.gof.singleton;
/**
 * Nesse Singleton a instancia começa vazia
 * 
 * vantagem: 
 * 			Cria instância apenas quando for solicitado
 * 			é thread-safe
 * desvantagem: 
 * 			
 */
public class SingletonPreguicosoHolder {
	
	/**
	 * Classe que encapsula a instancia
	 */
	private static class Holder {
		public static SingletonPreguicosoHolder instanciaSingleton = new SingletonPreguicosoHolder();
	}
	
	private SingletonPreguicosoHolder() {
		
	}
	
	public static SingletonPreguicosoHolder getInstancia() {
		return Holder.instanciaSingleton;
	}
}
