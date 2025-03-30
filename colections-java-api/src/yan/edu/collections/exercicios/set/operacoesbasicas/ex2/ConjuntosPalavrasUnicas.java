/*
 *  Crie uma classe chamada "ConjuntoPalavrasUnicas" que possui um conjunto de palavras únicas como atributo. Implemente os seguintes métodos:

    adicionarPalavra(String palavra): Adiciona uma palavra ao conjunto.
    removerPalavra(String palavra): Remove uma palavra do conjunto.
    verificarPalavra(String palavra): Verifica se uma palavra está presente no conjunto.
    exibirPalavrasUnicas(): Exibe todas as palavras únicas do conjunto.

 */
package yan.edu.collections.exercicios.set.operacoesbasicas.ex2;

import java.util.LinkedHashSet;
import java.util.Set;

public class ConjuntosPalavrasUnicas {
	private Set<String> conjuntoPalavras = new LinkedHashSet<>();
	
	public void adicionarPalavra(String palavra) {
		conjuntoPalavras.add(palavra);
	}
	
	public void removerPalavra(String palavra) {
		for(String p: conjuntoPalavras) {
			if(p.equals(palavra)){
				conjuntoPalavras.remove(p);
				break;
			}
		}
	}
	
	/**
	 * Verifica se a palavra está presente no conjunto
	 */
	public boolean	verificarSePalavraEstaPresenteNoConjunto(String palavra) {
		if(conjuntoPalavras.contains(palavra)) 
			return true;
		else
			return false;
	}
	
	public void exibirPalavrasUnicas() {
		for(String palavra: conjuntoPalavras){
			System.out.println(palavra);
		}
	}
	
	
}
