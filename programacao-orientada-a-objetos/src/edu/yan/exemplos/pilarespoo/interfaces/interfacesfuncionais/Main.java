package edu.yan.exemplos.pilarespoo.interfaces.interfacesfuncionais;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

//interfaces funcionais ou lambda são interfaces não implementadas
public class Main {
	public static void main(String[] args) {
		List<Usuario> usuarios = List.of(new Usuario("Joao",20), new Usuario("Maria",22), new Usuario("Jose",28), new Usuario("Roberto",34), new Usuario("Valdomiro",44));
		//toda interface funcional(lambda) deve implementar o consumer
/*		Consumer<Usuario> consumer = new Consumer<Usuario>() {

			@Override
			public void accept(Usuario usuario) {
				// TODO Auto-generated method stub
				System.out.println(usuario);
			}
			
		};
		usuarios.forEach(consumer);*/
		
		//OU POSSO FAZER
		
/*		usuarios.forEach(new Consumer<Usuario>() {
			
			@Override
			public void accept(final Usuario usuario) {
				System.out.println(usuario);
			}
			
		});*/
		
		//A EXPRESSÃO LAMBDA PODE SER SIMPLIFICADA MAIS AINDA
		
/*		usuarios.forEach((Usuario usuario) -> {
				System.out.println(usuario);
		});*/
		
		//OU AINDA
		
		usuarios.forEach(usuario -> System.out.println(usuario));
		
	}
	
	private static void exibirValoresString(Function<Usuario, String> callback, List<Usuario> usuarios) {
		usuarios.forEach(U -> System.out.println(callback.apply(U)));
	}
}
