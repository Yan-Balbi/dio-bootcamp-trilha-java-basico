package edu.yan.exemplos.pilarespoo.polimorfismoherancaeinterfaces.abstracaoempresa;

public non-sealed class Gerente extends Empregado{
	private String login;
	private String senha;;
	private double comissao;
	
	public Gerente(String codigo, String nome, String endereco, int idade, double salario) {
		super(codigo, nome, endereco, idade, salario);
		// TODO Auto-generated constructor stub
	}
	
	public Gerente() {
	
	}
	
	@Override
	public String getCodigo() {
		return "grnt@"+super.getCodigo();
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	@Override
	public double getSalarioCompleto() {
		// TODO Auto-generated method stub
		return getSalario()+ (comissao);
	}

	/** Exemplo de sobrecarga de métodos
	 * 
	 */
	public double getSalario(double extra) {
		return this.getSalarioCompleto() + extra;
	}
	
}
