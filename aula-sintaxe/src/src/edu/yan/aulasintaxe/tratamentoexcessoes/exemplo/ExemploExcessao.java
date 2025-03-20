package src.edu.yan.aulasintaxe.tratamentoexcessoes.exemplo;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcessao {
	public static void main(String[] args) {
		
		// Não é obrigatório tratar esse erro - Checked exceptions
		Number valor = Double.valueOf("a1.75");
		System.out.println(valor);
		
		//RunTimeExcepetion - É necessário tratar, porque é exigido
		try {
			Number valor2 = NumberFormat.getInstance().parse("1.75");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
