package edu.yan.padraoprojeto.gof.susbsistema2.cep;
/**
 * Singleton apressado
 */
public class CepApi {
	private static CepApi instanciaCepApi = new CepApi();
	
	private CepApi() {
		super();
	}
	
	public static CepApi getInstancia() {
		return instanciaCepApi;
	}
	
	public String obterCidadePeloCep(String cep) {
		return "Cidade X";
	}
	
	public String obterEstadoPeloCep(String cep) {
		return "Estado X";
	}
}
