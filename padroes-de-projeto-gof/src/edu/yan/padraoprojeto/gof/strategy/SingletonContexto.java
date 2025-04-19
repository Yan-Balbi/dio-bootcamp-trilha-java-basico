package edu.yan.padraoprojeto.gof.strategy;

public class SingletonContexto {
	private ISingletonStrategy instanciaStrategy;

	public SingletonContexto(ISingletonStrategy strategy) {
		this.instanciaStrategy = strategy;
	}
	/**
	 * nesse caso em específico, ao invés de eu fazer um getStrategy eu peguei a instancia contida dentro do strategy
	 * @return Object
	 */
	public Object getInstanciaStrategy() {
		return instanciaStrategy.getInstance();
	}

	public void setStrategy(ISingletonStrategy strategy) {
		this.instanciaStrategy = strategy;
	}
	
	
}
