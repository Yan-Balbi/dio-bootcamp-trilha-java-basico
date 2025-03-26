package edu.yan.exemplos.pilarespoo.polimorfismoherancaeinterfaces.abstracaoempresa;

public class Main {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setNome("Joao da Nica");
		gerente.setCodigo("104.24.25.833");
		gerente.setLogin("João");
		gerente.setSenha("nicão_123");
		gerente.setSalario(100000);
		gerente.setComissao(1000);
		exibirEmpregado(gerente);
		
		Vendedor vendedor = new Vendedor();
		vendedor.setNome("Julio Silva");
		vendedor.setCodigo("103.11.23.111");
		vendedor.setSalario(1700);
		vendedor.setPorcentagemPorVenda(10);
		vendedor.setQuantidadeVendida(200);
		exibirEmpregado(vendedor);
	}
	
	public static void exibirEmpregado(Empregado empregado) {
//		System.out.println("========"+empregado.getClass().getCanonicalName()+"========");
//		if(empregado instanceof Empregado) {
//			System.out.println(((Gerente) empregado).getNome());
//			System.out.println(((Gerente) empregado).getLogin());
//			System.out.println(((Gerente) empregado).getSenha());
//			System.out.println(((Gerente) empregado).getSalario());
//			
//			
//		}
//		System.out.println("================");

/*		ou ainda		*/

		System.out.println("========"+empregado.getClass().getCanonicalName()+"========");
		if(empregado instanceof Gerente gerente) {
			System.out.println(gerente.getNome());
			System.out.println(gerente.getCodigo());
			System.out.println(gerente.getLogin());
			System.out.println(gerente.getSenha());
			System.out.println(gerente.getSalario());
			
		} else if (empregado instanceof Vendedor vendedor) {
			System.out.println(vendedor.getNome());
			System.out.println(vendedor.getCodigo());
			System.out.println(vendedor.getPorcentagemPorVenda());
			System.out.println(vendedor.getSalario());			
		}
		System.out.println("Salário base: "+empregado.getSalario());
		System.out.println("Salário completo: "+empregado.getSalarioCompleto());
		System.out.println("================");
		
	
/*		ou ainda		*/

// mesmo com o JDK 22, to tendo problemas pra usar o Pattern Matching for Switch
//		switch (empregado) {
//			case Gerente gerente -> {
//				
//			}
//			
//			case Vendedor vendedor -> {
//				
//			}
//		}
	}
}
