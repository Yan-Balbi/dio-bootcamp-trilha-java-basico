package src.edu.yan.aulasintaxe.terminaleargumentos.conteudo;

import java.util.Scanner;

public class AboutMe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String nome = args[0];
		String sobrenome = args[1];
		int idade = Integer.valueOf(args[2]);
		double altura = Double.valueOf(args[3]);
		
		System.out.println("Insira seu endereço: ");
		String endereco = scanner.next();
		
		System.out.println("Ola, sou "+nome);
		System.out.println("Idade: "+idade+" anos");
		System.out.println("Altura: "+altura);
		System.out.println("Endereço: "+endereco);
	}
}
