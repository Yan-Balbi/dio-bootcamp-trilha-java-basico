package edu.yan.pilarespoo.herancaepolimorfismo.exercicios.ex2;

public class Gerente extends Usuario{

	public Gerente(String nome, String email, String senha) {
		super(nome, email, senha);
		// TODO Auto-generated constructor stub
		this.setAdministrador(true);
	}
	
	public String realizarRelatorioFinanceiro() {
		return "Gerando relatorio financeiro...";
	}
	
	public String consultarVendas() {
		return "Consultando vendas...";
	}
	

}
