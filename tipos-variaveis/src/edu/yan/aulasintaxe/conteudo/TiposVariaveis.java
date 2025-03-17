package edu.yan.aulasintaxe.conteudo;

public class TiposVariaveis {
	public static void main(String[] args) {
		/*tipos primitivos*/
		double salarioMinimo = 1700;
		float pi = 3.14F;
		double salarioBruto = 1650.36;
		
			//usando casts
		short numeroCurto1 = 1;
		int numeroNormal = numeroCurto1;
		short numeroCurto2 = (short) numeroNormal;
		
			//quando os valores nunca podem mudar
		final double VALOR_DE_PI = 3.14;
	}
}
