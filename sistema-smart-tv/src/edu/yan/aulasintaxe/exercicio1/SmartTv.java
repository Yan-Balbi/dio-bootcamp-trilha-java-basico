package edu.yan.aulasintaxe.exercicio1;

public class SmartTv {

	boolean ligada =false;
	int canal = 1;
	int volume = 25;
	
	public void ligar() {
		this.ligada = true;
	}
	
	public void desligar() {
		this.ligada = false;
	}
	
	public void aumentarVolumeEmUmaUnidade() {
		volume++;
	}
	
	public void diminuirVolumeEmUmaUnidade() {
		volume--;
	}
	
	public void avancarCanal() {
		canal++;
	}
	
	public void retornarCanal() {
		canal--;
	}
	
	public void mudarDeCanal(int canal) {
		this.canal = canal;
	}
}
