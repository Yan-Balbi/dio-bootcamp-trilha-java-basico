package src.edu.yan.aulasintaxe.tratamentoexcessoes.exemplo;

public class FormatadorCepExemplo {
	public static void main(String[] args) {
		try {
			String cepFormatado = formatarCep("123456789");
		} catch (CepInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static String formatarCep(String cep) throws CepInvalidoException{
		if(cep.length() != 8) {
			throw new CepInvalidoException();
		}
		
		return "123.456.789.10-	11";
	}
}
