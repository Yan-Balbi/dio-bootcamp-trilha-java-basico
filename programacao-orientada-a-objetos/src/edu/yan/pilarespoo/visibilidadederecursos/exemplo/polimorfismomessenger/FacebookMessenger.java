package edu.yan.pilarespoo.visibilidadederecursos.exemplo.polimorfismomessenger;

public class FacebookMessenger extends ServicoMensagemInstantanea{

	@Override
	public void enviarMenssagem() {
		// TODO Auto-generated method stub
		validarConecxaoComInternet();
		System.out.println("Enviando mensagem pelo Facbook");
	}

	@Override
	public void receberMensagem() {
		// TODO Auto-generated method stub
		System.out.println("Recebendo mensagem pelo fACEBOOK");
	}

}
