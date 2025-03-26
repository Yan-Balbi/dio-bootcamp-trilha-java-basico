package edu.yan.exercicios.interfaces.ex3;

public class Quadrado implements IFormaGeometrica{
	
	private double tamanhoAresta;
	
	public Quadrado(double tamanhoAresta) {
		this.tamanhoAresta = tamanhoAresta;
	}
	
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return tamanhoAresta*tamanhoAresta;
	}

	public double getTamanhoDoLado() {
		return tamanhoAresta;
	}

	public void setTamanhoDoLado(double tamanhoDoLado) {
		this.tamanhoAresta = tamanhoDoLado;
	}

}
