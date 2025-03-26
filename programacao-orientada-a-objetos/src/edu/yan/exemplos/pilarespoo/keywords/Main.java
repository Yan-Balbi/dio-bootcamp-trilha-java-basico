package edu.yan.exemplos.pilarespoo.keywords;

import edu.yan.exemplos.pilarespoo.keywords.classes.Cliente;

public class Main {
	public static void main(String[] args) {
		Cliente usuario = new Cliente();
		usuario.setNome("Yan");
		usuario.setStaticNome("Yan");
		System.out.println(usuario.getNome());
		System.out.println(usuario.getStaticNome());
	}
}
