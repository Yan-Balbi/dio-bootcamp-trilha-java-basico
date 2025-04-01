/*
 *  Crie uma classe chamada "ContagemPalavras" que utilize um Map para armazenar as palavras e a quantidade de vezes que cada palavra aparece em um texto. Implemente os seguintes métodos:

    adicionarPalavra(String palavra, Integer contagem): Adiciona uma palavra à contagem.
    removerPalavra(String palavra): Remove uma palavra da contagem, se estiver presente.
    exibirContagemPalavras(): Exibe todas as palavras e suas respectivas contagens.
    encontrarPalavraMaisFrequente(): Encontra a palavra mais frequente no texto e retorna a palavra e sua contagem.

 */
package yan.edu.collections.exercicios.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
	private HashMap<String, Integer> mapaDeContagemDePalavras;
	
	public ContagemPalavras() {
		// TODO Auto-generated constructor stub
		mapaDeContagemDePalavras = new HashMap<>();
	}
	
	public void adicionarPalavra(String palavra, Integer contagem) {
		mapaDeContagemDePalavras.put(palavra, contagem);
	}
	
	public void removerPalavra(String palavra) {
		if(!mapaDeContagemDePalavras.isEmpty())
			mapaDeContagemDePalavras.remove(palavra);
	}
	
	public void exibirContagemPalavras() {
		System.out.println(mapaDeContagemDePalavras);
	}
	
	public HashMap.Entry<String, Integer> encontrarPalavrasMaisFrequentes() {
        String palavraMaisFrequente = null;
        int maxFrequencia = 0;
		for(Map.Entry<String, Integer> palavra: mapaDeContagemDePalavras.entrySet()) {
			if(palavra.getValue() > maxFrequencia) {
				maxFrequencia = palavra.getValue();
				palavraMaisFrequente = palavra.getKey();
			}
		}
		return Map.entry(palavraMaisFrequente, maxFrequencia);
	}
}
