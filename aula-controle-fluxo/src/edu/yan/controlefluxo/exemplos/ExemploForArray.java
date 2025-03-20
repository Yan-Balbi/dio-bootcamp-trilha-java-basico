package edu.yan.controlefluxo.exemplos;

import java.util.ArrayList;
import java.util.Iterator;

public class ExemploForArray {
	public static void main(String[] args) {
		ArrayList<String> alunos = new ArrayList<>();
		alunos.add("JOÃO");
		alunos.add("PREDO");
		alunos.add("JUCA");
		alunos.add("TONHO");
		
		for (int i = 0; i < alunos.size(); i++) {
			System.out.println("No laço for, aluno de índice "+i+" é: "+alunos.get(i));
		}
		
		//ou 
		
		for(String aluno: alunos) {
			System.out.println("No laço Foreach: "+aluno);
		}
	}
}
