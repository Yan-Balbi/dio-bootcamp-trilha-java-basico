package edu.yan.padraoprojeto.gof.facade;

public class Main {
	public static void main(String[] args) {
		MigracaoFacade facade = new MigracaoFacade();
		facade.migrarCliente("Joao das Neves", "79385200");
		
	}
}
