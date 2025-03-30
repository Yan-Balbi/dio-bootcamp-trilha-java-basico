/*
  Crie uma classe chamada "CatalogoLivros" que possui uma lista de objetos do tipo "Livro" como atributo. Cada livro possui atributos como título, autor e ano de publicação. Implemente os seguintes métodos:

    adicionarLivro(String titulo, String autor, int anoPublicacao): Adiciona um livro ao catálogo.
    pesquisarPorAutor(String autor): Pesquisa livros por autor e retorna uma lista com os livros encontrados.
    pesquisarPorIntervaloAnos(int anoInicial, int anoFinal): Pesquisa livros publicados em um determinado intervalo de anos e retorna uma lista com os livros encontrados.
    pesquisarPorTitulo(String titulo): Pesquisa livros por título e retorna o primeiro livro encontrado.

 */

package yan.edu.collections.exercicios.list.pesquisaemlist.ex1;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	List<Livro> catalogo = new ArrayList<>();
	List<Livro> livrosDeUmAutor = new ArrayList<>();
	List<Livro> livrosDeUmAno = new ArrayList<Livro>();
	List<Livro> livrosComUmMesmoTitulo = new ArrayList<Livro>();
	
	public void adicionarLivro(Livro livro) {
		catalogo.add(livro);
	}
	
	public List<Livro> pesquisarPorAutor(String autorNome) {
		livrosDeUmAutor.clear();
		for(Livro livro: catalogo) {
			if(livro.getAutor().equals(autorNome)) {
				livrosDeUmAutor.add(livro);
			}
		}
		return livrosDeUmAutor;
	}
	
	public List<Livro> pesquisarPorIntervaloAnos(int anoMinimoPublicacao, int anoMaximoPublicacao) {
		livrosDeUmAno.clear();
		for(Livro livro: catalogo) {
			if(livro.getAnoPublicacao() >= anoMinimoPublicacao && livro.getAnoPublicacao() <= anoMaximoPublicacao) {
				livrosDeUmAno.add(livro);
			}
		}
		return livrosDeUmAno;
	}
	
	public List<Livro> pesquisarPorTitulo(String tituloLivro) {
		livrosDeUmAno.clear();
		for(Livro livro: catalogo) {
			if(livro.getTitulo().contains(tituloLivro)) {
				livrosComUmMesmoTitulo.add(livro);
			}
		}
		return livrosComUmMesmoTitulo;
	}
		
}
