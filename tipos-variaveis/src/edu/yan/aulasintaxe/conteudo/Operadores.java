package edu.yan.aulasintaxe.conteudo;

public class Operadores {
	public static void main(String[] args) {
		/* Concatenando duas Strings */
		String nomeString = "Linguagem" + " Java";
		System.out.println(nomeString);
		
		// Aula 1 - Depuração de concatenação de strings
		String concatenacao = "?";
		
		concatenacao = 1+1+1+"1"; //31
		System.out.println(concatenacao);
		
		concatenacao = 1+"1"+1+1; //1111
		System.out.println(concatenacao);
		
		concatenacao = "1"+1+1+1; //1111
		System.out.println(concatenacao);
		
		concatenacao = "1"+(1+1+1); //13
		System.out.println(concatenacao);
		
		//no momento em que o Java detecta um string, ela passa a concatenar tudo. Pra contornar isso, posso usar o parenthesis.
		
		/* Aula 2 -Operadores binários */
		
		int numero = 5;
		System.out.println(numero);
		numero = numero * -1;
		System.out.println(numero);
		
			//verificação de incremento ++ antes e depois das variavesi
		System.out.println("printa o valor atual e depois incrementa");
		System.out.println(numero ++); //printa o valor atual e depois incrementa
		System.out.println(numero);
		
		System.out.println("primeiro incrementa, e já exibe o novo valor");
		System.out.println(numero ++); //primeiro incrementa, e já exibe o novo valor
		System.out.println(numero);
		
			//variavel do tipo boolean
		boolean variavel = true;
		variavel = ! variavel;
		System.out.println(variavel);
		
		/* Aula 3 - Operador ternário */
		
		//estrutura condicional
		int a,b;
		String resultado = "?";
		a = 5;
		b = 6;
		
		if(a == b) {
			resultado = "verdadeiro";
		} else {
			resultado = "falso";
		}
		System.out.println("Resultado " +resultado);
		
		
		//estrutura condicional alternativa - operador condicional ternário
		int c, d;
		c = 5;
		d = 6;
		String resultadoAlternativo = a==b ?"verdadeiro": "false";
		System.out.println("Resultado alternativo " +resultadoAlternativo);
		
		/* Aula 4 - Operadores relacionais */
		int numero1 = 1;
		int numero2 = 2;
		boolean osNumeroSaoIguais = numero1 == numero2;
		System.out.println("numero1 é igual ao numero2?: "+osNumeroSaoIguais);
		
		boolean osNumeroSaoDiferentes = numero1 != numero2;
		System.out.println("numero1 é diferene do numero2?: "+osNumeroSaoDiferentes);
		
		boolean numero1EhMaiorQueNumero2 = numero1 > numero2;
		System.out.println("numero1 é maior que numero2? :"+numero1EhMaiorQueNumero2);
		
		boolean numero1EhMenorQueNumero2 = numero1 < numero2;
		System.out.println("numero1 é menor que numero2? :"+numero1EhMenorQueNumero2);
		
		String nome1 = "Joao";
		String nome2 = "Maria";
		
		if (nome1.equals(nome2)) {
			System.out.println("Os nomes são iguais");
		} 
		System.out.println("Os nomes diferem");
		
		/* Operadores lógicos */
		boolean condicao1 = true;
		boolean condicao2 = false;
		
		if(condicao1 && condicao2) {
			System.out.println("As duas condições são verdadeiras");
		}
		
		if(condicao1 || condicao2) {
			System.out.println("Uma ou mais das duas condições são verdadeiras");
		}
		
	}
}
