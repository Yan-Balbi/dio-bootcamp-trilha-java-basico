package yan.edu.collections.exercicios.list.pesquisaemlist.ex1;

public class Livro {
	private String titulo;
	private String autor;
	private int anoPublicacao;
	
	public Livro() {
		// TODO Auto-generated constructor stub
		
	}
	
	public Livro(String titulo, String autor, int anoPublicacao) {
		// TODO Auto-generated constructor stub
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
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

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
}
