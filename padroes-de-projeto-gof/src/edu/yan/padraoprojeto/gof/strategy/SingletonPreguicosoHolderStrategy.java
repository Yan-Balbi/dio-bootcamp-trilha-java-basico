package edu.yan.padraoprojeto.gof.strategy;

import edu.yan.padraoprojeto.gof.singleton.SingletonPreguicosoHolder;

public class SingletonPreguicosoHolderStrategy implements ISingletonStrategy{

	@Override
	public Object getInstance() {
		// TODO Auto-generated method stub
		return SingletonPreguicosoHolder.getInstancia();
	}

}
