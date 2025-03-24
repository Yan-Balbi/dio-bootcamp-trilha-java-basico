package edu.yan.abastracaoclassesencapsulamento.exercicios.veiculo;

import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		Veiculo carro = new Veiculo();
		carro.ligarCarro();
		
		//primeira marcha
		carro.avancarMarcha();
		for(int i = 0; i < 20; i++) {
			carro.acelerarCarro();
		}
		System.out.println(carro.obterVelocidade());
		
		carro.virarCarroParaAEsquerda();
		
		//segunda marcha
		carro.avancarMarcha();
		for(int i = 0; i <20; i++) {
			carro.acelerarCarro();
		}
		System.out.println(carro.obterVelocidade());
		
		carro.virarCarroParaADireita();
		
		//terceira marcha
		carro.avancarMarcha();
		for(int i = 0; i <20; i++) {
			carro.acelerarCarro();
		}
		System.out.println(carro.obterVelocidade());
		
		//quarta marcha
		carro.avancarMarcha();
		for(int i = 0; i <20; i++) {
			carro.acelerarCarro();
		}
		System.out.println(carro.obterVelocidade());
		
		//quinta marcha
		carro.avancarMarcha();
		for(int i = 0; i <20; i++) {
			carro.acelerarCarro();
		}
		System.out.println(carro.obterVelocidade());
		
		
		//sexta marcha
		carro.avancarMarcha();
		for(int i = 0; i <20; i++) {
			carro.acelerarCarro();
		}
		System.out.println(carro.obterVelocidade());
		
		//sexta marcha
		System.out.println(carro.avancarMarcha());
		for(int i = 0; i <20; i++) {
			carro.acelerarCarro();
		}
		System.out.println(carro.obterVelocidade());
	}
}
