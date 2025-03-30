package yan.edu.collections.exercicios.set.operacoesbasicas.ex2;

public class Main {
	public static void main(String[] args) {
		ConjuntosPalavrasUnicas conjunto = new ConjuntosPalavrasUnicas();
		
		conjunto.adicionarPalavra("Palavra 1");
		conjunto.adicionarPalavra("Palavra 2");
		conjunto.adicionarPalavra("Palavra 3");
		conjunto.adicionarPalavra("Palavra 3");
		conjunto.adicionarPalavra("Palavra 5");
		
		System.out.println("Palavra está presente no conjunto? "+conjunto.verificarSePalavraEstaPresenteNoConjunto("Palavra 1"));;
		
		conjunto.removerPalavra("Palavra 1");
		
		conjunto.exibirPalavrasUnicas();
	}
}
