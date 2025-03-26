/*
   1 - Escreva um código para enviar mensagens de marketing, para isso você deve ter a possibilidade de enviar a mesma mensagem para serviços diferentes, esses serviços devem ter um método para receber a mensagem como parâmetro, os serviços que devem estar disponíveis são:
    SMS;
    E-mail;
    Redes Sociais;
    WhatsApp;

 */
package edu.yan.exercicios.interfaces.ex1;

import java.util.List;
import java.util.function.Consumer;

public class Main {
	public static void main(String[] args) {
		List<IMensagemMarketing> mensagens = List.of(new MensagemSMS(), new MensagemEmail(), new MensagemRedeSocial("Twitter"), 
		new MensagemRedeSocial("TikTok"), new MensagemRedeSocial("YouTube"), new MensagemWhatsApp());
		
		mensagens.forEach(new Consumer<IMensagemMarketing>() {

			@Override
			public void accept(IMensagemMarketing mensagem) {
				// TODO Auto-generated method stub
				mensagem.enviarMensagemDeMarketing("Super explosão de ofertas! Só aqui no TerêFrutas!");
			}
			
		});
		
	}
}
