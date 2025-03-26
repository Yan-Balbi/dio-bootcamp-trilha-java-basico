package edu.yan.exercicios.interfaces.ex3;

import java.util.List;
import java.util.function.Consumer;

public class Main {
	public static void main(String[] args) {
		List<IFormaGeometrica> formas = List.of(new Quadrado(4), new Retangulo(3, 4), new Circulo(2));
		
		formas.forEach(new Consumer<IFormaGeometrica>(){

			@Override
			public void accept(IFormaGeometrica forma) {
				// TODO Auto-generated method stub
				System.out.println("O valor da área é: "+forma.calcularArea());
			}
			
		});
	}
}
