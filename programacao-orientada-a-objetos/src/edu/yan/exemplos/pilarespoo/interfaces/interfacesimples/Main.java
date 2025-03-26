package edu.yan.exemplos.pilarespoo.interfaces.interfacesimples;

public class Main {
	public static void main(String[] args) {
		
		
		
//		exemplo de classe anonima
//		var reprodutorDeMusica = new IReprodutorDeMusica() {
//			
//			@Override
//			public void tocarMusica() {
//				// TODO Auto-generated method stub
//				System.out.println("Tocando a musica");
//			}
//			
//			@Override
//			public void pausarMusica() {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void cancelarMusica() {
//				// TODO Auto-generated method stub
//				
//			}
//		};
		
		IReprodutorDeMusica reprodutorDeMusica = new ComputadorPessoal();
		IReprodutorDeVideo reprodutorDeVideo = new ComputadorPessoal();
		
		reproduzirMusica(reprodutorDeMusica, "Adagion for Tron");
		reproduzirVideo(reprodutorDeVideo, "Daft Punk - Derezzed (from TRON: Legacy)");
	}
	
	public static void reproduzirVideo(IReprodutorDeVideo player, String nomeVideo) {
		player.reproduzirVideo(nomeVideo);
	}
	
	public static void reproduzirMusica(IReprodutorDeMusica player, String nomeMusica) {
		player.tocarMusica(nomeMusica);
	}
	
	
}
