package edu.yan.abastracaoclassesencapsulamento.exercicios.contabancaria;

import javax.naming.CommunicationException;

public class ContaBancaria {
	private String titular;
	private double saldo;
	private double chequeEspecial;
	private double chequeEspecialDebitado;
	private boolean chequeEspecialEmUso;
	
	public ContaBancaria() {
		
	}
	
	public ContaBancaria(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
		if(saldo <= 500) {
			this.chequeEspecial = 50;
		} else {
			this.chequeEspecial = saldo + (0.5*saldo);
		}
	}
	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public double consultarSaldo() {
		return saldo;
	}
	
	public void depositarDinheiro(double valorDeposito) {
		if(valorDeposito > 0) {
			//se houver débito de saldo especial pendente
			if(verificarExistenciaDeDebitoDeCreditoEspecial()) {
				/*
				se o valor do deposito for maior que o valor de cheque em débito
					calcule a diferença valorDeposito e debitoChequeEspecial
					set debitoChequeEspecial = 0
					saldo += diferenca;
				se não for
					calcule a diferença valorDeposito e debitoChequeEspecial
					subtraia essa diferença dentro de debitoChequeEspecial
				 */
				double diferenca = valorDeposito - chequeEspecialDebitado;
				if(diferenca > 0) {
					saldo  = cobrarTaxaSaldoEspecial(diferenca);
					double debitoChequeEspecialExibicao = chequeEspecialDebitado;
					chequeEspecialDebitado = 0;
					chequeEspecialEmUso = false;
					System.out.println("Transaçaõ de R$"+valorDeposito+" concluida com sucesso. Saldo: R$"+saldo+" Cheque especial debitado: R$"+chequeEspecialDebitado+" Taxa de 20% de Débito de Cheque Especial descontado no saldo: "+Math.abs(debitoChequeEspecialExibicao *0.2));
					return;
				}
				System.out.println(diferenca);
				chequeEspecialDebitado -= valorDeposito;
				System.out.println("Transaçaõ de R$"+valorDeposito+" concluida com sucesso. Saldo: R$"+saldo+" Cheque especial debitado: R$"+chequeEspecialDebitado);
				return;
			}
			this.saldo += valorDeposito;
			System.out.println("Transaçaõ de R$"+valorDeposito+" concluida com sucesso. Saldo: R$"+saldo+" Cheque especial debitado: R$"+chequeEspecialDebitado);
			return;
		}
		System.out.println("Impossível depositar um quantia de dinheiro negativa! Tente novamente");
	}
	
	public void sacarDinheiro(double valorSaque, boolean usarSaldoEspecial) throws ContaBancariaException {
		if(valorSaque > 0) {
			if(valorSaque <= this.saldo) {
				this.saldo -= valorSaque;
				return;
			} else if (((this.saldo + this.chequeEspecial - chequeEspecialDebitado) > valorSaque) && usarSaldoEspecial == true) {
				double diferenca = valorSaque - saldo;
				saldo = 0;
				chequeEspecialDebitado += diferenca;
				chequeEspecialEmUso = true;
			} else {
				throw new ContaBancariaException();
			}
		}

	}
	
	public double consultarChequeEspecialEmDébito() {
			return this.chequeEspecialDebitado;
	}
	
	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	
	public void pagarBoleto(double valorPagamento, boolean usarSaldoEspecial) throws ContaBancariaException {
		sacarDinheiro(valorPagamento, usarSaldoEspecial);
	}
	
	public boolean verificarSeChequeEspecialEstaEmUso() {
		return chequeEspecialEmUso;
	}
	
	private boolean verificarExistenciaDeDebitoDeCreditoEspecial() {
		if(this.chequeEspecialDebitado > 0)
			return true;
		return false;
	}
	
	private double cobrarTaxaSaldoEspecial(double diferenca) {
		return saldo += diferenca - chequeEspecialDebitado * 0.2;
	}
	
	
}
