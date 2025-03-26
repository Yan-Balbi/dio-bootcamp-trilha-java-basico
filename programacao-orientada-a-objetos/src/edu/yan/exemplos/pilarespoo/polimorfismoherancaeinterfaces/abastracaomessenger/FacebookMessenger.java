package edu.yan.exemplos.pilarespoo.polimorfismoherancaeinterfaces.abastracaomessenger;

public class FacebookMessenger extends ServicoMensagemInstantanea{

	@Override
	public void enviarMenssagem() {
		// TODO Auto-generated method stub
		System.out.println("Enviando mensagem pelo Facbook");
	}

	@Override
	public void receberMensagem() {
		// TODO Auto-generated method stub
		System.out.println("Recebendo mensagem pelo fACEBOOK");
	}

}
