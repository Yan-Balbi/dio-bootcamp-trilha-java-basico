package edu.yan.pilarespoo.visibilidadederecursos.exemplo.polimorfismomessenger;

/*A diferença entre classe abstrata e interface é que  a classe abstrata pode conter código*/
	//Ou seja, classe abstrata tem um maior nível de acoplamento, uma vez que se baseia em herança.
public abstract class ServicoMensagemInstantanea {
	//pode ter apenas assinatura de contrato
	public abstract void enviarMenssagem();
	
	public abstract void receberMensagem();

	
	//pode ter classes implementadas
	public void teste() {
		System.out.println("Testando 123.");
	}
	
	protected void validarConecxaoComInternet() {
		System.out.println("Validando se está conectado à internet.");
	}
}
