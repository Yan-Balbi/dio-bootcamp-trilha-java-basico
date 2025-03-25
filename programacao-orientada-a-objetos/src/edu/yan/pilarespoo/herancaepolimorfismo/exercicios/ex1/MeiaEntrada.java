package edu.yan.pilarespoo.herancaepolimorfismo.exercicios.ex1;

public class MeiaEntrada extends Ingresso {

	public MeiaEntrada(double valor, String nomeDoFilme, String dublagem) {
		super(valor, nomeDoFilme, dublagem);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularValorIngresso() {
		// TODO Auto-generated method stub
		return super.getValor()/2;
	}

}
