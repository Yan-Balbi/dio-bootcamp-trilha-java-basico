package edu.yan.aulasintaxe.exercicio1;

public class Usuario {
	public static void main(String[] args) {
		SmartTv smartTv = new SmartTv();
		System.out.println("Está ligada? "+smartTv.ligada);
		System.out.println("Canal atual: "+smartTv.canal);
		System.out.println("Volume "+smartTv.volume);
		
		smartTv.ligar();
		System.out.println("Está ligada? "+smartTv.ligada);
		
		for(int i = 0; i < 5; i++) {
			smartTv.diminuirVolumeEmUmaUnidade();
		}
		System.out.println("Novo volume: "+smartTv.volume);
		
		for(int i = 0; i < 10; i++) {
			smartTv.aumentarVolumeEmUmaUnidade();
		}
		System.out.println("Novo volume: "+smartTv.volume);
		
		smartTv.mudarDeCanal(10);
		System.out.println("Canal atual: "+smartTv.canal);
		
		smartTv.avancarCanal();
		System.out.println("Canal atual: "+smartTv.canal);
		
		smartTv.retornarCanal();
		smartTv.retornarCanal();
		System.out.println("Canal atual: "+smartTv.canal);
	}
}
