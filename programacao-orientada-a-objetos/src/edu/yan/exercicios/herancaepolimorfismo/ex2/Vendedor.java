package edu.yan.exercicios.herancaepolimorfismo.ex2;

public class Vendedor extends Usuario{
	private int quantidadeDeVendas;
	
	public Vendedor(String nome, String email, String senha) {
		super(nome, email, senha);
		// TODO Auto-generated constructor stub
		this.setAdministrador(false);
	}

	public int getQuantidadeDeVendas() {
		return quantidadeDeVendas;
	}

	public void realizarVenda() {
		if(super.verificarSeEstaLogado())
			this.quantidadeDeVendas ++;
	}
	
	

}
