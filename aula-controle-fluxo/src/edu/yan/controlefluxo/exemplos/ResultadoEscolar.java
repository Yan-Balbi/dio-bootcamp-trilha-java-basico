package edu.yan.controlefluxo.exemplos;

public class ResultadoEscolar {
	public static void main(String[] args) {
	
		int nota = 7;
		if(nota >= 7) {
			System.out.println("Aprovado");
		} else if(nota >=5 && nota<7) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Reprovado");
		}
		
		//ou, por meio de operadores ternarios
		
		nota = 1;
		String resultado = nota >= 7 ? "Aprovado" : nota >=5 && nota < 7 ? "Recuperação" : "Reprovado";
		System.out.println("Resultado: "+resultado);
		
		
	}
}
