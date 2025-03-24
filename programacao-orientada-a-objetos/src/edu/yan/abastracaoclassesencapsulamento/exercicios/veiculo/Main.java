package edu.yan.abastracaoclassesencapsulamento.exercicios.veiculo;

import java.util.Iterator;
import java.util.Scanner;

import edu.yan.abastracaoclassesencapsulamento.exercicios.contabancaria.ContaBancaria;
import edu.yan.abastracaoclassesencapsulamento.exercicios.contabancaria.ContaBancariaException;
import edu.yan.pilarespoo.visibilidadederecursos.exemplo.autodromo.Carro;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Veiculo carro = new Veiculo();
		
		boolean continuar = true;
		
		while(continuar == true) {
			
			System.out.println("Escolha uma operacao: \n 1 - Ligar carro.\n 2 - Desligar Carro.\n 3 - Acelerar.\n 4 - Desacelerar.\n 5 - Virar para a esquerda.\n 6 - Virar para a direita.\n 7- Avançar marcha.\n 8 - Retornar marcha.\n 9 - Verificar velocidade.\n 10 - Cancelar ");
			int operacao = scanner.nextInt();
			
			switch (operacao) {
			case 1: {
				if (carro.ligarCarro()) 
					System.out.println("Carro ligado");
				break;
			}
			case 2: {
				if(carro.desligarCarro()) {
					System.out.println("Carro desligado");
					break;
				}
				System.out.println("Impossível desligar o carro no momento: desacelere o carro e coloque em ponto morto.");
				break;
			}
			case 3: {
				if(carro.acelerarCarro()) {
					System.out.println("Velocidade aumentada para "+carro.obterVelocidade()+" km/h");
					break;
				}
				System.out.println("Verifique se o carro está ligado e/ou a marcha do carro antes de acelerá-lo.");
				break;
			}
			case 4: {
				if(carro.desacelerarCarro()) {
					System.out.println("Velocidade reduzida para "+carro.obterVelocidade()+" km/h");
					break;
				}
				System.out.println("Verifique se o carro está ligado e/ou a marcha do carro antes de desacelerá-lo.");				
				break;
			}
			case 5: {
				carro.virarCarroParaADireita();
				break;
			}
			case 6: {
				carro.virarCarroParaAEsquerda();
				break;
			}
			case 7: {
				if(carro.avancarMarcha()) {
					System.out.println("Marcha subiu para: "+carro.getMarcha());
					break;
				}
				System.out.println("Falha ao avançar marcha: Verifique se o carro está ligado ou se a marcha já está no máximo.");
				break;
			}
			case 8: {
				if(carro.retornarMarcha()) {
					System.out.println("Marcha desceu para: "+carro.getMarcha());
					break;
				}
				System.out.println("Falha ao retornar marcha: Verifique se o carro está ligado ou se a marcha já está no mínimo.");				
				break;
			}
			case 9: {
				System.out.println("Velocidade atual: "+carro.obterVelocidade()+" km/h");
				break;
			}
			case 10: {
				
				break;
			}
			
			default:
				System.err.println("Operacao inválida: "+operacao+". Tente novamente inserindo uma operação válida! ");
			}
			
			try {
				continuar = verificarSeDesejaContinuar();
			} catch (VeiculoException e) {
				// TODO Auto-generated catch block
				System.err.println("Entrada inválida. Insira 's' ou 'n' para dar prosseguimento ao serviço.");
			}
			
		}

	}
	
	public static boolean verificarSeDesejaContinuar() throws VeiculoException {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Deseja continuar?\n 's' - sim \n 'n' - Não");
		String continuarChar = scanner.next().toLowerCase();
		
		if(continuarChar.equals("s")) { 
			System.out.println("ok");
			return true;
		} else if(continuarChar.equals("n")) {
			
			return false;
		} else {
			throw new VeiculoException();
		}
	}
}
