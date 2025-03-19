package edu.yan.controlefluxo.exemplos;

public class CaixaEletronico {
	public static void main(String[] args) {
		double saldo = 25.0;
		double valorSolicitado = 17.0;
		
		if(saldo > valorSolicitado ) {
			saldo = saldo - valorSolicitado;
			System.out.println("Transferência efetuada com sucesso! Saldo: "+saldo);
			
		} else {
			System.out.println("Transferência cancelada: saldo insuficiente");
		}
	}
}

