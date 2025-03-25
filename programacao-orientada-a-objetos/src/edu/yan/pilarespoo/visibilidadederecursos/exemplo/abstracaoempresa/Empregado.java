package edu.yan.pilarespoo.visibilidadederecursos.exemplo.abstracaoempresa;

public sealed abstract class Empregado permits Gerente, Vendedor{
	private String codigo;
	private String nome;
	private String endereco;
	private int idade;
	private double salario;
	
	public Empregado(String codigo, String nome, String endereco, int idade, double salario) {
		this.codigo = codigo;
		this.nome = nome;
		this.endereco = endereco;
		this.idade = idade;
		this.salario = salario;
	}
	
	public Empregado() {
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	/**O vendedor depende do percentual de venda. O gerente depende da comissão.
	 * 
	 */
	public abstract double getSalarioCompleto();
	
	
}
