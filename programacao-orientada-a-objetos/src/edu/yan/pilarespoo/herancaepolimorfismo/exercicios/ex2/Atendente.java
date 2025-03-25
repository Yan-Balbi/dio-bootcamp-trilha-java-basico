package edu.yan.pilarespoo.herancaepolimorfismo.exercicios.ex2;

import java.util.ArrayList;
import java.util.List;

public class Atendente extends Usuario{
	
	private double valorEmCaixa;
	private List<Double> pagamentos = new ArrayList<>();
	
	public Atendente(String nome, String email, String senha) {
		super(nome, email, senha);
		// TODO Auto-generated constructor stub
		this.setAdministrador(false);
	}

	public double getValorEmCaixa() {
		return valorEmCaixa;
	}

	public void receberPagamentos(double pagamento) {
		if(super.verificarSeEstaLogado()) {
			this.valorEmCaixa += pagamento;
			pagamentos.add(pagamento);
		}
	}
	
	public void fecharOCaixa() {
		if(super.verificarSeEstaLogado()) {
			for (Double pagamento : pagamentos) {
				System.out.println("Pagamento: R$"+pagamento);
			}
		}
	}

}
