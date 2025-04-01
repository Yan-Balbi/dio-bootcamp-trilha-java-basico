package yan.edu.collections.exercicios.map.ordenacao;

public class Main {
public static void main(String[] args) {
	LivrariaOnline livraria = new LivrariaOnline();
	
	livraria.adicionarLivro(1234, new Livro("Livro 1", "Autor 1", 156.1));
	livraria.adicionarLivro(45623, new Livro("Livro 2", "Autor 2", 117.50));
	livraria.adicionarLivro(134623, new Livro("Livro 3", "Autor 3", 98.00));
	livraria.adicionarLivro(91237, new Livro("Livro 4", "Autor 4", 56.3));
	livraria.adicionarLivro(334232, new Livro("Livro 5", "Autor 5", 65.51));
	
	livraria.pesquisarLivrosPorAutor("Autor 1");
	
	livraria.exibirLivrosOrdenados();
	
	livraria.exibirLivrosOrdenadosPorPreco();
	
	livraria.exibirLivroMaisCaro();
}
}
