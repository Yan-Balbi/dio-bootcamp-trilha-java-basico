package edu.yan.pilarespoo.visibilidadederecursos.exemplo.interfaceimpressora.estabelecimento;

import edu.yan.pilarespoo.visibilidadederecursos.exemplo.interfaceimpressora.equipamentos.copiadora.ICopiadora;
import edu.yan.pilarespoo.visibilidadederecursos.exemplo.interfaceimpressora.equipamentos.digitalizadora.IDigitalizadora;
import edu.yan.pilarespoo.visibilidadederecursos.exemplo.interfaceimpressora.equipamentos.impressora.Deskjet;
import edu.yan.pilarespoo.visibilidadederecursos.exemplo.interfaceimpressora.equipamentos.impressora.IImpressora;
import edu.yan.pilarespoo.visibilidadederecursos.exemplo.interfaceimpressora.equipamentos.impressora.Lazerjet;
import edu.yan.pilarespoo.visibilidadederecursos.exemplo.interfaceimpressora.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
	public static void main(String[] args) {
		
		//Testando a instanciacao de multifuncional.
			//Pode ser instanciado como qualquer classe que ele implementa
		IImpressora impressora = new Deskjet();
		impressora.imprimir();
		
		impressora = new Lazerjet();
		impressora.imprimir();
		
		impressora = new EquipamentoMultifuncional();
		impressora.imprimir();
		
		//Testando a adaptabilidade de Multifuncional
			//qualquer classe pode implementada por ele pode ser instanciada usando ele como parametro
		EquipamentoMultifuncional multifuncional = new EquipamentoMultifuncional();
		
		IDigitalizadora digitalizadora = multifuncional;
		ICopiadora copiadora = multifuncional;
		digitalizadora.digitalizar();
		copiadora.copiar();
		
	}
}
