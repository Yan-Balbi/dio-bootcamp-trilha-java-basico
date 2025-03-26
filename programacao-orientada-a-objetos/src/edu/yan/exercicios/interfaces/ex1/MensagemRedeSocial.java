package edu.yan.exercicios.interfaces.ex1;

public class MensagemRedeSocial implements IMensagemMarketing{
	private String nomeRedeSocial;
	
	public MensagemRedeSocial(String nomeRedeSocial) {
		this.nomeRedeSocial = nomeRedeSocial;
	}
	
	@Override
	public void enviarMensagemDeMarketing(String mensagem) {
		// TODO Auto-generated method stub
		System.out.println("Enviando mensagem de marketing via "+nomeRedeSocial+": "+mensagem);
	}
	
	public String getNomeRedeSocial() {
		return nomeRedeSocial;
	}
	public void setNomeRedeSocial(String nomeRedeSocial) {
		this.nomeRedeSocial = nomeRedeSocial;
	}

}
