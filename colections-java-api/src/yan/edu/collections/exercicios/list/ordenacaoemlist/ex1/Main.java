package yan.edu.collections.exercicios.list.ordenacaoemlist.ex1;

import java.util.List;
import java.util.function.Consumer;

public class Main {
	public static void main(String[] args) {
		OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
		
		List<Pessoa> pessoasParaInsercao = List.of(new Pessoa("Victor",30, 1.75), new Pessoa("Ana", 35, 1.63), new Pessoa("Felipe",40, 1.84));
		pessoasParaInsercao.forEach(new Consumer<Pessoa> (){
			@Override
			public void accept(Pessoa pessoa) {
				// TODO Auto-generated method stub
				ordenacaoPessoas.adicionarPessoa(pessoa);
				
			}
		});
		
		System.out.println(ordenacaoPessoas.obterTamanhoListaPessoas());
		
		
		System.out.println("\nOrdenando por altura");
		List<Pessoa> pessoasOrdenadasPorAltura = ordenacaoPessoas.ordenarPorAltura();
		pessoasOrdenadasPorAltura.forEach(new Consumer<Pessoa>() {
			@Override
			public void accept(Pessoa pessoa) {
				// TODO Auto-generated method stub
				System.out.println(pessoa.getAltura()+" - "+pessoa.getNome()+" - "+pessoa.getIdade());
			}
		});
		
		
		System.out.println("\nOrdenando por idade");
		List<Pessoa> pessoasOrdenadasPorIdade = ordenacaoPessoas.ordenarPorIdade();
		pessoasOrdenadasPorIdade.forEach(new Consumer<Pessoa>() {
			@Override
			public void accept(Pessoa pessoa) {
				// TODO Auto-generated method stub
				System.out.println(pessoa.getIdade()+" - "+pessoa.getNome()+" - "+pessoa.getAltura());
			}
			
		});
		
	}
}
