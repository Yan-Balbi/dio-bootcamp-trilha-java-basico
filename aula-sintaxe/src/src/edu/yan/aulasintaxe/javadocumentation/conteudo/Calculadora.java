package src.edu.yan.aulasintaxe.javadocumentation.conteudo;

/**@author yanba
 * @version 1.0
 * @since 18/03/2025
 */
public class Calculadora {
	
	
	/**
	 * @param primeiroNumero
	 * @param segundoNumero
	 * @return retorna um inteiro, resultado da soma dos dois numeros inseridos
	 */
	public int somar(int primeiroNumero, int segundoNumero) {
		return primeiroNumero+segundoNumero;
	}
	
	//COMANDO PRA EXECUTAR DOCUMENTAÇÃO
	//javadoc -d ../docs -sourcepath src -subpackages edu.yan.aulasintaxe.exemplodocumentacao
}
