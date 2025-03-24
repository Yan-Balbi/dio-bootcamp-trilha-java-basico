package src.edu.yan.aulasintaxe.record;

public record Pessoa(String nome, int idade) {//ese já é o construtor do record

	public Pessoa{//compacte constructor 
		if(idade <= 10) {
			System.out.println(nome+" é criança.");
		} else if(idade > 10 && idade < 18) {
			System.out.println(nome+" é adolescente");
		}else if(idade >= 18 && idade < 70) {
			System.out.println(nome+" é adulto");
		} else {
			System.out.println(nome+" é idoso");
		}
	}
	
	public Pessoa (final String name) {//outro tipo de construtor, que fornece uma idade padrão caso ela não seja especificada
		this(name,0);
	}
	
	public String getInfo() {
		return "Nome: "+nome+"\n idadde: "+idade;
	}
}
