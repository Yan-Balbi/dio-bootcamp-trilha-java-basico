package edu.yan.exemplos.pilarespoo.interfaces.interfacesimples;


public class Smartphone implements IReprodutorDeMusica, IReprodutorDeVideo {

	@Override
	public void tocarMusica(String nomeMusica) {
		// TODO Auto-generated method stub
		System.out.println("Smartphone tocando a música "+nomeMusica);
	}

	@Override
	public void pausarMusica() {
		// TODO Auto-generated method stub
		System.out.println("Smartphone pausando a musica");
	}

	@Override
	public void cancelarMusica() {
		// TODO Auto-generated method stub
		System.out.println("Smartphone parando a reprodução de musica");
	}

	@Override
	public void reproduzirVideo(String nomeVideo) {
		// TODO Auto-generated method stub
		System.out.println("Smartphone reproduzindo o video "+nomeVideo);
	}

	@Override
	public void pausarVideo() {
		// TODO Auto-generated method stub
		System.out.println("Smartphone pausando o video");
	}

	@Override
	public void cancelarVideo() {
		// TODO Auto-generated method stub
		System.out.println("Smartphone parando o video");
	}
	
}
