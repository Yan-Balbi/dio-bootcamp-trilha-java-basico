package edu.yan.pilarespoo.visibilidadederecursos.exemplo.autodromo;

public class Carro extends Veiculo{
	
	
	public void ligar() {
		System.out.println("Carro ligado");
		conferirCambio();
		conferirCombustivel();
	}
	
	private void conferirCombustivel() {
		System.out.println("Conferindo combustivel");
	}
	
	private void conferirCambio() {
		System.out.println("Conferindo cambio");
	}
}
