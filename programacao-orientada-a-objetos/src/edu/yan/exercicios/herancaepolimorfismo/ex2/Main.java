package edu.yan.exercicios.herancaepolimorfismo.ex2;

public class Main {
	public static void main(String[] args) {
		Gerente gerente = new Gerente("José", "ze@gmail.com", "zezinho123");
		System.out.println("Nome: "+gerente.getNome() + "\n Email: "+gerente.getEmail()+"\n Administrador? "+gerente.getAdministrador());
		
		gerente.fazerLogin("ze@gmail.com", "zezinho123");
		gerente.alterarDados("ze123@email.br", "123");
		System.out.println("Nome: "+gerente.getNome() + "\n Email: "+gerente.getEmail()+"\n Administrador? "+gerente.getAdministrador());
		gerente.consultarVendas();
		
		
		
		Vendedor vendedor = new Vendedor("Marcio", "macio@gmail.com", "m123arcio");
		System.out.println("Nome: "+vendedor.getNome() + "\n Email: "+vendedor.getEmail()+"\n Administrador? "+vendedor.getAdministrador());
		vendedor.fazerLogin("marcio@gmail.com", "m123arcio");
		
		vendedor.getQuantidadeDeVendas();
		
		
		
		Atendente atendente = new Atendente("Guilherme", "gui@gmail.com", "gui123");
		System.out.println("Nome: "+atendente.getNome() + "\n Email: "+atendente.getEmail()+"\n Administrador? "+atendente.getAdministrador());
		atendente.fazerLogin("gui@gmail.com", "gui123");
		atendente.receberPagamentos(100);
		atendente.receberPagamentos(50);
		atendente.receberPagamentos(100);
		atendente.receberPagamentos(50);
		atendente.receberPagamentos(100);
		atendente.receberPagamentos(50);
		atendente.fecharOCaixa();
		
		gerente.alterarDados("ze123@email.br", "123");
	}
}
