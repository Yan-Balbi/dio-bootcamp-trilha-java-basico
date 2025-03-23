package edu.yan.pilarespoo.visibilidadederecursos.exemplo.polimorfismomessenger;

public class TelegramMessenger extends ServicoMensagemInstantanea{

	@Override
	public void enviarMenssagem() {
		// TODO Auto-generated method stub
		validarConecxaoComInternet();
		System.out.println("Enviando mensagem pelo Telegram");
	}

	@Override
	public void receberMensagem() {
		// TODO Auto-generated method stub
		System.out.println("Recebendo mensagem pelo Telegram");
	}

}
