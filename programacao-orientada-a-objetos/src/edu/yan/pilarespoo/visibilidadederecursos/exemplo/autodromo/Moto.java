package edu.yan.pilarespoo.visibilidadederecursos.exemplo.autodromo;

public class Moto extends Veiculo{
	private String cor;
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void ligar() {
		System.out.println("Moto ligada");
	}
	



}
