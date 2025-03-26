package edu.yan.exemplos.pilarespoo.interfaces.interfacesimples;

public class ComputadorPessoal implements IReprodutorDeMusica, IReprodutorDeVideo {

	@Override
	public void tocarMusica(String nomeMusica) {
		// TODO Auto-generated method stub
		System.out.println("Computador tocando a música "+nomeMusica);
	}

	@Override
	public void pausarMusica() {
		// TODO Auto-generated method stub
		System.out.println("Computador pausando a musica");
	}

	@Override
	public void cancelarMusica() {
		// TODO Auto-generated method stub
		System.out.println("Computador parando a reprodução de musica");
	}

	@Override
	public void reproduzirVideo(String nomeVideo) {
		// TODO Auto-generated method stub
		System.out.println("Computador reproduzindo o video "+nomeVideo);
	}

	@Override
	public void pausarVideo() {
		// TODO Auto-generated method stub
		System.out.println("Computador pausando o video");
	}

	@Override
	public void cancelarVideo() {
		// TODO Auto-generated method stub
		System.out.println("Computador parando o video");
	}
	
}
