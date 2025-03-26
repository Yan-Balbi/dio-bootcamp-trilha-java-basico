package edu.yan.exercicios.interfaces.ex3;

public class Circulo implements IFormaGeometrica{
	
	private double tamanhoRaio;
	
	public Circulo(double tamanhoRaio) {
		this.tamanhoRaio = tamanhoRaio;
	}
	
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return 2*3.14*tamanhoRaio;
	}

	public double getTamanhoRaio() {
		return tamanhoRaio;
	}

	public void setTamanhoRaio(double tamanhoRaio) {
		this.tamanhoRaio = tamanhoRaio;
	}

}
