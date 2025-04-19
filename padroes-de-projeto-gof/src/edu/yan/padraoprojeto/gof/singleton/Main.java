package edu.yan.padraoprojeto.gof.singleton;

public class Main {
	public static void main(String[] args) {
		var instanciaPreguicoso = SingletonPreguicoso.getInstance();
		System.out.println(instanciaPreguicoso);
		instanciaPreguicoso = SingletonPreguicoso.getInstance();
		System.out.println(instanciaPreguicoso);
		
		var instanciaApressado = SingletonApressado.getInstance();
		System.out.println(instanciaApressado);
		instanciaApressado = SingletonApressado.getInstance();
		System.out.println(instanciaApressado);
		
		var instanciaPreguicosoHolder = SingletonPreguicosoHolder.getInstancia();
		System.out.println(instanciaPreguicosoHolder);
		instanciaPreguicosoHolder = SingletonPreguicosoHolder.getInstancia();
		System.out.println(instanciaPreguicosoHolder);
		
	}
}
