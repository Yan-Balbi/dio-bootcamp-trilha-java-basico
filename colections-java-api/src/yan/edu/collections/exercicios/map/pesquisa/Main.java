package yan.edu.collections.exercicios.map.pesquisa;

public class Main {
	public static void main(String[] args) {
		ContagemPalavras contador = new ContagemPalavras();
		
		contador.adicionarPalavra("Palavra 1", 1);
		contador.adicionarPalavra("Palavra 2", 2);
		contador.adicionarPalavra("Palavra 3", 3);
		contador.adicionarPalavra("Palavra 4", 4);
		contador.adicionarPalavra("Palavra 5", 5);
		
		contador.exibirContagemPalavras();
		
		contador.removerPalavra("Palavra 5");
		
		System.out.println("Palavra mais frequente: "+contador.encontrarPalavrasMaisFrequentes());
	}
}
