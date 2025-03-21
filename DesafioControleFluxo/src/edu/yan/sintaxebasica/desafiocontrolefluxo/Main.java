package edu.yan.sintaxebasica.desafiocontrolefluxo;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try {
			Scanner escaner = new Scanner(System.in);
			
			System.out.println("Insira o número que deseja iniciar a contagem: ");
			int primeiroNumero = escaner.nextInt();
			
			System.out.println("Insira o número que deseja finilizar a contagem: ");
			int segundoNumero = escaner.nextInt();
			
			Contador contador = new Contador();
			try {
				contador.iterarSobreUmIntervaloDeNumeros(primeiroNumero, segundoNumero);
			} catch (ParametrosInvalidosException e) {
				System.err.print("Erro: O segundo parâmetro deve ser maior que o primeiro.\nEm: ");
				e.printStackTrace();
			}
		} catch (Exception e) {
			System.err.println("Caracteres alfabéticos e especiais não sao aceitos. Por favor, tente novamente inserindo um número.");
		}
	}
}
