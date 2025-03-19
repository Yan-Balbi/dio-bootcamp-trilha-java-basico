package edu.yan.aulasintaxe.desafios;

import java.util.Scanner;

public class ContaTerminal {
	private int numeroDaConta;
	private String agencia;
	private String nomeDoCliente;
	private double saldo;

	public ContaTerminal() {
		
	}
	
	public ContaTerminal(int numero, String agencia, String nomeDoCliente, int saldo) {
		this.numeroDaConta = numero;
		this.agencia = agencia;
		this.nomeDoCliente = nomeDoCliente;
		this.saldo = saldo;
	}
	
	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(int numero) {
		this.numeroDaConta = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNomeDoCliente() {
		return nomeDoCliente;
	}

	public void setNomeDoCliente(String nomeDoCliente) {
		this.nomeDoCliente = nomeDoCliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public static void main(String[] args) {
		ContaTerminal contaBancaria = new ContaTerminal();
		Scanner escaner = new Scanner(System.in);
		String continuar = "s";
		
		while(continuar.equals("s")) {
			System.out.println("=======Cadatro de Conta=======");
			
			System.out.println("Por favor, digite o número da conta: ");
			contaBancaria.setNumeroDaConta(escaner.nextInt());
			
			System.out.println("Por favor, digite o número da agência: ");
			contaBancaria.setAgencia(escaner.next());
			
			System.out.println("Por favor, insira seu nome: ");
			contaBancaria.setNomeDoCliente(escaner.next());
			
			System.out.println("Por favor, insira seu saldo: ");
			contaBancaria.setSaldo(escaner.nextDouble());
			
			System.out.println("\n Olá "+contaBancaria.nomeDoCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+contaBancaria.agencia+", conta "+contaBancaria.numeroDaConta+" e seu saldo "+contaBancaria.saldo+" já está disponível para saque\n");
			
			System.out.println("Deseja criar outra conta? \n 's' - sim \n Qualquer outra tecla - não");
			continuar = escaner.next().toLowerCase();
		}
	}
}
