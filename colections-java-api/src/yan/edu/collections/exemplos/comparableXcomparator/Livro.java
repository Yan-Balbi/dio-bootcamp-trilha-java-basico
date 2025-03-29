package yan.edu.collections.exemplos.comparableXcomparator;

import java.util.Comparator;

public class Livro implements Comparable<Livro>{
	
	private String titulo;
	private String autor;
	private int ano;
	
	public Livro(String titulo, String autor, int ano) {
		// TODO Auto-generated constructor stub
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
	}
	
	
	/**
	 * Usando pra ordenar livros por ano
	 */
	@Override
	public int compareTo(Livro livro) {
		// TODO Auto-generated method stub
		return titulo.compareTo(livro.titulo);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
}

class CompararAutor implements Comparator<Livro> {

	@Override
	public int compare(Livro livro1, Livro livro2) {
		// TODO Auto-generated method stub
		return livro1.getAutor().compareTo(livro2.getAutor());
	}
}

class CompararAno implements Comparator<Livro>{
	@Override
	public int compare(Livro livro1, Livro livro2) {
		// TODO Auto-generated method stub
		return Integer.compare(livro1.getAno(), livro2.getAno());
	}
}

class CompararAnoAutorTitulo implements Comparator<Livro>{
	@Override
	public int compare(Livro livro1, Livro livro2) {
		// TODO Auto-generated method stub
		int ano = Integer.compare(livro1.getAno(), livro2.getAno());
		if (ano != 0)
			return ano;
		int autor = livro1.getAutor().compareTo(livro2.getAutor());
		if (autor != 0)
			return autor;
		return livro1.getTitulo().compareTo(livro2.getTitulo());
	}
}
