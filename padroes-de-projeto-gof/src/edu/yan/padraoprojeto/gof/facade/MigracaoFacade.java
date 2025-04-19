package edu.yan.padraoprojeto.gof.facade;

import edu.yan.padraoprojeto.gof.subsistema1.crm.CrmService;
import edu.yan.padraoprojeto.gof.susbsistema2.cep.CepApi;

public class MigracaoFacade {
	
	public void migrarCliente(String nome, String cep) {
		
		String cidade = CepApi.getInstancia().obterCidadePeloCep(cep);
		String estado = CepApi.getInstancia().obterEstadoPeloCep(cep);
		
		CrmService.salvarCliente(nome, cep, cidade, estado);
	}
}
