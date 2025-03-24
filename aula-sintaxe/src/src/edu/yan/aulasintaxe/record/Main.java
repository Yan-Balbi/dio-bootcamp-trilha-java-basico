package src.edu.yan.aulasintaxe.record;

public class Main {
	public static void main(String[] args) {
		Pessoa predo = new Pessoa("Predo", 20);
		System.out.println(predo);
		System.out.println(predo.nome());
		System.out.println(predo.idade());
		
		Pessoa joao = new Pessoa("Joao", 70);
		System.out.println(joao);
		System.out.println(joao.nome());
		System.out.println(joao.idade());
		
		Pessoa maria = new Pessoa("Maria");
		System.out.println(maria);
		System.out.println(maria.nome());
		System.out.println(maria.idade());
	}
}
