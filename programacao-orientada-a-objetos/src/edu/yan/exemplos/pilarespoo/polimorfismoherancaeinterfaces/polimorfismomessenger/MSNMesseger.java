package edu.yan.exemplos.pilarespoo.polimorfismoherancaeinterfaces.polimorfismomessenger;

public class MSNMesseger extends ServicoMensagemInstantanea{

	@Override
	public void enviarMenssagem() {
		// TODO Auto-generated method stub
		validarConecxaoComInternet();
		System.out.println("Enviando mensagem pelo MSN");
	}

	@Override
	public void receberMensagem() {
		// TODO Auto-generated method stub
		System.out.println("Recebendo mensagem pelo MSN");
	}

}
