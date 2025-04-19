package edu.yan.padraoprojeto.gof.strategy;

import edu.yan.padraoprojeto.gof.singleton.SingletonPreguicoso;

public class SingletonPreguicosoStrategy implements ISingletonStrategy{

	@Override
	public Object getInstance() {
		// TODO Auto-generated method stub
		return SingletonPreguicoso.getInstance();
	}

}
