package yan.edu.collections.exercicios.map.operacoesbasicas;

public class Main {
	public static void main(String[] args) {
		Dicionario dicionario = new Dicionario();
		
		dicionario.adicionarPalavra("Palavra 1", "Definição 1");
		dicionario.adicionarPalavra("Palavra 2", "Definição 2");
		dicionario.adicionarPalavra("Palavra 3", "Definição 3");
		dicionario.adicionarPalavra("Palavra 4", "Definição 4");
		dicionario.adicionarPalavra("Palavra 5", "Definição 5");
		dicionario.adicionarPalavra("Palavra 6", "Definição 6");
		
		dicionario.removerContato("Palavra 6");
		
		dicionario.exibirPalavras();
		
		System.out.println(dicionario.pesquisarDefinicaoDeUmaPalavra("Palavra 5"));
		
	}
}
