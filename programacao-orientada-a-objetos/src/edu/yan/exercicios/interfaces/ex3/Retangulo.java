package edu.yan.exercicios.interfaces.ex3;

public class Retangulo implements IFormaGeometrica{
	
	private double tamanhoArestaBase;
	
	private double tamanhoArestaAltura;
	
	public Retangulo(double tamanhoArestaBase, double tamanhoArestaAltura) {
		this.tamanhoArestaBase = tamanhoArestaBase;
		this.tamanhoArestaAltura = tamanhoArestaAltura;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return tamanhoArestaBase*tamanhoArestaAltura;
	}

	public double getTamanhoArestaBase() {
		return tamanhoArestaBase;
	}

	public void setTamanhoArestaBase(double tamanhoArestaBase) {
		this.tamanhoArestaBase = tamanhoArestaBase;
	}

	public double getTamanhoArestaAltura() {
		return tamanhoArestaAltura;
	}

	public void setTamanhoArestaAltura(double tamanhoArestaAltura) {
		this.tamanhoArestaAltura = tamanhoArestaAltura;
	}
	
}
