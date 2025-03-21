package src.edu.yan.aulasintaxe.exemplo.sistemaprocessoseletivo;

public class Main {
	public static void main(String[] args) {
//		ProcessoSeletivo.analisarCandidato(1900.0);
//		ProcessoSeletivo.analisarCandidato(2200.0);
//		ProcessoSeletivo.analisarCandidato(2000.0);
		ProcessoSeletivo processoSeletivo = new ProcessoSeletivo();
		processoSeletivo.selecaoCandidatos();
		
		processoSeletivo.imprimirSelecionados();
		
		processoSeletivo.ligarParaCandidatosSelecionados();
	}
}
