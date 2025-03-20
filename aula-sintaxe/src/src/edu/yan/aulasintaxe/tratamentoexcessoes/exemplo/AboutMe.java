package src.edu.yan.aulasintaxe.tratamentoexcessoes.exemplo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AboutMe {
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Insira seu nome: ");
			String nome = scanner.next();
			
			System.out.println("Insira seu sobrenome: ");
			String sobrenome = scanner.next();
			
			System.out.println("Insira sua idade: ");
			int idade = scanner.nextInt();
			
			System.out.println("Insira sua altura: ");
			double altura = scanner.nextDouble();
			
			System.out.println("Insira seu endereço: ");
			String endereco = scanner.next();
			
			System.out.println("Ola, sou "+nome);
			System.out.println("Idade: "+idade+" anos");
			System.out.println("Altura: "+altura);
			System.out.println("Endereço: "+endereco);
		} catch (InputMismatchException e) {
			System.err.println("Os campos idade e altura devem ser numéricos.");
		}
	}
}
