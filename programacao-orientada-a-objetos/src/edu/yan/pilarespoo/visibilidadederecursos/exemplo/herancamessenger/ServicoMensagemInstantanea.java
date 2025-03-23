package edu.yan.pilarespoo.visibilidadederecursos.exemplo.herancamessenger;

public class ServicoMensagemInstantanea {
	public void enviarMenssagem() {
		validarConexaoComInternet(); 
		System.out.println("Enviando mensagem ");
		salvarHistoricoMensagem();
	}
	
	public void receberMensagem() {
		System.out.println("Recebendo mensagem ");
	}
	
	private void validarConexaoComInternet() {
		System.out.println("Valiadando se está conectado a internet ");
	}
	
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando o histórico da mensagem ");
	}
}
