/*
 *  Crie uma classe chamada "Dicionario" que utilize um Map para armazenar palavras e suas respectivas definições. Implemente os seguintes métodos:

    adicionarPalavra(String palavra, String definicao): Adiciona uma palavra e sua definição ao dicionário, associando a palavra à sua definição correspondente.
    removerPalavra(String palavra): Remove uma palavra do dicionário, dado o termo a ser removido.
    exibirPalavras(): Exibe todas as palavras e suas definições do dicionário, mostrando cada palavra seguida de sua respectiva definição.
    pesquisarPorPalavra(String palavra): Pesquisa uma palavra no dicionário e retorna sua definição correspondente.

 */
package yan.edu.collections.exercicios.map.operacoesbasicas;

import java.util.HashMap;

public class Dicionario {
	
	private HashMap<String, String> palavrasEDefinicoes = new HashMap<>();
	
	public void adicionarPalavra(String palavra, String definicao) {
		palavrasEDefinicoes.put(palavra, definicao);
	}
	
	public void removerContato(String palavra) {
		if(!palavrasEDefinicoes.isEmpty()) {
			palavrasEDefinicoes.remove(palavra);
		}
	}
	
	public void exibirPalavras() {
		System.out.println(palavrasEDefinicoes);
	}
	
	public String pesquisarDefinicaoDeUmaPalavra(String nome) {
		return palavrasEDefinicoes.get(nome);
	}
}
