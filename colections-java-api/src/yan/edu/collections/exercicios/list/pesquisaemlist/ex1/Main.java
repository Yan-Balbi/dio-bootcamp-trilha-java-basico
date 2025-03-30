package yan.edu.collections.exercicios.list.pesquisaemlist.ex1;

import java.util.List;
import java.util.function.Consumer;

public class Main {
	public static void main(String[] args) {
		CatalogoLivros catalogoLivros = new CatalogoLivros();
		
		System.out.println("Inserindo livros");
		List<Livro> livrosParaInsercao = List.of(new Livro("Neuromancer","William Gibson", 1982), new Livro("Count Zero","William Gibson", 1984), new Livro("Monaliza Overdrive","William Gibson", 1986), new Livro("Androides sonham com ovelhas elétricas?","Philip K. Dick", 1962));
		livrosParaInsercao.forEach(new Consumer<Livro>() {
			@Override
			public void accept(Livro livro) {
				// TODO Auto-generated method stub
				catalogoLivros.adicionarLivro(livro);
			}
		});
		
		System.out.println("\n Pesquisando livros por nome de um autor");
		List<Livro> livrosAutor = catalogoLivros.pesquisarPorAutor("William Gibson");
		livrosAutor.forEach(new Consumer<Livro>() {
			@Override
			public void accept(Livro livro) {
				System.out.println(livro.getAutor()+" - "+livro.getTitulo()+" - "+ livro.getAnoPublicacao());
			}
		});
		
		System.out.println("\n Pesquisando livros por intervalo de ano de publicação");
		List<Livro> livrosIntervaloAno = catalogoLivros.pesquisarPorIntervaloAnos(1984, 1986);
		livrosIntervaloAno.forEach(new Consumer<Livro>() {
			@Override
			public void accept(Livro livro) {
				System.out.println(livro.getAnoPublicacao()+" - "+livro.getTitulo()+" - "+ livro.getAutor());
			}
		});
		
		System.out.println("\n Pesquisando livros por Título semelhante");
		List<Livro> livrosComMesmoTitulo = catalogoLivros.pesquisarPorTitulo("ovelhas");
		livrosComMesmoTitulo.forEach(new Consumer<Livro>() {
			@Override
			public void accept(Livro livro) {
				System.out.println(livro.getTitulo()+" - "+livro.getAnoPublicacao()+" - "+ livro.getAutor());
			}
		});		
		
	}
}
