/*
 * O método Collections.sort() pode usar tanto compareTo() (da interface Comparable) quanto compare() (da interface Comparator)
 */

/* ENTÃO, SO MÉTODO 'Collections.sort()' É RESPONSÁVEL PELA ORDENAÇÃO, COMO QUE DE FATO ELE FAZ ISSO USANDO O 'compare()' OU o 'compareTo()'?
 * O método Collections.sort() usa o algoritmo de ordenação Timsort, que é uma versão híbrida de Merge Sort e Insertion Sort e executa os seguintes passos:
    1. Verifica se a lista está vazia ou tem apenas um elemento

        Se sim, retorna imediatamente, pois já está ordenada.

    2. Decide se usa um algoritmo simples ou complexo

        Se a lista for pequena (geralmente ≤ 32 elementos), usa Insertion Sort (eficiente para listas pequenas).

        Para listas maiores, usa Merge Sort modificado (Timsort).

    3. Usa compare() para comparar elementos

        Durante a ordenação, Collections.sort() chama repetidamente compare() para decidir a posição dos elementos.
 * 
 */

package yan.edu.collections.exemplos.comparableXcomparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		System.out.println("---------------------------------------");
		ArrayList<Livro> livros = new ArrayList<Livro>() {
			{
				add(new Livro("Neuromancer", "William Gibson", 1984));
				add(new Livro("Count Zero", "William Gibson", 1986));
				add(new Livro("Monaliza Overdrive", "William Gibson", 1988));
				add(new Livro("Androides sonham com ovelhas elétricas?", "Phillip K. Dick", 1968));
			}
		};

		
		System.out.println("Livros após a ordenação natural (Título): ");
		Collections.sort(livros);
		for (Livro livro : livros) {
			System.out.println(livro.getTitulo() + " - " +
					livro.getAutor() + " - " +
					livro.getAno());
		}

		System.out.println("---------------------------------------");

		System.out.println("Livros após a ordenação por ano: ");
		Collections.sort(livros, new CompararAno());
		for (Livro livro : livros) {
			System.out.println(livro.getAno() + " - " +
					livro.getTitulo() + " - " +
					livro.getAutor());
		}

		System.out.println("---------------------------------------");

		System.out.println("Livros após a ordenação por autor: ");
		Collections.sort(livros, new CompararAutor());
		for (Livro livro : livros) {
			System.out.println(livro.getAutor() + " - " +
					livro.getTitulo() + " - " +
					livro.getAno());
		}

		System.out.println("---------------------------------------");

		System.out.println("Livros após a ordenação por ano, autor e título: ");
		Collections.sort(livros, new CompararAnoAutorTitulo());
		for (Livro livro : livros) {
			System.out.println(livro.getAno() + " - " +
					livro.getAutor() + " - " +
					livro.getTitulo());
		}
	}
}
