package edu.yan.exemplos.pilarespoo.polimorfismoherancaeinterfaces.interfaceimpressora.estabelecimento;

import edu.yan.exemplos.pilarespoo.polimorfismoherancaeinterfaces.interfaceimpressora.equipamentos.copiadora.ICopiadora;
import edu.yan.exemplos.pilarespoo.polimorfismoherancaeinterfaces.interfaceimpressora.equipamentos.digitalizadora.IDigitalizadora;
import edu.yan.exemplos.pilarespoo.polimorfismoherancaeinterfaces.interfaceimpressora.equipamentos.impressora.Deskjet;
import edu.yan.exemplos.pilarespoo.polimorfismoherancaeinterfaces.interfaceimpressora.equipamentos.impressora.IImpressora;
import edu.yan.exemplos.pilarespoo.polimorfismoherancaeinterfaces.interfaceimpressora.equipamentos.impressora.Lazerjet;
import edu.yan.exemplos.pilarespoo.polimorfismoherancaeinterfaces.interfaceimpressora.equipamentos.multifuncional.EquipamentoMultifuncional;

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
