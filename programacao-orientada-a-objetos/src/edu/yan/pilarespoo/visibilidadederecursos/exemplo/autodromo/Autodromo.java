package edu.yan.pilarespoo.visibilidadederecursos.exemplo.autodromo;

public class Autodromo {
	public static void main(String[] args) {
		Carro uno = new Carro();
		uno.setChassi("123.345.123.33");
		
		Moto lightCicle = new Moto();
		lightCicle.setChassi("");
		lightCicle.setCor("Azul celeste");
		lightCicle.ligar();
		
		Veiculo coringa = uno;
		coringa.ligar();
	}
	
	
}
