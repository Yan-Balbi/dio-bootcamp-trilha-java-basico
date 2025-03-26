package edu.yan.exercicios.interfaces.ex1;

public class MensagemWhatsApp implements IMensagemMarketing{


	@Override
	public void enviarMensagemDeMarketing(String mensagem) {
		// TODO Auto-generated method stub
		System.out.println("Enviando mensagem de marketing via WhatsApp: "+mensagem);
	}
}
