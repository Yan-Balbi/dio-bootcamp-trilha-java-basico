package edu.yan.padraoprojeto.gof.subsistema1.crm;

public class CrmService {
	
	private CrmService() {
		super();
	}
	
	public static void salvarCliente(String nome, String cep, String cidade, String estado) {
		System.out.println("Salvando usuario.");
		
		System.out.println("Nome: "+nome+"\nCep: "+cep+"\nCidade: "+cidade+"\nEstado: "+estado);
	}
}
