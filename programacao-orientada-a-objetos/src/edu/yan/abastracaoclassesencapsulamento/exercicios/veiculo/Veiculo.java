package edu.yan.abastracaoclassesencapsulamento.exercicios.veiculo;

public class Veiculo {
	private boolean estadoCarro = false;
	private int velocidade = 0;
	private int marcha = 0;
	private int velocidadeMaxima = 0;
	private int velocidadeMinima = 0;


	public void ligarCarro() {
		this.estadoCarro = true;
	}
	
	public void desligarCarro() {
		if(velocidade == 0 && marcha == 0) {
			this.estadoCarro = true;
		}
	}
	
	public boolean getEstadoCarro() {
		return this.estadoCarro;
	}
	
	public boolean acelerarCarro() {
		if(estadoCarro) {
			if(velocidade >= velocidadeMinima && velocidade <= velocidadeMaxima) {
				velocidade++;
				return true;
			}
		}
		return false;
	}
	
	public boolean desacelerarCarro() {
		if(estadoCarro) {
			if(velocidade >= velocidadeMinima && velocidade <= velocidadeMaxima) {
				velocidade--;
				return true;
			}
		}
		return false;
	}
	
	public int obterVelocidade() {
		return this.velocidade;
	}
	
	public boolean avancarMarcha() {
		//obs: a atividade não permite não permite que um carro não faça nada se estiver desligado
		if(estadoCarro) {
			marcha++;
			if(marcha >=6) {
				marcha = 6;
				return false;
			}
			acelerarCarro();
			aplicarLimiteVelocidadeParaAMarchaCorrespondente();
			return true;
		}
		return false;
	}
	
	public boolean retornarMarcha() {
		//obs: a atividade não permite não permite que um carro não faça nada se estiver desligado
		if(estadoCarro) {
			marcha--;
			if(marcha >=0) {
				marcha = 0;
				return false;
			}
			desacelerarCarro();
			aplicarLimiteVelocidadeParaAMarchaCorrespondente();
			return true;
		}
		return false;
	}

	public boolean virarCarroParaAEsquerda() {
		if(velocidadeMinima >=1 && velocidadeMaxima <= 40 ) {
			System.out.println("Virando o carro para a esquerda");
			return true;
		}
		System.out.println("Velocidade muito alta para virar o carro para a esquerda");
		return false;
	}
	
	public boolean virarCarroParaADireita() {
		if(velocidadeMinima >=1 && velocidadeMaxima <= 40 ) {
			System.out.println("Virando o carro para a direita");
			return true;
		}
		System.out.println("Velocidade muito alta para virar o carro para a direita");
		return false;
	}

	
	private void aplicarLimiteVelocidadeParaAMarchaCorrespondente() {
		
		switch (marcha) {
		case 0: {
			velocidadeMinima = 0;
			velocidadeMaxima = 0;
			break;
		}
		case 1: {
			velocidadeMinima = 1;
			velocidadeMaxima = 20;
			break;
		}
		case 2: {
			velocidadeMinima = 21;
			velocidadeMaxima = 40;
			break;
		}
		case 3: {
			velocidadeMinima = 41;
			velocidadeMaxima = 60;
			break;
		}
		case 4: {
			velocidadeMinima = 61;
			velocidadeMaxima = 80;
			break;
		}
		case 5: {
			velocidadeMinima = 81;
			velocidadeMaxima = 100;
			break;
		}
		case 6: {
			velocidadeMinima = 101;
			velocidadeMaxima = 120;
			break;
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + marcha);
		}
			
	}
	
}
