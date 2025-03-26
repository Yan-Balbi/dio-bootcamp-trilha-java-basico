package edu.yan.exemplos.pilarespoo.polimorfismoherancaeinterfaces.interfaceimpressora.equipamentos.multifuncional;

import edu.yan.exemplos.pilarespoo.polimorfismoherancaeinterfaces.interfaceimpressora.equipamentos.copiadora.ICopiadora;
import edu.yan.exemplos.pilarespoo.polimorfismoherancaeinterfaces.interfaceimpressora.equipamentos.digitalizadora.IDigitalizadora;
import edu.yan.exemplos.pilarespoo.polimorfismoherancaeinterfaces.interfaceimpressora.equipamentos.impressora.IImpressora;

/*
Java não permite herança múltipla.
diferente das demais propriedades POO como herança, polimorfismo e abstração, uma classe pode implementar múltiplas interfaces.
	Eu jamais conseguiria fazer:
public class EquipamentoMultifuncional extends Impressora, Copiadora, Digitalizadora {

}
*/
public class EquipamentoMultifuncional implements ICopiadora, IDigitalizadora, IImpressora{

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		System.out.println("Equipamento multifuncional imprimindo");
	}

	@Override
	public void digitalizar() {
		// TODO Auto-generated method stub
		System.out.println("Equipamento multifuncional Digitalizando");
	}

	@Override
	public void copiar() {
		// TODO Auto-generated method stub
		System.out.println("Equipamento multifuncional copiando");
	}

}
