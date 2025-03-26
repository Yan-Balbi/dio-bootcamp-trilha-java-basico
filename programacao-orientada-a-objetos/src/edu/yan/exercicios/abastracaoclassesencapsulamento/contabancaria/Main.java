package edu.yan.exercicios.abastracaoclassesencapsulamento.contabancaria;

import java.util.Scanner;

import edu.yan.exercicios.abastracaoclassesencapsulamento.veiculo.VeiculoException;


public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		ContaBancaria contaJose = new ContaBancaria("Jose", 1000);
//		contaJose.sacarDinheiro(1550, true);
//		contaJose.depositarDinheiro(1100);
		
		System.out.println("Insira o nome do titular: ");
		String titular = scanner.nextLine();
		
		System.out.println("Insira o saldo da conta: ");
		double saldo = scanner.nextDouble();
		
		ContaBancaria conta = new ContaBancaria(titular,saldo);
		
		boolean continuar = true;
		
		while(continuar == true) {
			
			System.out.println("Escolha uma operacao: \n 1 - Consultar Saldo.\n 2 - Consultar Cheque especial.\n 3 - Depositar Dinheiro.\n 4 - Sacar dinheiro.\n 5 - Pagar boleto.\n 6 - Verificar uso de cheque especial.\n 7- cancelar ");
			int operacao = scanner.nextInt();
			
			switch (operacao) {
			case 1: {
				System.out.println("Saldo disponivel: "+ conta.consultarSaldo());
				break;
			}
			case 2: {
				System.out.println("Cheque especial disponível: "+conta.consultarChequeEspecialEmDébito());
				break;
			}
			case 3: {
				System.out.println("Insira o valor que deseja depositar");
				double valorDeposito = scanner.nextDouble();
				conta.depositarDinheiro(valorDeposito);
				break;
			}
			case 4: {
				System.out.println("Insira o valor que deseja sacar");
				double valorSaque= scanner.nextDouble();
				

				boolean usarChequeEspecial;
				try {
					usarChequeEspecial = verificarSeDesejaUsarChequeEspecial();
					try {
						conta.sacarDinheiro(valorSaque, usarChequeEspecial);
						System.out.println("Transaçaõ de R$"+valorSaque+" concluida com sucesso. Saldo: R$"+conta.consultarSaldo()+" Cheque especial debitado: R$"+conta.consultarChequeEspecialEmDébito());
					} catch (Exception e) {
						// TODO: handle exception
						System.err.println("Saldo insuficiente!");
					}
				} catch (ContaBancariaException e) {
					// TODO Auto-generated catch block
					System.err.println("Inisra uma opção valida!");
				}
				break;
			}
			case 5: {
				boolean usarChequeEspecial;
				
				System.out.println("Inisira o preço do boleto a ser pago: ");
				double valorBoleto = scanner.nextDouble();
				
				try {
				System.out.println("Deseja usar cheque especial? ");
					usarChequeEspecial = verificarSeDesejaUsarChequeEspecial();
					try {
						conta.pagarBoleto(valorBoleto, usarChequeEspecial);
					} catch (Exception e) {
						// TODO: handle exception
						System.err.println("Saldo insuficiente!");
					}
				} catch (ContaBancariaException e) {
					// TODO Auto-generated catch block
					System.err.println("Inisra uma opção valida!");
				}
				break;
			}
			case 6: {
				System.out.println("Cheque especial em uso? "+ (conta.verificarSeChequeEspecialEstaEmUso() ? "Sim.\n Cheque Especial em débito:"+conta.consultarChequeEspecialEmDébito() : "Não"));
				break;
			}
			case 7: {
				break;
			}
			
			default:
				System.err.println("Operacao inválida: "+operacao+". Tente novamente inserindo uma operação válida! ");
			}
			
			try {
				continuar = verificarSeDesejaContinuar();
			} catch (ContaBancariaException e) {
				// TODO Auto-generated catch block
				System.err.println("Entrada inválida. Insira 's' ou 'n' para dar prosseguimento ao serviço.");
			}
			
		}

	}
	
	public static boolean verificarSeDesejaContinuar() throws ContaBancariaException {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Deseja continuar?\n 's' - sim \n 'n' - Não");
		String continuarChar = scanner.next().toLowerCase();
		
		if(continuarChar.equals("s")) { 
			System.out.println("ok");
			return true;
		} else if(continuarChar.equals("n")) {
			
			return false;
		} else {
			throw new ContaBancariaException();
		}
	}
	
	public static boolean verificarSeDesejaUsarChequeEspecial() throws ContaBancariaException {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Deseja usar cheque especial?\n 's' - sim \n 'n' - Não");
		String continuarChar = scanner.next().toLowerCase();
		
		if(continuarChar.equals("s")) {
			System.out.println("ok");
			return true;
		} else if(continuarChar.equals("n")) {
			
			return false;
		} else {
			throw new ContaBancariaException();
		}
	}
}
