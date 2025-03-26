package edu.yan.exemplos.pilarespoo.polimorfismoherancaeinterfaces.polimorfismomessenger;

public class ComputadorUsuario {
	public static void main(String[] args) {
		MSNMesseger msn = new MSNMesseger();
		msn.enviarMenssagem();
		msn.receberMensagem();
		
		FacebookMessenger face = new FacebookMessenger();
		face.enviarMenssagem();
		face.receberMensagem();
		
		TelegramMessenger telegram = new TelegramMessenger();
		telegram.enviarMenssagem();
		telegram.receberMensagem();
	}
}
