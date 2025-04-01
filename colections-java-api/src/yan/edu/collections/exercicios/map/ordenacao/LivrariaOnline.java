/*
 *  Crie uma classe chamada "LivrariaOnline" que representa uma livraria online. Essa classe utiliza um Map para armazenar os livros disponíveis na livraria, utilizando o link da obra na Amazon Marketplace como chave e um objeto da classe "Livro" como valor. A classe "Livro" possui atributos como título, autor e preço. Através da classe "LivrariaOnline", implemente os seguintes métodos:

    adicionarLivro(String link, String titulo, String autor, private double preco): Adiciona um livro à livraria, utilizando o ISBN como chave no Map.
    removerLivro(String titulo): Remove um livro da livraria, dado o titulo do livro.
    exibirLivrosOrdenadosPorPreco(): Exibe os livros da livraria em ordem crescente de preço.
    pesquisarLivrosPorAutor(String autor): Retorna uma lista de todos os livros escritos por um determinado autor.
    obterLivroMaisCaro(): Retorna o livro mais caro disponível na livraria.
    exibirLivroMaisBarato(): Retorna o livro mais barato disponível na livraria.
o desafio é incoerente, a chave do hashmap é o isbn ou o link do amazon	
 */
package yan.edu.collections.exercicios.map.ordenacao;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
//questão inconsistente
public class LivrariaOnline {
	private HashMap<Integer, Livro> mapaLivros = new HashMap<>();
	
	public void adicionarLivro(Integer isbn, Livro livro) {
		mapaLivros.put(isbn, livro);
	}
	
	public void removerLivro(Integer isbn) {//não tem como remover pelo título nessa questão
		mapaLivros.remove(isbn);
	}
	
	public void exibirLivrosOrdenados() {
		System.out.println(mapaLivros);
	}
	
	public void exibirLivrosOrdenadosPorPreco() {
		Map<Integer, Livro> livrosTreeMap = new TreeMap<>(mapaLivros);
		System.out.println(livrosTreeMap);
	}
	
	public void pesquisarLivrosPorAutor(String autorNome) {
        System.out.println("Livro do Autor "+autorNome+": ");
		for (Livro livro : mapaLivros.values()) {
            if (livro.getAutor().equals(autorNome)) {
                System.out.println("Livro: "+livro.getTitulo()+" Preço: "+livro.getPreco());
            }
        }
	}
	
	public void exibirLivroMaisCaro() {
        Livro livroMaiscaro = null;
        double maiorValor = 0;
		for(Map.Entry<Integer, Livro> livro: mapaLivros.entrySet()) {
			if(livro.getValue().getPreco() > maiorValor) {
				maiorValor = livro.getValue().getPreco();
				livroMaiscaro = livro.getValue();
			}
		}
		System.out.println("O livro mais caro é: "+livroMaiscaro.getTitulo()+" do autor "+livroMaiscaro.getAutor()+" de valor "+livroMaiscaro.getPreco());
	}
}
