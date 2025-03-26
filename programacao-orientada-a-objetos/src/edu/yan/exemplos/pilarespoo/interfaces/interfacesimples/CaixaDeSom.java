package edu.yan.exemplos.pilarespoo.interfaces.interfacesimples;

public record CaixaDeSom(String musica, boolean estaPausada) implements IReprodutorDeMusica {

	@Override
	public void tocarMusica(String nomeMusica) {
		// TODO Auto-generated method stub
		System.out.println("A caixa está reproduzindo a música.");
	}

	@Override
	public void pausarMusica() {
		// TODO Auto-generated method stub
		System.out.println("A caixa está pausando a música.");
	}

	@Override
	public void cancelarMusica() {
		// TODO Auto-generated method stub
		System.out.println("A caixa está parando a música.");
	}

}
