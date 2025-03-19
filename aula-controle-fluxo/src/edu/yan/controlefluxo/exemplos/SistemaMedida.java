package edu.yan.controlefluxo.exemplos;

public class SistemaMedida {
	public static void main(String[] args) {
		String sigla = "M";
		
		switch (sigla) {
		case "P": {
			System.out.println("PEQUENO");
			break;
		}
		case "M":{
			System.out.println("MÉDIO");
			break;
		}
		case "G":{
			System.out.println("GRANDE");
			break;
		}
		default:
			throw new IllegalArgumentException("Valor inesperado: " + sigla);
		}
		
		
	}
}
