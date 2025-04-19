package edu.yan.padraoprojeto.gof.strategy;

import edu.yan.padraoprojeto.gof.singleton.SingletonApressado;

public class SingletonApressadoStrategy implements ISingletonStrategy{

	@Override
	public Object getInstance() {
		// TODO Auto-generated method stub
		return SingletonApressado.getInstance();
	}

}
